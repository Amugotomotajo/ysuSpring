package com.example.ysu.controller;

import com.example.ysu.model.dto.adminDTO;
import com.example.ysu.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/admin")
    public List<adminDTO> AdminList() {

        return adminService.AdminList();
    }
}