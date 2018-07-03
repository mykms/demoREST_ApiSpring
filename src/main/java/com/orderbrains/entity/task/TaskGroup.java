package com.orderbrains.entity.task;

import com.orderbrains.entity.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "task_group")
public class TaskGroup extends BaseEntity {
    private String groupName;
}
