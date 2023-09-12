package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void addTaskSuccessful() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.tasks.containsKey("Feed the cat"));
        Assertions.assertFalse(todoList.tasks.get("Feed the cat"));
    }

    @Test
    public void addTaskFailed() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.tasks.containsKey("Feed the cat"));
        Assertions.assertFalse(todoList.addTask("Feed the cat"));
    }

    @Test
    public void addTaskFailsBecauseEmptyString() {
        TodoList todoList = new TodoList();
        Assertions.assertFalse(todoList.addTask("\n\r\t"));
        Assertions.assertEquals(0, todoList.tasks.size());
    }

    @Test
    public void getTasksWhenMapNotEmpty() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        String taskTwo = "Go shopping";
        todoList.addTask(taskOne);
        todoList.addTask(taskTwo);
        Assertions.assertEquals("Tasks: " + String.join(", ", todoList.tasks.keySet()), todoList.getTasks());
    }
    @Test
    public void getTasksWhenMapIsEmpty() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("No tasks in your list!" , todoList.getTasks());
    }

}
