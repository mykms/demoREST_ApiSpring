package com.example.service;

import com.example.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAll();
    User getUser(Long id);
    List<User> getUsers(String firstName);

    User addUser(User user);

    void deleteUser(Long id);

    User updateUserName(Long id, String newName);
}