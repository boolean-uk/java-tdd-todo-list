package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoExtensionTest {
    public ToDoExtensionTest(){}
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTest() {
        ToDoExtension todoList=new ToDoExtension();

        Assertions.assertTrue(todoList.add("1", new String[]{"Thing", "Time", "Incomplete"}));
        Assertions.assertFalse(todoList.add("1", new String[]{"Thing", "Time", "Incomplete"}));
    }
    @Test
    public void displayTest() {
        ToDoExtension todoList=new ToDoExtension();
        Assertions.assertFalse(todoList.display());
        todoList.add("1", new String[]{"Thing", "Time", "Incomplete"});
        todoList.add("2", new String[]{"Stuff", "Period", "Incomplete"});
        Assertions.assertTrue(todoList.display());
    }

    // This test is meant to update the name of a task with a given ID, as well as its status
    @Test
    public void changeNameTest() {
        ToDoExtension todoList=new ToDoExtension();
        todoList.add("1", new String[]{"Thing", "Time", "Incomplete"});
        todoList.changeName("1", "Stuff");
        todoList.changeStatus("1");
        Assertions.assertTrue(todoList.taskList.get("1")[0]=="Stuff");
        Assertions.assertTrue(todoList.taskList.get("1")[2]=="Complete");
    }

    // This test is meant to show the name and time/date of a task
    @Test
    public void searchTest() {
        ToDoExtension todoList=new ToDoExtension();
        String[] task=new String[]{"Thing", "Time", "Incomplete"};
        todoList.add("1", task);
        Assertions.assertTrue(task==todoList.findTask("1"));
    }




}
