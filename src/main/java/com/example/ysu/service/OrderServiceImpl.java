package com.example.ysu.service;

import com.example.ysu.model.dao.OrderDAO;
import com.example.ysu.model.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final OrderDAO orderDAO;

    @Override
    public List<OrderDTO> getMyOrders(String u_id) {
        return orderDAO.getMyOrders(u_id);
    }

    @Override
    public List<OrderDTO> OrderList(String u_id) {
        return orderDAO.OrderList(u_id);
    }

    @Override
    public List<OrderDTO> OrderDetailList(int order_id, String u_id) {
        return orderDAO.OrderDetailList(order_id, u_id);
    }

    @Transactional
    @Override
    public void OrderInsert(OrderDTO order) {
        orderDAO.OrderInsert(order);
    }
}
