package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListTest {
    @Test
    public void testAddAndRemove() {
        TodoList _todo = new TodoList();

        _todo.add("Clean Room");
        _todo.add("Make Dinner");

        Assertions.assertTrue(_todo.doesTaskExist("Clean Room"));
        Assertions.assertTrue(_todo.doesTaskExist("Make Dinner"));

        _todo.remove("Make Dinner");
        Assertions.assertFalse(_todo.doesTaskExist("Make Dinner"));

        _todo.remove("Wash Clothes");
        Assertions.assertFalse(_todo.doesTaskExist("Wash Clothes"));
    }

    @Test
    public void testTaskCompletionToggle() {
        TodoList _todo = new TodoList();

        _todo.add("Clean Room");
        _todo.add("Make Dinner");
        _todo.add("Wash Clothes");

        _todo.toggleTaskCompletion("Clean Room");
        _todo.toggleTaskCompletion("Make Dinner");

        Assertions.assertTrue(_todo.getTaskStatus("Make Dinner"));
        Assertions.assertFalse(_todo.getTaskStatus("Wash Clothes"));

        _todo.toggleTaskCompletion("Clean Room");
        _todo.toggleTaskCompletion("Make Dinner", false);

        Assertions.assertFalse(_todo.getTaskStatus("Clean Room"));
        Assertions.assertFalse(_todo.getTaskStatus("Make Dinner"));
    }

    @Test
    public void testCheckIfTaskExists() {
        TodoList _todo = new TodoList();

        _todo.add("Make Dinner");

        Assertions.assertTrue(_todo.doesTaskExist("Make Dinner"));
        Assertions.assertFalse(_todo.getTaskStatus("Wash Clothes"));
    }

    @Test
    public void testListedItems() {
        TodoList _todo = new TodoList();

        _todo.add("Fix Car");
        _todo.add("Clean Room");
        _todo.add("Wash Clothes");
        _todo.add("Make Dinner");

        _todo.toggleTaskCompletion("Clean Room");
        _todo.toggleTaskCompletion("Wash Clothes");

        Assertions.assertArrayEquals(new String[]{ "Fix Car", "Make Dinner" }, _todo.viewIncompleteTasks());
        Assertions.assertArrayEquals(new String[]{ "Clean Room", "Wash Clothes" }, _todo.viewCompletedTasks());

        Assertions.assertArrayEquals(new String[]{ "Clean Room", "Fix Car", "Make Dinner", "Wash Clothes" }, _todo.printAllTasksOrdered(true));
        Assertions.assertArrayEquals(new String[]{ "Wash Clothes", "Make Dinner", "Fix Car", "Clean Room" }, _todo.printAllTasksOrdered(false));
    }
}
