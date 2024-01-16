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
    @Test
    public void testAddExistingTaskToTodoList(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        Assertions.assertFalse(tl.addTask(new Task("Shopping")));
    }

    /*Domain model user story 2 test*/
    @Test
    public void testGetTodoList(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        tl.addTask(new Task("Bowling"));
        String expected = "Shopping" + ", Not Complete\n"
                + "Bowling" + ", Not Complete\n";

        Assertions.assertEquals(expected, tl.getTodoList());
    }

    /*Domain model user story 3 test*/
    @Test
    public void testToggleStatusOfTask(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        Assertions.assertTrue(tl.toggleStatus("Shopping"));
    }
}
