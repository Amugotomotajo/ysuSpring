package com.example.ysu.model.dao;

import com.example.ysu.model.dto.menuDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public class MenuUpdateDAO {
    @Autowired
    private SqlSession sqlSession;

    public void updateData(menuDTO mdto) {
        sqlSession.update("com.example.ysu.model.dao.MenuDAO.MenuUpdate", mdto);
    }

    public menuDTO getMenuById(int menu_id) {
        return sqlSession.selectOne("com.example.ysu.model.dao.MenuDAO.getMenuById", menu_id);
    }
}
