package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addNewTaskTest() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        Assertions.assertTrue(todoList.addTask("clean", "123"));
    }

//    @Test
//    public void addAlreadyExistingTaskTest() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        Assertions.assertFalse(todoList.addTask("clean"));
//    }
//
//    @Test
//    public void seeListTest() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("book dentist appointment");
//        todoList.addTask("clean");
//        todoList.addTask("bake");
//        String list = todoList.seeList();
//        Assertions.assertTrue(list.contains("clean") && list.contains("bake") && list.contains("book dentist appointment"));
//    }
//
//    @Test
//    public void updateExistingTaskStatusTest() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        Assertions.assertTrue(todoList.updateTaskStatus("clean", true));
//    }
//
//    @Test
//    public void updateNonExistingTaskStatusTest() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        Assertions.assertFalse(todoList.updateTaskStatus("bake", true));
//    }
//
//    @Test
//    public void getCompletedTasksEmptyList() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        Assertions.assertEquals(new ArrayList<>(), todoList.getCompletedTasks());
//    }
//
//    @Test
//    public void getCompletedTasksNotEmptyList() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        todoList.addTask("book dentist");
//        todoList.updateTaskStatus("clean", true);
//        Assertions.assertEquals(new ArrayList<>(Arrays.asList("clean")), todoList.getCompletedTasks());
//    }
//
//    @Test
//    public void getUncompletedTasksEmptyList() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        Assertions.assertEquals(new ArrayList<>(), todoList.getUncompletedTasks());
//    }
//
//    @Test
//    public void getUncompletedTasksNotEmptyList() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        todoList.addTask("book dentist");
//        todoList.updateTaskStatus("clean", true);
//        Assertions.assertEquals(new ArrayList<>(Arrays.asList("book dentist")), todoList.getUncompletedTasks());
//    }
//
//    @Test
//    public void doesExistingTaskExist() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        Assertions.assertEquals(	"The task exists!", todoList.doesTaskExist("clean"));
//    }
//
//    @Test
//    public void doesNonexistingTaskExist() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        Assertions.assertEquals(	"The task doesn't exist!", todoList.doesTaskExist("call bob"));
//    }
//
//    @Test
//    public void removeExistingTask() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        Assertions.assertTrue(todoList.remove("clean"));
//    }
//
//    @Test
//    public void removeNonexistingTask() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        Assertions.assertFalse(todoList.remove("make dinner"));
//    }
//
//    @Test
//    public void seeListInAlphabeticalAscendingOrder() {
//        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
//        todoList.addTask("clean");
//        todoList.addTask("bake");
//        todoList.addTask("book bowling");
//        ArrayList<String> expected = new ArrayList<>(Arrays.asList("bake", "book bowling", "clean"));
//        Assertions.assertEquals(expected, todoList.getListInAlphabeticalOrder(true));
//    }
//
//    @Test
//    public void seeListInAlphabeticalDescendingOrder() {
//        com.booleanuk.core.TodoList todoList = new TodoList();
//        todoList.addTask("clean");
//        todoList.addTask("bake");
//        todoList.addTask("book bowling");
//        ArrayList<String> expected = new ArrayList<>(Arrays.asList("clean", "book bowling", "bake"));
//        Assertions.assertEquals(expected, todoList.getListInAlphabeticalOrder(false));
//    }
}
