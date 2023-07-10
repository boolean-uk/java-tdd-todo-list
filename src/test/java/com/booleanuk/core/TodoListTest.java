package com.booleanuk.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

        assertTrue(
                TODO_LIST.getAllTasks().stream()
                        .map(Task::name)
                        .toList()
                        .contains(CLEAN_DISHES)
        );
    }

    @Test
    void addTask_shouldThrowWhenAlreadyOnList() {
        TODO_LIST.addTask(CLEAN_DISHES);

        assertThrows(IllegalStateException.class, () -> TODO_LIST.addTask(CLEAN_DISHES));
    }

    @Test
    void getAllTasks_shouldReturnEmptyListForNoTasks() {
        assertEquals(List.of(), TODO_LIST.getAllTasks());
    }

    @Test
    void getAllTasks_shouldReturnNonEmptyListForTasksPresent() {
        TODO_LIST.addTask(CLEAN_DISHES);
        TODO_LIST.addTask(BUY_GROCERIES);

        var expectedTasks = List.of(Task.of(CLEAN_DISHES), Task.of(BUY_GROCERIES));

        assertEquals(expectedTasks, TODO_LIST.getAllTasks());
    }

    @Test
    void toggleTaskStatus_shouldChangeTaskStatusWhenTaskExists() {
        TODO_LIST.addTask(CLEAN_DISHES);

        TODO_LIST.toggleTaskStatus(CLEAN_DISHES);

        var actualStatus = TODO_LIST.getAllTasks().stream()
                .filter(t -> t.name().equals(CLEAN_DISHES))
                .findFirst()
                .orElseThrow(NoSuchElementException::new)
                .status();

        assertEquals(TaskStatus.Complete, actualStatus);
    }

    @Test
    void toggleTaskStatus_shouldThrowWhenTaskDoesNotExist() {
        assertThrows(NoSuchElementException.class, () -> TODO_LIST.toggleTaskStatus(CLEAN_DISHES));
    }

    @Test
    void getAllTasksByStatus_shouldReturnEmptyListForEmptyTodoList() {
        assertEquals(List.of(), TODO_LIST.getAllTasksByStatus(TaskStatus.Complete));
    }

    @Test
    void getAllTasksByStatus_shouldReturnEmptyListForNoMatchingTasks() {
        TODO_LIST.addTask(CLEAN_DISHES);
        TODO_LIST.addTask(BUY_GROCERIES);

        assertEquals(List.of(), TODO_LIST.getAllTasksByStatus(TaskStatus.Complete));
    }

    @Test
    void getAllTasksByStatus_shouldReturnNonEmptyListWhenMatchingTasksFound() {
        TODO_LIST.addTask(CLEAN_DISHES);
        TODO_LIST.addTask(BUY_GROCERIES);

        var expectedTasks = List.of(Task.of(CLEAN_DISHES), Task.of(BUY_GROCERIES));

        assertEquals(expectedTasks, TODO_LIST.getAllTasksByStatus(TaskStatus.InProgress));
    }

    @Test
    void getOneTaskByName_shouldReturnNonEmptyOptionalIfExists() {
        TODO_LIST.addTask(CLEAN_DISHES);

        var taskOpt = TODO_LIST.getOneTaskByName(CLEAN_DISHES);

        assertTrue(taskOpt.isPresent());
        assertEquals(Task.of(CLEAN_DISHES), taskOpt.get());
    }

    @Test
    void getOneTaskByName_shouldReturnEmptyOptionalIfDoesNotExist() {
        var taskOpt = TODO_LIST.getOneTaskByName(CLEAN_DISHES);

        assertTrue(taskOpt.isEmpty());
    }

    @Test
    void removeOneTaskByName_shouldRemoveTaskIfPresent() {
        TODO_LIST.addTask(BUY_GROCERIES);

        TODO_LIST.removeOneTaskByName(BUY_GROCERIES);

        assertFalse(
                TODO_LIST.getAllTasks().stream()
                        .map(Task::name)
                        .toList()
                        .contains(BUY_GROCERIES)
        );
    }

    @Test
    void removeOneTaskByName_shouldDoNothingIfTaskNotPresent() {
        TODO_LIST.addTask(BUY_GROCERIES);

        TODO_LIST.removeOneTaskByName(CLEAN_DISHES);

        assertTrue(
                TODO_LIST.getAllTasks().stream()
                        .map(Task::name)
                        .toList()
                        .contains(BUY_GROCERIES)
        );
    }

    @Test
    void getAllTasksSorted_shouldReturnEmptyListForNoTasks() {
        for (var s : SortingOrder.values()) {
            assertEquals(List.of(), TODO_LIST.getAllTasksSorted(s));
        }
    }

    @Test
    void getAllTasksSorted_shouldReturnListSortedAscending() {
        TODO_LIST.addTask(CLEAN_DISHES);
        TODO_LIST.addTask(BUY_GROCERIES);

        TODO_LIST.getAllTasksSorted(SortingOrder.Ascending);

        var expectedTasks = List.of(Task.of(BUY_GROCERIES), Task.of(CLEAN_DISHES));

        assertEquals(expectedTasks, TODO_LIST.getAllTasksSorted(SortingOrder.Ascending));
    }

    @Test
    void getAllTasksSorted_shouldReturnListSortedDescending() {
        TODO_LIST.addTask(CLEAN_DISHES);
        TODO_LIST.addTask(BUY_GROCERIES);

        var expectedTasks = List.of(Task.of(CLEAN_DISHES), Task.of(BUY_GROCERIES));

        assertEquals(expectedTasks, TODO_LIST.getAllTasksSorted(SortingOrder.Descending));
    }
}
