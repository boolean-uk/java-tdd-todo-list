package com.booleanuk.core;

import org.junit.jupiter.api.Test;

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

}
