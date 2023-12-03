package com.example.ysu.model.dao;

import com.example.ysu.model.dto.OrderDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderMapper {

    List<OrderDTO> getMyOrders(String u_id);
}
