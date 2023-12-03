package com.example.ysu.service;

import com.example.ysu.model.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {

    List<OrderDTO> getMyOrders(String u_id);
}
