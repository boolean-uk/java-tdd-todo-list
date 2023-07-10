package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class TaskCreatorTest {
    @Test
    public void testCreateTask() {
        TaskCreator taskCreator = new TaskCreator();
        String taskName = "Buy groceries";

        Task task = taskCreator.createTask(taskName);

        // Assert
        //1. I want to be able to get a task by a unique ID.
        Assertions.assertNotNull(task.getId());
        //2. I want to update the name of a task by providing its ID and a new name.
        Assertions.assertEquals(taskName, task.getName());
        //3. I want to be able to change the status of a task by providing its ID.
        Assertions.assertEquals(TaskStatus.IN_PROGRESS, task.getStatus());
        //4. I want to be able to see the date and time that I created each task.
        Assertions.assertNotNull(task.getCreationDateTime());
        Assertions.assertTrue(task.getCreationDateTime().isBefore(LocalDateTime.now().plusSeconds(1)));
    }
}