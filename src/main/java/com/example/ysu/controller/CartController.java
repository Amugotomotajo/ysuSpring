package com.example.ysu.controller;

import com.example.ysu.model.dto.cartDTO;
import com.example.ysu.service.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Slf4j
public class CartController {
    private final CartService cartService;

    @GetMapping("cart/list")
    public List<cartDTO> CartList() {
        return cartService.CartList();
    }

    @DeleteMapping("cart/delete/{menu_id}")
    public String CartDelete(@PathVariable int menu_id) {
        cartService.CartDelete(menu_id);
        return "redirect:/cart/list";
    }

    @PutMapping("cart/update")
    public String CartUpdate(@RequestBody List<cartDTO> Update) {
        cartService.CartUpdate(Update);
        return "redirect:/order/insert";
    }

}
