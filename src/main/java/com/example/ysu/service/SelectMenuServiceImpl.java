package com.example.ysu.service;

import com.example.ysu.model.dao.SelectMenuDAO;
import com.example.ysu.model.dao.SelectMenuDAO;
import com.example.ysu.model.dto.SelectMenuDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SelectMenuServiceImpl implements SelectMenuService {
    private final SelectMenuDAO selectMenuDAO;

    @Override
    public List<SelectMenuDTO> SelectMenuList() {

        return selectMenuDAO.SelectMenuList();
    }

    @Override
    public SelectMenuDTO getMenuById(Long menuId) {
        return selectMenuDAO.getMenuById(menuId);
    }
}
