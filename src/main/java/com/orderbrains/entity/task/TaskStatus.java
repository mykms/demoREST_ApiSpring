package com.orderbrains.entity.task;

import com.orderbrains.entity.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "task_status")
public class TaskStatus extends BaseEntity {
    private String name;
    private boolean active;
}
