package com.example.ysu.service;

import com.example.ysu.model.dto.CartDTO;

import java.util.List;

public interface CartService {
    void insertCart(CartDTO cartDTO);

    List<CartDTO> CartList(String u_id);
    void CartDelete(int menu_id);
    void CartUpdate(List<CartDTO> cartList);
}
