package com.example.ysu.service;

import com.example.ysu.model.dao.UserMapper;
import com.example.ysu.model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUserByUId(String u_id) {
        return userMapper.getUserByUId(u_id);
    }
}

