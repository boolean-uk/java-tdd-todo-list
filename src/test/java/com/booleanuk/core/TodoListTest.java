package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void TestAdd() {
        TodoList lst = new TodoList();
        Task task = new Task("CV");
        
        Assertions.assertEquals(true, lst.addTask(task));
        Assertions.assertTrue(lst.addTask(new Task("Sleep")));
    }
}
