package com.hr.system.controller;

import com.hr.system.model.UploadImageDto;
import com.hr.system.service.IFileService;
import com.hr.system.utils.Request;
import com.hr.system.utils.Response;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/file")
@CrossOrigin
public class FileController {


    @Autowired
    private IFileService fileService;

    @PostMapping(value = "/upload")
    @ApiOperation(value = "传输图片",notes = "xx")
    @ApiImplicitParam(name = "request",value = "请求传输实体",required = true,dataType = "Request«UploadImageDto»")
    public Response upload(@RequestParam("file") MultipartFile file, Request<UploadImageDto> request){
        System.out.println(request);
        String url = fileService.uploadOnServer(file, "system_images", "competion-file");
        return Response.bulid().ResposeSuccessWithObject(url);
    }

    @RequestMapping(value = "/upload/client",method = RequestMethod.POST)
    public Response  uploadOnclient(@RequestParam("file") MultipartFile file){
        Map<String, String> re = fileService.uploadOnClient(file);
        return Response.bulid().ResposeSuccessWithObject(re);
    }





}
