package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListTest {

    @Test
    public void addTaskTest(){
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Dishes", 1));
        Assertions.assertTrue(todoList.addTask("Dishes2", 2));

    }
}
