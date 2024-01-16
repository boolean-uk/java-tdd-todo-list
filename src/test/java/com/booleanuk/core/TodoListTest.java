package com.booleanuk.core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class TodoListTest {
    @Test
    public void addingTaskToListReturnsTrue() {
        TodoList list = new TodoList();

        assertTrue(list.add("Shovel snow", "Incomplete"));
    }

    @Test
    public void returnsFalseIfListIsEmpty() {
        TodoList list = new TodoList();

        assertFalse(list.viewTasks());

        list.add("Shovel snow", "Incomplete");

        assertTrue(list.viewTasks());
    }

    @Test
    public void testingIfTaskIsCompleted() {
        TodoList listStatus = new TodoList();

        listStatus.add("Shovel snow", "Incomplete");

        listStatus.changeStatus("Shovel snow", "Complete");

        assertEquals("Complete", listStatus.viewStatus("Shovel snow"));
    }

    @Test
    public void testingIfIOnlyGetCompleteTasks() {
        TodoList listStatus = new TodoList();

        listStatus.add("Shovel snow", "Incomplete");

        listStatus.add("Grocery shopping", "Incomplete");

        listStatus.changeStatus("Shovel snow", "Complete");

        assertEquals("Shovel snow", listStatus.getCompleteTasks());
    }

    @Test
    public void testingIfIOnlyGetIncompleteTasks() {
        TodoList listStatus = new TodoList();

        listStatus.add("Shovel snow", "Incomplete");

        listStatus.add("Grocery shopping", "Incomplete");

        listStatus.changeStatus("Shovel snow", "Complete");

        assertEquals("Grocery shopping", listStatus.getIncompleteTasks());
    }

    @Test
    public void testReturnsMessageIfTaskNotFound() {
        TodoList listStatus = new TodoList();

        listStatus.add("Shovel snow", "Incomplete");

        listStatus.add("Grocery shopping", "Incomplete");

        assertEquals("This task does not exist in your list", listStatus.searchForTask("Watering the plants"));
    }

    @Test
    public void testListSizeAfterRemovingTask() {
        TodoList listStatus = new TodoList();

        listStatus.add("Shovel snow", "Incomplete");
        listStatus.add("Grocery shopping", "Incomplete");

        assertEquals(2, listStatus.todoList.size());

        listStatus.remove("Grocery shopping");

        assertEquals(1, listStatus.todoList.size());
    }

    @Test
    public void testAscendingOrder() {
        TodoList sortedList = new TodoList();

        sortedList.add("Shovel snow", "Incomplete");
        sortedList.add("Grocery shopping", "Incomplete");
        sortedList.add("Watering plants", "Incomplete");
        sortedList.add("Cleaning windows", "Incomplete");

        String ascendingOrder = sortedList.ascendingOrder();

        assertEquals("Cleaning windows, Grocery shopping, Shovel snow, Watering plants", ascendingOrder);
    }

    @Test
    public void testDescendingOrder() {
        TodoList sortedList = new TodoList();

        sortedList.add("Shovel snow", "Incomplete");
        sortedList.add("Grocery shopping", "Incomplete");
        sortedList.add("Watering plants", "Incomplete");
        sortedList.add("Cleaning windows", "Incomplete");

        String descendingOrder = sortedList.descendingOrder();

        assertEquals("Watering plants, Shovel snow, Grocery shopping, Cleaning windows", descendingOrder);
    }
}
