package com.orderbrains.entity.task;

import com.orderbrains.entity.BaseEntity;
import com.orderbrains.entity.user.User;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "task_status_history")
public class TaskStatusHistory extends BaseEntity {
    private Task task;
    private TaskStatus status;
    private User user;
    private long dateStart;
    private long dateEnd;
    private boolean lastStatus;// или не нужно, будем по дате смотреть?
}
