package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTaskCreation(){
        TodoList todolist = new TodoList();
        Task task = new Task(1,"A");
        todolist.tasks.add(task);

        long expectedId = 1;
        Assertions.assertEquals(expectedId,task.id);

        String expectedName = "A";
        Assertions.assertEquals(expectedName,task.name);

        boolean expectedStatus = false;
        Assertions.assertEquals(expectedStatus,task.status);

        String expectedDate = task.creationDataAndTime.toString();
        Assertions.assertEquals(expectedDate,todolist.getCreationDateTimeByTaskId(1));

    }
}
