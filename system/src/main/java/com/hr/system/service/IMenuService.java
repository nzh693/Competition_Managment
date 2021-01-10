package com.hr.system.service;

import com.hr.system.model.MenuDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMenuService {

    /**
     * 修改菜单
     * @param menuDto
     */
    public void update(MenuDto menuDto);

    /**
     * 根据用户权限读取菜单
     * @param power
     * @return
     */
    public List<MenuDto> findMenuByPower(int power);


}
