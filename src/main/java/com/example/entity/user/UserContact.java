package com.example.entity.user;

import com.example.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "user_contact")
public class UserContact extends BaseEntity implements Serializable {
    private UserContactType contactType;
    private String contactValue;
    private Long userId;

    public UserContact() {
    }

    @Column(name = "contact_type")
    public UserContactType getContactType() {
        return contactType;
    }

    public void setContactType(UserContactType contactType) {
        this.contactType = contactType;
    }

    @Column(name = "contact_value")
    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserContact that = (UserContact) o;
        return contactType == that.contactType &&
                Objects.equals(contactValue, that.contactValue) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contactType, contactValue, userId);
    }
}
