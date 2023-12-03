package com.example.ysu.service;

import com.example.ysu.model.dto.CartDTO;
import org.springframework.stereotype.Service;

@Service
public interface CartService {
    void insertCart(CartDTO cartDTO);
}
