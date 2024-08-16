package com.booleanuk.extension;

import com.booleanuk.core.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTestExtension {
    @Test
    public void createTaskTest() {
        TaskExtension task = new TaskExtension(0, "First Task");

        Assertions.assertEquals("First Task", task.getName());
    }

    @Test
    public void getTaskStatusTest() {
        TaskExtension task = new TaskExtension(0, "First Task");

        Assertions.assertFalse(task.getTaskStatus());
    }

    @Test
    public void changeStatusTest() {
        TaskExtension task = new TaskExtension(0, "First Task");

        Assertions.assertFalse(task.getTaskStatus());

        task.changeStatus();

        Assertions.assertTrue(task.getTaskStatus());
    }
}
