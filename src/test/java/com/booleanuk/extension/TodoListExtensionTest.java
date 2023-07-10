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
    public void changeStatusTest(){
        todoListExtension = new TodoListExtension();

        TaskExtension taskToFind = new TaskExtension("task to find");

        todoListExtension.add(taskToFind);
        todoListExtension.add(new TaskExtension("Task no.1"));
        todoListExtension.changeStatusById(taskToFind.getId());
        Assertions.assertEquals(TaskStatusExtension.COMPLETED,todoListExtension.getTaskById(taskToFind.getId()).getStatus());

        todoListExtension.changeStatusById(taskToFind.getId());
        Assertions.assertEquals(TaskStatusExtension.INCOMPLETED,todoListExtension.getTaskById(taskToFind.getId()).getStatus());
    }

    @Test
    public void datesTest(){
        todoListExtension = new TodoListExtension();

        TaskExtension taskToFind = new TaskExtension("task to find");

        todoListExtension.add(taskToFind);
        todoListExtension.add(new TaskExtension("Task no.1"));
        todoListExtension.changeStatusById(taskToFind.getId());
        Assertions.assertEquals(taskToFind.getDate(),todoListExtension.timesOfCreation().get("task to find"));

    }

}
