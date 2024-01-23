package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    //User story 1
    @Test
    public void returnTrueIfTaskIsCreated() {
        boolean created = new Task("Buy groceries");
        Assertions.assertTrue(created);
    }
}
