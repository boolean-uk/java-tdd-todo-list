package com.booleanuk.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class TodoListTest {
    @Test
    public void addingTaskToListReturnsTrue() {
        TodoList list = new TodoList();

        Assertions.assertTrue(list.add("Shovel snow"));
    }
}
