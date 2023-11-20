package com.example.ysu.model.dao;

import com.example.ysu.model.dto.cartDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface cartDAO {
    List<cartDTO> CartList();
    void CartDelete(int menu_id);
}
