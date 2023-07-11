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
        TodoList todo = new TodoList();
        Assertions.assertEquals(1, todo.add("First task"));
    }

    @Test
    public void seeAllTest() {
        TodoList todo = new TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals("[First task, Second task, Third task]", todo.seeAll());
    }

    @Test
    public void changeStatusTest() {
        TodoList todo = new TodoList();
        todo.add("First task");
        todo.add("Second task");
        Assertions.assertEquals("[First task [Complete], Second task]", todo.statusChange("First task", true));
    }

    @Test
    public void getCompleteTest() {
        TodoList todo = new TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        todo.statusChange("First task", true);
        todo.statusChange("Third task", true);
        Assertions.assertEquals("[First task [Complete], Third task [Complete]]", todo.getComplete());
    }

    @Test
    public void getIncompleteTest() {
        TodoList todo = new TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        todo.statusChange("First task", false);
        todo.statusChange("Third task", false);
        Assertions.assertEquals("[First task [Incomplete], Third task [Incomplete]]", todo.getIncomplete());
    }

    @Test
    public void SearchForTaskTest() {
        TodoList todo = new TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals("Task was found.", todo.search("Second task"));
    }

    @Test
    public void RemoveTest() {
        TodoList todo = new TodoList();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals(2, todo.remove("First task"));
    }

    @Test
    public void sortAscendTest() {
        TodoList todo = new TodoList();
        todo.add("A");
        todo.add("C");
        todo.add("B");
        Assertions.assertEquals("[A, B, C]", todo.sortAscend());
    }

    @Test
    public void getAllTasksDescendingTest() {
        TodoList todo = new TodoList();
        todo.add("A");
        todo.add("C");
        todo.add("B");
        Assertions.assertEquals("[C, B, A]", todo.sortDescend());
    }
}
