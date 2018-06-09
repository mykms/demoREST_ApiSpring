package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl extends BaseService implements UserService {
    private List<User> userList = new ArrayList<>();

    //@Autowired private UserRepository repository;

    @Override
    public List<User> getAll() {
       return userList;
    }

    @Override
    public User getUser(Long id) {
        User resUser = null;
//        for (User user : userList) {
//            if (user.getId().equals(id)) {
//                resUser = user;
//                break;
//            }
//        }
/*
        repository.findUserById(id);
        Optional<User> userFromDb = repository.findById(id);
        if (userFromDb.isPresent()) {
            resUser = userFromDb.get();
        }
*/
        return resUser;
    }

    @Override
    public List<User> getUsers(String firstName) {
        List<User> userList = new ArrayList<>();
        for (User user : userList) {
            if (user.getFirstName().equalsIgnoreCase(firstName)) {
                userList.add(user);
            }
        }
        return userList;
    }

    @Override
    public User addUser(User user) {
        userList.add(user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                userList.remove(user);
                break;
            }
        }
    }

    @Override
    public void deleteUser(User user) {
        userList.remove(user);
    }

    @Override
    public User changeName(Long id, String newName) {
        return getUser(id, newName, new User());
    }

    private User getUser(Long id, String newName, User user) {
        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            if (user.getId().equals(id)) {
                user.setFirstName(newName);
                userList.set(i, user);
                break;
            }
        }
        return user;
    }
}
