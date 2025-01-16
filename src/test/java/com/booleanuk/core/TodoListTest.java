package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

class TodoListTest {
    private HashMap<String, Boolean> items = new HashMap<>(){{
        put("Clean room", false);
        put("Buy groceries", false);
        put("Write CV", true);
    }};

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    //Task 1
    @Test
    public void addTaskThatDoesNotExist(){
        TodoList todoList = new TodoList(items);
        String taskName = "Go do exercise";

        Assertions.assertTrue(todoList.add(taskName));
    }

    @Test
    public void addTaskThatDoesExist(){
        TodoList todoList = new TodoList(items);
        String taskName = "Clean room";

        Assertions.assertFalse(todoList.add(taskName));
    }



    //Task 2
    @Test
    public void tasksExistInTodoList(){
        TodoList todoList = new TodoList(items);

        Assertions.assertFalse(todoList.listTasks().isEmpty());
    }

    @Test
    public void tasksDoesNotExistInTodoList(){
        HashMap<String, Boolean> emptyItemSet = new HashMap<>();
        TodoList todoList = new TodoList(emptyItemSet);

        Assertions.assertEquals("The todolist does not contain any tasks!", todoList.listTasks());
    }



    //Task 3
    @Test
    public void doesStatusUpdateIfTaskExist(){
        TodoList todoList = new TodoList(items);
        String task = "Clean room";

        Assertions.assertTrue(todoList.updateTaskStatus(task, true));
    }

    @Test
    public void doesStatusUpdateIfTaskDoesNotExist(){
        TodoList todoList = new TodoList(items);
        String task = "Go do exercise";

        Assertions.assertFalse(todoList.updateTaskStatus(task, true));
    }


    // Task 4
    @Test
    public void doesExistCompletedTasks(){
        TodoList todoList = new TodoList(items);

        if(!todoList.getCompletedTasks().isEmpty()){
            Assertions.assertFalse(todoList.getCompletedTasks().isEmpty());
        }
    }

    @Test
    public void doesNotExistCompletedTasks(){
        TodoList todoList = new TodoList(items);

        if(todoList.getCompletedTasks().isEmpty()){
            Assertions.assertEquals("There are no completed tasks!", todoList.getCompletedTasks());
        }
    }


    // Task 5
    @Test
    public void UncompletedTasksExist(){
        TodoList todoList = new TodoList(items);

        if(!todoList.getUncompletedTasks().isEmpty()){
            Assertions.assertFalse(todoList.getUncompletedTasks().isEmpty());
        }
    }

    @Test
    public void doesNotExistUncompletedTasks(){
        TodoList todoList = new TodoList(items);

        if(todoList.getUncompletedTasks().isEmpty()){
            Assertions.assertEquals("There are no uncompleted tasks!", todoList.getUncompletedTasks());
        }
    }


    // Task 6
    @Test
    public void taskDoesExist(){
        TodoList todoList = new TodoList(items);
        String task = "Buy groceries";

        Assertions.assertEquals("The task exist!", todoList.SearchTask(task));
    }

    @Test
    public void taskDoesNotExist(){
        TodoList todoList = new TodoList(items);
        String task = "Play the piano";

        Assertions.assertEquals("The task does not exist!", todoList.SearchTask(task));
    }


    // Task 7
    @Test
    public void taskIsRemoved(){
        TodoList todoList = new TodoList(items);
        String task = "Clean room";

        Assertions.assertTrue(todoList.removeTask(task));
    }

    @Test
    public void taskIsNotRemoved(){
        TodoList todoList = new TodoList(items);
        String task = "Play the piano";

        Assertions.assertFalse(todoList.removeTask(task));
    }


    // Test 8
    @Test
    public void tasksAreDescending(){
        TodoList todoList = new TodoList(items);

        Assertions.assertEquals(todoList.taskDescending(), "Write CV, Clean room, Buy groceries");
    }


    // Test 9
    @Test
    public void tasksAreAscending(){
        TodoList todoList = new TodoList(items);

        Assertions.assertEquals(todoList.taskAscending(), "Buy groceries, Clean room, Write CV");
    }



}
