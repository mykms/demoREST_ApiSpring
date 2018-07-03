package com.orderbrains.repository.user;

import com.orderbrains.entity.Session;
import com.orderbrains.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSessionRepository extends JpaRepository<Session, Long> {
    List<Session> findAllByEndDateTimeIsNull();
    List<Session> findAllByEndDateTimeIsNotNull();
    List<Session> findAllByUser(User user);
    List<Session> findAllByNameOS(String nameOS);
    List<Session> findAllByNameOSAndVersionOS(String nameOS, String versionOS);
    void deleteByPushToken(String pushToken);
    void deleteByUser(User user);
}
