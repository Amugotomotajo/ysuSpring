package com.example.ysu.service;

import com.example.ysu.model.dao.MenuMapper;
import com.example.ysu.model.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuMapper menuMapper;

    @Override
    public List<MenuDTO> menuList() {
        return menuMapper.menuList();
    }

    @Override
    public MenuDTO getMenuById(Long menuId) {
        return menuMapper.getMenuById(menuId);
    }
}
