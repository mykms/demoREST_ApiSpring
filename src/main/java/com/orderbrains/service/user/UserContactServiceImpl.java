package com.orderbrains.service.user;

import com.orderbrains.entity.user.User;
import com.orderbrains.entity.user.UserContact;
import com.orderbrains.entity.user.UserContactType;
import com.orderbrains.repository.user.UserContactRepository;
import com.orderbrains.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserContactServiceImpl extends BaseService implements UserContactService {
    @Autowired
    private UserContactRepository repository;

    @Override
    public List<UserContact> getAllContacts() {
        return repository.findAll();
    }

    @Override
    public List<UserContact> getAllByUser(User user) {
        return repository.findAllByUser(user);
    }

    @Override
    public List<UserContact> getByType(UserContactType contactType, User user) {
        return repository.findAllByContactTypeAndUser(contactType, user);
    }

    @Override
    public UserContact getContact(Long id) {
        return repository.getOne(id);
    }

    @Override
    public UserContact addContact(UserContact contact) {
        return repository.save(contact);
    }

    @Override
    public UserContact updateContact(UserContact contact) {
        return repository.save(contact);
    }

    @Override
    public void deleteAllForUser(User user) {
        repository.deleteByUser(user);
    }

    @Override
    public void deleteContact(UserContact contact) {
        repository.delete(contact);
    }

    @Override
    public void deleteContact(long id) {
        repository.deleteById(id);
    }
}
