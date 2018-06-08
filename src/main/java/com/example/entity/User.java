package com.example.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@DynamicUpdate
@javax.persistence.Entity
@javax.persistence.Table(name = "User")
public class User extends BaseEntity {
    @NotEmpty
    @Column(name = "FirstName")
    private String firstName;

    private String surname;
    private String patronymic;
    private short age;
    private Date birthday;

    public User() {
        //
    }

    public User(String firstName, String surname, String patronymic, short age, Date birthday) {
        this.firstName = firstName;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
