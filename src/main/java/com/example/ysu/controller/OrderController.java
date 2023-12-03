package com.example.ysu.controller;

import com.example.ysu.model.dto.OrderDTO;
import com.example.ysu.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/myorders/{u_id}")
    public List<OrderDTO> selectMyOrders(@PathVariable String u_id) {

        return orderService.getMyOrders(u_id);
    }
}
