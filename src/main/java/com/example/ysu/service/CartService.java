package com.example.ysu.service;

import com.example.ysu.model.dto.cartDTO;

import java.util.List;

public interface CartService {
    public List<cartDTO> CartList();
    void CartDelete(int menu_id);
    void CartUpdate(List<cartDTO> cartList);

}
