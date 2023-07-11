package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Locale;

class TodoListETest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        Assertions.assertEquals(1, todo.add("First task"));
    }

    @Test
    public void seeAllTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals("[First task, Second task, Third task]", todo.seeAll());
    }

    @Test
    public void changeStatusTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("First task");
        todo.add("Second task");
        Assertions.assertEquals("[First task [Complete], Second task]", todo.statusChange("First task", true));
    }

    @Test
    public void getCompleteTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        todo.statusChange("First task", true);
        todo.statusChange("Third task", true);
        Assertions.assertEquals("[First task [Complete], Third task [Complete]]", todo.getComplete());
    }

    @Test
    public void getIncompleteTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        todo.statusChange("First task", false);
        todo.statusChange("Third task", false);
        Assertions.assertEquals("[First task [Incomplete], Third task [Incomplete]]", todo.getIncomplete());
    }

    @Test
    public void SearchForTaskTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals("Task was found.", todo.search("Second task"));
    }

    @Test
    public void RemoveTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("First task");
        todo.add("Second task");
        todo.add("Third task");
        Assertions.assertEquals(2, todo.remove("First task"));
    }

    @Test
    public void sortAscendTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("A");
        todo.add("C");
        todo.add("B");
        Assertions.assertEquals("[A, B, C]", todo.sortAscend());
    }

    @Test
    public void getAllTasksDescendingTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("A");
        todo.add("C");
        todo.add("B");
        Assertions.assertEquals("[C, B, A]", todo.sortDescend());
    }

    //Extension Criteria Tests

    @Test
    public void GetTimeandDateTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("A");
        todo.add("C");
        todo.add("B");
        LocalDateTime cTime = LocalDateTime.now();
        int hTime = cTime.getHour();
        Assertions.assertEquals(hTime, todo.getTime(2));
    }

    @Test
    public void AddIDTest() {
        com.booleanuk.extension.TodoListE todo = new com.booleanuk.extension.TodoListE();
        todo.add("A");
        todo.add("B");
        todo.add("C");
        Assertions.assertEquals("[ID]123 B", todo.addID("B", 123));
    }
}

