package com.example.ysu.service;

import com.example.ysu.model.dao.MenuDAO;
import com.example.ysu.model.dto.menuDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuDAO menuDAO;

    @Override
    public List<menuDTO> MenuList(){
        return menuDAO.MenuList();
    }

    @Override
    public List<menuDTO> AdminMenuList(){
        return menuDAO.AdminMenuList();
    }

    @Override
    public menuDTO getMenuById(int menuId){
        return menuDAO.getMenuById(menuId);
    }

    @Override
    public menuDTO getAdminMenuById(int menuId){
        return menuDAO.getAdminMenuById(menuId);
    }


    @Override
    public void MenuDelete(int menuId) { menuDAO.MenuDelete(menuId);
    }


}