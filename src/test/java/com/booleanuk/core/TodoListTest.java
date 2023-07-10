package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }


    @Test
    public void shouldAddTaskToTodoList(){
        //given
        TodoList todoList = new TodoList();
        Task task = new Task();

        //when
        todoList.addTask(task);

        //then
        Assertions.assertTrue(TodoList.getTasks.size() == 1);


    }

}
