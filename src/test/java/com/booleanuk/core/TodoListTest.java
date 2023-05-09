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
    public void addTaskShouldBe0() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals(0, todoList.tasks.size());
    }
    @Test
    public void addTaskShouldBe1() {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task());
        Assertions.assertEquals(1, todoList.tasks.size());
    }

    @Test
    public void removeTaskShouldBeFalse() {
        TodoList todoList = new TodoList();

        Assertions.assertFalse(todoList.removeTask(new Task()));
    }
    @Test
    public void removeTaskShouldBeTrue() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        todoList.addTask(task);
        Assertions.assertTrue(todoList.removeTask(task));
    }

    @Test
    public void getTasksShouldBe0() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals(0, todoList.getTasks().size());
    }
    @Test
    public void getTasksShouldBe1() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task());
        Assertions.assertEquals(1, todoList.getTasks().size());
    }

    @Test
    public void getCompleteTasksShouldBe0() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.status = false;
        todoList.addTask(task);
        Assertions.assertEquals(0, todoList.getCompleteTasks().size());
    }
    @Test
    public void getCompleteTasksShouldBe1() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.status = true;
        todoList.addTask(task);
        Assertions.assertEquals(1, todoList.getCompleteTasks().size());
    }

    @Test
    public void getIncompleteTasksShouldBe0() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.status = true;
        todoList.addTask(task);
        Assertions.assertEquals(0, todoList.getIncompleteTasks().size());
    }
    @Test
    public void getIncompleteTasksShouldBe1() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.status = false;
        todoList.addTask(task);
        Assertions.assertEquals(1, todoList.getIncompleteTasks().size());
    }

    @Test
    public void searchTaskByNameShouldBe0() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("Error not found", todoList.searchTaskByName("Code"));
    }
}
