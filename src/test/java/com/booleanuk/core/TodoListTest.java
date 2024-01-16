package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void testAdd() {
        TodoList todolist = new TodoList();

        todolist.add("Do laundry");
        Assertions.assertEquals("Do laundry", todolist.getTask("Do laundry").getName());
        Assertions.assertEquals("Task already in list", todolist.add("Do laundry"));
        todolist.add("Go fishing");
        Assertions.assertEquals("Go fishing", todolist.getTask("Go fishing").getName());
    }

    @Test
    public void testShowTasks() {
        TodoList todolist = new TodoList();
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Do laundry");
        testList.add("Go fishing");
        todolist.add("Do laundry");
        todolist.add("Go fishing");
        Assertions.assertEquals(testList, todolist.getToDos());
    }
    @Test
    public void testShowTasksWhenEmpty() {
        TodoList todolist = new TodoList();
        ArrayList<String> testList = new ArrayList<>();
        Assertions.assertEquals(testList, todolist.getToDos());
    }

    @Test
    public void testChangeStatus() {
        TodoList todolist = new TodoList();
        todolist.add("Do laundry");

       Assertions.assertFalse((todolist.getTask("Do laundry")).isComplete);

       todolist.changeCompletion("Do laundry");

       Assertions.assertTrue((todolist.getTask("Do laundry")).isComplete);
    }

    @Test
    public void testGetTasksByCompletion() {
        TodoList todolist = new TodoList();
        ArrayList<String> testlistComplete = new ArrayList<>();
        ArrayList<String> testlistInComplete = new ArrayList<>();

        todolist.add("Do laundry");
        todolist.add("Go fishing");
        todolist.add("Cook");

        todolist.changeCompletion("Do laundry");

        testlistComplete.add("Do laundry");
        testlistInComplete.add("Go fishing");
        testlistInComplete.add("Cook");

        Assertions.assertTrue(
                testlistComplete.containsAll(todolist.getTasksByCompletion(true)) &&
                todolist.getTasksByCompletion(true).containsAll(testlistComplete));
        Assertions.assertTrue(testlistInComplete.containsAll(todolist.getTasksByCompletion(false)) &&
                todolist.getTasksByCompletion(false).containsAll(testlistInComplete));
    }

    @Test
    public void testGetTask(){
        TodoList todolist = new TodoList();
        Assertions.assertEquals("Task doesn't exist" ,todolist.getTaskName("Go fishing"));
        todolist.add("Go fishing");
        Assertions.assertEquals("Go fishing" ,todolist.getTaskName("Go fishing"));
    }

    @Test
    public void testRemoveTaskWhenTaskInList(){
        TodoList todolist = new TodoList();
        todolist.add("Do laundry");
        Assertions.assertTrue(todolist.getToDos().contains("Do laundry"));
        todolist.remove("Do laundry");
        Assertions.assertFalse(todolist.getToDos().contains("Do laundry"));
    }

    @Test
    public void testRemoveTaskWhenTaskNotInList(){
        TodoList todolist = new TodoList();
        Assertions.assertEquals("Task is not in list", todolist.remove("Do laundry"));


    }
}
