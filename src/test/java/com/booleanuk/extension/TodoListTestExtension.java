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




}
