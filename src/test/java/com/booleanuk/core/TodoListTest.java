package com.booleanuk.core;

import com.sun.source.util.TaskListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListTest {
    @Test
    public void addTest() {
        TodoList todoList = new TodoList();
        Task task = new Task("Do the dishes", false);

        Assertions.assertTrue(todoList.add("Mow the lawn", false));
        Assertions.assertFalse(todoList.add("Mow the lawn", false));
        Assertions.assertTrue(todoList.add("Water the plants", false));

        Assertions.assertTrue(todoList.add(task));
        Assertions.assertTrue(todoList.contains(task));
        Assertions.assertFalse(todoList.add(task));
    }

    @Test
    public void toStringTest() {
        TodoList todoList = new TodoList();
        todoList.add("Mow the lawn", false);
        todoList.add("Water the plants", true);
        String toCompare = """
                Mow the lawn. Completion status: incomplete.
                Water the plants. Completion status: complete.
                """;
        Assertions.assertEquals(toCompare, todoList.toString());
    }

    @Test
    public void changeStatusTest() {
        TodoList todoList = new TodoList();
        String toCompareBefore = """
                Mow the lawn. Completion status: incomplete.
                """;
        String toCompareAfter = """
                Mow the lawn. Completion status: complete.
                """;
        todoList.add("Mow the lawn", false);
        Assertions.assertEquals(toCompareBefore, todoList.toString());
        todoList.changeStatus("Mow the lawn", true);
        Assertions.assertEquals(toCompareAfter, todoList.toString());
    }

    @Test
    public void getTasksByCompletionTest() {
        TodoList todoList = new TodoList();
        String toCompareFalse = """
                Mow the lawn. Completion status: incomplete.
                """;
        String toCompareTrue = """
                Water the plants. Completion status: complete.
                """;
        todoList.add("Mow the lawn", false);
        todoList.add("Water the plants", true);
        Assertions.assertEquals(toCompareFalse, todoList.getTasksByCompletion(false));
        Assertions.assertEquals(toCompareTrue, todoList.getTasksByCompletion(true));
    }

    @Test
    public void searchTest() {
        TodoList todoList = new TodoList();
        todoList.add("Mow the lawn", false);
        Assertions.assertEquals("Mow the lawn", todoList.search("Mow the lawn").getDescription());
        Assertions.assertNull(todoList.search("Water the plants"));
    }

    @Test
    public void removeTest() {
        TodoList todoList = new TodoList();
        todoList.add("Mow the lawn", false);
        Assertions.assertEquals("Mow the lawn", todoList.search("Mow the lawn").getDescription());
        todoList.remove("Mow the lawn");
        Assertions.assertNull(todoList.search("Mow the lawn"));

        Task task = new Task("Water the plants", false);
        todoList.add(task);
        Assertions.assertTrue(todoList.contains(task));
        todoList.remove(task);
        Assertions.assertFalse(todoList.contains(task));
    }

    @Test
    public void getInAlphabeticalOrderTest() {
        TodoList todoList = new TodoList();
        todoList.add("Mow the lawn", false);
        todoList.add("Water the plants", true);
        todoList.add("Do the dishes", false);
        String toCompareSortedAscending = """
                Do the dishes. Completion status: incomplete.
                Mow the lawn. Completion status: incomplete.
                Water the plants. Completion status: complete.
                """;
        List<Task> ascendingList = todoList.getInAlphabeticalOrder(true);
        StringBuilder sb = new StringBuilder();
        for(Task task : ascendingList)
            sb.append(task);
        Assertions.assertEquals(toCompareSortedAscending, sb.toString());
        String toCompareSortedDescending = """
                Water the plants. Completion status: complete.
                Mow the lawn. Completion status: incomplete.
                Do the dishes. Completion status: incomplete.
                """;
        List<Task> descendingList = todoList.getInAlphabeticalOrder(false);
        sb = new StringBuilder();
        for(Task task : descendingList)
            sb.append(task);
        Assertions.assertEquals(toCompareSortedDescending, sb.toString());
    }
}
