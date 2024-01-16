package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testEmptyTodoList(){
        TodoList list = new TodoList();
        Assertions.assertEquals("List is empty",list.checkAllTasks());
    }

    @Test
    public void testIfReturnsAllTasks(){
        TodoList list = new TodoList();
        list.todoList = new HashMap<>();
        list.todoList.put("Clean room","Complete");
        list.todoList.put("Clean kitchen","Incomplete");
        list.todoList.put("Walk dog","Complete");
        Assertions.assertEquals("{Walk dog=Complete, Clean room=Complete, " +
                "Clean kitchen=Incomplete}",list.checkAllTasks());
    }


}
