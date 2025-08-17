package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

class TodoListTest {

    @Test
    public void addTaskWhenNewValidName() {
        TodoList todo = new TodoList();
        boolean result = todo.addTask("Play football today");
        Assertions.assertTrue(result);


    }

    @Test
    public void getFalseIfDuplicate() {
        TodoList todo = new TodoList();
        Assertions.assertTrue(todo.addTask("Play football today"));
        Assertions.assertFalse(todo.addTask("Play football today"));
    }
    @Test
    public void listAllTasks() {
        TodoList todo = new TodoList();
        // add tasks into the TodoList
        todo.addTask("buy milk");
        todo.addTask("buy cheese");
        todo.addTask("go and run");

        ArrayList<String> list = new ArrayList<>();
        list.add("buy milk");
        list.add("buy cheese");
        list.add("go and run");

        Assertions.assertEquals(list, todo.getTasks());
    }

    @Test
    public void changeStatusOfTask() {
        TodoList todo = new TodoList();
        todo.addTask("buy cheese");
        Assertions.assertTrue(todo.changeStatus("buy cheese"));
        Assertions.assertTrue(todo.getCompletedTasks().contains("buy cheese"));

        Assertions.assertTrue(todo.changeStatus("buy cheese"));
        Assertions.assertTrue(todo.getIncompleteTasks().contains("buy cheese"));

        Assertions.assertFalse(todo.changeStatus("Play football today"));
        Assertions.assertFalse(todo.changeStatus("Non existent task"));

    }

    @Test
    public void getTaskByCompletion() {
        TodoList todo = new TodoList();
        todo.addTask("run");
        todo.addTask("buy milk");
        todo.addTask("buy cheese");

        todo.changeStatus("run");
        todo.changeStatus("buy milk");

        ArrayList<String> list = new ArrayList<>();
        list.add("run");
        list.add("buy milk");

        Assertions.assertEquals(list, todo.getCompletedTasks());
    }

    @Test
    public void getTasksByIncompletion() {
        TodoList todo = new TodoList();
        todo.addTask("cut hair");
        todo.addTask("Write story");

        Assertions.assertTrue(todo.changeStatus("Write story"));

        ArrayList<String> list = new ArrayList<>();
        list.add("cut hair");

        Assertions.assertEquals(list, todo.getIncompleteTasks());
    }

    @Test
    public void searchForTasksAndReturnMessageIfTaskNotFound() {
        TodoList todo = new TodoList();

        todo.addTask("Go and run");
        todo.addTask("buy cheese");

        String str = todo.search("clean table");
        Assertions.assertEquals("Task not found", str);


    }

    @Test
    public void deleteTaskIfFound() {
        TodoList todo = new TodoList();
        todo.addTask("Go and run");
        todo.addTask("buy cheese");
        todo.addTask("buy food");


        Assertions.assertTrue(todo.deleteTask("buy food"));
        Assertions.assertFalse(todo.getTasks().contains("buy food"));
    }

    @Test
    public void sortedInAscendingOrder() {
        TodoList todo = new  TodoList();
        todo.addTask("C");
        todo.addTask("A");
        todo.addTask("B");

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Assertions.assertEquals(list, todo.sortTasksAscOrder());
    }

    @Test
    public void sortedInDescendingOrder() {
        TodoList todo = new TodoList();
        todo.addTask("A");
        todo.addTask("B");
        todo.addTask("C");

        ArrayList<String> list = new ArrayList<>();
        list.add("C");
        list.add("B");
        list.add("A");

        Assertions.assertEquals(list, todo.sortTasksDescOrder());
    }


}

