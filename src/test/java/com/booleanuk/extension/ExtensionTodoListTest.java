package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionTodoListTest {

    @Test
    public void getTaskByIdTest() {
        ExtensionTodoList todoList = new ExtensionTodoList();
        ExtensionTask task1 = new ExtensionTask("Make dinner");
        todoList.addTask(task1);
        Assertions.assertEquals(task1, todoList.getTaskById(0));
        Assertions.assertNull(todoList.getTaskById(7));
    }

    @Test
    public void changeStatusTest(){
        ExtensionTodoList todoList = new ExtensionTodoList();
        ExtensionTask task = new ExtensionTask("Go shopping");
        todoList.tasks.put(1,task);
        Assertions.assertTrue(todoList.changeStatusById(1));
        Assertions.assertFalse(todoList.changeStatusById(5));
    }

    @Test
    public void changeNameTest(){
        ExtensionTodoList todoList = new ExtensionTodoList();
        ExtensionTask task = new ExtensionTask("Go shopping");
        todoList.tasks.put(1,task);
        Assertions.assertEquals("Laundry",todoList.changeNameById(1,"Laundry"));
    }

    @Test
    public void getDateAndTime(){
        ExtensionTodoList todoList = new ExtensionTodoList();
        ExtensionTask task = new ExtensionTask("Go shopping");
        todoList.tasks.put(1,task);
        Assertions.assertEquals(task.getCreationDate().toString(),todoList.getDateAndTime(1));
        Assertions.assertEquals("Task not found",todoList.getDateAndTime(7));
    }
}
