package com.booleanuk.extension;

import com.booleanuk.core.Task;
import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TodoListExtensionTest {
    @Test
    public void addTaskToList(){
        TodoListExtension todoList = new TodoListExtension();

        Assertions.assertTrue(todoList.add("First Task"));
        Assertions.assertTrue(todoList.add("First Task"));
    }

    @Test
    public void getTaskByIdTest() {
        TodoListExtension todoList = new TodoListExtension();

        Assertions.assertTrue(todoList.add("First Task"));
        todoList.add("Second Task");
        todoList.add("Third Task");

        Assertions.assertEquals("First Task", todoList.getTaskById(0).getName());
        Assertions.assertNotEquals("Third Task", todoList.getTaskById(0).getName());
    }

    @Test
    public void updateTaskTest() {
        TodoListExtension todoList = new TodoListExtension();

        todoList.add("First Task");
        Assertions.assertEquals("First Task", todoList.getTaskById(0).getName());
        todoList.updateTaskName(0, "Updated Task");
        Assertions.assertEquals("Updated Task", todoList.getTaskById(0).getName());
    }

    @Test
    public void changeStatusTest() {
        TodoListExtension todoList = new TodoListExtension();

        todoList.add("First Task");
        Assertions.assertFalse(todoList.getTaskById(0).getTaskStatus());
        todoList.getTaskById(0).changeStatus();
        Assertions.assertTrue(todoList.getTaskById(0).getTaskStatus());
    }

    @Test
    public void getDateTask() {
        TodoListExtension todoList = new TodoListExtension();
        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDay = LocalDateTime.now().format(formatter);

        todoList.add("First Task");

        Assertions.assertEquals(formattedDay, todoList.getTaskById(0).getDateString());
    }
}
