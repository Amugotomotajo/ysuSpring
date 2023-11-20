package com.example.ysu.model.dao;

import com.example.ysu.model.dto.orderDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface orderDAO {
    List<orderDTO> OrderList();
    List<orderDTO> OrderDetailList(int order_id);

    void OrderInsert(orderDTO order);

    void orderInsertDAO(orderDTO orderDTO);
}
