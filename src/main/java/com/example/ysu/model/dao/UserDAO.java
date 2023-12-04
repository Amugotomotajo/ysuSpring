package com.example.ysu.model.dao;

import com.example.ysu.model.dto.userDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDAO {
    userDTO getUserByUId(String u_id);
}
