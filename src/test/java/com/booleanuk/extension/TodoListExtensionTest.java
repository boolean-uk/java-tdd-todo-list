package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TodoListExtensionTest {

    TodoListExtension todoListExtension;


    @Test
    public void shouldReturnTaskWithSpecifiedUUID() {
        todoListExtension = new TodoListExtension();

        TaskExtension taskToFind = new TaskExtension("task to find");

        todoListExtension.add(taskToFind);
        todoListExtension.add(new TaskExtension("Task no.1"));
        todoListExtension.add(new TaskExtension("Task no.2"));
        todoListExtension.add(new TaskExtension("Task no.3"));

        Optional<TaskExtension> taskFound = todoListExtension.getTaskById(taskToFind.getId());

        Assertions.assertEquals(taskToFind, taskFound.get());
    }

}
