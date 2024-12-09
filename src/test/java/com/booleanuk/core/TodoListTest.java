package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    //Task Tests
    @Test
    public void testGetIsCompleteShouldReturnFalse() {
        Task task = new Task("eat");
        Assertions.assertFalse(task.getIsComplete());
    }

    @Test
    public void testSetIsComplete(){
        Task task = new Task("eat");
        Assertions.assertEquals("incomplete", task.isComplete);
        task.setIsComplete();
        Assertions.assertEquals("complete", task.isComplete);
    }

    //TodoList Tests

    @Test
    public void testAddTask(){
        TodoList todoList = new TodoList();
        todoList.addTask("Swim");
        Assertions.assertEquals(1, todoList.tasks.size());
        todoList.addTask("Read");
        Assertions.assertEquals(2, todoList.tasks.size());
    }

    @Test
    public void testGetList(){
        TodoList todoList = new TodoList();
        todoList.addTask("Swim");
        todoList.addTask("Read");
        todoList.addTask("Eat");
        Assertions.assertEquals("Swim", todoList.tasks.get(0).name);
        Assertions.assertEquals("Read", todoList.tasks.get(1).name);
        Assertions.assertEquals("Eat", todoList.tasks.get(2).name);
    }

    @Test
    public void testGetCompletedTasks(){
        TodoList todoList = new TodoList();
        todoList.addTask("Swim");
        todoList.addTask("Read");
        todoList.addTask("Eat");
        todoList.addTask("Dance");

        todoList.tasks.get(1).setIsComplete();
        todoList.tasks.get(2).setIsComplete();

        ArrayList<Task> completedTasks = todoList.getCompletedTasks();
        Assertions.assertEquals("Read", completedTasks.get(0).name);
        Assertions.assertEquals("Eat", completedTasks.get(1).name);
    }

    @Test
    public void testGetIncompletedTasks(){
        TodoList todoList = new TodoList();
        todoList.addTask("Swim");
        todoList.addTask("Read");
        todoList.addTask("Eat");
        todoList.addTask("Dance");

        todoList.tasks.get(1).setIsComplete();
        todoList.tasks.get(2).setIsComplete();

        ArrayList<Task> completedTasks = todoList.getIncompletedTasks();
        Assertions.assertEquals("Swim", completedTasks.get(0).name);
        Assertions.assertEquals("Dance", completedTasks.get(1).name);
    }

    @Test
    public void testSearch(){
        TodoList todoList = new TodoList();
        todoList.addTask("Swim");
        todoList.addTask("Read");
        todoList.addTask("Eat");
        Assertions.assertEquals("Task was found in the list", todoList.search("Eat"));
        Assertions.assertEquals("This task was not found", todoList.search("Dance"));
    }

    @Test
    public void testRemove(){
        TodoList todoList = new TodoList();
        todoList.addTask("Swim");
        todoList.addTask("Read");
        todoList.removeTask("Swim");
        Assertions.assertEquals("This task was not found", todoList.search("Swim"));
    }

    @Test
    public void testGetAscOrder(){
        TodoList todoList = new TodoList();
        todoList.addTask("A");
        todoList.addTask("Z");
        todoList.addTask("B");
        ArrayList<Task> ascTasks = todoList.getAscOrder();
        Assertions.assertEquals("A", ascTasks.get(0).name);
        Assertions.assertEquals("B", ascTasks.get(1).name);
        Assertions.assertEquals("Z", ascTasks.get(2).name);
    }

    @Test
    public void testGetDescOrder(){
        TodoList todoList = new TodoList();
        todoList.addTask("A");
        todoList.addTask("Z");
        todoList.addTask("B");
        ArrayList<Task> descTasks = todoList.getDescOrder();
        Assertions.assertEquals("Z", descTasks.get(0).name);
        Assertions.assertEquals("B", descTasks.get(1).name);
        Assertions.assertEquals("A", descTasks.get(2).name);
    }
}
