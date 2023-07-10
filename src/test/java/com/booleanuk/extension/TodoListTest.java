package com.booleanuk.extension;

import com.booleanuk.shared.TaskStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TodoListTest {
    private static TodoList TODO_LIST;
    private static String CLEAN_DISHES;
    private static String BUY_GROCERIES;

    @BeforeAll
    static void testSetup() {
        TODO_LIST = new TodoList();
        CLEAN_DISHES = "Clean the dishes";
        BUY_GROCERIES = "Buy groceries";
    }

    @AfterEach
    void resetTodoList() {
        TODO_LIST.clear();
    }


    @Test
    void addTask_shouldAddTaskToListWhenNotAlreadyOnList() {
        TODO_LIST.addTask(CLEAN_DISHES);

        var addedTask = TODO_LIST
                .getAllTasks()
                .get(0)
                .getName();
        
        assertEquals(CLEAN_DISHES, addedTask);
    }

    @Test
    void addTask_shouldThrowWhenAlreadyOnList() {
        TODO_LIST.addTask(CLEAN_DISHES);

        assertThrows(IllegalStateException.class, () -> TODO_LIST.addTask(CLEAN_DISHES));
    }

    @Test
    void updateTaskName_shouldUpdateNameWhenTaskPresent() {
        TODO_LIST.addTask(CLEAN_DISHES);
        long taskId = TODO_LIST
                .getAllTasks()
                .get(0)
                .getId();

        TODO_LIST.updateTaskName(taskId, BUY_GROCERIES);
        var actualTaskName = TODO_LIST
                .getAllTasks()
                .get(0)
                .getName();

        assertEquals(BUY_GROCERIES, actualTaskName);
    }

    @Test
    void updateTaskName_shouldThrowWhenTaskAbsent() {
        assertThrows(NoSuchElementException.class, () -> TODO_LIST.updateTaskName(100, BUY_GROCERIES));
    }

    @Test
    void toggleTaskStatus_shouldChangeTaskStatusWhenTaskExists() {
        TODO_LIST.addTask(CLEAN_DISHES);

        TODO_LIST.toggleTaskStatus(Task.getCurrentIdCounter());

        var actualStatus = TODO_LIST.getAllTasks()
                .get(0)
                .getStatus();

        assertEquals(TaskStatus.Complete, actualStatus);
    }

    @Test
    void toggleTaskStatus_shouldThrowWhenTaskDoesNotExist() {
        assertThrows(NoSuchElementException.class, () -> TODO_LIST.toggleTaskStatus(100));
    }

    @Test
    void getTask_shouldReturnNonEmptyOptionalIfExists() {
        TODO_LIST.addTask(CLEAN_DISHES);

        var taskOpt = TODO_LIST.getTask(Task.getCurrentIdCounter());

        assertTrue(taskOpt.isPresent());
        assertEquals(Task.of(CLEAN_DISHES), taskOpt.get());
    }

    @Test
    void getTask_shouldReturnEmptyOptionalIfDoesNotExist() {
        var taskOpt = TODO_LIST.getTask(100);

        assertTrue(taskOpt.isEmpty());
    }
}