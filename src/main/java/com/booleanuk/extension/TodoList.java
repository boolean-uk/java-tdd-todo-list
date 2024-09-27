package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public Task getTaskById(long id)
    {
        for (Task task : tasks)
        {
            if (task.id==id)
                return task;
        }
        return null;
    }

    public void updateTaskNameByById(long id, String name)
    {
        for (Task task : tasks)
        {
            if (task.id==id)
            {
                task.name= name;
                break;
            }
        }
    }
    public void updateTaskStatusByById(long id)
    {
        for (Task task : tasks)
        {
            if (task.id==id)
            {
                task.status= !task.status;
                break;
            }
        }
    }
    public String getCreationDateTimeByTaskId(long id)
    {
        for (Task task : tasks)
        {
            if (task.id==id)
            {
                return task.creationDataAndTime.toString();
            }
        }
        return "Not found";
    }
}
