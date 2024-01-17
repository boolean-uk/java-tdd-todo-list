package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListEXTest {


    @Test
    public void testGetId() {
        TodoListEX todoListEX = new TodoListEX();

        todoListEX.addTaskToTodolist(Task task);


        Task task = todoListEX.getTaskById();

        Assertions.assertEquals(1, task.getId());

    }
}
