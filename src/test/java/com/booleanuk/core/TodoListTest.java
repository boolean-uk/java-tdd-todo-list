package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAddTaskWorks() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        boolean taskFinished = true;

        assertTrue(todoList.addToTodoList(task, taskFinished));
        Assertions.assertTrue(todoList.taskList.containsKey(task));
        Assertions.assertEquals(true, todoList.taskList.get(task));
    }

    @Test
    public void testGetTasksWorks() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        String taskTwo = "Iron shirts";
        String taskThree = "Do the dishes";
        todoList.addToTodoList(task, true);
        todoList.addToTodoList(taskTwo, false);
        todoList.addToTodoList(taskThree, false);

        String expected = "Task: Walk the dog, Iron shirts, Do the dishes";
        Assertions.assertEquals(expected, todoList.getTasks());
    }

    @Test
    public void testChangeTaskStatusWorks() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        boolean initialTaskStatus = false;

        assertTrue(todoList.addToTodoList(task, initialTaskStatus));
        Assertions.assertTrue(todoList.taskList.containsKey(task));
        Assertions.assertEquals(initialTaskStatus, todoList.taskList.get(task));

        boolean newStatus = true; //change the status to complete
        assertTrue(todoList.changeStatus(task, newStatus));
        Assertions.assertTrue(todoList.taskList.containsValue(newStatus));
        Assertions.assertEquals(newStatus, todoList.taskList.get(task));
    }

    @Test
    public void getCompletedTasks() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        String taskTwo = "Iron shirts";
        String taskThree = "Do the dishes";
        todoList.addToTodoList(task, true);
        todoList.addToTodoList(taskTwo, false);
        todoList.addToTodoList(taskThree, false);

        String expected = "Completed tasks: Walk the dog";
        Assertions.assertTrue(todoList.taskList.containsValue(true));
        Assertions.assertEquals(expected, todoList.getCompletedTasks());
    }

    @Test
    public void getIncompleteTasks() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        String taskTwo = "Iron shirts";
        String taskThree = "Do the dishes";
        todoList.addToTodoList(task, true);
        todoList.addToTodoList(taskTwo, false);
        todoList.addToTodoList(taskThree, false);

        String expected = "Incomplete tasks: Iron shirts, Do the dishes";
        Assertions.assertTrue(todoList.taskList.containsValue(false));
        Assertions.assertEquals(expected, todoList.getInCompleteTasks());
    }

    @Test
    public void testSearchForTaskFailed() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        String taskTwo = "Iron shirts";
        String taskThree = "Do the dishes";
        todoList.addToTodoList(task, true);
        todoList.addToTodoList(taskTwo, false);
        todoList.addToTodoList(taskThree, false);

        String result = todoList.searchForTask("Pet the cat");
        Assertions.assertEquals("Task not found: Pet the cat", result);
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        String taskTwo = "Iron shirts";
        String taskThree = "Do the dishes";
        todoList.addToTodoList(task, true);
        todoList.addToTodoList(taskTwo, false);
        todoList.addToTodoList(taskThree, false);

        boolean removed = todoList.removeTask(taskTwo); //remove task two from the list
        assertTrue(removed); //check if task two (Iron shirts) is removed
        assertFalse(todoList.taskList.containsKey(taskTwo));
    }

    @Test
    public void testSortTasksAscending() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        String taskTwo = "Iron shirts";
        String taskThree = "Do the dishes";
        todoList.addToTodoList(task, true);
        todoList.addToTodoList(taskTwo, false);
        todoList.addToTodoList(taskThree, false);

        Assertions.assertEquals("Do the dishes, Iron shirts, Walk the dog", todoList.sortTaskAscending());
    }

    @Test
    public void testSortTasksDescending() {
        TodoList todoList = new TodoList();
        String task = "Walk the dog";
        String taskTwo = "Iron shirts";
        String taskThree = "Do the dishes";
        todoList.addToTodoList(task, true);
        todoList.addToTodoList(taskTwo, false);
        todoList.addToTodoList(taskThree, false);

        Assertions.assertEquals("Walk the dog, Iron shirts, Do the dishes", todoList.sortTaskDescending());
    }
}


