package com.example.ysu.service;

import com.example.ysu.model.dao.MenuUpdateDAO;
import com.example.ysu.model.dto.menuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuUpdateServiceImpl implements MenuUpdateService {
    private final MenuUpdateDAO menuUpdateDAO;

    @Autowired
    public MenuUpdateServiceImpl(MenuUpdateDAO menuUpdateDAO) {
        this.menuUpdateDAO = menuUpdateDAO;
    }

    @Override
    public void MenuUpdate(menuDTO mdto) {
        menuUpdateDAO.updateData(mdto);
    }

    @Override
    public menuDTO getMenuById(int menu_id) {
        return menuUpdateDAO.getMenuById(menu_id);
    }

}
