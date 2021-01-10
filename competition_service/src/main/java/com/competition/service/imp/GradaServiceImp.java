package com.competition.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.competition.mapper.IGradaMapper;
import com.competition.model.GradaDto;
import com.competition.po.GradaPo;
import com.competition.service.IGradaService;
import com.competition.utils.Request;
import com.competition.utils.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class GradaServiceImp implements IGradaService {

    @Autowired
    private IGradaMapper gradaMapper;

    @Override
    public Response findRecentlyGrada() {
        QueryWrapper<GradaPo> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("sort");
        List<GradaPo> gradaPos = gradaMapper.selectList(queryWrapper);
        ArrayList<GradaDto> gradaDtos = new ArrayList<>(gradaPos.size());
        gradaPos.forEach(po->{
            GradaDto gradaDto = new GradaDto();
            BeanUtils.copyProperties(po,gradaDto);
            gradaDtos.add(gradaDto);
        });
        return Response.bulid().ResposeSuccess(gradaDtos.size(),gradaDtos);
    }

    @Override
    public void save(Request request) {
        GradaPo gradaPo = new GradaPo();
        BeanUtils.copyProperties(request.getData(), gradaPo);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        gradaPo.setCreateTime(timestamp);
        gradaMapper.insert(gradaPo);
    }
}
