package com.booleanuk.core;

import java.util.Scanner;

public class TodoListBot {
    Scanner input = new Scanner(System.in);
    TodoList todoList = new TodoList();
    public void todoList() {
        System.out.println("Welcome to your TodoList application!");
        System.out.println("Type 0 to add a new task");
        System.out.println("Type 1 to see all your tasks");
        while (!this.input.nextLine().equalsIgnoreCase("q")) {
            switch (this.input.nextLine()) {
                case "0":
                    addTask();
                case "1":
                    getAllTasks();
            }

        }
    }

    public void getAllTasks() {
        if(!todoList.viewList().isEmpty()) {
            for (Task task: todoList.viewList()){
                System.out.println(task.getName() + " " + task.getTaskStatus() );
            }
        }else  {
            System.out.println("No tasks found!");
        }

    }

    public void addTask() {
        System.out.println("What should the new task be?");
        String newTaskName = this.input.nextLine();
        todoList.add(new Task(newTaskName));
        System.out.println("Added task: " + newTaskName);
    }
}
