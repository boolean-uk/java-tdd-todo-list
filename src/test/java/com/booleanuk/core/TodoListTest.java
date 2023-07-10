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
    @Test
    public void shouldAddNames() {
        TodoList list = new TodoList();
        String task = "Go for a walk with my dog";
        Assertions.assertEquals(true, list.addTask(task));
    }

    @Test
    public void shouldDisplayAllTasks() {
        TodoList list = new TodoList();
        list.addTask("Get home");
        list.addTask("Go for a walk with my dog");
        list.addTask("Get groceries");
        Assertions.assertEquals(new String[]{"Get home uncompleted", "Go for a walk with my dog uncompleted", "Get groceries uncompleted"}, testTask.displayAll());
    }

    @Test
    public void shouldChangeStatus() {
        TodoList list = new TodoList();

        String task = "Get home";
        list.addTask(task);
        Assertions.assertEquals(true, testTask.changeStatus(task));
        Assertions.assertEquals(false, testTask.changeStatus(task));
    }
}
