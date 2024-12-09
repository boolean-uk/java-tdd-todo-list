package com.booleanuk.extension;

import com.sun.source.util.TaskListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ExtensionTodoListTest {

    @Test
    public void getTaskByIdTest() {
        ExtensionTodoList todoList = new ExtensionTodoList();
        ExtensionTask task1 = new ExtensionTask("Mow the lawn.", true);
        ExtensionTask task2 = new ExtensionTask("Water the plants", false);
        todoList.add(task1);
        todoList.add(task2);
        Assertions.assertEquals(task1, todoList.getTaskById(0));
        Assertions.assertEquals(task2, todoList.getTaskById(1));
        Assertions.assertNull(todoList.getTaskById(12));
    }

    @Test
    public void updateDescriptionByIdTest() {
        ExtensionTodoList todoList = new ExtensionTodoList();
        ExtensionTask task = new ExtensionTask("Mow the lawn", true);
        todoList.add(task);
        Assertions.assertEquals("Mow the lawn", todoList.getTaskById(0).getDescription());
        todoList.updateDescriptionById(0, "Water the plants");
        Assertions.assertEquals("Water the plants", todoList.getTaskById(0).getDescription());
    }

    @Test
    public void updateStatusByIdTest() {
        ExtensionTodoList todoList = new ExtensionTodoList();
        ExtensionTask task = new ExtensionTask("Mow the lawn.", true);
        todoList.add(task);
        Assertions.assertTrue(todoList.getTaskById(0).getCompletion());
        todoList.updateStatusById(0, false);
        Assertions.assertFalse(todoList.getTaskById(0).getCompletion());
    }

    @Test
    public void toStringContainsDateTest() {
        ExtensionTodoList todoList = new ExtensionTodoList();
        ExtensionTask task = new ExtensionTask("Mow the lawn.", true);
        todoList.add(task);
        Assertions.assertEquals(task.getCreationDate(), todoList.getCreationDateById(0));
    }
}
