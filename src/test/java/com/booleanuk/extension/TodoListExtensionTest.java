package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {
    @Test
    public void testGetTaskByID() {
        TodoListExtension _todo = new TodoListExtension();

        _todo.add("Fix Car");       // id : 0
        _todo.add("Clean Room");    // id : 1
        _todo.add("Wash Clothes");  // id : 2
        _todo.add("Make Dinner");   // id : 3

        Assertions.assertEquals("Wash Clothes", _todo.getTaskByID(2));
        Assertions.assertNull(_todo.getTaskByID(-4));

        _todo.remove("Wash Clothes");

        Assertions.assertNull(_todo.getTaskByID(2));
    }

    @Test
    public void testUpdateTaskByID() {
        TodoListExtension _todo = new TodoListExtension();

        _todo.add("Fix Car");       // id : 0
        _todo.add("Clean Room");    // id : 1
        _todo.add("Wash Clothes");  // id : 2

        Assertions.assertEquals("Clean Room", _todo.getTaskByID(1));
        _todo.updateTaskText(1, "Make Dinner");
        Assertions.assertEquals("Make Dinner", _todo.getTaskByID(1));
    }

    @Test
    public void testChangeStatusByID() {
        TodoListExtension _todo = new TodoListExtension();

        _todo.add("Fix Car");       // id : 0
        _todo.add("Clean Room");    // id : 1
        _todo.add("Wash Clothes");  // id : 2

        Assertions.assertFalse(_todo.getTaskStatus(2));
        _todo.setTaskCompletionStatus(2, true);
        Assertions.assertTrue(_todo.getTaskStatus(2));
    }

    @Test
    public void testGetCorrectTime() {
        TodoListExtension _todo = new TodoListExtension();

        _todo.add("Fix Car");       // id : 0

        Assertions.assertEquals(TaskExtension.getDateTime(), _todo.getTaskDate(0));
    }
}
