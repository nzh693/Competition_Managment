package com.competition.service.imp;

import com.competition.mapper.IPostMapper;
import com.competition.model.PostDto;
import com.competition.po.Apple;
import com.competition.po.PostPo;
import com.competition.service.IPostService;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PostServiceImp implements IPostService {

    @Autowired
    private IPostMapper postMapper;

    @Override
    public void save(PostDto dto) {
        PostPo postPo = new PostPo();
        BeanUtils.copyProperties(dto,postPo);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        postPo.setCreateTime(timestamp);
        postMapper.insert(postPo);
    }

    @Test
    public void test(){
        ArrayList<Apple> list = new ArrayList<>();
        list.add(new Apple("red", 11));
        list.add(new Apple("green", 12));
        list.add(new Apple("blue", 13));
        list.add(new Apple("blue", 14));

        Map<String, Apple> map = list.stream()
                .filter(a -> !a.getColor().equals("red"))
                .distinct()
                .collect(Collectors.toMap(a -> a.getColor(), a -> a,(a1,a2)->a1))
                ;
        System.out.println(map);

    }
}
