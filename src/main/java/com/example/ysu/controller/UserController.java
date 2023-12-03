package com.example.ysu.controller;

import com.example.ysu.model.dto.UserDTO;
import com.example.ysu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/{u_id}")
    public ResponseEntity<UserDTO> postUserByUId(@PathVariable String u_id) {
        UserDTO user = userService.getUserByUId(u_id);
        System.out.println(user);
        System.out.println("hi");
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

