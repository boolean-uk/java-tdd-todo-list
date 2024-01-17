package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListEXTest {


    @Test
    public void testGetTaskById() {
        TodoListEX todoListEX = new TodoListEX();

        Task task = new Task(1);

        todoListEX.addTaskToTodolist(task);


        Task task2 = todoListEX.getTaskById(1);

        Assertions.assertEquals(1, task.getId());

    }
}
