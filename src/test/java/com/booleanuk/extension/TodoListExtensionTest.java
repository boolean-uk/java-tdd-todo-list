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

    @Test
    public void testSetNameByID() {
        TodoListExtension lst = new TodoListExtension();
        TaskExtension task = new TaskExtension("CV");
        task.ID = 0;
        lst.addTask(task);

        Assertions.assertEquals(task.name, "CV");
        Assertions.assertNotEquals(task.name, "Sleep");

        lst.setNameByID(lst.getTaskByID(0).ID, "Job");

        Assertions.assertNotEquals(task.name, "CV");
        Assertions.assertEquals(task.name, "Job");
        Assertions.assertSame(task, lst.getTaskByID(0));
    }

    @Test
    public void testChangeStatusByID() {
        TodoListExtension lst = new TodoListExtension();
        TaskExtension task = new TaskExtension("CV");
        task.ID = 0;
        lst.addTask(task);

        Assertions.assertFalse(task.status);

        lst.changeStatusByID(0);
        Assertions.assertTrue(task.status);
    }
}
