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
      //  Assertions.assertEquals("23-01-2024 / 12:26",task.getCreated());
    }

    @Test
    public void testTaskToString(){
        Task task = new Task(001,"Vacuum","Incomplete");
        Assertions.assertEquals("Task\n" +
                "{ \n" +
                "ID: 1\n" +
                "Name: Vacuum\n" +
                "Status: Incomplete\n" +
                "Created: "+task.getCreated()+ "\n" +
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
                "Created: "+task.getCreated()+"\n" +
                "}", todoList.getTaskByID(001));

        Assertions.assertEquals("Task\n" +
                "{ \n" +
                "ID: 2\n" +
                "Name: Eat\n" +
                "Status: Complete\n" +
                "Created: "+task2.getCreated()+"\n" +
                "}", todoList.getTaskByID(002));
    }

    @Test
    public void testUpdateTaskName(){
        Task task = new Task(001,"Vacuum","Incomplete");
        Task task2 = new Task(002,"Eat","Complete");
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask(task);
        todoList.addTask(task2);

        Assertions.assertEquals(true, todoList.updateTaskName(002,"Sleep"));
        Assertions.assertEquals(false, todoList.updateTaskName(123,"Sleep"));
        Assertions.assertEquals("Sleep",task2.getName());
    }

    @Test
    public void testUpdateTaskStatus(){
        Task task = new Task(001,"Vacuum","Incomplete");
        Task task2 = new Task(002,"Eat","Complete");
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask(task);
        todoList.addTask(task2);

        Assertions.assertEquals(true, todoList.updateTaskStatus(002,"Incomplete"));
        Assertions.assertEquals(false, todoList.updateTaskStatus(123,"Complete"));
        Assertions.assertEquals("Incomplete",task2.getStatus());
    }

    @Test
    public void testTimeTaskWasCreated(){
        Task task = new Task(001,"Vacuum","Incomplete");
        Task task2 = new Task(002,"Eat","Complete");
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask(task);
        todoList.addTask(task2);
        System.out.println(task.getCreated());
        System.out.println(task2.getCreated());
        Assertions.assertEquals(task.getCreated(), task2.getCreated());
    }
}
