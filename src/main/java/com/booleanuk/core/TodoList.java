package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class TodoList {
    public static class Task{
        public String description;
        public boolean isCompleted;

        public Task(String task){
            this.description = task;
            this.isCompleted = false;
        }

        public String getDescription(){
            return description;
        }
    }
    ArrayList<Task> list;
    ArrayList<Task> sortedListAscending;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void sortedListAsc(){
        this.list.sort(Comparator.comparing(Task::getDescription));
        if(!this.list.isEmpty()){
            for (int i = 0; i < this.list.size(); i++) {
                System.out.println(this.list.get(i).description);
                return;
            }
        }
    }
    public void sortedListDes(){
        this.list.sort(Comparator.comparing(Task::getDescription).reversed());
        if(!this.list.isEmpty()){
            for (int i = 0; i < this.list.size(); i++) {
                System.out.println(this.list.get(i).description);
                return;
            }
        }
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

    public static void main(String[] args) {
        TodoList todo = new TodoList();

        todo.add("Wash car");
        todo.add("Make food");
        todo.add("Brush teeth");
        todo.add("Workout");
        todo.add("Walk the dog");
        System.out.println(todo.getIncompleteTasks());
        todo.changeTaskStatus("Wash car");
        todo.changeTaskStatus("Brush teeth");
        System.out.println(todo.getIncompleteTasks());
        //System.out.println(t.list.get(0).description + t.list.get(0).isCompleted);
    }
}
