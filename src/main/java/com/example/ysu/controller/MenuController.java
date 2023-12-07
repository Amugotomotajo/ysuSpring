package com.example.ysu.controller;

import com.example.ysu.model.dto.menuDTO;
import com.example.ysu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MenuController {
    @Autowired
    private final MenuService menuService;

    // 사용자 메뉴
    @GetMapping("/menu")
    public List<menuDTO> MenuList() { return menuService.MenuList(); }

    // 관리자 메뉴
    @GetMapping("/adminmenu")
    public List<menuDTO> AdminMenuList() { return menuService.MenuList(); }


    // 선택 메뉴 상세 정보
    @GetMapping("/menu/{menuid}")
    public menuDTO SelectMenuById(@PathVariable int menuid) { return menuService.getMenuById(menuid); }

    @GetMapping("/adminmenu/menudetail/{menuid}")
    public menuDTO SelectAdminMenuById(@PathVariable int menuid) { return menuService.getAdminMenuById(menuid); }

    // 선택 메뉴 삭제
    @DeleteMapping("/adminmenu/menudetail/{menuid}")
    public String MenuDelete(@PathVariable int menuid) {
        menuService.MenuDelete(menuid);
        return "redirect:/adminmenu";
    }
}