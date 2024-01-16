package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void testAddTaskSuccessfully() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.add("Walk the dog"));
    }

    @Test
    public void testAddTaskThatAlreadyExists() {
        TodoList todoList = new TodoList();
        todoList.add("Code");
        Assertions.assertFalse(todoList.add("Code"));
    }

    @Test
    public void testAddEmptyTask() {
        TodoList todoList = new TodoList();
        Assertions.assertFalse(todoList.add(""));
    }

    @Test
    public void testCheckIfTaskIsAdded() {
        TodoList todoList = new TodoList();
        todoList.add("exercise");
        Assertions.assertTrue(todoList.todos.containsKey("exercise"));
    }

    @Test
    public void testGetTodoListWithSingleItem() {
        TodoList todoList = new TodoList();
        todoList.add("exercise");
        Assertions.assertEquals("exercise: Incomplete", todoList.getTodoList());
    }

    @Test
    public void testGetTodoListWithMultipleItems() {
        TodoList todoList = new TodoList();
        todoList.add("Code");
        todoList.add("Exercise");
        todoList.add("Work");
        Assertions.assertEquals("Exercise: Incomplete\nWork: Incomplete\nCode: Incomplete", todoList.getTodoList());
    }

    @Test
    public void testGetTodoListWithNoItems() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("List is empty", todoList.getTodoList());
    }

    @Test
    public void testChangeTaskToComplete() {
        TodoList todoList = new TodoList();
        todoList.add("Work");
        Assertions.assertTrue(todoList.completeTask("Work"));
        Assertions.assertTrue(todoList.todos.get("Work"));
    }

    @Test
    public void testChangeTaskToCompleteWhichIsComplete() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Work", true);
        Assertions.assertFalse(todoList.completeTask("Work"));
    }

    @Test
    public void testChangeTaskNotInListToComplete() {
        TodoList todoList = new TodoList();
        todoList.add("Work");
        Assertions.assertFalse(todoList.completeTask("Eat"));
    }

    @Test
    public void testGetCompleteTasksWithOneOfEach() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Exercise", true);
        todoList.todos.put("Walk", false);
        Assertions.assertEquals("Exercise",todoList.getCompleteTasks());
    }

    @Test
    public void testGetCompleteTasksWithMultipleOfEach() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Exercise", true);
        todoList.todos.put("Work", true);
        todoList.todos.put("Code", false);
        todoList.todos.put("Walk", false);
        Assertions.assertEquals("Exercise\nWork",todoList.getCompleteTasks());
    }

    @Test
    public void testGetCompleteTasksWithOneTask() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Exercise", true);
        Assertions.assertEquals("Exercise",todoList.getCompleteTasks());
    }

    @Test
    public void testGetCompleteTasksWithNoCompleteTasks() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Code", false);
        todoList.todos.put("Walk", false);
        Assertions.assertEquals("No tasks completed",todoList.getCompleteTasks());
    }

    @Test
    public void testGetCompleteTasksWithEmptyList() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("No tasks completed",todoList.getCompleteTasks());
    }

    @Test
    public void testGetIncompleteTasksWithOneOfEach() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Exercise", true);
        todoList.todos.put("Walk", false);
        Assertions.assertEquals("Walk",todoList.getIncompleteTasks());
    }

    @Test
    public void testGetIncompleteTasksWithMultipleOfEach() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Exercise", true);
        todoList.todos.put("Work", true);
        todoList.todos.put("Code", false);
        todoList.todos.put("Walk", false);
        Assertions.assertEquals("Code\nWalk",todoList.getIncompleteTasks());
    }

    @Test
    public void testGetIncompleteTasksWithOneTask() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Exercise", false);
        Assertions.assertEquals("Exercise",todoList.getIncompleteTasks());
    }

    @Test
    public void testGetIncompleteTasksWithNoCompleteTasks() {
        TodoList todoList = new TodoList();
        todoList.todos.put("Code", true);
        todoList.todos.put("Walk", true);
        Assertions.assertEquals("No tasks incomplete",todoList.getIncompleteTasks());
    }

    @Test
    public void testGetIncompleteTasksWithEmptyList() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("No tasks incomplete",todoList.getIncompleteTasks());
    }
}
