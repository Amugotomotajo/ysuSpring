package com.example.ysu.model.dao;

import com.example.ysu.model.dto.CartDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public class CartDAO {
    @Autowired
    private SqlSession sqlSession;

    public void insertData(CartDTO cartDTO) {
        sqlSession.insert("CartMapper.InsertCart", cartDTO);
    }

    List<CartDTO> CartList();
    void CartDelete(int menu_id);


    void CartUpdate(@Param("quantity") int quantity, @Param("menu_id") int menu_id);

    void CartUpdate();
}
