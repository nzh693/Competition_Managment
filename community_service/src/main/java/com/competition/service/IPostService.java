package com.competition.service;

import com.competition.model.PostDto;

public interface IPostService {

    /**
     * 新增帖子
     * @param dto
     */
    public void save(PostDto dto);
}
