package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        TaskExtension taskFound = todoListExtension.getTaskById(taskToFind.getId());

        Assertions.assertEquals(taskToFind, taskFound);
    }

    @Test
    public void shouldUpdateTitleAfterPassingIdAndNewTitle() {
        todoListExtension = new TodoListExtension();

        TaskExtension taskToRename = new TaskExtension("Name before");
        todoListExtension.add(taskToRename);
        todoListExtension.renameTask(taskToRename.getId(), "Name After");

        Assertions.assertEquals("Name After", todoListExtension.getTaskById(taskToRename.getId()).getTitle());
    }

}
