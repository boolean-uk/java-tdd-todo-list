package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TodoListTest {
    @Test
    public void testIsResultASpecificTask() throws Exception {
        String taskDescription = "Walk the dog";

        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription);

        Task result = todolist.getTask(0);

        Assertions.assertEquals(result.getDescription(), taskDescription);
    }

    @Test
    public void testGetTaskForInvalidId() {
        String taskDescription = "Walk the dog";

        TodoList todolist = new TodoList();
        todolist.addTask(taskDescription);

        String message = "";

        try {
            todolist.getTask(1);
        } catch(Exception e){
            message = e.toString();
        }

        Assertions.assertEquals(message, "java.lang.Exception: Task not found");
    }

    @Test
    public void updateDescriptionSuccessfulUpdate() {
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the dog2";
        TodoList todolist = new TodoList();
        todolist.addTask(taskDescription1);

        try{
            Task newTask = todolist.updateDescription(0, taskDescription2);
            Assertions.assertEquals(newTask.getDescription(), taskDescription2);
        } catch(Exception e){

        }

    }

    @Test
    public void updateDescriptionWrongId() {
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the dog2";
        TodoList todolist = new TodoList();
        todolist.addTask(taskDescription1);

        String message = "";

        try {
            todolist.updateDescription(1, taskDescription2);
        } catch(Exception e){
            message = e.toString();
        }

        Assertions.assertEquals(message, "java.lang.Exception: Task not found");
    }

    @Test
    public void changeTaskStatusByIdIfTaskExists() {
        String taskDescription = "Walk the dog";

        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription);

        Task result = todolist.changeTaskStatusById(0);

        Assertions.assertTrue(result.isComplete());
    }
    @Test
    public void testGetIncompleteTasks() {
        String taskDescription = "Walk the dog";

        TodoList todolist = new TodoList();
        todolist.addTask(taskDescription);

        String message = "";

        try {
            todolist.changeTaskStatusById(1);
        } catch(Exception e){
            message = e.toString();
        }

        Assertions.assertEquals(message, "java.lang.Exception: Task not found");
    }
}
