package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void TestAdd() {
        TodoList lst = new TodoList();
        Assertions.assertEquals(true, lst.addTask());
        Assertions.assertNotEquals("Goodbye", hello);
    }
}
