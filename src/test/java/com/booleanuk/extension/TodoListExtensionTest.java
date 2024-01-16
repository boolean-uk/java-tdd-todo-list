package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {

    @Test
    public void testGetTaskByID() {
        TodoListExtension lst = new TodoListExtension();
        TaskExtension task = new TaskExtension("CV");

        Assertions.assertEquals(task.ID, 0);
    }
}
