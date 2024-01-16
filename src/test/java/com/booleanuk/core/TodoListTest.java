package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    TodoList todoList = new TodoList();

    Task task1 = new Task("Go shopping");
    Task task2 = new Task("Make dinner");
    Task task3 = new Task("Prepare for meeting");

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

    @Test
    public void canRetrieveTasksByCompletion() {
        todoList.add(task1);
        Assertions.assertEquals(1, todoList.getTasks(false).size());
        Assertions.assertEquals(0, todoList.getTasks(true).size());

        todoList.getTasks().get(0).setCompleted(true);
        Assertions.assertEquals(0, todoList.getTasks(false).size());
        Assertions.assertEquals(1, todoList.getTasks(true).size());
    }

    @Test
    public void canGetTaskByDescription() {
        todoList.add(task1);
        Assertions.assertEquals(task1, todoList.getTask("Go shopping"));
    }

    @Test
    public void returnsNullIfTaskDoesNotExist() {
        todoList.add(task1);
        Assertions.assertNull(todoList.getTask("Do my homework"));
    }

    @Test
    public void canRemoveTaskFromList() {
        todoList.add(task1);
        Assertions.assertEquals(1, todoList.getTasks().size());
        Assertions.assertTrue(todoList.remove(task1));
        Assertions.assertEquals(0, todoList.getTasks().size());
    }

    @Test
    public void canGetAlphabeticalList_Ascending() {
        todoList.add(task2);
        todoList.add(task1);
        todoList.add(task3);

        ArrayList<Task> sortedList = new ArrayList<>();
        sortedList.add(task1);
        sortedList.add(task2);
        sortedList.add(task3);
        Assertions.assertEquals(sortedList, todoList.getAlphabeticalTasks(true));
    }

    @Test
    public void canGetAlphabeticalList_Descending() {
        todoList.add(task2);
        todoList.add(task1);
        todoList.add(task3);

        ArrayList<Task> reverseSortedList = new ArrayList<>();
        reverseSortedList.add(task3);
        reverseSortedList.add(task2);
        reverseSortedList.add(task1);
        Assertions.assertEquals(reverseSortedList, todoList.getAlphabeticalTasks(false));
    }
}
