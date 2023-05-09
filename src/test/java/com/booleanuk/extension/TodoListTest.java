package com.booleanuk.extension;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListTest {

    @Test
    public void getByIdShouldBeTask() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.id = 1;
        todoList.tasks.add(task);

        Assertions.assertEquals(task.id, todoList.getById(1).id);
    }

    @Test
    public void getByIdShouldBeNull() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        todoList.tasks.add(task);

        Assertions.assertNull(todoList.getById(1));
    }

    @Test
    public void updateNameByIdShouldBeTrue() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.id = 1;
        todoList.tasks.add(task);

        Assertions.assertTrue(todoList.updateNameById(1, "Nick"));
    }

    @Test
    public void updateNameByIdShouldBeFalse() {
        TodoList todoList = new TodoList();

        Assertions.assertFalse(todoList.updateNameById(1, "Nick"));
    }
}
