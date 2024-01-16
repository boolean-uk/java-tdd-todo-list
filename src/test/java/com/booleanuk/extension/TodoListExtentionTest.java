package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtentionTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }


}
