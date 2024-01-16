package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TodoListExtensionTest {

    @Test
    public void taskWithIdExist() {
        TodoListExtension task1 = new TodoListExtension();
        task1.addTask(1, "Hei");
        boolean result = task1.getTaskWithId(1);
        Assertions.assertTrue(result);
    }

    @Test
    public void taskWithIdNotExist() {
        TodoListExtension task1 = new TodoListExtension();

        boolean result = task1.getTaskWithId(1);
        Assertions.assertFalse(result);

    }

    @Test
    public void testSetNewName() {
        TodoListExtension task1 = new TodoListExtension();

        task1.addTask(1, "Hei");
        String result = task1.setNewName(1, "Halla");
        Assertions.assertEquals("{1=Halla})", result);

    }







}
