package com.example.ysu.controller;

import com.example.ysu.model.dto.MenuDTO;
import com.example.ysu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/menu")
    public List<MenuDTO> SelectMenuList(){
        return menuService.menuList();
    }

    @GetMapping("/menu/{menuid}")
    public MenuDTO SelectMenuById(@PathVariable Long menuid) {
        return menuService.getMenuById(menuid);
    }
}
