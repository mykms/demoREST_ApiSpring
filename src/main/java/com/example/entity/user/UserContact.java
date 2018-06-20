package com.example.entity.user;

import com.example.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "user_contact")
public class UserContact extends BaseEntity implements Serializable {
    private UserContactType contactType;
    private String contactValue;
    private User user;

    public UserContact() {
    }

    @Column(name = "contact_type", nullable = false)
    public UserContactType getContactType() {
        return contactType;
    }

    public void setContactType(UserContactType contactType) {
        this.contactType = contactType;
    }

    @Column(name = "contact_value", nullable = false)
    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserContact that = (UserContact) o;
        return contactType == that.contactType &&
                Objects.equals(contactValue, that.contactValue) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contactType, contactValue, user);
    }
}
