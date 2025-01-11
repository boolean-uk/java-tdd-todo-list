package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

class TodoListTest {

    // Had to add this to reset static counter in between different tests
    @BeforeEach
    public void resetCounter() throws NoSuchFieldException, IllegalAccessException {
        Field counterField = Task.class.getDeclaredField("counter");
        counterField.setAccessible(true);
        counterField.set(null, 0);
    }

    @Test
    public void testAddTask() {
        ToDoList toDoList = new ToDoList();
        Task task = new Task("Swim");

        toDoList.addTask(task);
        Assertions.assertTrue(toDoList.tasks.contains(task));
    }

    @Test
    public void testGetTask(){
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);

        Assertions.assertEquals(task1, toDoList.getTask(1));
        Assertions.assertEquals(task2, toDoList.getTask(2));
        Assertions.assertEquals(task3, toDoList.getTask(3));
    }

    @Test
    public void testUpdateName(){
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);

        Assertions.assertEquals("a", toDoList.getTask(1).getName());
        Assertions.assertEquals("b", toDoList.getTask(2).getName());
        Assertions.assertEquals("c", toDoList.getTask(3).getName());

        toDoList.updateName(1, "x");
        toDoList.updateName(2, "y");
        toDoList.updateName(3, "z");
        Assertions.assertEquals("x", task1.getName());
        Assertions.assertEquals("y", task2.getName());
        Assertions.assertEquals("z", task3.getName());

    }

    @Test
    public void testRemoveTask() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("Sing");
        Task task2 = new Task("Jump");
        toDoList.addTask(task1);
        toDoList.addTask(task2);

        Assertions.assertTrue(toDoList.tasks.contains(task1));
        Assertions.assertTrue(toDoList.tasks.contains(task2));
        toDoList.removeTask("Jump");
        Assertions.assertFalse(toDoList.tasks.contains(task2));

    }

    @Test
    public void testSeeAllTask() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);

        Assertions.assertEquals(List.of("a", "b", "c"), toDoList.seeAllTasks());
    }

    @Test
    public void testChangeStatusWithId() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);

        Assertions.assertFalse(task1.getStatus());
        Assertions.assertFalse(task2.getStatus());
        Assertions.assertFalse(task3.getStatus());
        Assertions.assertEquals(2, task2.getId());
        Assertions.assertEquals(3, task3.getId());
        toDoList.changeStatus(2, true);
        toDoList.changeStatus(3, true);
        Assertions.assertFalse(task1.getStatus());
        Assertions.assertTrue(task2.getStatus());
        Assertions.assertTrue(task3.getStatus());

    }

    @Test
    public void testGetCompletedTasks() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        Assertions.assertEquals(2, task2.getId());
        Assertions.assertEquals(3, task3.getId());
        toDoList.changeStatus(2, true);
        toDoList.changeStatus(3, true);

        Assertions.assertEquals(List.of(task2, task3), toDoList.getCompletedTasks());

    }

    @Test
    public void testGetIncompleteTasks() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        Task task4 = new Task("d");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);
        toDoList.changeStatus(2, true);
        toDoList.changeStatus(3, true);

        Assertions.assertEquals(List.of(task1, task4), toDoList.getIncompleteTasks());

    }

    @Test
    public void testSearchExists() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        Task task4 = new Task("d");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);

        Task searchedTask = toDoList.search("d");
        Assertions.assertEquals(task4, searchedTask);
    }

    @Test
    public void testSearchDoesntExists() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        Task task4 = new Task("d");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);

        Task searchedTask = toDoList.search("e");
        Assertions.assertNull(searchedTask);
    }

    @Test
    public void testAlphabeticalA() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("d");
        Task task2 = new Task("c");
        Task task3 = new Task("b");
        Task task4 = new Task("a");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);

        Assertions.assertEquals(List.of("a", "b", "c", "d"), toDoList.alphabeticalA());
    }

    @Test
    public void testAlphabeticalD() {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");
        Task task4 = new Task("d");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);

        Assertions.assertEquals(List.of("d", "c", "b", "a"), toDoList.alphabeticalD());
    }

}

