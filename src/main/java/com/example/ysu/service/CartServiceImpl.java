package com.example.ysu.service;

import com.example.ysu.model.dao.cartDAO;
import com.example.ysu.model.dto.cartDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{
    private final cartDAO cartMapper;

    @Override
    public List<cartDTO> CartList() {
        return cartMapper.CartList();
    }

    @Override
    public void CartDelete(int menu_id) {
        cartMapper.CartDelete(menu_id);
    }

    @Override
    public void CartUpdate(List<cartDTO> cartList) {
        for (cartDTO cart : cartList) {
            int quantity = cart.getQuantity();
            int menuId = cart.getMenu_id();
            cartMapper.CartUpdate(quantity, menuId);
        }
    }
}
