package com.example.ysu.service;

import com.example.ysu.model.dto.SelectMenuDTO;

import java.util.List;

public interface SelectMenuService {
    public List<SelectMenuDTO> SelectMenuList();
    SelectMenuDTO getMenuById(Long menuId);

}
