package com.example.ysu.service;

import com.example.ysu.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getUserByUId(String u_id);
    public List<UserDTO> UserList();
}
