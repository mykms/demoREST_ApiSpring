package com.example.entity.user;

import com.example.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "user_status")
public class UserStatus extends BaseEntity implements Serializable {
    private Date lastEnter;
    private Date blockDate;
    private boolean delete;
    private User user;

    public UserStatus() {
    }

    public UserStatus(Long id) {
        super(id);
    }

    @Column(name = "last_enter_date")
    public Date getLastEnter() {
        return lastEnter;
    }

    public void setLastEnter(Date lastEnter) {
        this.lastEnter = lastEnter;
    }

    @Column(name = "block_date")
    public Date getBlockDate() {
        return blockDate;
    }

    public void setBlockDate(Date blockDate) {
        this.blockDate = blockDate;
    }

    @Column(name = "delete")
    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    @OneToOne
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
        UserStatus that = (UserStatus) o;
        return delete == that.delete &&
                Objects.equals(lastEnter, that.lastEnter) &&
                Objects.equals(blockDate, that.blockDate) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lastEnter, blockDate, delete, user);
    }
}
