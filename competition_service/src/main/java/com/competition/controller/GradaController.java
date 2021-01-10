package com.competition.controller;

import com.competition.model.GradaDto;
import com.competition.service.IGradaService;
import com.competition.utils.Request;
import com.competition.utils.Response;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 届次控制层
 */
@RestController
@RequestMapping("/grada")
@CrossOrigin
public class GradaController {


    @Autowired
    private IGradaService gradaService;

    @ApiOperation(value = "保存大赛届次实体",notes = "xx")
    @ApiImplicitParam(name = "request",value = "届次传输实体",required = true,dataType = "Request«GradaDto»")
    @PostMapping(path = "save")
    public Response save(@RequestBody Request<GradaDto> request){
        gradaService.save(request);
        return Response.bulid().ResposeSuccess("success");
    }


    @ApiOperation(value = "查询最近届次",notes = "xx")
    @PostMapping(path = "findRecently")
    public Response findRecently(){
        return gradaService.findRecentlyGrada();
    }
}
