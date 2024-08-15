package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskTest() {

        // Add tasks if does not already exists.
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("homework"));
        Assertions.assertFalse(todoList.addTask("homework"));

    }

    @Test
    public void getAllTasksTest() {

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        List<String> tasks = todoList.getAllTasks();
        Assertions.assertEquals(2, tasks.size());

        Assertions.assertTrue(tasks.contains("homework"));
        Assertions.assertTrue(tasks.contains("shopping"));

    }

    @Test
    public void changeStatusTasksTest() {

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        Assertions.assertTrue(todoList.changeStatusTasks("homework", true));
        Assertions.assertTrue(todoList.getTasks().get("homework"));

        Assertions.assertTrue(todoList.changeStatusTasks("homework", false));
        Assertions.assertFalse(todoList.getTasks().get("homework"));
    }

    @Test
    public void getCompletedTasksTest() {

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        todoList.changeStatusTasks("homework", true);
        ArrayList<String> test = todoList.getCompletedTasks();

        Assertions.assertEquals(test.getFirst(), "homework");

    }

    @Test
    public void getUnCompletedTasksTest() {

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        todoList.changeStatusTasks("homework", false);
        ArrayList<String> test = todoList.getUnCompletedTasks();

        Assertions.assertEquals(test.getFirst(), "homework");

    }

    @Test
    public void searchTaskTest(){

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        String res = todoList.searchTask("homework");
        Assertions.assertEquals(res, "Exists");

    }

    @Test
    public void removeTasksTest(){

        TodoList todoList = new TodoList();

        todoList.addTask("homework");
        todoList.addTask("shopping");

        todoList.removeTasks("homework");
        Assertions.assertTrue(todoList.searchTask("homework").equals("Not Exists"));

    }

    @Test
    public void ascendingTasksTest(){

        TodoList todoList = new TodoList();

        todoList.addTask("win");
        todoList.addTask("homework");
        todoList.addTask("shopping");

        ArrayList<String> res = todoList.ascendingTasks();

        Assertions.assertEquals(res.get(0), "homework");

    }

    @Test
    public void descendingTasksTest(){

        TodoList todoList = new TodoList();

        todoList.addTask("win");
        todoList.addTask("homework");
        todoList.addTask("shopping");

        ArrayList<String> res = todoList.descendingTasks();

        Assertions.assertEquals(res.get(0), "win");

    }


}

