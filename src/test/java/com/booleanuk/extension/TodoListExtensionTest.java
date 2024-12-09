package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {

    @Test
    public void testSearchWithValidId() {
        TodoListExtension todoListExtension = new TodoListExtension();
        todoListExtension.addTask("Task1", "Incomplete");
        String result = todoListExtension.searchWithId(1);
        Assertions.assertEquals("Task1", result);
    }

    @Test
    public void testSearchWithInvalidId() {
        TodoListExtension todoListExtension = new TodoListExtension();
        String result = todoListExtension.searchWithId(3);
        Assertions.assertEquals("Task was not found", result);
    }

    @Test
    public void testUpdateNameWithValidId() {
        TodoListExtension todoListExtension = new TodoListExtension();
        todoListExtension.addTask("Task1", "Incomplete");

        String result = todoListExtension.updateNameWithId(1, "UpdatedTask");
        Assertions.assertEquals("Done", result);
        String updatedResult = todoListExtension.searchWithId(1);
        Assertions.assertEquals("UpdatedTask", updatedResult);
    }

    @Test
    public void testChangeStatusWithValidId() {
        TodoListExtension todoListExtension = new TodoListExtension();
        todoListExtension.addTask("Task1", "Incomplete");
        String result = todoListExtension.changeStatusWithId(1, "Completed");
        Assertions.assertEquals("Done", result);
        String updatedStatus = todoListExtension.searchTasks("Task1");
        Assertions.assertEquals("Completed", updatedStatus);
    }

    @Test
    public void testChangeStatusWithInvalidId() {
        TodoListExtension todoListExtension = new TodoListExtension();
        String result = todoListExtension.changeStatusWithId(3, "Completed");

        Assertions.assertEquals("Task was not found", result);
    }

    @Test
    public void testTasksCreationTimeFnWithInvalidTask() {
        TodoListExtension todoListExtension = new TodoListExtension();
        String taskCreationTime = todoListExtension.tasksCreationTimeFn("Task5");
        Assertions.assertEquals("Task was not found", taskCreationTime);
    }
}
