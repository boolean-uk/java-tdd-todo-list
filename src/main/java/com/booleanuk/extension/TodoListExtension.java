package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.util.ArrayList;
import java.util.Collections;

public class TodoListExtension {

    private ArrayList<TaskExtension> tasks = new ArrayList<>();






    public void addTask(TaskExtension task){
        tasks.add(task);
    }


    public ArrayList<TaskExtension> getTasks() {
        return tasks;
    }

    public String showTasks() {
        StringBuilder tasksInString = new StringBuilder();

        for (TaskExtension task :
                tasks) {
            tasksInString.append(task.printTaskName()).append("\n");
        }

        return tasksInString.toString();
    }

    public void changeStatus(TaskExtension task, boolean status) {
        if(tasks.contains(task)){
            task.setStatus(status);
        }
    }

    public boolean getTaskStatus(TaskExtension task) {
        return task.getStatus();
    }

    public ArrayList<TaskExtension> getIncompleteTasks() {
        ArrayList<TaskExtension> incompleteTasks =  new ArrayList<>();
        for (TaskExtension task :
                tasks) {
            if (!task.getStatus()) {
                incompleteTasks.add(task);
            }
        }

        return incompleteTasks;
    }


    public ArrayList<TaskExtension> getCompletedTasks() {
        ArrayList<TaskExtension> completedTasks = new ArrayList<>();
        for (TaskExtension task :
                tasks) {
            if (task.getStatus()) {
                completedTasks.add(task);
            }
        }

        return completedTasks;

    }

    public String findTask(TaskExtension task) {
        if(tasks.contains(task)){
            return "I found a message!";
        }
        return "I didn't find message";
    }

    public void removeTask(TaskExtension task) {
        tasks.remove(task);
    }


    public void alphabeticallyInAscendingOrder() {
        Collections.sort(tasks);
    }

    public void alphabeticallyInDescendingOrder() {
        tasks.sort(Collections.reverseOrder());

    }

    public TaskExtension getTaskbyId(String id) {
        for (TaskExtension task :
                tasks) {
            if (task.getTaskExtensionId().equals(id)) {
                return task;
            }
        }
        return null;
    }
}