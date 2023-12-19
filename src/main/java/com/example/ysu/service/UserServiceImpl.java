package com.example.ysu.service;

import com.example.ysu.model.dao.UserDAO;
import com.example.ysu.model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDTO getUserByUId(String u_id) {
        return userDAO.getUserByUId(u_id);
    }

    @Override
    public List<UserDTO> UserList() {
        return userDAO.UserList();
    }
}

