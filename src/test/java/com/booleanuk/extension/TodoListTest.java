package com.booleanuk.extension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoListTest {
    TodoList list = new TodoList();

    @BeforeEach
    public void dummy() {
        list.addTask("Go for a walk");
        list.addTask("Ride a bike");
        list.addTask("Go to sleep");

    }

    @Test
    public void testGetItemByIdReturnsCorrectItem() {
        Item firstTask = list.getTaskById("task-1");
        Assertions.assertEquals(firstTask.getMessage(), "Go for a walk");
    }
}
