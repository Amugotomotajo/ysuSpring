package com.example.ysu.model.dao;

import com.example.ysu.model.dto.CartDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public class CartMapper {
    @Autowired
    private SqlSession sqlSession;

    public void insertData(CartDTO cartDTO) {
        sqlSession.insert("CartMapper.InsertCart", cartDTO);
    }
}
