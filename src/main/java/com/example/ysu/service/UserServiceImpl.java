package com.example.ysu.service;

import com.example.ysu.model.dao.UserDAO;
import com.example.ysu.model.dto.userDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userMapper;

    @Override
    public userDTO getUserByUId(String u_id) {
        return userMapper.getUserByUId(u_id);
    }
}
