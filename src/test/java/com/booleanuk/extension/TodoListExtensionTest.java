package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TodoListExtensionTest {

    @Test
    public void shouldReturnTaskUniqueId(){

        //given && when
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        todoListExtension.addTask(taskExtension);

        //then
        assertEquals("ID0",taskExtension.getTaskExtensionId());

    }


    @Test
    public void shouldReturnTaskByProvidedID(){

        //given
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        todoListExtension.addTask(taskExtension);
        //When
        String id = "ID0";
        TaskExtension taskExtension1 = todoListExtension.getTaskbyId(id);

        //then
        assertEquals(taskExtension, taskExtension1);
    }


}
