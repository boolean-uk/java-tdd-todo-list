package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;

public class ToDoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public Task getTask(int id){
        for (Task task : tasks){
            if (task.getId() == id){
                return task;
            }
        }
        System.out.println("No task with this ID!");
        return null;
    }

    public void updateName(int id, String newName){
        for (Task task : tasks){
            if (task.getId() == id){
                task.changeName(newName);
            }
        }
        System.out.println("No task with given ID!");
    }

    public void addTask(Task task){
        if (!tasks.contains(task)){
            tasks.add(task);
        }
    }

    public void removeTask(String taskName){
        tasks.removeIf(task -> task.getName().equals(taskName));
    }

    public void changeStatus(int id, boolean completed){
        for (Task task : tasks){
            if (task.getId() == id){
                task.setStatus(completed);
            }
        }
    }

    public ArrayList<String> seeAllTasks(){
        ArrayList<String> showTasks = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++){
            showTasks.add(i, tasks.get(i).getName());
        }
        return showTasks;
    }

    public ArrayList<Task> getCompletedTasks(){
        ArrayList<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks){
            if (task.getStatus()){
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public ArrayList<Task> getIncompleteTasks(){
        ArrayList<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks){
            if (!task.getStatus()){
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }

    public Task search(String taskName){
        for (Task task : tasks){
            if (task.getName().equals(taskName)){
                return task;
            }
        }
        System.out.println("The task was not found or does not exist!");
        return null;
    }

    public ArrayList<String> alphabeticalA(){
        ArrayList<String> alphabeticalAscending = new ArrayList<>();
        for (Task task : tasks){
            alphabeticalAscending.add(task.getName());
        }
        Collections.sort(alphabeticalAscending);
        return alphabeticalAscending;
    }

    public ArrayList<String> alphabeticalD(){
        ArrayList<String> alphabeticalDescending = new ArrayList<>();
        for (Task task : tasks){
            alphabeticalDescending.add(task.getName());
        }
        Collections.sort(alphabeticalDescending);
        Collections.reverse(alphabeticalDescending);
        return alphabeticalDescending;
    }

}