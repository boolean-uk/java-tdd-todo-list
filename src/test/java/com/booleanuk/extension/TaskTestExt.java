package com.booleanuk.extension;

import com.booleanuk.core.Task;
import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTestExt {

    @Test
    public void testCompleteIncompleteTask(){
        com.booleanuk.core.TodoList todo = new TodoList();

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

    @Test
    public void testGetCreationTime(){
        TaskExt task = new TaskExt("Test");

        Assertions.assertnotn
    }
}
