package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TodoListExtensionTest {

    @Test
    public void testGetTaskById() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        todoList.todos.add(new Task("2","Code"));
        Assertions.assertEquals("Work: incomplete",todoList.getTaskById("1"));
    }

    @Test
    public void testGetTaskByIdNotInList() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        todoList.todos.add(new Task("2","Code"));
        Assertions.assertEquals("Task not found",todoList.getTaskById("3"));
    }

    @Test
    public void testGetTaskByIdFromEmptyList() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertEquals("List is empty",todoList.getTaskById("1"));
    }

    @Test
    public void testSetTaskNameByIdWithSingleTaskInList() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        Assertions.assertTrue(todoList.setTaskName("1", "Code"));
        Assertions.assertEquals(todoList.getTaskById("1").split(": ")[0], "Code");
    }

    @Test
    public void testSetTaskNameByIdWithMultipleTasksInList() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        todoList.todos.add(new Task("2","Exercise"));
        todoList.todos.add(new Task("3","Train"));
        Assertions.assertTrue(todoList.setTaskName("3", "Code"));
        Assertions.assertEquals(todoList.getTaskById("3").split(": ")[0], "Code");
    }

    @Test
    public void testSetTaskNameByIdWithEmptyList() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertFalse(todoList.setTaskName("1", "Code"));
    }

    @Test
    public void testSetTaskNameByIdWithNoneExistingId() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        todoList.todos.add(new Task("2","Exercise"));
        todoList.todos.add(new Task("3","Train"));
        Assertions.assertFalse(todoList.setTaskName("4", "Code"));
    }

    @Test
    public void testChangeStatus() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        Assertions.assertTrue(todoList.setTaskStatus("1"));
        Assertions.assertTrue(todoList.todos.get(0).status);
    }

    @Test
    public void testChangeStatusNoneExistingId() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertFalse(todoList.setTaskStatus("1"));
    }

    @Test
    public void testChangeStatusTwice() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        Assertions.assertTrue(todoList.setTaskStatus("1"));
        Assertions.assertTrue(todoList.setTaskStatus("1"));
        Assertions.assertFalse(todoList.todos.get(0).status);
    }

    @Test
    public void testCheckDateSetToTimeOfCreation() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        Assertions.assertEquals(todoList.todos.get(0).creationTime, new Date());
    }

    @Test
    public void testGetTaskWithTime() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        Assertions.assertEquals("Work: incomplete\n"+new Date(), todoList.getTasksWithTime());
    }

    @Test
    public void testGetTaskWithTimeEmptyList() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertEquals("List is empty", todoList.getTasksWithTime());
    }

    @Test
    public void testGetMultipleTasksWithTime() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        todoList.todos.add(new Task("2","Exercise"));
        todoList.todos.add(new Task("3","Code"));
        Assertions.assertEquals("Work: incomplete\n"+new Date()+"\nExercise: incomplete\n"+new Date()+"\nCode: incomplete\n"+new Date(), todoList.getTasksWithTime());
    }
}
