package com.example.service;

import com.example.entity.MainObject;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

    @Override
    public String get(Long id) {
        return "Our id =" + id;
    }

    @Override
    public MainObject get(MainObject mainObject) {
        return new MainObject(mainObject.getId());
    }
}
