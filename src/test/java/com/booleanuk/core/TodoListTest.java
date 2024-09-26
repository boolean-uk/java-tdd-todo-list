package com.booleanuk.core;

import org.junit.jupiter.api.*;

class TodoListTest {
    private TodoList todolist;
    private String todo1, todo2, todo3, todo4;

    @BeforeEach
    void setUp() {
        todolist = new TodoList();
        todo1 = "groceries";
        todo2 = "bills";
        todo3 = "dentist";
        todo4 = "cleaning";

        todolist.addTask(todo1, false);
        todolist.addTask(todo2, false);
        todolist.addTask(todo3, false);
        todolist.addTask(todo4, false);
    }

    @Test
    void addItemsToTheTodoList() {
        Assertions.assertEquals(4, todolist.todoItems.size());
    }

    @Test
    void seeTheTasks() {
        Assertions.assertEquals("groceries, bills, dentist, cleaning", todolist.seeTasks());
    }

    @Test
    void changeStatus() {
        todolist.changeStatus("groceries");
        Assertions.assertTrue(todolist.todoItems.get("groceries"));
    }

    @Test
    void getCompletedTasks() {
        todolist.addTask(todo3, true);
        todolist.addTask(todo4, true);
        Assertions.assertEquals("dentist, cleaning", todolist.getCompletedTasks());
    }

    @Test
    void getUncompletedTasks() {
        todolist.addTask(todo1, false);
        todolist.addTask(todo2, false);
        todolist.addTask(todo3, true);
        todolist.addTask(todo4, true);
        Assertions.assertEquals("groceries, bills", todolist.getUncompletedTasks());
    }

    @Test
    void searchForSpecificTasks() {
        Assertions.assertTrue(todolist.searchTask(todo1));
        Assertions.assertFalse(todolist.searchTask("working"));
    }

    @Test
    void removeSpecificTasks() {
        Assertions.assertTrue(todolist.searchTask(todo1));
        todolist.removeTask(todo1);
        Assertions.assertFalse(todolist.searchTask(todo1));
    }

    @Test
    void getTheTasksInAscendingOrder() {
        Assertions.assertEquals("bills, cleaning, dentist, groceries", todolist.ascendingTasks());
    }

    @Test
    void getTheTasksInDescendingOrder() {
        Assertions.assertEquals("groceries, dentist, cleaning, bills", todolist.descendingTasks());
    }
}