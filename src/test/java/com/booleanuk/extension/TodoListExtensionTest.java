package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TodoListExtensionTest {

    @BeforeEach
    public void setCounterToZero(){
        TaskExtension.setCounterToZero();
    }

    @Test
    public void shouldReturnTaskUniqueId(){

        //given && when
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        TaskExtension taskExtension2 = new TaskExtension("Extended Task 2");
        TaskExtension taskExtension3 = new TaskExtension("Extended Task 3");
        todoListExtension.addTask(taskExtension);

        //then
        assertEquals("ID0",taskExtension.getTaskExtensionId());
        assertEquals("ID1",taskExtension2.getTaskExtensionId());
        assertEquals("ID2",taskExtension3.getTaskExtensionId());

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
