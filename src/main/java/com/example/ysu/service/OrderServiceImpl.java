package com.example.ysu.service;

import com.example.ysu.model.dao.OrderMapper;
import com.example.ysu.model.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final OrderMapper orderMapper;

    @Override
    public List<OrderDTO> getMyOrders(String u_id) {

        return orderMapper.getMyOrders(u_id);
    }
}
