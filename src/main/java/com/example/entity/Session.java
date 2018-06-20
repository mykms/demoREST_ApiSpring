package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "session")
public class Session extends BaseEntity implements Serializable {
    private Long startDateTime;
    private Long endDateTime;
    private Long lastEnter;
    private Long user_id;
    private String nameOS;
    private String versionOS;
    private String pushToken;

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

    @Column(name = "user_id")
    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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
}
