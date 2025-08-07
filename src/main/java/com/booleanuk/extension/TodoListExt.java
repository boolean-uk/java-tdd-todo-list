package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.util.ArrayList;
import java.util.List;

public class TodoListExt {
    List<TaskExt> tasks = new ArrayList<>();

    public void add(String desc) {
        tasks.add(new TaskExt(desc));
    }

    public void add(String desc, boolean status) {
        tasks.add(new TaskExt(desc, status));
    }

    public List<TaskExt> getTasks() {
        return tasks;
    }

    public List<TaskExt> getCompleteTasks() {
        List<TaskExt> complete = new ArrayList<>();
        for(TaskExt task: tasks){
            if (task.getStatus())
                complete.add(task);
        }
        return complete;
    }

    public List<TaskExt> getIncompleteTasks() {
        List<TaskExt> complete = new ArrayList<>();
        for(TaskExt task: tasks){
            if (!task.getStatus())
                complete.add(task);
        }
        return complete;
    }

    public TaskExt search(String search) {
        for(TaskExt task: tasks){
            if (task.getDescription().equals(search))
                return task;
        }
        return null;
    }

    public TaskExt searchById(String id) {
        for(TaskExt task: tasks){
            if (task.getId().equals(id))
                return task;
        }
        return null;
    }

    public boolean remove(String description) {
        TaskExt task = search(description);
        if (task == null)
            return false;
        tasks.remove(task);
        return true;
    }

    public List<TaskExt> getAlphAsc() {
        tasks.sort((a, b) -> a.getDescription().compareTo(b.getDescription()));
        return tasks;
    }

    public List<TaskExt> getAlphDesc() {
        tasks.sort((a, b) -> b.getDescription().compareTo(a.getDescription()));
        return tasks;
    }

    public boolean renameTask(String id, String newDesc) {
        TaskExt task = searchById(id);
        if (task == null)
            return false;
        task.setDescription(newDesc);
        return true;
    }

    public boolean changeTaskStatus(String id) {
        TaskExt task = searchById(id);
        if (task == null)
            return false;
        task.toggleStatus();
        return true;
    }
}
