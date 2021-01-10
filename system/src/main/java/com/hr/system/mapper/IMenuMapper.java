package com.hr.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.system.po.MenuPo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IMenuMapper extends BaseMapper<MenuPo> {

    List<MenuPo> findMenuByPower(Integer power);

}
