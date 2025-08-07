package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskTest {

    @Test
    public void testCompleteIncompleteTask(){
        TodoList todo = new TodoList();

        todo.add("Test");

        Task task = todo.getTasks().get(0);
        boolean taskCompleted = task.getCompleteStatus();

        Assertions.assertFalse(taskCompleted);

        Assertions.assertTrue(task.completeTask());

        taskCompleted = task.getCompleteStatus();
        Assertions.assertTrue(taskCompleted);

        Assertions.assertFalse(task.completeTask());

        Assertions.assertTrue(task.incompleteTask());

        Assertions.assertFalse(task.getCompleteStatus());

        Assertions.assertFalse(task.incompleteTask());
    }
}
