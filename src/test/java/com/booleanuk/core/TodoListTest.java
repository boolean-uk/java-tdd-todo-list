package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;



class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskWhenNotExist(){
        TodoList todoList = new TodoList();
        Task task = new Task("do laundry");

        boolean result = todoList.addTask(task);

        Assertions.assertTrue(result);
    }

    @Test
    public void addTaskWhenAlreadyExists() {
        TodoList todoList = new TodoList();
        Task task = new Task("Do laundry");

        todoList.addTask(task);
        boolean result = todoList.addTask(task);

        Assertions.assertFalse(result);
    }

    @Test
    public void testgetAllTasks(){
        TodoList todoList = new TodoList();
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Do dishes");
        Task task3 = new Task("Walk the dog");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        List<Task> tasks = todoList.getAllTasks();

        Assertions.assertEquals(3,tasks.size());
        Assertions.assertTrue(tasks.contains(task1));
        Assertions.assertTrue(tasks.contains(task2));
        Assertions.assertTrue(tasks.contains(task3));
    }

    @Test
    public void testToggleStatus(){
        TodoList todoList = new TodoList();
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Walk the dog");

        todoList.addTask(task1);
        todoList.addTask(task2);

        boolean toggledExisting = todoList.toggleStatus("Buy groceries");
        Assertions.assertTrue(toggledExisting);

        boolean toggledNonExisting = todoList.toggleStatus("Walk the dog");
        Assertions.assertTrue(toggledNonExisting);

    }

    @Test
    public void testGetCompleteTasks(){
        TodoList todoList = new TodoList();
        Task task1 = new Task("Do dishes");
        Task task2 = new Task("Clean room");
        Task task3 = new Task("Do laundry");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        todoList.toggleStatus("Do laundry");
        todoList.toggleStatus("Clean room");

        List<Task> completedTasks = todoList.getCompleteTasks();

        Assertions.assertEquals(2, completedTasks.size());
        Assertions.assertTrue(completedTasks.contains(task2));
        Assertions.assertTrue(completedTasks.contains(task3));
        Assertions.assertFalse(completedTasks.contains(task1));

    }

    @Test
    public void testGetIncompleteTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Walk the dog");
        Task task3 = new Task("Do laundry");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        todoList.toggleStatus("Walk the dog");

        List<Task> incompleteTasks = todoList.getIncompleteTasks();

        Assertions.assertTrue(incompleteTasks.contains(task1));
        Assertions.assertTrue(incompleteTasks.contains(task3));
        Assertions.assertFalse(incompleteTasks.contains(task2));
        Assertions.assertEquals(2, incompleteTasks.size());
    }

    @Test
    public void testFindTask(){
        TodoList todoList = new TodoList();
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Walk the dog");

        todoList.addTask(task1);
        todoList.addTask(task2);

        String foundTaskName = todoList.findTask("Walk the dog");
        Assertions.assertEquals("Walk the dog", foundTaskName);

        String notFoundTaskName = todoList.findTask("Do dishes");
        Assertions.assertEquals("Task not found!", notFoundTaskName);


    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Do laundry");
        Task task2 = new Task("Do dishes");

        todoList.addTask(task1);
        todoList.addTask(task2);

        boolean removed = todoList.removeTask("Do laundry");

        Assertions.assertTrue(removed);
        Assertions.assertEquals(1, todoList.getAllTasks().size());
        Assertions.assertFalse(todoList.getAllTasks().contains(task1));
        Assertions.assertTrue(todoList.getAllTasks().contains(task2));

        boolean removedNonExisting = todoList.removeTask("Buy groceries");
        Assertions.assertFalse(removedNonExisting);

    }

    @Test
    public void testSortTasksAscending() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("Write report"));
        todoList.addTask(new Task("Buy groceries"));
        todoList.addTask(new Task("Attend meeting"));

        List<Task> sorted = todoList.getTasksSortedAscending();

        Assertions.assertEquals("Attend meeting", sorted.get(0).getName());
        Assertions.assertEquals("Buy groceries", sorted.get(1).getName());
        Assertions.assertEquals("Write report", sorted.get(2).getName());
    }

    @Test
    public void testSortTasksDescending() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("Write report"));
        todoList.addTask(new Task("Buy groceries"));
        todoList.addTask(new Task("Attend meeting"));

        List<Task> sorted = todoList.getTasksSortedDescending();

        Assertions.assertEquals("Write report", sorted.get(0).getName());
        Assertions.assertEquals("Buy groceries", sorted.get(1).getName());
        Assertions.assertEquals("Attend meeting", sorted.get(2).getName());
    }



}
