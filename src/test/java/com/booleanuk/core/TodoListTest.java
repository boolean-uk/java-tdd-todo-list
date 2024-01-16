package com.booleanuk.core;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.ArrayList.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }
    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();

        // Act
        todoList.addTask("Complete assignment");
        List<String> tasks = todoList.viewAllTasks();

        // Assert
        assertTrue(tasks.contains("Complete assignment:incomplete"), "Task should be added to the todo list");



    }
    @Test
    public void testViewAllTasks() {
        // Arrange
        // Arrange
        TodoList todoList = new TodoList();

        // Act
        List<String> tasks = todoList.viewAllTasks();

        // Assert
        assertTrue(tasks.isEmpty(), "The tasks list should be empty initially");

    }


        @Test
        public void testChangeTaskStatus () {
            // Arrange
            TodoList todoList = new TodoList();
            todoList.addTask("Complete assignment");

            // Act
            todoList.changeTaskStatus(0, true);

            // Assert
            assertTrue(todoList.viewAllTasks().get(0).endsWith(":complete"), "Task status should be changed to complete");
        }
    @Test
    public void testViewCompleteTasks() {
        // Arrange
        TodoList todoList = new TodoList();
        todoList.addTask("Complete assignment 1");
        todoList.addTask("Complete assignment 2");
        todoList.changeTaskStatus(0, true);  // Mark the first task as complete

        // Act
        List<String> completeTasks = todoList.viewCompleteTasks();

        // Assert
        assertEquals(1, completeTasks.size(), "There should be only one complete task");
        assertTrue(completeTasks.get(0).endsWith(":complete"), "The task should be marked as complete");
    }
    @Test
    public void testGetIncompleteTasks() {
        // Arrange
        TodoList todoList = new TodoList();
        todoList.addTask("Complete assignment 1");
        todoList.addTask("Complete assignment 2");
        todoList.changeTaskStatus(0, true);  // Mark the first task as complete

        // Act
        List<String> incompleteTasks = todoList.getIncompleteTasks();

        // Assert
        assertEquals(1, incompleteTasks.size(), "There should be only one incomplete task");
        assertTrue(incompleteTasks.get(0).endsWith(":incomplete"), "The task should be marked as incomplete");
    }


    @Test
    public void testSearchTaskNotFound() {
        // Arrange
        TodoList todoList = new TodoList();
        todoList.addTask("Complete assignment");

        // Act
        String searchResult = todoList.searchTask("Non-existent task");

        // Assert
        assertEquals("Task not found: Non-existent task", searchResult, "The task should not be found");
    }
    @Test
    public void testRemoveTask() {
        // Arrange
        TodoList todoList = new TodoList();

        // Act
        todoList.addTask("Complete assignment");
        todoList.removeTask("Complete assignment");
        List<String> tasks = todoList.viewAllTasks();

        // Assert
        assertTrue(tasks.isEmpty(), "The tasks list should be empty after removing the task");
    }
    @Test
    void testViewAllTasksOrdered() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task C");
        todoList.addTask("Task A");
        todoList.addTask("Task B");

        todoList.viewAllTasksOrdered();

        List<String> expected = List.of("Task A:incomplete", "Task B:incomplete", "Task C:incomplete");
        List<String> actual = todoList.viewAllTasks();

        assertEquals(expected, actual);
    }
    @Test
    void testViewAllTasksOrderedDescending() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task C");
        todoList.addTask("Task A");
        todoList.addTask("Task B");

        todoList.viewAllTasksOrderedDescending();

        List<String> expected = List.of("Task C:incomplete", "Task B:incomplete", "Task A:incomplete");
        List<String> actual = todoList.viewAllTasks();

        assertEquals(expected, actual);
    }
}

