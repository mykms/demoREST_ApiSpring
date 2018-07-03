package com.orderbrains.service.user;

import com.orderbrains.entity.user.User;
import com.orderbrains.entity.user.UserContact;
import com.orderbrains.entity.user.UserContactType;
import java.util.List;

public interface UserContactService {
    List<UserContact> getAllContacts();
    List<UserContact> getAllByUser(User user);
    List<UserContact> getByType(UserContactType contactType, User user);
    UserContact getContact(Long id);

    UserContact addContact(UserContact contact);
    UserContact updateContact(UserContact contact);

    void deleteAllForUser(User user);
    void deleteContact(UserContact contact);
    void deleteContact(long id);
}
