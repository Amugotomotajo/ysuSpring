package com.example.ysu.service;

import com.example.ysu.model.dto.MenuDTO;

import java.util.List;

public interface MenuService {
    public List<MenuDTO> menuList();

    MenuDTO getMenuById(Long menuId);

}
