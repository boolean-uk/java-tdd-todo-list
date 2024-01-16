package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {

    @Test
    public void testGetTaskByID() {
        TodoListExtension lst = new TodoListExtension();
        TaskExtension task = new TaskExtension("CV");
        task.ID = 0;
        lst.addTask(task);

        Assertions.assertEquals(task.ID, 0);
        Assertions.assertSame(task, lst.getTaskByID(0));
    }
}
