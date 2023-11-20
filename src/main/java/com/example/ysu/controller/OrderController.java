package com.example.ysu.controller;

import com.example.ysu.model.dto.orderDTO;
import com.example.ysu.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/order/list")
    public List<orderDTO> OrderList() {
        return orderService.OrderList();
    }

    @GetMapping("/order/detail/{order_id}")
    public List<orderDTO> OrderDetailList(@PathVariable int order_id) { return orderService.OrderDetailList(order_id); }

    @PostMapping("/order/insert")
    public String orderInsert(@RequestBody orderDTO order) {
        orderService.OrderInsert(order);
        return "redirect:/cart/list";
    }
}
