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

        todolist.addTask(todo1, false);
        todolist.addTask(todo2, false);
        todolist.addTask(todo3, false);
        todolist.addTask(todo4, false);

        Assertions.assertEquals(4, todolist.todoItems.size());
    }

    @Test
    void seeTheTasks() {
        TodoList todolist = new TodoList();

        String todo1 = "groceries";
        String todo2 = "bills";
        String todo3 = "dentist";
        String todo4 = "cleaning";

        todolist.addTask(todo1, false);
        todolist.addTask(todo2, false);
        todolist.addTask(todo3, false);
        todolist.addTask(todo4, false);

        Assertions.assertEquals("groceries, bills, dentist, cleaning", todolist.seeTasks());


    }

    @Test
    void changeStatus() {
        TodoList todolist = new TodoList();

        String todo1 = "groceries";
        String todo2 = "bills";
        String todo3 = "dentist";
        String todo4 = "cleaning";

        todolist.addTask(todo1, false);
        todolist.addTask(todo2, false);
        todolist.addTask(todo3, false);
        todolist.addTask(todo4, false);

        todolist.changeStatus("groceries");

        Assertions.assertTrue(todolist.todoItems.get("groceries"));


    }

    @Test
    void getCompletedTasks() {
        TodoList todolist = new TodoList();

        String todo1 = "groceries";
        String todo2 = "bills";
        String todo3 = "dentist";
        String todo4 = "cleaning";

        todolist.addTask(todo1, false);
        todolist.addTask(todo2, false);
        todolist.addTask(todo3, true);
        todolist.addTask(todo4, true);

        Assertions.assertEquals("dentist, cleaning", todolist.getCompletedTasks());


    }




}
