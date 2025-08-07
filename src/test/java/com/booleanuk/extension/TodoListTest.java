package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class TodoListTest {

    @Test
    public void testAddAndGetTaskById() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy milk");

        boolean added = todoList.addTask(task);
        Assertions.assertTrue(added);

        Task found = todoList.getTaskById(task.getId());
        Assertions.assertNotNull(found);
        Assertions.assertEquals(task.getName(), found.getName());
    }
    @Test
    public void testGetTaskByIdNotFound() {
        TodoList todoList = new TodoList();
        Task found = todoList.getTaskById("non-existent-id");
        Assertions.assertNull(found);
    }

    @Test
    public void testUpdateTaskName() {
        TodoList todoList = new TodoList();
        Task task = new Task("Wash car");
        todoList.addTask(task);

        boolean updated = todoList.updateTaskName(task.getId(), "Clean car");
        Assertions.assertTrue(updated);

        Task updatedTask = todoList.getTaskById(task.getId());
        Assertions.assertEquals("Clean car", updatedTask.getName());
    }

    @Test
    public void testUpdateTaskNameDuplicateFails() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Task One");
        Task task2 = new Task("Task Two");
        todoList.addTask(task1);
        todoList.addTask(task2);

        boolean updated = todoList.updateTaskName(task1.getId(), "Task Two");
        Assertions.assertFalse(updated);
    }
    @Test
    public void testToggleStatusById() {
        TodoList todoList = new TodoList();
        Task task = new Task("Do homework");
        todoList.addTask(task);

        Assertions.assertFalse(task.isCompleted());
        boolean toggled = todoList.toggleStatusById(task.getId());
        Assertions.assertTrue(toggled);
        Assertions.assertTrue(task.isCompleted());
    }

    @Test
    public void testToggleStatusByIdNotFound() {
        TodoList todoList = new TodoList();
        boolean toggled = todoList.toggleStatusById("non-existent-id");
        Assertions.assertFalse(toggled);
    }
    @Test
    public void testTaskCreatedAtIsSet() {
        Task task = new Task("Read book");
        LocalDateTime now = LocalDateTime.now();

        Assertions.assertNotNull(task.getCreatedAt());
        Assertions.assertTrue(task.getCreatedAt().isBefore(now.plusSeconds(1)));
        Assertions.assertTrue(task.getCreatedAt().isAfter(now.minusSeconds(5)));
    }
}
