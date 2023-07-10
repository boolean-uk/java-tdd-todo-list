package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        assertEquals("Hello", hello);
        assertNotEquals("Goodbye", hello);
    }


    @Test
    public void shouldAddTaskToTodoList(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1");

        //when
        todoList.addTask(task);

        //then
        assertEquals(1, todoList.getTasks().size());
        assertEquals(todoList.getTasks().get(0), task);

    }

    @Test
    public void ShouldReturnAllTasksInTodoList(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1");
        Task task2 = new Task("Exercise 2");
        Task task3 = new Task("Exercise 3");
        todoList.addTask(task);
        todoList.addTask(task2);
        todoList.addTask(task3);

        //when
        String printedTasks = todoList.showTasks();

        //then
        assertEquals("Exercise 1\n"+"Exercise 2\n"+"Exercise 3\n",printedTasks);


    }

    @Test
    public void statusShouldReturnTrueAfterChange(){
        //when
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1");
        todoList.addTask(task);

        //given
        todoList.changeStatus(task, true);
        boolean isComplete = todoList.getTaskStatus(task);

        assertTrue(isComplete);
    }

    @Test
    public void statusShouldReturnFalseAfterChange(){
        //when
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1",true);
        todoList.addTask(task);

        //given
        todoList.changeStatus(task, false);
        boolean isComplete = todoList.getTaskStatus(task);

        assertFalse(isComplete);
    }

    @Test
    public void shouldReturn2TasksInAllIncompleteTasksList(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1",true);
        todoList.addTask(task);
        Task task2 = new Task("Exercise 2",false);
        todoList.addTask(task2);
        Task task3 = new Task("Exercise 3",false);
        todoList.addTask(task3);

        //when
        ArrayList<Task> allIncompleteTask = todoList.getIncompleteTasks();


        //then
        assertEquals(2,allIncompleteTask.size());
    }

    @Test
    public void shouldReturnNoTasksInAllIncompleteTasksList(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1",true);
        todoList.addTask(task);
        Task task2 = new Task("Exercise 2",true);
        todoList.addTask(task2);
        Task task3 = new Task("Exercise 3",true);
        todoList.addTask(task3);

        //when
        ArrayList<Task> allIncompleteTask = todoList.getIncompleteTasks();


        //then
        assertEquals(0,allIncompleteTask.size());
    }

    @Test
    public void ShouldReturn2TaskInCompleteTaskList(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1",false);
        todoList.addTask(task);
        Task task2 = new Task("Exercise 2",true);
        todoList.addTask(task2);
        Task task3 = new Task("Exercise 3",true);
        todoList.addTask(task3);

        //when
        ArrayList<Task> allCompleteTask = todoList.getCompletedTasks();

        //then
        assertEquals(2,allCompleteTask.size());
    }

    @Test
    public void shouldReturnNoTasksInAllCompleteTasksList(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1",false);
        todoList.addTask(task);
        Task task2 = new Task("Exercise 2",false);
        todoList.addTask(task2);
        Task task3 = new Task("Exercise 3",false);
        todoList.addTask(task3);

        //when
        ArrayList<Task> allCompleteTaskList = todoList.getCompletedTasks();


        //then
        assertEquals(0,allCompleteTaskList.size());
    }


    @Test
    public void shouldReturnPositiveMessage(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1",false);
        todoList.addTask(task);
        Task task2 = new Task("Exercise 2",false);
        todoList.addTask(task2);
        Task task3 = new Task("Exercise 3",false);
        todoList.addTask(task3);

        //when
        String message = todoList.findTask(task);

        //then
        assertEquals("I found a message!", message);

    }
    @Test
    public void shouldReturnNegativeMessage(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1",false);
        todoList.addTask(task);
        Task task2 = new Task("Exercise 2",false);
        todoList.addTask(task2);
        Task task3 = new Task("Exercise 3",false);
        todoList.addTask(task3);
        Task task4 = new Task("Exercise 4", true);

        //when
        String message = todoList.findTask(task4);

        //then
        assertEquals("I didn't find message", message);

    }

    @Test
    public void shouldRemoveTaskFromList(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task("Exercise 1",false);
        todoList.addTask(task);
        Task task2 = new Task("Exercise 2",false);
        todoList.addTask(task2);
        Task task3 = new Task("Exercise 3",false);
        todoList.addTask(task3);

        //when
       todoList.removeTask(task);

       //then
        assertEquals(2,todoList.getTasks().size());
    }





}
