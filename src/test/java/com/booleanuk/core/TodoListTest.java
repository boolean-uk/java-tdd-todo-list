package com.booleanuk.core;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void returnTrueAddTaskNotInList() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.add("Vacuum"));
    }

    @Test
    public void returnFalseAddTaskAlreadyInList() {
        TodoList todoList = new TodoList();
        todoList.add("Vacuum");
        Assertions.assertFalse(todoList.add("Vacuum"));
    }

    @Test
    public void addingMultipleTasksWorkCorrectly() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.add("Vacuum"));
        Assertions.assertTrue(todoList.add("Laundry"));
        Assertions.assertTrue(todoList.add("Go for a walk"));
        Assertions.assertFalse(todoList.add("Laundry"));
    }

    @Test
    public void returnTrueRemoveTaskInList() {
        TodoList todoList = new TodoList();
        todoList.add("Vacuum");
        Assertions.assertTrue(todoList.remove("Vacuum"));
    }

    @Test
    public void returnFalseRemoveTaskNotInList() {
        TodoList todoList = new TodoList();
        Assertions.assertFalse(todoList.remove("Vacuum"));
    }

    @Test
    public void removingMultipleTasksWorkCorrectly() {
        TodoList todoList = new TodoList();
        todoList.add("Vacuum");
        todoList.add("Laundry");
        Assertions.assertTrue(todoList.remove("Vacuum"));
        Assertions.assertFalse(todoList.remove("Go for a walk"));
        Assertions.assertTrue(todoList.remove("Laundry"));
    }

    @Test
    public void returnTrueChangeStatusOfExistingTask() {
        TodoList todoList = new TodoList();
        todoList.add("Vacuum");
        Assertions.assertTrue(todoList.changeStatus("Vacuum"));
        Assertions.assertTrue(todoList.changeStatus("Vacuum"));
    }

    @Test
    public void returnFalseChangeStatusOfNonExistingTask() {
        TodoList todoList = new TodoList();
        todoList.add("Vacuum");
        Assertions.assertFalse(todoList.changeStatus("Laundry"));
    }
}
