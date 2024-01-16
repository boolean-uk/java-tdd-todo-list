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

    @Test
    public void testGetCompleteTasks() {
        TodoList lst = new TodoList();
        Task task_1 = new Task("CV");
        Task task_2 = new Task("Sleep");

        lst.addTask(task_1);
        lst.addTask(task_2);

        Assertions.assertFalse(task_1.status);
        lst.addTask(task_1);
        lst.addTask(task_2);
        task_1.setStatus(true);

        Assertions.assertSame(task_1, lst.getCompleteTasks().get(0));
        Assertions.assertNotSame(task_2, lst.getCompleteTasks().get(0));
    }

    @Test
    public void testGetIncompleteTasks() {
        TodoList lst = new TodoList();
        Task task_1 = new Task("CV");
        Task task_2 = new Task("Sleep");

        lst.addTask(task_1);
        lst.addTask(task_2);

        Assertions.assertFalse(task_1.status);
        lst.addTask(task_1);
        lst.addTask(task_2);
        task_1.setStatus(true);

        Assertions.assertSame(task_1, lst.getIncompleteTasks().get(0));
        Assertions.assertNotSame(task_2, lst.getIncompleteTasks().get(0));
    }
}
