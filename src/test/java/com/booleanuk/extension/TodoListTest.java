package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TodoListTest {

    @Test
    public void testGetTaskById(){
        TodoList todoList = new TodoList();
        todoList.tasks.add(new Task(1,"A"));
        todoList.tasks.add(new Task(2,"B"));
        todoList.tasks.add(new Task(3,"C"));

        Assertions.assertEquals("B",todoList.getTaskById(2).name);
    }

    @Test
    public void testUpdateTaskNameByById(){
        TodoList todoList = new TodoList();
        todoList.tasks.add(new Task(1,"A"));
        todoList.updateTaskNameByById(1,"B");

        Assertions.assertEquals("B",todoList.getTaskById(1).name);
    }
    @Test
    public void testUpdateTaskStatusByById(){
        TodoList todoList = new TodoList();
        todoList.tasks.add(new Task(1,"A"));
        Assertions.assertFalse(todoList.getTaskById(1).status);
        todoList.updateTaskStatusByById(1);
        Assertions.assertTrue(todoList.getTaskById(1).status);
    }
    @Test
    public void testGetCreationDateTimeByTaskId (){
        TodoList todoList = new TodoList();
        Task t = new Task(1,"A");
        todoList.tasks.add(t);

        String expectedDate = t.creationDataAndTime.toString();
        Assertions.assertEquals(expectedDate,todoList.getCreationDateTimeByTaskId(1));
    }

}
