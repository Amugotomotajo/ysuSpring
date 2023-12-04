package com.example.ysu.service;

import com.example.ysu.model.dao.orderDAO;
import com.example.ysu.model.dto.orderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final orderDAO orderMapper;

    @Override
    public List<orderDTO> OrderList() {
        return orderMapper.OrderList();
    }

    @Override
    public List<orderDTO> OrderDetailList(int order_id) { return orderMapper.OrderDetailList(order_id); }

    @Transactional
    @Override
    public void OrderInsert(orderDTO order) {
        orderMapper.OrderInsert(order);
    }

}
