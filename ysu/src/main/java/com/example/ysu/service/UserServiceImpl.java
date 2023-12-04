package com.example.ysu.service;

import com.example.ysu.model.dao.userDAO;
import com.example.ysu.model.dto.userDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final userDAO userMapper;

    @Override
    public List<userDTO> UserList() {
        return userMapper.UserList();
    }
}
