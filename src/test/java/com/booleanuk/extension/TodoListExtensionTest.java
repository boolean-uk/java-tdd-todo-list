package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {

    @Test
    public void shouldReturnTaskUniqueId(){

        //given && when
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        todoListExtension.addTask(taskExtension);

        //then
        Assertions.assertEquals("ID0",taskExtension.getTaskExtensionId());

    }


}
