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

        Assertions.assertEquals(true, list.addTask("Go for a walk with my dog"));
    }

    @Test
    public void shouldDisplayAllTasks() {
        TodoList list = new TodoList();
        list.addTask("Get home");
        list.addTask("Go for a walk with my dog");
        list.addTask("Get groceries");
        Assertions.assertArrayEquals(new String[]{"Get home Uncompleted", "Go for a walk with my dog Uncompleted", "Get groceries Uncompleted"}, list.display(list.tasks));
    }

    @Test
    public void shouldChangeStatus() {
        TodoList list = new TodoList();

        Task task = new Task("Get home");
        list.addTask(task);
        Assertions.assertEquals(true, list.changeStatus(task));
        Assertions.assertEquals(false, list.changeStatus(task));
    }
    /*
    @Test
    public void shouldDisplayAllUncompleted() {
        TodoList list = new TodoList();
        list.addTask("Get home");
        list.addTask("Go for a walk with my dog");
        list.addTask("Get groceries");
        Assertions.assertEquals(new String[]{"Get home uncompleted", "Go for a walk with my dog uncompleted", "Get groceries uncompleted"}, list.displayAllUncompleted());
    }

    @Test
    public void shouldDisplayAllCompleted() {
        TodoList list = new TodoList();
        list.addTask("Get home");
        list.changeStatus("Get home");
        list.addTask("Go for a walk with my dog");
        list.addTask("Get groceries");
        Assertions.assertEquals(new String[]{"Get home"}, list.displayAllCompleted());
    }

     */
}