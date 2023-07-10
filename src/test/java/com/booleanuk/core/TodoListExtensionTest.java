package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListExtensionTest {

    TodoList todoList;

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testTask1() {
        todoList = new TodoList();
        todoList.add(new Task("Task no. 1"));

        Assertions.assertEquals(1, todoList.tasks.size());
    }

    @Test
    public void changeTaskStatusToCompleted() {
        Task task = new Task("Task no. 2");
        task.setStatus(TaskStatus.COMPLETED);

        Assertions.assertEquals(TaskStatus.COMPLETED, task.getStatus());
    }

    @Test
    public void getCompletedTasks() {

        todoList = new TodoList();
        todoList.add(new Task("Completed task no.1", TaskStatus.COMPLETED));
        todoList.add(new Task("Completed task no.2", TaskStatus.COMPLETED));
        todoList.add(new Task("Incompleted task no. 1 "));

        List<Task> completedTasks = todoList.getCompletedTasks();

        Assertions.assertEquals(2, completedTasks.size());
        Assertions.assertTrue(completedTasks.stream().allMatch(o -> o.getStatus().equals(TaskStatus.COMPLETED)));


    }

    @Test
    public void getIncompletedTasks() {
        todoList = new TodoList();
        todoList.add(new Task("Completed task no.1", TaskStatus.COMPLETED));
        todoList.add(new Task("Completed task no.2", TaskStatus.COMPLETED));
        todoList.add(new Task("Incompleted task no. 1 "));

        List<Task> incompletedTasks = todoList.getIncompletedTasks();

        Assertions.assertEquals(1, incompletedTasks.size());
        Assertions.assertTrue(incompletedTasks.stream().allMatch(o -> o.getStatus().equals(TaskStatus.INCOMPLETED)));


    }

    @Test
    public void testTask2() {
        Task task1 = new Task("Task no. 1");
        todoList = new TodoList();
        todoList.add(task1);

        Assertions.assertEquals(todoList.getTasks().get(0), task1);
    }

    @Test
    public void testRemove() {
        Task task1 = new Task("Task no. 1");
        todoList = new TodoList();
        todoList.add(task1);
        Assertions.assertTrue(todoList.getTasks().contains(task1));

        todoList.removeTask(task1);

        Assertions.assertFalse(todoList.getTasks().contains(task1));
    }

    @Test
    public void testSearchIfExist() {
        Task task1 = new Task("Task no. 1");
        todoList = new TodoList();
        todoList.add(task1);
        Assertions.assertEquals("Task found: Task no. 1", todoList.search(task1));
    }

    @Test
    public void testSearchIfNotExist() {
        Task task1 = new Task("Task no. 1");
        todoList = new TodoList();
        todoList.add(task1);
        Assertions.assertEquals("Task not found", todoList.search(new Task("a")));
    }

    @Test
    public void testAscendingOrder() {
        Task task1 = new Task("aaa");
        Task task2 = new Task("bbb");
        Task task3 = new Task("ccc");

        todoList = new TodoList();
        todoList.add(task2);
        todoList.add(task1);
        todoList.add(task3);
        List<Task> ascendingTasks = todoList.sortAscending();
        Assertions.assertEquals(ascendingTasks.get(0), task1);
        Assertions.assertEquals(ascendingTasks.get(1), task2);
        Assertions.assertEquals(ascendingTasks.get(2), task3);
    }

    @Test
    public void testDescendingOrder() {
        Task task1 = new Task("aaa");
        Task task2 = new Task("bbb");
        Task task3 = new Task("ccc");

        todoList = new TodoList();
        todoList.add(task2);
        todoList.add(task1);
        todoList.add(task3);
        List<Task> descTasks = todoList.sortDescending();
        Assertions.assertEquals(descTasks.get(0), task3);
        Assertions.assertEquals(descTasks.get(1), task2);
        Assertions.assertEquals(descTasks.get(2), task1);
    }
}
