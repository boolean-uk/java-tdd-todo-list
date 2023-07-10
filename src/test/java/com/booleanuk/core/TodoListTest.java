package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void addNewTaskCorrectDescription() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.add(taskDescription);
        Assertions.assertEquals(result.getDescription(),"Walk the dog");
    }
    @Test
    public void addNewTaskCorrectId() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.add(taskDescription);
        Assertions.assertEquals(result.getId(),0);
    }
    @Test
    public void addNewTaskCorrectIsComplete() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.add(taskDescription);
        Assertions.assertEquals(result.getIsComplete(),false);
    }
}
