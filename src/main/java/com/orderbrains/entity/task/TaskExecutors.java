package com.orderbrains.entity.task;

import com.orderbrains.entity.BaseEntity;
import com.orderbrains.entity.user.User;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "task_executors")
public class TaskExecutors extends BaseEntity {
    private User userExecutor;
    private Task task;
}
