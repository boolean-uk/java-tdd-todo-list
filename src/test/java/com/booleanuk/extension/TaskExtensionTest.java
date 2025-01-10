package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskExtensionTest {
    @Test
    public void testStatusChanges(){
        TaskExtension testTask = new TaskExtension("TestTask");
        testTask.changeStatus(true);
        Assertions.assertTrue(testTask.complete);
        testTask.changeStatus(false);
        Assertions.assertFalse(testTask.complete);
    }

}