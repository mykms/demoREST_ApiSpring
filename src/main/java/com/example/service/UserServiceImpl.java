package com.example.service;

import com.example.entity.user.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl extends BaseService implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getUser(Long id) {
        User resUser = null;

        Optional<User> userFromDb = repository.findById(id);
        if (userFromDb.isPresent()) {
            resUser = userFromDb.get();
        }

        return resUser;
    }

    @Override
    public List<User> getUsers(String firstName) {
        return repository.findUsersByFirstName(firstName);
    }

    @Override
    public User addUser(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User updateUserName(Long id, String newName) {
        User user = getUser(id);
        user.setFirstName(newName);
        return repository.saveAndFlush(user);
    }
}
