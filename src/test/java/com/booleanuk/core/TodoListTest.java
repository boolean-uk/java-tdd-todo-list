package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    TodoList todoList;

    public TodoListTest() {
        this.todoList = new TodoList();
    }
    @Test
    public void addTest() {
        todoList.add("Running for 5km");

        Assertions.assertTrue(todoList.allTasks().containsKey("Running for 5km"));
    }

    @Test
    public void printingAllTasksTest() {
        todoList.add("Running");
        todoList.add("Swimming");
        todoList.add("Cycling");

        Assertions.assertEquals(3, todoList.allTasks().size());
    }

    @Test
    public void changingOfStatusTest() {
        todoList.add("Running");


        Assertions.assertEquals(true,todoList.allTasks().get("Running").equals("incomplete"));

        todoList.changeStatusOfTask("Running");
        Assertions.assertEquals(false,todoList.allTasks().get("Running").equals("incomplete"));
    }
    @Test
    public void onlyTaskWithCompleteStatusTest() {
        todoList.add("Running");
        todoList.add("Swimming");
        todoList.add("Cycling");
        todoList.add("Walking");

        todoList.changeStatusOfTask("Running");

        Assertions.assertEquals(1, todoList.completeTasks().size());
    }

    @Test
    public void onlyTaskWithIncompleteStatusTest() {
        todoList.add("Running");
        todoList.add("Swimming");
        todoList.add("Cycling");
        todoList.add("Walking");

        todoList.changeStatusOfTask("Running");

        Assertions.assertEquals(3, todoList.inCompleteTasks().size());
    }

    @Test
    public void searchTest() {
        todoList.add("Running");
        todoList.add("Swimming");
        todoList.add("Cycling");
        todoList.add("Walking");

        Assertions.assertEquals(todoList.search("Boxing"), "Task wasn't found");
    }

    @Test
    public void removeFromListTest() {
        todoList.add("Running");
        todoList.add("Swimming");
        todoList.add("Cycling");
        todoList.add("Walking");
        Assertions.assertEquals(4, todoList.allTasks().size());

        todoList.remove("Cycling");
        Assertions.assertEquals(3, todoList.allTasks().size());
    }
}
