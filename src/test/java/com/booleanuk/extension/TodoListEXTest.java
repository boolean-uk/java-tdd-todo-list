package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListEXTest {


    @Test
    public void testGetTaskById() {
        TodoListEX todoListEX = new TodoListEX();

        Task task = new Task(1, "Task1");

        todoListEX.addTaskToTodolist(task);


        Task task2 = todoListEX.getTaskById(1);

        Assertions.assertEquals(1, task.getId());

    }


    @Test
    public void testUpdateTaskName() {
        TodoListEX todoListEX = new TodoListEX();

        Task task = new Task(1, "Task1");

        todoListEX.addTaskToTodolist(task);


        Assertions.assertEquals("Task1", task.getName());

        todoListEX.updateTaskName(task.getId(), "TaskNew");

        Assertions.assertEquals("TaskNew", task.getName());
        Assertions.assertFalse(todoListEX.updateTaskName(2, "WrongTaskId"));

    }


    @Test
    public void testChangeTaskCompleteOrIncomplete() {
        TodoListEX todoListEX = new TodoListEX();

        Task task = new Task(1, "Task1");

        todoListEX.addTaskToTodolist(task);

        Assertions.assertFalse(task.getStatus());

        todoListEX.changetaskCompleteOrIncomplete(1);

        Task task2 = todoListEX.getTaskById(1);

        Assertions.assertTrue(task2.getStatus());

    }




}
