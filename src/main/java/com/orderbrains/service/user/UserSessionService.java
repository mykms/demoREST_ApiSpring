package com.orderbrains.service.user;

import com.orderbrains.entity.Session;
import com.orderbrains.entity.user.User;
import java.util.List;

public interface UserSessionService {
    List<Session> getAll();
    List<Session> getAllActive();
    List<Session> getAllNoActive();
    List<Session> getAllByUser(User user);
    List<Session> getAllByNameOS(String nameOS);
    List<Session> getAllByNameAndVersionOS(String nameOS, String versionOS);

    void deleteByPushToken(String pushToken);
    void deleteByUser(User user);
    void deleteBySessionId(Long id);

    Session addSession(Session session);
}
