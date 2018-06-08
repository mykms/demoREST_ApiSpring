package com.example.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends BaseService implements UserService {
    private List<User> userList = new ArrayList<>();

    @Override
    public List<User> getAll() {
       return userList;
    }

    @Override
    public User getUser(long id) {
        User resUser = null;
        for (User user : userList) {
            if (user.getId() == id) {
                resUser = user;
                break;
            }
        }
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
    public void deleteUser(long id) {
        for (User user : userList) {
            if (user.getId() == id) {
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
    public User changeName(long id, String newName) {
        return getUser(id, newName, new User());
    }

    private User getUser(long id, String newName, User user) {
        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            if (user.getId() == id) {
                user.setFirstName(newName);
                userList.set(i, user);
                break;
            }
        }
        return user;
    }
}
