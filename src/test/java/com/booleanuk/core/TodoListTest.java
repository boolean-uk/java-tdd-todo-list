package com.booleanuk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {


    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTest() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dog");
        Assertions.assertEquals("Wash the dog", todoList.getTasks().get(0).getName());
    }

    @Test
    public void getAllTasksTest() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the car");
        todoList.add("code some Java");
        todoList.add("eat pizza");

        int taskAmount = todoList.getTasks().size();

        Assertions.assertEquals(3, taskAmount);
        Assertions.assertEquals("Wash the car", todoList.getTasks().get(0).getName());
        Assertions.assertEquals("code some Java", todoList.getTasks().get(1).getName());
        Assertions.assertEquals("eat pizza", todoList.getTasks().get(2).getName());
    }

    @Test
    public void changeStatusTest() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the car");

        Assertions.assertFalse(todoList.getTasks().get(0).isStatus());

        todoList.changeStatus("Wash the car", true);

        Assertions.assertTrue(todoList.getTasks().get(0).isStatus());

        todoList.changeStatus("Wash the car", false);

        Assertions.assertFalse(todoList.getTasks().get(0).isStatus());
    }

    @Test
    public void getCompletedTest() {
        TodoList todoList = new TodoList();
        todoList.add("wash the car");
        todoList.add("eat ice cream");
        todoList.changeStatus("wash the car", true);

        List<Task> completed = todoList.getCompleted();

        Assertions.assertEquals(1, completed.size());
        Assertions.assertEquals("wash the car", completed.get(0).getName());

    }

    @Test
    public void getIncompletedTest() {
        TodoList todoList = new TodoList();
        todoList.add("wash the car");
        todoList.add("eat ice cream");
        todoList.changeStatus("wash the car", true);

        List<Task> completed = todoList.getIncompleted();

        Assertions.assertEquals(1, completed.size());
        Assertions.assertEquals("eat ice cream", completed.get(0).getName());
    }

    @Test
    public void searchTaskTest() {
        TodoList todoList = new TodoList();
        String carTask = "wash the car";
        todoList.add(carTask);

        Assertions.assertEquals(carTask, todoList.searchTask(carTask));
        Assertions.assertEquals("Task not found", todoList.searchTask("walk the dog"));
    }

    @Test
    public void deleteTaskTest() {
        TodoList todoList = new TodoList();
        todoList.add("wash the car");
        todoList.add("eat pizza");
        todoList.deleteTask("eat pizza");

        int taskAmount = todoList.getTasks().size();

        Assertions.assertEquals(1, taskAmount);
        Assertions.assertEquals("wash the car", todoList.getTasks().get(0).getName());
    }

    @Test
    public void getAscendingListTest() {
        TodoList todoList = new TodoList();

        todoList.add("wash the car");
        todoList.add("eat pizza");
        todoList.add("code some java");

        List<Task> sorted = todoList.getAscendingList();

        Assertions.assertEquals(3, sorted.size());
        Assertions.assertEquals("code some java", sorted.get(0).getName());
        Assertions.assertEquals("eat pizza", sorted.get(1).getName());
        Assertions.assertEquals("wash the car", sorted.get(2).getName());
    
    }

    @Test
    public void getDescendingListTest() {
        TodoList todoList = new TodoList();

        todoList.add("wash the car");
        todoList.add("eat pizza");
        todoList.add("code some java");

        List<Task> sorted = todoList.getDescendingList();

        Assertions.assertEquals(3, sorted.size());
        Assertions.assertEquals("wash the car", sorted.get(0).getName());
        Assertions.assertEquals("eat pizza", sorted.get(1).getName());
        Assertions.assertEquals("code some java", sorted.get(2).getName());
    
    }




}
