package com.example.ysu.model.dao;

import com.example.ysu.model.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    UserDTO getUserByUId(String u_id);
}
