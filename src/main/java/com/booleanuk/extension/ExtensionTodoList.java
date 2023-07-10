package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.time.LocalDateTime;
import java.util.*;

public class ExtensionTodoList {
    private final HashMap<Integer, ExtensionTask> taskHashMap;
    private int idCounter;
    ExtensionTodoList() {
        taskHashMap = new HashMap<Integer, ExtensionTask>();
        idCounter = 0;
    }
    public boolean contains(ExtensionTask task) {
        return taskHashMap.containsValue(task);
    }
    public boolean add(String description, boolean isComplete) {
        for(ExtensionTask task : taskHashMap.values()) {
            if(task.getDescription().equals(description))
                return false;
        }
        taskHashMap.put(idCounter++, new ExtensionTask(description, isComplete));
        return true;
    }
    public boolean add(ExtensionTask task) {
        if(taskHashMap.containsValue(task))
            return false;
        taskHashMap.put(idCounter++, task);
        return true;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(ExtensionTask task : taskHashMap.values())
            sb.append(task);
        return sb.toString();
    }
    public void changeStatus(String taskDescription, boolean newStatus) {
        for(ExtensionTask task : taskHashMap.values())
            if(task.getDescription().equals(taskDescription)) {
                task.setCompletion(newStatus);
                return;
            }
    }
    public String getTasksByCompletion(boolean isComplete) {
        StringBuilder sb = new StringBuilder();
        for(ExtensionTask task : taskHashMap.values())
            if(task.getCompletion() == isComplete)
                sb.append(task);
        return sb.toString();
    }

    public ExtensionTask search(String taskDescription) {
        for(ExtensionTask task : taskHashMap.values())
            if(task.getDescription().equals(taskDescription))
                return task;
        System.out.println("Task with matching description not found.");
        return null;
    }

    public void remove(String taskDescription) {
        taskHashMap.entrySet().removeIf(entry -> (entry.getValue().getDescription().equals(taskDescription)));
    }
    public void remove(ExtensionTask task) {
        taskHashMap.entrySet().removeIf(entry -> (entry.getValue().equals(task)));
    }
    public List<ExtensionTask> getInAlphabeticalOrder(boolean ascending) {
        List<ExtensionTask> list = new LinkedList<>(taskHashMap.values());
        list.sort(Comparator.comparing(ExtensionTask::getDescription));
        if(!ascending) Collections.reverse(list);
        return list;
    }
    public ExtensionTask getTaskById(int id) {
        return taskHashMap.get(id);
    }
    public void updateDescriptionById(int id, String newDescription) {
        ExtensionTask task = taskHashMap.get(id);
        if (task != null) {
            task.setDescription(newDescription);
        }
    }
    public void updateStatusById(int id, boolean newCompletion) {
        ExtensionTask task = taskHashMap.get(id);
        if (task != null) {
            task.setCompletion(newCompletion);
        }
    }
    public LocalDateTime getCreationDateById(int id) {
        ExtensionTask task = taskHashMap.get(id);
        return task == null ? null : task.getCreationDate();
    }
}
