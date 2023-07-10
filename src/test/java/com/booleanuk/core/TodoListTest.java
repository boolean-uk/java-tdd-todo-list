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
        Assertions.assertTrue(list.changeStatus(task));
        Assertions.assertFalse(list.changeStatus(task));
    }

    @Test
    public void searchTaskByNameTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        todoList.addTask(task1);
        Assertions.assertEquals(task1.toString(), todoList.searchTaskByName("Make dinner"));
        Assertions.assertEquals("Task not found", todoList.searchTaskByName("Buy bread"));
    }

    @Test
    public void removeTaskTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        todoList.addTask(task1);
        Assertions.assertEquals("Task removed", todoList.removeTask("Make dinner"));
        Assertions.assertEquals("Task not found", todoList.removeTask("Buy bread"));
    }

    @Test
    public void displayUncompletedTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        Task task2 = new Task("Buy bread");
        Task task3 = new Task("Go to the doctor");
        todoList.addTask(task3);
        todoList.addTask(task2);
        todoList.addTask(task1);
        task2.setStatus(true);
        Assertions.assertArrayEquals(new String[]{"Go to the doctor Uncompleted", "Make dinner Uncompleted"}, todoList.displayUncompleted());
    }

    @Test
    public void displayCompletedTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        Task task2 = new Task("Buy bread");
        Task task3 = new Task("Go to the doctor");
        todoList.addTask(task3);
        todoList.addTask(task2);
        todoList.addTask(task1);
        task2.setStatus(true);
        Assertions.assertArrayEquals(new String[]{"Buy bread Completed"}, todoList.displayCompleted());
    }

    @Test
    public void displayInAlphabeticalOrderTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        Task task2 = new Task("Buy bread");
        Task task3 = new Task("Go to the doctor");
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        Assertions.assertArrayEquals(new String[]{"Buy bread Uncompleted", "Go to the doctor Uncompleted", "Make dinner Uncompleted"}, todoList.displayInAlphabeticalOrder());
    }

    @Test
    public void displayInReverseAlphabeticalOrderTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Make dinner");
        Task task2 = new Task("Buy bread");
        Task task3 = new Task("Go to the doctor");
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        Assertions.assertArrayEquals(new String[]{"Make dinner Uncompleted", "Go to the doctor Uncompleted", "Buy bread Uncompleted"}, todoList.displayInReverseAlphabeticalOrder());
    }
}