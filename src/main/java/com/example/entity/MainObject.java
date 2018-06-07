package com.example.entity;

import java.util.Objects;

public class MainObject {

    private Long id;

    public MainObject() {
    }

    public MainObject(Long id) {
        this.id = id + 1000000;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainObject that = (MainObject) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
