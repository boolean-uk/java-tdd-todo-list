package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAdd() {
        TodoList todolist = new TodoList();

        todolist.add("Do laundry");
        Assertions.assertEquals("Do laundry", todolist.getTask("Do laundry"));
        Assertions.assertEquals("Task already in list", todolist.add("Do laundry"));
        todolist.add("Go fishing");
        Assertions.assertEquals("Go fishing", todolist.getTask("Go fishing"));
    }
}
