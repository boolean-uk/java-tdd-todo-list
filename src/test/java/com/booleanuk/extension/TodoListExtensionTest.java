package com.booleanuk.extension;

import com.booleanuk.core.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

public class TodoListExtensionTest {

    @Test
    public void addingTask() {
        TodoListExtensions todoList = new TodoListExtensions();
        TaskExtension task = new TaskExtension("Take out the garbage");

        todoList.add(task);

        Assertions.assertEquals(task, todoList.getTodoList().get(task.getId()));
    }

    @Test
    public void changingNameOfTask() {
        TodoListExtensions todoList = new TodoListExtensions();
        TaskExtension task = new TaskExtension("Take out the garbage");

        todoList.add(task);
        todoList.changeName(task.getId(), "Go grocery shopping");

        Assertions.assertEquals("Go grocery shopping", task.getName());
    }

    @Test
    public void changingStatusOfTask() {
        TodoListExtensions todoList = new TodoListExtensions();
        TaskExtension task = new TaskExtension("Take out the garbage");

        todoList.add(task);
        todoList.changeStatus(task.getId(), true);

        Assertions.assertTrue(task.isComplete());
    }

    @Test
    public void getDateOfTasks() {
        TodoListExtensions todoList = new TodoListExtensions();
        TaskExtension task = new TaskExtension("Take out the garbage");
        String dateAtm = java.time.ZonedDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));

        todoList.add(task);
        String date = task.getDate();

        Assertions.assertEquals(dateAtm, date);
    }
}
