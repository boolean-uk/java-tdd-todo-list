package com.booleanuk.extension;

import java.rmi.server.UID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class TodoListExtension {
    public static class Task{
        public String description;
        public boolean isCompleted;
        private static int nextId = 0;
        private int id;
        public LocalDateTime dateCreated;



        public Task(String task){
            this.description = task;
            this.isCompleted = false;
            this.id = nextId++;
            this.dateCreated = LocalDateTime.now();
        }
        public int getID(){
            return id;
        }
        public String getDateCreated(){
            return this.dateCreated.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        }

        public String getDescription(){
            return description;
        }
    }
    public String getCreationOfTask(int id){
        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).id == id){
                return this.list.get(i).getDateCreated();
            }
        }
        return null;
    }

    ArrayList<Task> list;

    public TodoListExtension(){
        this.list = new ArrayList<>();
    }

    public int getIncompleteTasks(){
        ArrayList<Task> incompleteList = new ArrayList<>();
        for (int i = 0; i < this.list.size(); i++) {
            if(!this.list.get(i).isCompleted){
                incompleteList.add(this.list.get(i));
            }
        }
        return incompleteList.size();
    }
    public int getCompletedTasks(){
        ArrayList<Task> completedList = new ArrayList<>();
        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).isCompleted){
                completedList.add(this.list.get(i));
            }
        }
        return completedList.size();
    }

    public String getTaskByID(int num){
        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).id == num){
                return list.get(i).description;
            }
        }
        return null;
    }

    public String updateTaskByID(int num, String update){
        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).id == num){
                this.list.get(i).description = update;
                return this.list.get(i).description;
            }
        }
        System.out.println("No Task found");
        return null;
    }
    public String updateTaskByID(int num){
        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).id == num){
                if(this.list.get(i).isCompleted){
                    //System.out.println("Toggling isCompleted to false.");
                    this.list.get(i).isCompleted = false;
                    return "Toggling isCompleted to false";
                }
                System.out.println("Toggling isCompleted to true.");
                this.list.get(i).isCompleted = true;
                return "Toggling isCompleted to true";
            }
        }
        System.out.println("No task found");
        return null;
    }


    public boolean removeTask(String task){
        for (int i = 0; i < this.list.size(); i++) {
            if(Objects.equals(this.list.get(i).description, task)){
                System.out.println("Task found, removing...");
                this.list.remove(this.list.get(i));
                return true;
            }
        }
        System.out.println("Task not found, nothing is removed");
        return false;
    }

    public boolean searchTask(String task){
        for (int i = 0; i < this.list.size(); i++) {
            if(Objects.equals(this.list.get(i).description, task)){
                System.out.println("Task found in list at index " + i);
                return true;
            }
        }
        System.out.println("Task is not in list");
        return false;
    }
    public void sortedListAsc(){
        if(this.list.isEmpty()){
            return;
        }
        this.list.sort(Comparator.comparing(Task::getDescription));
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i).description);
        }
    }
    public void sortedListDes(){
        if(this.list.isEmpty()){
            return;
        }
        this.list.sort(Comparator.comparing(Task::getDescription).reversed());
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i).description);
        }
    }

    public boolean changeTaskStatus(String task){
        if(task.isEmpty()){
            return false;
        }
        for (Task value : this.list) {
            if (Objects.equals(value.description, task)) {
                value.isCompleted = true;
                return true;
            }
        }
        System.out.println("NO TASK FOUND IN LIST");
        return false;
    }
    public boolean add(String taskDescription){
        if(taskDescription.isEmpty()){
            return false;
        }
        Task task = new Task(taskDescription);
        list.add(task);
        return true;
    }
    public int listTasks(){
        if(!this.list.isEmpty()){
            for (int i = 0; i < this.list.size(); i++) {
                System.out.println("Task: " + i
                        + " Description: " + this.list.get(i).description
                        + " IsCompleted: " + this.list.get(i).isCompleted);
            }
            return list.size();
        }
        return 0;
    }
}
