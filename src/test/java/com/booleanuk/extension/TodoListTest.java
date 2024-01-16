package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoListTest {
    TodoList todoList = new TodoList();

    @BeforeEach
    public void setupTestEnvironment() {
        todoList.clear();
    }

    @Test
    public void canGetTaskByUUID() {
        int id1 = todoList.add("Go Shopping");
        int id2 = todoList.add("Go Fishing");
        Assertions.assertEquals(todoList.getTasks().get(1), todoList.getTask(id2));
    }

    @Test
    public void canRenameTask() {
        int id1 = todoList.add("Go Shopping");
        int id2 = todoList.add("Go Fishing");
        Assertions.assertEquals(1, todoList.renameTask(id2, "Go swimming instead"));
        Assertions.assertEquals("Go swimming instead", todoList.getTask(id2).getDescription());
        Assertions.assertEquals(-1, todoList.renameTask(54321, "This id should not exist"));
    }

    @Test
    public void canToggleCompletion() {
        int id1 = todoList.add("Go Shopping");
        int id2 = todoList.add("Go Fishing");
        Assertions.assertFalse(todoList.getTask(id2).isCompleted());
        Assertions.assertEquals(1, todoList.setCompletionStatus(id2, true));
        Assertions.assertTrue(todoList.getTask(id2).isCompleted());
        Assertions.assertEquals(1, todoList.setCompletionStatus(id2, false));
        Assertions.assertFalse(todoList.getTask(id2).isCompleted());
    }
}
