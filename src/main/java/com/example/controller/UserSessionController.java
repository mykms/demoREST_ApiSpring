package com.example.controller;

import com.example.service.user.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/session")
public class UserSessionController {
    @Autowired
    private UserSessionService contactService;
}
