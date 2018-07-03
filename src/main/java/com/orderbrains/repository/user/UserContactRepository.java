package com.orderbrains.repository.user;

import com.orderbrains.entity.user.User;
import com.orderbrains.entity.user.UserContact;
import com.orderbrains.entity.user.UserContactType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserContactRepository extends JpaRepository<UserContact, Long> {
    List<UserContact> findAllByUser(User user);
    List<UserContact> findAllByContactTypeAndUser(UserContactType contactType, User user);
    void deleteByUser(User user);
}
