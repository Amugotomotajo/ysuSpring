package com.example.ysu.controller;

import com.example.ysu.model.dto.CartDTO;
import com.example.ysu.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/insertCart")
    public ResponseEntity<String> insertData(@RequestBody CartDTO cartDTO) {
        cartService.insertCart(cartDTO);
        return ResponseEntity.ok("Data inserted successfully");
    }
}