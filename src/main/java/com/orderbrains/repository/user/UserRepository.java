package com.orderbrains.repository.user;

import com.orderbrains.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.firstName=:name")
    List<User> findUsersByFirstNameQuery(@Param("name") String name);

    List<User> findUsersByFirstName(String firs_name);
}
