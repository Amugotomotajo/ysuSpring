package com.example.ysu.service;

import com.example.ysu.model.dto.menuDTO;
import org.springframework.stereotype.Service;

@Service
public interface MenuInsertService {
    void MenuInsert(menuDTO mdto);
}
