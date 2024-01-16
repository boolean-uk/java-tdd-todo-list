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

    /*Domain model user story 1 test*/
    @Test
    public void testAddToTodoList(){
        TodoList tl = new TodoList();
        Assertions.assertTrue(tl.addTask(new Task("Shopping")));


    }
    @Test void testAddExistingTaskToTodoList(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        Assertions.assertFalse(tl.addTask(new Task("Shopping")));
    }
}
