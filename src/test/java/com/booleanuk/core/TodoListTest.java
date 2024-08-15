package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class TodoListTest {

    public TodoListTest(){}
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTest() {
        TodoList todoList=new TodoList();

        Assertions.assertTrue(todoList.add("Write add() test"));
        Assertions.assertFalse(todoList.add("Write add() test"));
    }

    @Test
    public void displayTest() {
        TodoList todoList=new TodoList();
        Assertions.assertFalse(todoList.display());
        todoList.add("Add something to the todo-list");
        todoList.add("Test the display() method with tasks added");
        Assertions.assertTrue(todoList.display());
    }

    @Test
    public void changeStatusTest() {
        TodoList todoList=new TodoList();
        Assertions.assertFalse(todoList.changeStatus("Test the changeStatus() method"));
        todoList.add("Test the changeStatus() method");
        Assertions.assertTrue(todoList.changeStatus("Test the changeStatus() method"));
        Assertions.assertSame("Complete", todoList.taskList.get("Test the changeStatus() method"));
    }

    @Test
    public void displayStatusTest() {
        TodoList todoList=new TodoList();
        ArrayList<String> test0=new ArrayList<>();
        ArrayList<String> status= todoList.statusDisplay("Complete");

        Assertions.assertTrue(test0.containsAll(status) && status.containsAll(test0));

        todoList.add("Test the statusDisplay() method");
        ArrayList<String> status0= todoList.statusDisplay("Incomplete");

        Assertions.assertFalse(test0.containsAll(status0) && status0.containsAll(test0));

        test0.add("Test the statusDisplay() method");
        Assertions.assertTrue(test0.containsAll(status0) && status0.containsAll(test0));

        todoList.changeStatus("Test the statusDisplay() method");
        ArrayList<String> status1= todoList.statusDisplay("Complete");
        Assertions.assertTrue(test0.containsAll(status1) && status1.containsAll(test0));

    }

    @Test
    public void searchTest() {
        TodoList todoList=new TodoList();
        Assertions.assertFalse(todoList.search("Test search() method"));
        todoList.add("Test search() method");
        Assertions.assertTrue(todoList.search("Test search() method"));
    }

    @Test
    public void removeTest() {
        TodoList todoList=new TodoList();
        Assertions.assertFalse(todoList.remove("Test remove() method"));
        todoList.add("Test remove() method");
        Assertions.assertTrue(todoList.remove("Test remove() method"));
        Assertions.assertFalse(todoList.remove("Test remove() method"));
    }

    @Test
    public void sortTest() {
        TodoList todoList0=new TodoList();
        TodoList todoList1=new TodoList();

        Assertions.assertArrayEquals(new String[]{}, todoList0.sort(false));
        todoList0.add("B test");
        todoList0.add("C test");
        todoList0.add("A test");
        todoList1.add("C test");
        todoList1.add("A test");
        todoList1.add("B test");
        String[] testList0= new String[]{"A test", "B test", "C test"};
        String[] testList1= new String[]{"C test", "B test", "A test"};

        Assertions.assertArrayEquals(testList0, todoList0.sort(true));
        Assertions.assertArrayEquals(testList1, todoList0.sort(false));
        Assertions.assertArrayEquals(todoList0.sort(false), todoList0.sort(false));
        Assertions.assertArrayEquals(todoList0.sort(true), todoList0.sort(true));
        Assertions.assertFalse(todoList0.sort(true)== todoList0.sort(false));
        Assertions.assertFalse(todoList0.sort(true)==todoList0.sort(true));
    }
}
