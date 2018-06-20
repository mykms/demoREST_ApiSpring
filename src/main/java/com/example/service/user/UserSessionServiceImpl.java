package com.example.service.user;

import com.example.entity.Session;
import com.example.entity.user.User;
import com.example.repository.user.UserSessionRepository;
import com.example.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserSessionServiceImpl extends BaseService implements UserSessionService {
    @Autowired
    private UserSessionRepository repository;

    @Override
    public List<Session> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Session> getAllActive() {
        return repository.findAllByEndDateTimeIsNull();
    }

    @Override
    public List<Session> getAllNoActive() {
        return repository.findAllByEndDateTimeIsNotNull();
    }

    @Override
    public List<Session> getAllByUser(User user) {
        return repository.findAllByUser(user);
    }

    @Override
    public List<Session> getAllByNameOS(String nameOS) {
        return repository.findAllByNameOS(nameOS);
    }

    @Override
    public List<Session> getAllByNameAndVersionOS(String nameOS, String versionOS) {
        return repository.findAllByNameOSAndVersionOS(nameOS, versionOS);
    }

    @Override
    public void deleteByPushToken(String pushToken) {
        repository.deleteByPushToken(pushToken);
    }

    @Override
    public void deleteByUser(User user) {
        repository.deleteByUser(user);
    }

    @Override
    public void deleteBySessionId(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Session addSession(Session session) {
        return repository.save(session);
    }
}
