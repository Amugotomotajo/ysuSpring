package com.example.ysu.service;

import com.example.ysu.model.dto.orderDTO;

import java.util.List;

public interface OrderService {
    public List<orderDTO> OrderList();

    public List<orderDTO> OrderDetailList(int order_id);

    void OrderInsert(orderDTO order);
}
