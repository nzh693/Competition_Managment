package com.competition.controller;

import com.competition.model.PostDto;
import com.competition.service.IPostService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/community/post")
public class PostController {

    @Autowired
    private IPostService postService;

    @ApiOperation(value = "发布社区帖子",notes = "发布时")
    @ApiImplicitParam(name = "postDto",value = "帖子传输实体",required = true,dataType = "PostDto")
    @RequestMapping(path = "save",method = RequestMethod.POST)
    public String save(@RequestBody PostDto postDto){
        postService.save(postDto);
        return "success";
    }
}
