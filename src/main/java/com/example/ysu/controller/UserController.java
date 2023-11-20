package com.example.ysu.controller;

import com.example.ysu.model.dto.userDTO;
import com.example.ysu.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<userDTO> UserList() {
        return userService.UserList();
    }
}
