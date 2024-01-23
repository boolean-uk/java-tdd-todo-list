package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TodoListExtensionTest {

    @Test
    public void testSetAttributes(){
        Task task = new Task(001,"Vacuum","Incomplete");
        Assertions.assertEquals(001, task.getId());
        Assertions.assertEquals("Vacuum", task.getName());
        Assertions.assertEquals("Incomplete", task.getStatus());
        Assertions.assertEquals("23-01-2024",task.getCreated());
    }
}
