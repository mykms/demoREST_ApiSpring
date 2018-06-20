package com.example.service.user;

import com.example.entity.user.User;
import java.util.List;

public interface UserService {
    List<User> getAll();
    User getUser(Long id);
    List<User> getUsers(String firstName);

    User addUser(User user);

    void deleteUser(Long id);

    User updateUserName(User user);
}