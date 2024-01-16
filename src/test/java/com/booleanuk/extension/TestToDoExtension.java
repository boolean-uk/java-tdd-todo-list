package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestToDoExtension {
    @Test
    public void testGetTaskByID(){
        ToDoExtension todo = new ToDoExtension();
        todo.add("abc1234", "brush hair");
        todo.add("ooo3", "eat soup");

        Assertions.assertEquals(todo.getTask("abc1234").description, "brush hair");
        Assertions.assertEquals(todo.getTask("ooo3").description, "eat soup");
    }

    @Test
    public void testUpdateNameByID(){
        ToDoExtension todo = new ToDoExtension();
        todo.add("7646", "play golf");

        Assertions.assertEquals(todo.getTask("7646").description, "play golf");

        todo.changeName("7646", "play tennis");

        Assertions.assertFalse(todo.getTask("7646").description.equals("play golf"));
        Assertions.assertEquals(todo.getTask("7646").description, "play tennis");
    }

    @Test
    public void testChangeStatusByID(){
        ToDoExtension todo = new ToDoExtension();
        todo.add("123", "...");

        Assertions.assertFalse(todo.getTask("123").status);

        todo.changeStatus("123", true);

        Assertions.assertTrue(todo.getTask("123").status);
    }

    @Test
    public void testDateAndTimeCreated(){
        // TODO ============================================== test printed to screen
    }
}
