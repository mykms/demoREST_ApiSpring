package com.example.entity.user;

import com.example.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user_person")
public class User extends BaseEntity implements Serializable {
    private String user_login;
    private String user_password;
    private String firstName;
    private String surname;
    private String patronymic;
    private Short age;
    private Date birthday;
    private UserType userType;
    private UserGender gender;
    private Set<UserContact> userContact;
    private UserStatus status;

    public User() {
        //
    }

    public User(Long id) {
        super(id);
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "patronymic")
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Column(name = "age")
    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "user_login")
    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    @Column(name = "user_password")
    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Column(name = "user_type")
    @Enumerated(EnumType.STRING)
    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Column(name = "gender")
    @Enumerated(EnumType.ORDINAL)
    public UserGender getGender() {
        return gender;
    }

    public void setGender(UserGender gender) {
        this.gender = gender;
    }

    @OneToMany
    @Column(name = "contact_id")
    public Set<UserContact> getUserContact() {
        return userContact;
    }

    public void setUserContact(Set<UserContact> userContact) {
        this.userContact = userContact;
    }

    @OneToOne
    //@Column(name = "status_id")
    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(user_login, user.user_login) &&
                Objects.equals(user_password, user.user_password) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(patronymic, user.patronymic) &&
                Objects.equals(age, user.age) &&
                Objects.equals(birthday, user.birthday) &&
                userType == user.userType &&
                gender == user.gender &&
                Objects.equals(userContact, user.userContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), user_login, user_password, firstName, surname, patronymic, age, birthday, userType, gender, userContact);
    }
}
