package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void testAdd() {
        TodoList lst = new TodoList();
        Task task = new Task("CV");

        Assertions.assertEquals(true, lst.addTask(task));
        Assertions.assertTrue(lst.addTask(new Task("Sleep")));
    }

    @Test
    public void testRetrieveTasks() {
        TodoList lst = new TodoList();
        List<Task> ex = new ArrayList<Task>();

        Task task_1 = new Task("CV");
        Task task_2 = new Task("Sleep");

        lst.addTask(new Task("CV"));
        lst.addTask(new Task("Sleep"));

        ex.add(task_1);
        ex.add(task_2);

        Assertions.assertNotEquals(lst.retrieveTasks(), ex);
    }

    @Test
    public void testSetStatus() {
        TodoList lst = new TodoList();
        Task task = new Task("CV");
        Assertions.assertFalse(task.status);

        task.setStatus(true);
        Assertions.assertTrue(task.status);
    }
}
