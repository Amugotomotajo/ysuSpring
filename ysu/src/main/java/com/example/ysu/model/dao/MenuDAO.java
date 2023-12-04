package com.example.ysu.model.dao;

import com.example.ysu.model.dto.menuDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MenuDAO {
    List<menuDTO> MenuList();

    List<menuDTO> AdminMenuList();

    void MenuInsert(menuDTO mto);

    void MenuUpdate(menuDTO mto);

    menuDTO getMenuById(int menuId);

    menuDTO getAdminMenuById(int menuId);


    void MenuDelete(int menuId);
}


