package com.booleanuk.extension;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {
    private static TodoList TODOLIST;

    private static String TASK1;
    private static String TASK2;
    private static String TASK3;

    @BeforeAll
    static void setup() {
        TODOLIST = new TodoList();
        TASK1 = "Wash the dishes";
        TASK2 = "Walk the dog";
        TASK3 = "Drink a glass of water";
    }

    @AfterEach
    void clear() {
        TODOLIST.tasks.clear();
    }

    @Nested
    class addTask {
        @Test
        public void shouldAddTask() {
            TODOLIST.addTask(TASK1);
            assertEquals(1, TODOLIST.tasks.keySet().size());

            TODOLIST.addTask(TASK2);
            assertEquals(2, TODOLIST.tasks.keySet().size());
        }
    }

    @Nested
    class GetTask {
        @Test
        public void shouldReturnTask() {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            Task task1 = TODOLIST.getTask(0);
            Task task2 = TODOLIST.getTask(1);
            Task task3 = TODOLIST.getTask(3);
            assertEquals(TASK1, task1.text);
            assertEquals(TASK2, task2.text);
        }
    }

    @Nested
    class UpdateTaskName {
        @Test
        public void shouldReturnTrue() {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            assertTrue(TODOLIST.updateTaskName(0, TASK3));
            Task task1 = TODOLIST.getTask(0);
            assertEquals(TASK3, task1.text);
        }

        @Test
        public void shouldReturnFalse() {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            assertFalse(TODOLIST.updateTaskName(3, TASK3));
        }
    }

    @Nested
    class ChangeTaskStatus {
        @Test
        public void shouldChangeStatus() {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            assertFalse(TODOLIST.getTask(0).isCompleted);
            assertFalse(TODOLIST.getTask(0).isCompleted);
            TODOLIST.changeTaskStatus(0);
            TODOLIST.changeTaskStatus(1);
            TODOLIST.changeTaskStatus(2);
            assertTrue(TODOLIST.getTask(0).isCompleted);
            assertTrue(TODOLIST.getTask(0).isCompleted);
        }
    }
}
