package com.example.service;

import com.example.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAll();
    User getUser(long id);
    List<User> getUsers(String firstName);

    User addUser(User user);

    void deleteUser(long id);
    void deleteUser(User user);

    User changeName(long id, String newName);
}
