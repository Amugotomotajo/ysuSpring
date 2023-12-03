package com.example.ysu.model.dao;

import com.example.ysu.model.dto.menuDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface menuDAO {
    List<menuDTO> MenuList();
}
