package com.booleanuk.extension;

import com.booleanuk.core.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {
    TodoListExtension todoList;

    @Test
    public void getTaskById() {
        todoList = new TodoListExtension();
        TaskExtension task = new TaskExtension(1, "Code a project");
        todoList.add(task);

        // Try to get task that exist
        Assertions.assertEquals(task, todoList.getTask(1));

        // Try to get task that dpesn't exist
        Assertions.assertEquals(null, todoList.getTask(2));
    }

    @Test
    public void changeName() {
        todoList = new TodoListExtension();
        TaskExtension task = new TaskExtension(1, "Code");
        todoList.add(task);

        // Try to change name on task that exist
        Assertions.assertTrue(todoList.changeTitle(1, "Code a project in Java"));

        // Try to change name on task that doesn't exist
        Assertions.assertFalse(todoList.changeTitle(2, "Code a project in Java"));
    }

    @Test
    public void changeStatus() {
        todoList = new TodoListExtension();
        TaskExtension task = new TaskExtension(1, "Code");
        todoList.add(task);

        // Try to change name on task that exist
        Assertions.assertTrue(todoList.changeStatus(1, StatusExtension.COMPLETE));

        // Try to change name on task that doesn't exist
        Assertions.assertFalse(todoList.changeStatus(2, StatusExtension.COMPLETE));
    }

    @Test
    public void getDateFromTask() {
        // TODO: Unsure about how to test this
        TaskExtension task = new TaskExtension(1, "Time task");
        Assertions.assertNotEquals(null, task.dateCreated());

        // Print out with date and timestamp
        todoList = new TodoListExtension();
        todoList.add(task);
        todoList.add(new TaskExtension(2, "Draw"));
        todoList.listAll();
    }
}
