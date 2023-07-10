package com.booleanuk.core;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    private static String TASK1;
    private static String  TASK2;
    private static String  TASK3;
    private static TodoList TODOLIST;

    @BeforeAll
    static void testSetup() {
        TODOLIST = new TodoList();
        TASK1 = "Wash the dishes";
        TASK2 = "Walk the dog";
        TASK3 = "Drink a glass of water";
    }

    @Nested
    class AddTask {
        @Test
        void shouldReturnTrueIfTaskIsNotInTodoList() {
            assertTrue(TODOLIST.addTask(TASK1));
            assertTrue(TODOLIST.addTask(TASK2));
            assertTrue(TODOLIST.addTask(TASK3));
        }
        @Test
        void shouldReturnFalseIfTaskIsInTodoList() {
            assertFalse(TODOLIST.addTask(TASK1));
        }
    }
}
