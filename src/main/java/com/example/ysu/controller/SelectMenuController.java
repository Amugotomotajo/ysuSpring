package com.example.ysu.controller;

import com.example.ysu.model.dto.SelectMenuDTO;
import com.example.ysu.service.SelectMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SelectMenuController {
    private final SelectMenuService selectMenuService;

    @GetMapping("/menu")
    public List<SelectMenuDTO> SelectMenuList(){
        return selectMenuService.SelectMenuList();
    }

    @GetMapping("/menu/{menuid}")
    public SelectMenuDTO SelectMenuById(@PathVariable Long menuid) {
        return selectMenuService.getMenuById(menuid);
    }


}
