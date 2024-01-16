package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {

    @Test
    public void taskWithIdExist() {
        TodoList task1 = new TodoList();

        boolean result = task1.getTaskWithId(int id);
        Assertions.assertTrue(result);
    }

    @Test
    public void taskWithIdNotExist() {
        TodoList task1 = new TodoList();

        boolean result = task1.getTaskWithId(int id);
        Assertions.assertFalse(result);

    }





}
