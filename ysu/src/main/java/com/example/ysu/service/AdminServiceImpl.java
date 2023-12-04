package com.example.ysu.service;

import com.example.ysu.model.dao.AdminDAO;
import com.example.ysu.model.dto.adminDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminDAO adminDAO;

    @Override
    public List<adminDTO> AdminList(){
        return adminDAO.AdminList();
    }

}
