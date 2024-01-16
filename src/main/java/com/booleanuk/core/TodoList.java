package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Objects;

public class TodoList {
    public static class Task{
        public String description;
        public boolean isCompleted;

        public Task(String task){
            this.description = task;
            this.isCompleted = false;
        }
    }
    ArrayList<Task> list;
    public TodoList(){
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


    public boolean changeTaskStatus(String task){
        if(task.isEmpty()){
            return false;
        }
        for (Task value : this.list) {
            if (Objects.equals(value.description, task)) {
                System.out.println("CHANGING isCompleted FROM TRUE TO FALSE");
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
