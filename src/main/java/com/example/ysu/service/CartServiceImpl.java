package com.example.ysu.service;

import com.example.ysu.model.dao.CartMapper;
import com.example.ysu.model.dto.CartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    private final CartMapper cartMapper;

    @Autowired
    public CartServiceImpl(CartMapper cartMapper) {
        this.cartMapper =cartMapper;
    }

    @Override
    public void insertCart(CartDTO cartDTO) {
        cartMapper.insertData(cartDTO);
    }
}
