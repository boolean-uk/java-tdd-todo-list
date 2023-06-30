package com.booleanuk.extension;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {

    @Test
    void getTaskById() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy groceries");
        todoList.addTask(task);

        Task result = todoList.getTaskById(task.id);

        assertEquals(task, result);
    }

    @Test
    void updateTaskName() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy groceries");
        todoList.addTask(task);

        todoList.updateTaskName(task.id, "Buy milk");

        assertEquals("Buy milk", task.getName());
    }

    @Test
    void setTaskStatus() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy groceries");
        todoList.addTask(task);

        todoList.setTaskStatus(task.id, true);

        assertTrue(task.isCompleted);
    }

    @Test
    void getTaskCreationDateTime() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy groceries");
        todoList.addTask(task);

        LocalDateTime result = todoList.getTaskCreationDateTime(task.id);

        assertEquals(task.createdAt, result);
    }
}