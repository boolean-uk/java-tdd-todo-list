package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.UUID;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    private static TodoList todolist;
    private static Task task;
    private static Task task2;
    private static Task task3;

    @BeforeAll
    public static void createTasks(){
        task = new Task("Do homework", false);
        task2 = new Task("Wash dishes", true);
        task3 = new Task("Go outside", true);
    }
    @BeforeEach
    public void create(){
        todolist = new TodoList();
    }

    @Test
    public void getTaskByUUID() {
        Optional<Task> optionalTask = todolist.getTaskByUUID(UUID.randomUUID());
        Assertions.assertTrue(optionalTask.isEmpty());

        todolist.addTask(task);

        Optional<Task> optionalTask2 = todolist.getTaskByUUID(task.uuid);
        Assertions.assertTrue(optionalTask2.isPresent());
    }

    //boolean updateTaskByUUID(UUID uuid, String newName)
    @Test
    public void updateTaskByUUIDTest(){
        todolist.addTask(task);
        boolean result1 = todolist.updateTaskByUUID(task.uuid, "Clean the room");
        Assertions.assertTrue(result1);
        Assertions.assertEquals("Clean the room",task.name);

        boolean result2 = todolist.updateTaskByUUID(UUID.randomUUID(), "Do homework");
        Assertions.assertFalse(result2);
    }

    @Test
    public void changeStatusByUUID() {
        todolist.addTask(task);
        boolean result1 = todolist.changeStatus(task.uuid);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(task.isCompleted);

        boolean result2 = todolist.changeStatus(UUID.randomUUID());
        Assertions.assertFalse(result2);
    }
}
