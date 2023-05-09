package com.booleanuk.extension;

import com.booleanuk.core.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TodoListTest {
    NewTask task0 = new NewTask("eat lunch",0);
    NewTask task1 = new NewTask("Wash hands.",1);
    NewTask task2 = new NewTask("Wash dishes",2);

    @Test
    void testGetTask(){
        TodoList todoList = new TodoList();
        todoList.todos.add(task0);
        todoList.todos.add(task1);
        todoList.todos.add(task2);
        Assertions.assertEquals(todoList.getTask(0),task0);

    }
    @Test
    void testUpdateTask(){
        TodoList todoList = new TodoList();
        todoList.todos.add(task0);
        todoList.todos.add(task1);
        todoList.todos.add(task2);
        todoList.updateTask(0,"finished!");
        Assertions.assertEquals(todoList.todos.get(0).getName(),"finished!");
    }
    @Test
    void testChangeStatus(){
        TodoList todoList = new TodoList();
        todoList.todos.add(task0);
        todoList.todos.add(task1);
        todoList.todos.add(task2);
        todoList.changeStatus(0);
        Assertions.assertTrue(todoList.todos.get(0).isCompleted());
        Assertions.assertFalse(todoList.todos.get(1).isCompleted());

    }
    @Test
    void testGetDate(){
        TodoList todoList = new TodoList();
        todoList.todos.add(task0);
        todoList.todos.add(task1);
        todoList.todos.add(task2);
        Assertions.assertEquals(todoList.getDate(0),task0.date);
        Assertions.assertEquals(todoList.getDate(1),task1.date);
        Assertions.assertEquals(todoList.getDate(2),task2.date);
    }
}
