package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class TodoListExtendedTest {

    private TodoListExtended todoList;

    @BeforeEach
    public void setup() {
        todoList = new TodoListExtended();
        TaskExtended.id_counter = 0;
    }

    @Test
    public void testUpdateTaskById() {
        todoList.getTasks().add(new TaskExtended("Work Out"));
        todoList.updateTaskName(0, "Work In");
        Assertions.assertEquals("Work In", todoList.getTasks().get(0).getName());
    }

    @Test
    public void testGetTaskCreationDate() {
        LocalDateTime before = LocalDateTime.now().minusSeconds(10);
        todoList.getTasks().add(new TaskExtended("Work Out"));
        LocalDateTime after = LocalDateTime.now().plusSeconds(10);

        System.out.println(todoList.getTaskCreationDate(0));

        Assertions.assertTrue(before.isBefore(todoList.getTaskCreationDate(0)));
        Assertions.assertTrue(after.isAfter(todoList.getTaskCreationDate(0)));
    }
}
