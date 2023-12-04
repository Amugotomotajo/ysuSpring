package com.example.ysu.controller;

import com.example.ysu.model.dto.userDTO;
import com.example.ysu.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/{u_id}")
    public ResponseEntity<userDTO> postUserByUId(@PathVariable String u_id) {
        userDTO user = userService.getUserByUId(u_id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}