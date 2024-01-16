package com.booleanuk.extension;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class TodoListExtension {
    public static class Task{
        public String description;
        public boolean isCompleted;
        private static int nextId = 0;
        private int id;



        public Task(String task){
            this.description = task;
            this.isCompleted = false;
            this.id = nextId++;
        }
        public int getID(){
            return id;
        }
        public String getDescription(){
            return description;
        }
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

    public static void main(String[] args) {
        TodoListExtension todo = new TodoListExtension();

        todo.add("Wash car");
        todo.add("Make food");
        todo.add("Brush teeth");
        todo.add("Workout");
        todo.add("Walk the dog");
        for (int i = 0; i < todo.list.size(); i++) {
            System.out.println(todo.list.get(i).id);
        }
        System.out.println(todo.getIncompleteTasks());
        todo.changeTaskStatus("Wash car");
        todo.changeTaskStatus("Brush teeth");
        System.out.println(todo.getIncompleteTasks());
        //System.out.println(t.list.get(0).description + t.list.get(0).isCompleted);
    }
}
