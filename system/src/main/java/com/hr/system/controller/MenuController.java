package com.hr.system.controller;

import com.hr.system.model.MenuDto;
import com.hr.system.service.IMenuService;
import com.hr.system.utils.Request;
import com.hr.system.utils.Response;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @ApiOperation(value = "获取菜单",notes = "xx")
    @ApiImplicitParam(name = "request",value = "请求传输实体",required = true,dataType = "Request«int»")
    @PostMapping(path = "/find")
    public Response find(@RequestBody Request<Integer> request){
        List<MenuDto> list =menuService.findMenuByPower(request.getData());
        return Response.bulid().ResposeSuccess(list.size(),list);
    }
}
