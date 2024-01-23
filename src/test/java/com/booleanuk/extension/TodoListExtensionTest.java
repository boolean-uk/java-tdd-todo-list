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

    @Test
    public void testGetTaskById(){
        Task task = new Task(001,"Vacuum","Incomplete");
        Task task2 = new Task(002,"Eat","Complete");
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask(task);
        todoList.addTask(task2);
        Assertions.assertEquals("Task\n" +
                "{ \n" +
                "ID: 1\n" +
                "Name: Vacuum\n" +
                "Status: Incomplete\n" +
                "Created: 23-01-2024 \n" +
                "}", todoList.getTaskByID(001));

        Assertions.assertEquals("Task\n" +
                "{ \n" +
                "ID: 2\n" +
                "Name: Eat\n" +
                "Status: Complete\n" +
                "Created: 23-01-2024 \n" +
                "}", todoList.getTaskByID(002));
    }

}
