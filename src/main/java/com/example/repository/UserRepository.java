package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    //@Query("SELECT u FROM test_user u WHERE u.first_name=:name")
    //List<User> findUsersByFirstName(@Param("name") String name);

    List<User> findUsersByFirstName(String firs_name);
}
