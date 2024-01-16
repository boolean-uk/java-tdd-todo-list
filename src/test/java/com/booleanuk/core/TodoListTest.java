package com.booleanuk.core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class TodoListTest {
    @Test
    public void addingTaskToListReturnsTrue() {
        TodoList list = new TodoList();

        assertTrue(list.add("Shovel snow"));
    }

    @Test
    public void returnsFalseIfListIsEmpty() {
        TodoList list = new TodoList();

        assertEquals(false, list.viewTasks());
    }
}
