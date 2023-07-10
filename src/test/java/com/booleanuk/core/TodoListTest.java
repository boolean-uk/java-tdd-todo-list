package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
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
        Task task = new Task();

        //when
        todoList.addTask(task);

        //then
        assertEquals(1, todoList.getTasks().size());


    }

}
