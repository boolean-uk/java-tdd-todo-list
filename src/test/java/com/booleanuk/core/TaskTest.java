package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    public void testStatusChanges(){
        Task testTask = new Task("TestTask");
        testTask.changeStatus(true);
        Assertions.assertTrue(testTask.complete);
        testTask.changeStatus(false);
        Assertions.assertFalse(testTask.complete);
    }



}