package com.example.ysu.service;

import com.example.ysu.model.dao.menuDAO;
import com.example.ysu.model.dto.menuDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl  implements MenuService{
    private final menuDAO menuMapper;

    @Override
    public List<menuDTO> MenuList() {
        return menuMapper.MenuList();
    }
}
