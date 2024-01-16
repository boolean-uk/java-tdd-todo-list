package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    TodoList todoList = new TodoList();

    Task task1 = new Task("Go shopping");
    Task task2 = new Task("Make dinner");

    @BeforeEach
    public void setupTestEnvironment() {
        todoList.clear();
    }

    @Test
    public void canInitializeTodoList() {
        Assertions.assertEquals(new ArrayList<Task>(), todoList.getTasks());
    }

    @Test
    public void canAddTaskToList() {
        Assertions.assertEquals(0, todoList.getTasks().size());
        Assertions.assertTrue(todoList.add(task1));
        Assertions.assertEquals(1, todoList.getTasks().size());
    }

    @Test
    public void canGetAllTasksInList() {
        ArrayList<Task> listWithTasks = new ArrayList<>();
        Assertions.assertEquals(listWithTasks, todoList.getTasks());

        listWithTasks.add(task1);
        listWithTasks.add(task2);
        todoList.add(task1);
        todoList.add(task2);

        Assertions.assertEquals(listWithTasks, todoList.getTasks());
    }

    @Test
    public void canToggleCompletion() {
        todoList.add(task1);
        Assertions.assertFalse(todoList.getTasks().get(0).isCompleted());
        todoList.getTasks().get(0).setCompleted(true);
        Assertions.assertTrue(todoList.getTasks().get(0).isCompleted());
    }

}
