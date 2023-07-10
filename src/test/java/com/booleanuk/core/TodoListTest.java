package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
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
    @Test
    public void changeTaskStatusToComplete() {
        String taskDescription1 = "Walk the dog";

        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);
        newTask.changeTaskStatus();

        Assertions.assertTrue(newTask.isComplete());
    }
    @Test
    public void changeTaskStatusToIncomplete() {
        String taskDescription1 = "Walk the dog";

        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);
        newTask.changeTaskStatus(); //change status to complete
        newTask.changeTaskStatus();

        Assertions.assertFalse(newTask.isComplete());

    }
    @Test
    public void testGetCompleteTasks() {
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the dog2";
        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);
        Task newTask2 = todolist.addTask(taskDescription2);

        newTask.changeTaskStatus();
        ArrayList<Task> result = todolist.getCompleteTasks();
        Assertions.assertEquals(result.size(), 1);
    }
    @Test
    public void testGetIncompleteTasks() {
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the dog2";
        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);
        Task newTask2 = todolist.addTask(taskDescription2);

        newTask.changeTaskStatus();
        ArrayList<Task> result = todolist.getIncompleteTasks();
        Assertions.assertEquals(result.size(), 1);
    }

}
