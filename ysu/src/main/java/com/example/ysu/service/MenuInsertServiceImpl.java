package com.example.ysu.service;

import com.example.ysu.model.dao.MenuInsertDAO;
import com.example.ysu.model.dto.menuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuInsertServiceImpl implements MenuInsertService {
    private final MenuInsertDAO menuInsertDAO;

    @Autowired
    public MenuInsertServiceImpl(MenuInsertDAO menuInsertDAO) {
        this.menuInsertDAO = menuInsertDAO;
    }

    @Override
    public void MenuInsert(menuDTO mdto) {
        menuInsertDAO.insertData(mdto);
    }
}
