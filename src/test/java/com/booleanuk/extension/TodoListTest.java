package com.booleanuk.extension;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static java.time.LocalDateTime.now;
import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        assertEquals("Hello", hello);
        assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testIfAddsTask(){
        TodoList todoList = new TodoList();

        int id = todoList.add(new Task("Clean room",false, now()));
        assertEquals(1,id);

    }

    @Test
    public void testIfReturnsAllTasks(){
        TodoList todoList = new TodoList();

        todoList.add(new Task("bla bla",false, now()));
        todoList.add(new Task("clean",true, now()));
        assertEquals(2,todoList.getAll().size());
    }

    @Test
    public void testIfStatusChanged(){
        TodoList todoList = new TodoList();
        todoList.add(new Task("bla bla",false, now()));

        assertTrue(todoList.toggleTaskStatus(1));
        assertFalse(todoList.toggleTaskStatus(1));
    }

    @Test
    public void testGettingById(){
        TodoList todoList = new TodoList();
        Task task = new Task("bla bla",false, now());
        todoList.add(task);
        assertEquals(task, todoList.getById(1));
    }

    @Test
    public void testGettingAllTasksInAscendingOrder(){
        TodoList todoList = new TodoList();
        Task task1 = new Task("cla bla",false,LocalDateTime.now());
        Task task2 = new Task("bla bla",false,LocalDateTime.now());
        Task task3 = new Task("cza bla",false,LocalDateTime.now());
        todoList.add(task1);
        todoList.add(task2);
        todoList.add(task3);

        assertEquals(task1,todoList.getTasksAscending().get(1));
        assertEquals(task2,todoList.getTasksAscending().get(0));
        assertEquals(task3,todoList.getTasksAscending().get(2));
        assertEquals(3,todoList.getTasksAscending().size());
    }

    @Test
    public void testGettingAllTasksInDescendingOrder(){
        TodoList todoList = new TodoList();
        Task task1 = new Task("cla bla",false,LocalDateTime.now());
        Task task2 = new Task("bla bla",false,LocalDateTime.now());
        Task task3 = new Task("cza bla",false,LocalDateTime.now());
        todoList.add(task1);
        todoList.add(task2);
        todoList.add(task3);

        assertEquals(task1,todoList.getTasksDescending().get(1));
        assertEquals(task2,todoList.getTasksDescending().get(2));
        assertEquals(task3,todoList.getTasksDescending().get(0));
        assertEquals(3,todoList.getTasksDescending().size());
    }

    @Test
    public void testGettingCompleteTasks() {
        TodoList todoList = new TodoList();
        todoList.add(new Task("task one", false, now()));
        todoList.add(new Task("task two", true, now()));
        todoList.add(new Task("task three", true, now()));

        assertEquals(2, todoList.getCompleteTasks().size());
    }

    @Test
    public void testGettingIncompleteTasks() {
        TodoList todoList = new TodoList();
        todoList.add(new Task("task one", false, now()));
        todoList.add(new Task("task two", true, now()));
        todoList.add(new Task("task three", true, now()));

        assertEquals(1, todoList.getIncompleteTasks().size());
    }

    @Test
    public void testFindingIfTaskExists() {
        TodoList todoList = new TodoList();
        todoList.add(new Task("task one", false, now()));

        assertEquals("Task with id 1 exists in todo list.", todoList.taskExists(1));
        assertEquals("Task with id 2 doesn't exist in todo list.", todoList.taskExists(2));
    }

    @Test
    public void testIfTaskRemoved() {
        TodoList todoList = new TodoList();
        todoList.add(new Task("task one", false, now()));

        assertTrue(todoList.removeTask(1));
        assertFalse(todoList.removeTask(1));
    }

    @Test
    public void testUpdatingTaskName() {
        TodoList todoList = new TodoList();
        todoList.add(new com.booleanuk.extension.Task("task name", false, now()));

        assertTrue(todoList.updateTaskName(1, "updated task name"));
        assertEquals("updated task name", todoList.getById(1).getName());
    }

    @Test
    public void testGettingTasksByDateTime() {
        TodoList todoList = new TodoList();
        LocalDateTime firstDate = LocalDateTime.of(2023, Month.JULY, 10, 0, 0);
        LocalDateTime secondDate = LocalDateTime.of(2023, Month.JULY, 11, 0, 0);
        LocalDateTime thirdDate = LocalDateTime.of(2023, Month.JULY, 12, 0, 0);
        todoList.add(new Task("first task",false,firstDate));
        todoList.add(new Task("second task",false,secondDate));
        todoList.add(new Task("third task",false,thirdDate));

        assertEquals(firstDate, todoList.getTasksByDate().get(0).getCreateTime());
        assertEquals(secondDate, todoList.getTasksByDate().get(1).getCreateTime());
        assertEquals(thirdDate, todoList.getTasksByDate().get(2).getCreateTime());
        assertEquals(3,todoList.getTasksDescending().size());

        System.out.println(todoList.getTasksByDate());
    }
}
