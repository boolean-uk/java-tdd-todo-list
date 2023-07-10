package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TodoListTest {
    TodoList todoList = new TodoList();

    @BeforeEach
    void setUp() {
        todoList.add("Buy milk");
        todoList.add("Do laundry");
    }

    @Test
    void add_AddsNewItemsToList() {
        TodoList todoList2 = new TodoList();
        List<String> expectedTaskNames = new ArrayList<>();
        expectedTaskNames.add("Buy milk");
        expectedTaskNames.add("Do laundry");

        todoList2.add("Buy milk");
        todoList2.add("Do laundry");

        assertEquals(
                todoList2.getTaskNames(),
                expectedTaskNames
        );
    }

    @Test
    void getTasks_ReturnsTasks() {
        List<Task> tasks = todoList.getTasks();

        assertEquals(
                tasks.stream().map(Task::getName).toList(),
                Arrays.asList("Buy milk", "Do laundry")
        );
        assertEquals(
                tasks.stream().map(Task::getStatus).toList(),
                Arrays.asList(STATUS.NEW, STATUS.NEW)
        );
    }

    @Test
    void getTasks_ReturnsTasksWithGivenStatus() {
        todoList.add("Vacuum the apartment");
        assertTrue(todoList.changeStatus(3, STATUS.COMPLETED));

        List<Task> tasks = todoList.getTasks(STATUS.COMPLETED);

        assertEquals(tasks.get(0).getName(), "Vacuum the apartment");
    }

    @Test
    void remove_RemovesTaskWithGivenId() {
        long firstTaskId = todoList.getTasks().get(0).getId();

        todoList.remove(firstTaskId);

        List<Task> tasks = todoList.getTasks();
        assertEquals(tasks.size(), 1);
        assertEquals(tasks.get(0).getName(), "Do laundry");
    }

    @Test
    void getTasksOrderedAsc_GetsTasksInCorrectOrder() {
        todoList.add("A task");

        List<Task> tasks = todoList.getTasksOrderedAsc();

        assertEquals(
                tasks.stream().map(Task::getName).toList(),
                Arrays.asList("A task", "Buy milk", "Do laundry")
        );
    }

    @Test
    void getTasksOrderedDesc_GetsTasksInCorrectOrder() {
        todoList.add("A task");

        List<Task> tasks = todoList.getTasksOrderedDesc();

        assertEquals(
                tasks.stream().map(Task::getName).toList(),
                Arrays.asList("Do laundry", "Buy milk", "A task")
        );
    }

}
