package com.booleanuk.core;

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
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        Assertions.assertEquals(1, todo.add("First task"));
    }

    @Test
    public void seeAllTest() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals("[First task, Second task, Third task]", todo.seeAll());
    }

    @Test
    public void changeStatusTest() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("First task");
        todo.add("Second task");
        Assertions.assertEquals("[First task [Complete], Second task]", todo.statusChange("First task", true));
    }

    @Test
    public void getCompleteTest() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        todo.statusChange("First task", true);
        todo.statusChange("Third task", true);
        Assertions.assertEquals("[First task [Complete], Third task [Complete]]", todo.getComplete());
    }

    @Test
    public void getIncompleteTest() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        todo.statusChange("First task", false);
        todo.statusChange("Third task", false);
        Assertions.assertEquals("[First task [Incomplete], Third task [Incomplete]]", todo.getIncomplete());
    }

    @Test
    public void SearchForTaskTest() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals("Task was found.", todo.search("Second task"));
    }

    @Test
    public void RemoveTest() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals(2, todo.remove("First task"));
    }

    @Test
    public void sortAscendTest() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("A");
        todo.add("C");
        todo.add("B");
        Assertions.assertEquals("[A, B, C]", todo.sortAscend());
    }

    @Test
    public void getAllTasksDescendingTest() {
        com.booleanuk.core.TodoList todo = new com.booleanuk.core.TodoList();
        todo.add("A");
        todo.add("C");
        todo.add("B");
        Assertions.assertEquals("[C, B, A]", todo.sortDescend());
    }
}
