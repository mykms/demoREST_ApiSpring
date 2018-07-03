package com.orderbrains.entity.task;

import com.orderbrains.entity.BaseEntity;
import com.orderbrains.entity.user.User;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task extends BaseEntity {
    private String name;
    private String fullData;
    private Long dateStart;// Оно же дата создания
    private Long dateEnd;
    private Double price;
    private TaskGroup groupID;
    private TaskLevel levelID;
    private User userAuthor;
    private TaskExecutors userExecutor;
    private TaskStatusHistory statusHistory;
}
