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




}
