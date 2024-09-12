package com.booleanuk.extension;


import com.booleanuk.core.TaskStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class TodoListExtension {
    List<TaskExtension> tasks;

    public TodoListExtension() {
        tasks = new ArrayList<>();
    }

    public void add(TaskExtension task) {
        this.tasks.add(task);
    }

    public TaskExtension getTaskById(UUID id) {
        return this.tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElseThrow();
    }

    public void changeStatusById(UUID id){
        TaskExtension task = this.getTaskById(id);
        if(task.getStatus().equals(TaskStatusExtension.COMPLETED)){
            task.setStatus(TaskStatusExtension.INCOMPLETED);
        }else{
            task.setStatus(TaskStatusExtension.COMPLETED);
        }
    }

    public HashMap<String, LocalDateTime> timesOfCreation(){
        HashMap<String, LocalDateTime> times = new HashMap();
        for (TaskExtension t: this.tasks){
            times.put(t.getTitle(), t.getDate());
        }
        return times;
    }

    public void renameTask(UUID id, String nameAfter) {
        this.tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElseThrow().setTitle(nameAfter);

    }
}

