package com.competition.service;

import com.competition.utils.Request;
import com.competition.utils.Response;

public interface IGradaService {

    /**
     * 保存届次信息
     * @param request
     */
    public void  save(Request request);

    /**
     * 查询最近10届的届次基本信息
     * @return
     */
    public Response findRecentlyGrada();

}
