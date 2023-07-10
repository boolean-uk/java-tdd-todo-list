package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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
        }
        @Test
        void shouldReturnFalseIfTaskIsInTodoList() {
            TODOLIST.addTask(TASK1);
            assertFalse(TODOLIST.addTask(TASK1));
        }
    }
}
