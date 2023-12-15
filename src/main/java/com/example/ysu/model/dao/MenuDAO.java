package com.example.ysu.model.dao;

import com.example.ysu.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MenuMapper {
    List<MenuDTO> menuList();
    MenuDTO getMenuById(Long menuId);
}
