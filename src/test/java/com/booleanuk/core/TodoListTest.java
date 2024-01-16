package com.booleanuk.core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class TodoListTest {
    @Test
    public void addingTaskToListReturnsTrue() {
        TodoList list = new TodoList();

        assertTrue(list.add("Shovel snow", "Incomplete"));
    }

    @Test
    public void returnsFalseIfListIsEmpty() {
        TodoList list = new TodoList();

        assertFalse(list.viewTasks());

        list.add("Shovel snow", "Incomplete");

        assertTrue(list.viewTasks());
    }

    @Test
    public void testingIfTaskIsCompleted() {
        TodoList listStatus = new TodoList();

        listStatus.add("Shovel snow", "Incomplete");

        listStatus.changeStatus("Shovel snow", "Complete");

        assertEquals("Complete", listStatus.viewStatus("Shovel snow"));
    }

    @Test
    public void testingIfIOnlyGetCompleteTasks() {
        TodoList listStatus = new TodoList();

        listStatus.add("Shovel snow", "Incomplete");

        listStatus.add("Grocery shopping", "Incomplete");

        listStatus.changeStatus("Shovel snow", "Complete");

        assertEquals("Shovel snow", listStatus.getCompleteTasks());
    }

    @Test
    public void testingIfIOnlyGetIncompleteTasks() {
        TodoList listStatus = new TodoList();

        listStatus.add("Shovel snow", "Incomplete");

        listStatus.add("Grocery shopping", "Incomplete");

        listStatus.changeStatus("Shovel snow", "Complete");

        assertEquals("Grocery shopping", listStatus.getIncompleteTasks());
    }
}
