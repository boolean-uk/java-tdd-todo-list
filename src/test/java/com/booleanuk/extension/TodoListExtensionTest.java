package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class TodoListExtensionTest {

    @Test
    public void getId(){
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");

        Assertions.assertTrue(task1.getId() != task2.getId());
    }

    @Test
    public void getIdTaskNotExisting(){
        TodoListExtension todoList = new TodoListExtension();

        Assertions.assertNull(todoList.getTask(100000));

    }

    @Test
    public void getNameok() {
        TodoListExtension todoList = new TodoListExtension();
        Task task1 = new Task("Task 1");
        todoList.addTask(task1);
        int id = task1.getId();
        Assertions.assertEquals("Task 1", todoList.getName(id));

    }


    @Test
    public void changeNameOk(){
        Task task1 = new Task("Task 1");
        Assertions.assertEquals("Task 2", task1.updateName("Task 2"));
    }


    @Test
    public void changeStatusOk() {
        TodoListExtension todoList = new TodoListExtension();
        Task task1 = new Task("Task 1");
        todoList.addTask(task1);
        int id = task1.getId();

        Assertions.assertTrue(todoList.changeStatus(id));
    }

    @Test
    public void changeStatusNotOk(){
        TodoListExtension todoList = new TodoListExtension();
        int id = 100000;
        Assertions.assertFalse(todoList.changeStatus(id));
    }

    @Test
    public void seeDateOk(){
        Task task1 = new Task("Task 1");
        LocalDate date = LocalDate.now();

        Assertions.assertEquals(date, task1.getDate());
    }
}
