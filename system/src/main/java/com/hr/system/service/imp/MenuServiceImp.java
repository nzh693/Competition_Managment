package com.hr.system.service.imp;

import com.hr.system.mapper.IMenuMapper;
import com.hr.system.model.MenuDto;
import com.hr.system.po.MenuPo;
import com.hr.system.po.MenuSubPo;
import com.hr.system.service.IMenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImp implements IMenuService {

    @Autowired
    private IMenuMapper menuMapper;

    @Override
    public void update(MenuDto menuDto) {

    }

    @Override
    public List<MenuDto> findMenuByPower(int power) {
        List<MenuPo> list = menuMapper.findMenuByPower(power);
        ArrayList<MenuDto> menuDtos = new ArrayList<>();
        list.forEach(po->{
            if (po.getSubMenuList()==null || po.getSubMenuList().size()==0 ){//没有子菜单时将主菜单冗余到子菜单列表中
                MenuSubPo menuSubPo = new MenuSubPo();
                menuSubPo.setSubName(po.getName());
                menuSubPo.setSubIndexPath(po.getIndexPath());
                menuSubPo.setSubVisitPower(po.getVisitPower());
                po.getSubMenuList().add(menuSubPo);
            }
            MenuDto menuDto = new MenuDto();
            BeanUtils.copyProperties(po,menuDto);
            menuDtos.add(menuDto);

        });
        return menuDtos;
    }
}
