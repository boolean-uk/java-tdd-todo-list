package com.booleanuk.extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
public class TodoListTestExtension {
    private TodoListExtension todoList;

    @BeforeEach
    public void setup() {
        todoList = new TodoListExtension();
    }

    @Test
    public void testAddTask() {
        todoList.addTask("Task 1");
        todoList.addTask("Task 2");

        Assertions.assertEquals(2, todoList.getTasksList().size());
    }

    @Test
    public void testGetTaskById() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.addTask(task1);
        todoList.addTask(task2);

        Task foundTask = todoList.getTaskById(task2.getTaskId());

        Assertions.assertEquals(task2, foundTask);
    }

    @Test
    public void testGetTaskById_NonExistentId() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.addTask(task1);
        todoList.addTask(task2);

        Task foundTask = todoList.getTaskById(3); // Non-existent ID

        Assertions.assertNull(foundTask);
    }

    @Test
    public void testUpdateTask() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.addTask(task1);
        todoList.addTask(task2);

        boolean result = todoList.updateTask(task2.getTaskId(), "Updated Task");

        Assertions.assertTrue(result);
        Assertions.assertEquals("Updated Task", task2.getName());
    }

    @Test
    public void testUpdateTask_NonExistentId() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.addTask(task1);
        todoList.addTask(task2);

        boolean result = todoList.updateTask(3, "Updated Task"); // Non-existent ID

        Assertions.assertFalse(result);
    }

    @Test
    public void testChangeStatusById() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.addTask(task1);
        todoList.addTask(task2);

        boolean result = todoList.changeStatusById(task1.getTaskId());

        Assertions.assertTrue(result);
        Assertions.assertTrue(task1.isCompleted());
    }

    @Test
    public void testChangeStatusById_NonExistentId() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        todoList.addTask(task1);
        todoList.addTask(task2);

        boolean result = todoList.changeStatusById(3); // Non-existent ID

        Assertions.assertFalse(result);
    }

    @Test
    public void testShowTasks() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        task1.setTimeCreated(LocalDateTime.parse("2023-07-10T10:00:00"));
        task2.setTimeCreated(LocalDateTime.parse("2023-07-11T12:00:00"));
        todoList.addTask(task1);
        todoList.addTask(task2);

        String expectedOutput = "Task: Task 1\n" +
                "Task ID: 1\n" +
                "Created at: 2023-07-10T10:00\n" +
                "Completed: false\n\n" +
                "Task: Task 2\n" +
                "Task ID: 2\n" +
                "Created at: 2023-07-11T12:00\n" +
                "Completed: false\n\n";

        Assertions.assertEquals(expectedOutput, todoList.showTasks());
    }

}
