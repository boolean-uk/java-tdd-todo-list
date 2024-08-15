package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();

        // Test that task is added to list
        Assertions.assertTrue(todoList.addTask("Test task 1"));
        Assertions.assertEquals("[Test task 1]", todoList.getTasks());
    }

    @Test
    public void testGetTasks(){
        TodoList todoList = new TodoList();

        // Test if return is correct when list is empty
        Assertions.assertEquals("Todo list is empty.", todoList.getTasks());

        // Test if tasks are retrieved
        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        ArrayList<String> test = new ArrayList<>();
        test.add("Test task 1");
        test.add("Test task 2");
        test.add("Test task 3");
        Assertions.assertEquals(test.toString(), todoList.getTasks());
    }

    @Test
    public void testChangeStatus() {
        TodoList todoList = new TodoList();

        // Test if return is correct when task does not exist
        Assertions.assertEquals("Task not found.", todoList.setCompleted("Test task 1"));

        // Test that the status is changed to complete
        todoList.addTask("Test task 1");
        Assertions.assertEquals("Task status is now 'Completed'.", todoList.setCompleted("Test task 1"));

        // Test that the status is changed to incomplete
        Assertions.assertEquals("Task status is now 'Incomplete'.", todoList.setUncompleted("Test task 1"));

    }

    @Test
    public void testGetCompletedTasks() {
        TodoList todoList = new TodoList();

        // Test that no tasks are retrieved if no tasks have status complete
        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("No completed tasks in todo list.", todoList.getCompletedTasks());

        // Test that tasks with status complete are retrieved
        todoList.setCompleted("Test task 1");
        todoList.setCompleted("Test task 3");
        Assertions.assertEquals("[Test task 1, Test task 3]", todoList.getCompletedTasks());
    }

    @Test
    public void testGetUncompletedTasks() {
        TodoList todoList = new TodoList();

        // Test that no tasks are retrieved if no tasks have status incomplete
        todoList.addTask("Test task 1");
        todoList.setCompleted("Test task 1");
        Assertions.assertEquals("No uncompleted tasks in todo list.", todoList.getUncompletedTasks());

        // Test that tasks with status incomplete are retrieved
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        ArrayList<String> test = new ArrayList<>();
        test.add("Test task 2");
        test.add("Test task 3");
        Assertions.assertEquals(test.toString(), todoList.getUncompletedTasks());
    }

    @Test
    public void testSearchTask() {
        TodoList todoList = new TodoList();

        // Test if return is correct when task does not exist
        Assertions.assertEquals("Task not found.", todoList.searchTask("Test task 1"));

        // Test if correct task is retrieved by task name
        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("Task 'Test task 1' is Incomplete", todoList.searchTask("Test task 1"));
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();

        // Test if return is correct when task does not exist
        Assertions.assertEquals("Task not found.", todoList.removeTask("Test task 1"));

        // Test if task is removed from list
        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("Task removed from todo list.", todoList.removeTask("Test task 1"));
        Assertions.assertEquals("[Test task 2, Test task 3]", todoList.getTasks());
    }

    @Test
    public void testGetTasksAscending() {
        TodoList todoList = new TodoList();

        // Test if return is correct when list is empty
        Assertions.assertEquals("Todo list is empty.", todoList.getTasksAscending());

        // Test if tasks are retrieved in ascending order
        todoList.addTask("C task 1");
        todoList.addTask("A task 2");
        todoList.addTask("F task 3");
        ArrayList<String> test = new ArrayList<>();
        test.add("A task 2");
        test.add("C task 1");
        test.add("F task 3");
        Assertions.assertEquals(test.toString(), todoList.getTasksAscending());
    }

    @Test
    public void testGetTasksDescending() {
        TodoList todoList = new TodoList();

        // Test if return is correct when list is empty
        Assertions.assertEquals("Todo list is empty.", todoList.getTasksDescending());

        // Test if tasks are retrieved in descending order
        todoList.addTask("C task 1");
        todoList.addTask("A task 2");
        todoList.addTask("F task 3");
        ArrayList<String> test = new ArrayList<>();
        test.add("F task 3");
        test.add("C task 1");
        test.add("A task 2");
        Assertions.assertEquals(test.toString(), todoList.getTasksDescending());
    }
}
