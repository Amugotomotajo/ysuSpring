package com.example.ysu.controller;

import com.example.ysu.model.dto.menuDTO;
import com.example.ysu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/menu")
    public List<menuDTO> MenuList() {
        return menuService.MenuList();
    }
}
