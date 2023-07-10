package com.booleanuk.core;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

class TodoListTest {
    TodoList todoList;

    @BeforeEach
    public void createExampleTasks() {
        todoList = new TodoList();
    }

    @Test
    public void addTaskTest() {
        Assertions.assertTrue(todoList.addTask("Laundry", "Wash the clothes"));
    }

    // Duplicate fail
    @Test
    public void addTaskFailedTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        Assertions.assertTrue(todoList.addTask("Laundry", "Wash the clothes"));
    }

    @Test
    public void getAllTasksTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        todoList.addTask("Cooking", "Cook the food");
        Assertions.assertEquals(2, todoList.getAllTasks().size());
    }

    @Test
    public void changeStatusTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        Assertions.assertTrue(todoList.changeStatus("Laundy", TaskStatus.COMPLETE));
    }

    @Test
    public void getCompleteTasksTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        todoList.changeStatus("Laundry", TaskStatus.COMPLETE);
        todoList.addTask("Cooking", "Cook the food");
        Assertions.assertEquals(1, todoList.getCompleteTasks().size());
    }

    @Test
    public void getIncompleteTasksTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        todoList.changeStatus("Laundry", TaskStatus.COMPLETE);
        todoList.addTask("Cooking", "Cook the food");
        Assertions.assertEquals(1, todoList.getIncompleteTasks().size());
    }

    @Test
    public void searchTaskTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        todoList.addTask("Cooking", "Cook the food");
        Assertions.assertEquals("Laundry", todoList.searchTask("Laundry").getName());
    }

    @Test
    public void searchTaskFailedTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        todoList.addTask("Cooking", "Cook the food");
        Assertions.assertNotEquals("Laundry", todoList.searchTask("Running").getName());
    }

    @Test
    public void removeTaskTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        Assertions.assertTrue(todoList.removeTask("Laundry"));
    }

    @Test
    public void removeTaskFailedTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        Assertions.assertFalse(todoList.removeTask("Cooking"));
    }

    @Test
    public void getAllTasksAscendingTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        todoList.addTask("Cooking", "Cook");
        todoList.addTask("Washing", "Wash the clothes");
        ArrayList<String> sortedKeys = todoList.getAllTasksAscending();
        boolean sorted = true;
        for (int i = 0; i < sortedKeys.size() - 1; i++) {
            String current = sortedKeys.get(i);
            String next = sortedKeys.get(i + 1);
            if (current.compareTo(next) > 0) {
                sorted = false;
            }
        }
        Assertions.assertTrue(sorted);
    }

    @Test
    public void getAllTasksDescendingTest() {
        todoList.addTask("Laundry", "Wash the clothes");
        todoList.addTask("Cooking", "Cook");
        todoList.addTask("Washing", "Wash the clothes");
        ArrayList<String> sortedKeys = todoList.getAllTasksDescending();
        boolean sorted = true;
        for (int i = 0; i < sortedKeys.size() - 1; i++) {
            String current = sortedKeys.get(i);
            String next = sortedKeys.get(i + 1);
            if (current.compareTo(next) < 0) {
                sorted = false;
            }
        }
        Assertions.assertTrue(sorted);
    }
}
