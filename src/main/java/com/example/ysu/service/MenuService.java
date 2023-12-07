package com.example.ysu.service;

import com.example.ysu.model.dto.menuDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {
    public List<menuDTO> MenuList();

    menuDTO getMenuById(int menuId);

    menuDTO getAdminMenuById(int menuId);

    void MenuDelete(int menuId);
}
