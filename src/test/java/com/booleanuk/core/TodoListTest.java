package com.booleanuk.core;

import org.junit.jupiter.api.*;

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
}
