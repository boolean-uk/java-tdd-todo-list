package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTest() {

        TodoList mytodo = new TodoList();

        mytodo.add("Test");

        Assertions.assertTrue(mytodo.getTodoList().containsKey("Test"));

    }

    @Test
    public void listTest() {

        TodoList mytodo = new TodoList();

        mytodo.add("Test");
        mytodo.add("Test2");
        mytodo.add("Test3");
        mytodo.add("Test4");
        mytodo.add("Test5");

        Assertions.assertEquals(5, mytodo.getTodoList().size());
    }

    @Test
    public void testToggling() {

        TodoList mytodo = new TodoList();

        mytodo.add("Test");

        Assertions.assertFalse(mytodo.getTodoList().get("Test"));

        mytodo.toggle("Test");

        Assertions.assertTrue(mytodo.getTodoList().get("Test"));
    }

    @Test
    public void testGetComplete() {

        TodoList mytodo = new TodoList();

        mytodo.add("Test");
        mytodo.add("Test2");
        mytodo.add("Test3");
        mytodo.add("Test4");
        mytodo.add("Test5");

        mytodo.toggle("Test");
        mytodo.toggle("Test3");
        mytodo.toggle("Test5");

        Assertions.assertEquals(3, mytodo.getComplete().size());
    }

    @Test
    public void testGetIncomplete() {

        TodoList mytodo = new TodoList();

        mytodo.add("Test");
        mytodo.add("Test2");
        mytodo.add("Test3");
        mytodo.add("Test4");
        mytodo.add("Test5");

        mytodo.toggle("Test");
        mytodo.toggle("Test3");
        mytodo.toggle("Test5");

        Assertions.assertEquals(2, mytodo.getIncomplete().size());
    }

    @Test
    public void testGetMessageIfFound() {

        TodoList mytodo = new TodoList();

        mytodo.add("Test");
        mytodo.add("Test2");
        mytodo.add("Test3");
        mytodo.add("Test4");
        mytodo.add("Test5");

        Assertions.assertEquals(mytodo.search("Test"), "Test");
    }

    @Test
    public void testGetMessageIfNotFound() {

        TodoList mytodo = new TodoList();

        mytodo.add("Test");
        mytodo.add("Test2");
        mytodo.add("Test3");
        mytodo.add("Test4");
        mytodo.add("Test5");

        Assertions.assertEquals(mytodo.search("Test6"), "Task not found");
    }

    @Test
    public void testRemove(){
        TodoList mytodo = new TodoList();

        mytodo.add("Test");
        mytodo.add("Test2");
        mytodo.add("Test3");
        Assertions.assertEquals(3, mytodo.getTodoList().size());
        mytodo.remove("Test");
        Assertions.assertEquals(2, mytodo.getTodoList().size());
    }

    @Test
    public void getTasksInAscendingOrder(){
        TodoList mytodo = new TodoList();

        mytodo.add("Test9");
        mytodo.add("Test5");
        mytodo.add("Test2");
        List<String> sortedKeys = mytodo.getTasksInAscendingOrder();
        Assertions.assertEquals(List.of("Test2", "Test5", "Test9"), sortedKeys);
    }

    @Test
    public void getTasksInDescendingOrder(){
        TodoList mytodo = new TodoList();

        mytodo.add("Test1");
        mytodo.add("Test2");
        mytodo.add("Test3");
        List<String> sortedKeys = mytodo.getTasksInDescendingOrder();
        Assertions.assertEquals(List.of("Test3", "Test2", "Test1"), sortedKeys);
    }
}
