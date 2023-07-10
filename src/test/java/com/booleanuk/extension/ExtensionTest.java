package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ExtensionTest {
    @Test
    void shouldReturnTaskName() {
        Extension extension = new Extension();
        Task task = extension.getTask(123);
        Task expected = new Task("Cleaning", 123);

        Assertions.assertEquals(expected.name, task.name);
    }

    @Test
    void shouldUpdateTaskById() {
        Extension extension = new Extension();
        String name = "Running";
        extension.updateTask(123, name);

        Assertions.assertEquals(name, extension.getTask(123).name);
    }

    @Test
    void shouldUpdateTaskStatus() {
        Extension extension = new Extension();
        extension.updateStatus(123);

        Task task = extension.getTask(123);
        Assertions.assertTrue(task.status);

    }

    @Test
    void shouldReturnLocalDateTime() {
        Extension extension = new Extension();
        LocalDateTime time = extension.getTimeOfCreation(123);

        Assertions.assertNotNull(time);
    }
}
