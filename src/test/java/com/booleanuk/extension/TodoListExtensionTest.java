package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TodoListExtensionTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void add() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertEquals(new HashMap<>(), todoList.getTasks());
        todoList.add("Vacuum");
        Assertions.assertEquals(1, todoList.getTasks().size());
        todoList.add("Laundry");
        Assertions.assertEquals(2, todoList.getTasks().size());
        todoList.add("Vacuum");
        Assertions.assertEquals(3, todoList.getTasks().size());
    }

    @Test
    public void getTask() {
    }

    @Test
    public void updateName() {
    }

    @Test
    public void changeStatus() {
    }

    @Test
    public void getDateTime() {
    }
}
