package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void testAdd() {
        TodoList todolist = new TodoList();

        todolist.add("Do laundry");
        Assertions.assertEquals("Do laundry", todolist.getTask("Do laundry"));
        Assertions.assertEquals("Task already in list", todolist.add("Do laundry"));
        todolist.add("Go fishing");
        Assertions.assertEquals("Go fishing", todolist.getTask("Go fishing"));
    }

    public void testShowTasks() {
        TodoList todolist = new TodoList();
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Do laundry");
        testList.add("Go fishing");
        todolist.add("Do laundry");
        todolist.add("Go fishing");
        Assertions.assertEquals(testList, todolist.getToDos());
    }
    public void testShowTasksWhenEmpty() {
        TodoList todolist = new TodoList();
        ArrayList<String> testList = new ArrayList<>();
        Assertions.assertEquals(testList, todolist.getToDos());
    }
}
