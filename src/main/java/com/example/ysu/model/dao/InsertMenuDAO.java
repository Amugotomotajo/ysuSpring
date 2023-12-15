package com.example.ysu.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public class InsertMenuDAO {
    @Autowired
    private SqlSession sqlSession;

    public void insertData(MenuDAO mdto) {
        sqlSession.insert("com.example.ysu.model.dao.MenuDAO.MenuInsert", mdto);
    }
}
