package com.booleanuk.extension;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TodoListExtensionTest {
    @Test
    public void CheckingIfGetTaskMethodWorks() {
        TodoListExtension task = new TodoListExtension();

        task.add("Shovel snow", "Incomplete");

        assertEquals("Shovel snow", task.getTask(1));
    }


}
