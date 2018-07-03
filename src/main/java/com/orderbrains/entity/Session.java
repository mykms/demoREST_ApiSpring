package com.orderbrains.entity;

import com.orderbrains.entity.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "session")
public class Session extends BaseEntity implements Serializable {
    private Long startDateTime;
    private Long endDateTime;
    private Long lastEnter;
    private String nameOS;
    private String versionOS;
    private String pushToken;
    private User user;

    public Session(Long id) {
        super(id);
    }

    @Column(name = "startDateTime")
    public Long getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Long startDateTime) {
        this.startDateTime = startDateTime;
    }

    @Column(name = "endDateTime")
    public Long getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Long endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Column(name = "lastEnter")
    public Long getLastEnter() {
        return lastEnter;
    }

    public void setLastEnter(Long lastEnter) {
        this.lastEnter = lastEnter;
    }

    @Column(name = "nameOS")
    public String getNameOS() {
        return nameOS;
    }

    public void setNameOS(String nameOS) {
        this.nameOS = nameOS;
    }

    @Column(name = "versionOS")
    public String getVersionOS() {
        return versionOS;
    }

    public void setVersionOS(String versionOS) {
        this.versionOS = versionOS;
    }

    @Column(name = "pushToken")
    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
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
        Session session = (Session) o;
        return Objects.equals(startDateTime, session.startDateTime) &&
                Objects.equals(endDateTime, session.endDateTime) &&
                Objects.equals(lastEnter, session.lastEnter) &&
                Objects.equals(nameOS, session.nameOS) &&
                Objects.equals(versionOS, session.versionOS) &&
                Objects.equals(pushToken, session.pushToken) &&
                Objects.equals(user, session.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), startDateTime, endDateTime, lastEnter, nameOS, versionOS, pushToken, user);
    }
}
