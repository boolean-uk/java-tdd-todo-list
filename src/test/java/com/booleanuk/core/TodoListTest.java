package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListTest {

    TodoList todoList;

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void test() {
        todoList = new TodoList();
        todoList.add(new Task("Task no. 1", TaskStatus.INCOMPLETED));

        Assertions.assertEquals(1, todoList.tasks.size());
    }

    @Test
    public void changeTaskStatusToCompleted() {
        Task task = new Task("Task no. 2", TaskStatus.INCOMPLETED);
        task.setStatus(TaskStatus.COMPLETED);

        Assertions.assertEquals(TaskStatus.COMPLETED, task.getStatus());
    }

    @Test
    public void getCompletedTasks() {

        todoList = new TodoList();
        todoList.add(new Task("Completed task no.1", TaskStatus.COMPLETED));
        todoList.add(new Task("Completed task no.2", TaskStatus.COMPLETED));
        todoList.add(new Task("Incompleted task no. 1 ", TaskStatus.INCOMPLETED));

        List<Task> completedTasks = todoList.getCompletedTasks();

        Assertions.assertEquals(2, completedTasks.size());
        Assertions.assertTrue(completedTasks.stream().allMatch(o -> o.getStatus().equals(TaskStatus.COMPLETED)));


    }

    @Test
    public void getIncompletedTasks() {
        todoList = new TodoList();
        todoList.add(new Task("Completed task no.1", TaskStatus.COMPLETED));
        todoList.add(new Task("Completed task no.2", TaskStatus.COMPLETED));
        todoList.add(new Task("Incompleted task no. 1 ", TaskStatus.INCOMPLETED));

        List<Task> incompletedTasks = todoList.getCompletedTasks();

        Assertions.assertEquals(1, incompletedTasks.size());
        Assertions.assertTrue(incompletedTasks.stream().allMatch(o -> o.getStatus().equals(TaskStatus.INCOMPLETED)));


    }
}
