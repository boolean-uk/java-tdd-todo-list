package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    private TodoList todoList;
    @BeforeEach
    public void setup() {
        todoList = new TodoList();
        Task.id_counter = 0;
    }

    @Test
    @DisplayName("Test tasks initialized and empty")
    public void testTodoListInitialState() {
        Assertions.assertTrue(todoList.getTasks().isEmpty());
    }

    @Test
    public void testAddNewTask() {
        String name = "Work out";
        todoList.add(name);
        Assertions.assertEquals(name, todoList.getTasks().get(0).getName());
    }

    @Test
    public void testGetAllTasks() {
        todoList.add("1st item");
        todoList.add("2nd item");
        todoList.add("3rd item");
        // Test Array Length
        Assertions.assertEquals(3, todoList.getTasks().size());

        Assertions.assertEquals("1st item", todoList.getTasks().get(0).getName());
        Assertions.assertEquals("2nd item", todoList.getTasks().get(1).getName());
        Assertions.assertEquals("3rd item", todoList.getTasks().get(2).getName());
    }

    @Test
    public void testToggleCompleted() {
        todoList.add("Work out");
        Assertions.assertFalse(todoList.getTasks().get(0).getCompleted());
        todoList.toggleCompleted(0);
        Assertions.assertTrue(todoList.getTasks().get(0).getCompleted());
        todoList.toggleCompleted(0);
        Assertions.assertFalse(todoList.getTasks().get(0).getCompleted());
    }

    @Test
    public void testGetTasksByCompleted() {
        //set up
        todoList.add("Work out");
        todoList.add("Rest");
        todoList.add("Study");
        todoList.toggleCompleted(0);
        List<Task> completedTasks = todoList.getTasks(true);
        List<Task> uncompletedTasks = todoList.getTasks(false);
        // assert length
        Assertions.assertEquals(1,completedTasks.size());
        Assertions.assertEquals(2,uncompletedTasks.size());
        // assert values
        Assertions.assertTrue(completedTasks.get(0).getCompleted());
        Assertions.assertFalse(uncompletedTasks.get(0).getCompleted());
        Assertions.assertFalse(uncompletedTasks.get(1).getCompleted());
    }

    @Test
    public void testGetTaskById(){
        todoList.add("Work out");
        todoList.add("Study");

        Assertions.assertTrue(todoList.getTask(1) != null);
        Assertions.assertTrue(todoList.getTask(15) == null);
    }

    @Test
    public void testRemoveTasks() {
        todoList.add("Work Out");
        todoList.add("Rest");

        todoList.remove(0);

        Assertions.assertEquals(1, todoList.getTasks().size());
        Assertions.assertEquals("Rest", todoList.getTasks().get(0).getName());
    }

    @Test
    public void testSortAscending() {
        todoList.add("Banana");
        todoList.add("Avocado");
        todoList.add("Dragon Fruit");
        todoList.add("Corn");

        todoList.sortAscending();
        Assertions.assertEquals("Avocado", todoList.getTasks().get(0).getName());
        Assertions.assertEquals("Banana", todoList.getTasks().get(1).getName());
        Assertions.assertEquals("Corn", todoList.getTasks().get(2).getName());
        Assertions.assertEquals("Dragon Fruit", todoList.getTasks().get(3).getName());
    }

    @Test
    public void testSortDescending() {
        todoList.add("Banana");
        todoList.add("Avocado");
        todoList.add("Dragon Fruit");
        todoList.add("Corn");

        todoList.sortDescending();
        Assertions.assertEquals("Dragon Fruit", todoList.getTasks().get(0).getName());
        Assertions.assertEquals("Corn", todoList.getTasks().get(1).getName());
        Assertions.assertEquals("Banana", todoList.getTasks().get(2).getName());
        Assertions.assertEquals("Avocado", todoList.getTasks().get(3).getName());
    }
}
