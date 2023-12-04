package com.example.ysu.service;

import com.example.ysu.model.dto.menuDTO;
import org.springframework.stereotype.Service;

@Service
public interface MenuUpdateService {
    void MenuUpdate(menuDTO mdto);
    menuDTO getMenuById(int menu_id); // ID로 데이터 가져오기
}
