package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TodoList {
    List<Task> tasks = new ArrayList<>();


    public boolean addTask(Task task) {
        if(tasks.contains(task)) return false;
        else{
            tasks.add(task);
            return true;
        }
    }

    public String getAllTasks() {
        return tasks.toString();
    }

    public String getAllTasks(boolean isCompleted){
        return tasks.stream().filter(task -> task.isCompleted == isCompleted).toList().toString();
    }

    public String search(String name) {
        for(Task task : tasks) {
            if(task.name.equals(name))
                return "found";
        }
        return "not found";
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    public String listTasks(String order) {
        if (order.equals("descending"))
            tasks.sort((task1, task2) -> task2.name.compareTo(task1.name));
        else
            tasks.sort((task1, task2) -> task1.name.compareTo(task2.name));

        return tasks.toString();
    }

    public boolean changeStatus(Task task) {
        if (tasks.contains(task)) {
            task.isCompleted = !task.isCompleted;
            return true;
        }
        return false;
    }

    public Optional<Task> getTaskByUUID(UUID uuid) {
        return tasks.stream().filter(task -> task.uuid == uuid).findFirst();
    }

    public boolean updateTaskByUUID(UUID uuid, String name) {
        Optional<Task> task = getTaskByUUID(uuid);
        if(task.isPresent()){
            task.get().name = name;
            return true;
        }else{
            return false;
        }
    }

    public boolean changeStatus(UUID uuid) {
        Optional<Task> taskByUUID = getTaskByUUID(uuid);
        if(taskByUUID.isPresent()) {
            changeStatus(taskByUUID.get());
            return true;
        }
        return false;
    }


    public Optional<LocalDateTime> getDateOfTask(Task task) {
        if(tasks.contains(task)){
            return Optional.of(task.dateOfCreation);
        }
        else{
            return Optional.empty();
        }
    }
}
