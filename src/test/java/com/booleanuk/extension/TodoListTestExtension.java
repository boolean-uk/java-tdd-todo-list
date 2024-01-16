package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTestExtension {

    // add task with ID
    @Test
    public void addTaskTestReturnTrue() {
        TodoListExtension toDo = new TodoListExtension();
        boolean result = toDo.addTaskID("Clean", "a12ft");
        Assertions.assertTrue(result);
    }

    @Test
    public void addTaskTestReturnFalse() {
        TodoListExtension toDo = new TodoListExtension();
        boolean result = toDo.addTaskID("Clean", "a12ft");
        result = toDo.addTaskID("Clean", "a12ft");
        Assertions.assertFalse(result);
    }

    // get task from ID
    @Test
    public void getTaskTestReturnTask() {
        TodoListExtension toDo = new TodoListExtension();
        boolean result = toDo.addTaskID("Clean", "a12ft");
        result = toDo.addTaskID("Dry", "fg83ft");

        Assertions.assertEquals("Dry", toDo.getTask("fg83ft"));
        Assertions.assertEquals("Clean", toDo.getTask("a12ft"));
    }

    @Test
    public void getTaskTestReturnEmpty() {
        TodoListExtension toDo = new TodoListExtension();
        boolean result = toDo.addTaskID("Clean", "a12ft");
        result = toDo.addTaskID("Dry", "fg83ft");

        Assertions.assertEquals("", toDo.getTask("ff83ft"));
        Assertions.assertEquals("", toDo.getTask("a11ft"));
    }

    // update name
    @Test
    public void newTaskNameTestReturnTrue() {
        TodoListExtension toDo = new TodoListExtension();
        boolean result = toDo.addTaskID("Clean", "a12ft");
        result = toDo.addTaskID("Dry", "fg83ft");
        result = toDo.newTaskName("fg83ft", "Dust");
        Assertions.assertTrue(result);
        result = toDo.newTaskName("a12ft", "Bath");
        Assertions.assertTrue(result);
    }

    @Test
    public void newTaskNameTestReturnFalse() {
        TodoListExtension toDo = new TodoListExtension();
        boolean result = toDo.addTaskID("Clean", "a12ft");
        result = toDo.addTaskID("Dry", "fg83ft");
        result = toDo.newTaskName("fg82ft", "Dust");
        Assertions.assertFalse(result);
        result = toDo.newTaskName("a11ft", "Bath");
        Assertions.assertFalse(result);
    }

    @Test
    public void newTaskNameTestLists() {
        TodoListExtension toDo = new TodoListExtension();
        boolean result = toDo.addTaskID("Clean", "a12ft");
        result = toDo.addTaskID("Dry", "fg83ft");
        result = toDo.newTaskName("fg83ft", "Dust");
        Assertions.assertTrue(result);

        Assertions.assertEquals("Dust", toDo.getTask("fg83ft"));
        Assertions.assertEquals("Found", toDo.searchTasks("Dust"));
        Assertions.assertEquals("Not Found", toDo.searchTasks("Dry"));
    }

    // Status with ID
    @Test
    public void taskStatusIDTestReturnTrue() {
        TodoListExtension toDo = new TodoListExtension();
        boolean result = toDo.addTaskID("Clean", "a12ft");
        result = toDo.addTaskID("Dry", "fg83ft");
        result = toDo.taskStatusID("fg83ft", true);
        Assertions.assertTrue(result);
    }
}
