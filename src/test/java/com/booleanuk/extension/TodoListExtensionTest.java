package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TodoListExtensionTest {

    @Test
    public void testSetAttributes(){
        Task task = new Task(001,"Vacuum","Incomplete");
        Assertions.assertEquals(001, task.getId());
        Assertions.assertEquals("Vacuum", task.getName());
        Assertions.assertEquals("Incomplete", task.getStatus());
        Assertions.assertEquals("23-01-2024",task.getCreated());
    }

    @Test
    public void testTaskToString(){
        Task task = new Task(001,"Vacuum","Incomplete");
        Assertions.assertEquals("Task\n" +
                "{ \n" +
                "ID: 1\n" +
                "Name: Vacuum\n" +
                "Status: Incomplete\n" +
                "Created: 23-01-2024 \n" +
                "}", task.toString());
    }

    @Test
    public void testAddTask(){
        Task task = new Task(001,"Vacuum","Incomplete");
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertEquals("Task added", todoList.addTask(task));
    }

}
