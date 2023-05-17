package com.booleanuk.extension;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasksList;
    public TodoList(){
        this.tasksList  = new ArrayList<>();
        //default Tasks
        this.addTask("Go to the doctor");
        this.addTask("Work out");
        this.addTask("Write some Java");

    }
    public void addTask(String name){
        this.tasksList.add(new Task(name));
    }
    public void addTask(Task task){
        this.tasksList.add(task);
    }
    public Task getTaskById(int id){
        for (Task task : this.tasksList) {
            if (task.taskId == id) {
                return task;
            }
        }
        return null;
    }
    public boolean updateTask(int id, String newName){
        for (Task task : this.tasksList) {
            if (task.taskId == id) {
                task.name = newName;
                return true;
            }
        }
        return false;
    }
    public boolean changeStatusByID(int id){
        for (Task task : this.tasksList) {
            if (task.taskId == id) {
                task.completed = !task.isCompleted();
                task.setCompleted(!task.completed);
                return true;
            }
        }
        return false;
    }
    public String showTasks(){
        String res ="";
        for(Task task:this.tasksList){
            System.out.println(task);
            res += task.name+"\n";
        }
        return res;
    }
}
