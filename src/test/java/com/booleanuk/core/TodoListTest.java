package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void addNewTaskCorrectDescription() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.addTask(taskDescription);
        Assertions.assertEquals(result.getDescription(),"Walk the dog");
    }
    @Test
    public void addNewTaskCorrectId() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.addTask(taskDescription);
        Assertions.assertEquals(result.getId(),0);
    }
    @Test
    public void addNewTaskCorrectIsComplete() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.addTask(taskDescription);
        Assertions.assertEquals(result.isComplete(),false);
    }
    @Test
    public void getTasksShouldReturnAllTasks() {
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the hamster";

        TodoList todolist = new TodoList();
        todolist.addTask(taskDescription1);
        todolist.addTask(taskDescription2);

        ArrayList<Task> results = todolist.getTasks();

        Assertions.assertEquals(results.size(), 2  );
    }

}
