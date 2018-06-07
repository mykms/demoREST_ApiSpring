package com.example.service;

import com.example.entity.MainObject;

public interface MainService {

    String get(Long id);

    MainObject get(MainObject mainObject);
}
