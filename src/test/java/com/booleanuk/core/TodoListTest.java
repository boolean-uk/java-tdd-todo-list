package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
//    @Test
//    public void exampleTest() {
//        String hello = "Hello";
//        Assertions.assertEquals("Hello", hello);
//        Assertions.assertNotEquals("Goodbye", hello);
//    }

    @Test
    void addItemsToTheTodoList() {
        TodoList todolist = new TodoList();

        String todo1 = "groceries";
        String todo2 = "bills";
        String todo3 = "dentist";
        String todo4 = "cleaning";

        todolist.addTask(todo1);
        todolist.addTask(todo2);
        todolist.addTask(todo3);
        todolist.addTask(todo4);

        Assertions.assertEquals(4, todolist.todoItems.size());
    }

    @Test
    void seeTheTasks() {
        TodoList todolist = new TodoList();

        String todo1 = "groceries";
        String todo2 = "bills";
        String todo3 = "dentist";
        String todo4 = "cleaning";

        todolist.addTask(todo1);
        todolist.addTask(todo2);
        todolist.addTask(todo3);
        todolist.addTask(todo4);

        Assertions.assertEquals("groceries, bills, dentist, cleaning", todolist.seeTasks());


    }

    @Test
    void changeStatus() {
        TodoList todolist = new TodoList();

        String todo1 = "groceries";
        String todo2 = "bills";
        String todo3 = "dentist";
        String todo4 = "cleaning";

        todolist.addTask(todo1);
        todolist.addTask(todo2);
        todolist.addTask(todo3);
        todolist.addTask(todo4);

        todolist.changeStatus("groceries");

        Assertions.assertTrue(todolist.todoItems.get("groceries"));


    }


}
