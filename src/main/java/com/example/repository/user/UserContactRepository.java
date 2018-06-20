package com.example.repository.user;

import com.example.entity.user.User;
import com.example.entity.user.UserContact;
import com.example.entity.user.UserContactType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserContactRepository extends JpaRepository<UserContact, Long> {
    List<UserContact> findAllByUser(User user);
    List<UserContact> findAllByContactTypeAndUser(UserContactType contactType, User user);
    void deleteByUser(User user);
}
