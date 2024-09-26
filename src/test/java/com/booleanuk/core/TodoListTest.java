package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskTest()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");

        Assertions.assertTrue(myList.getTodoList().containsKey("walk the dog"));
    }

    @Test
    public void listTest()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");
        myList.addTask("get groceries");

        Assertions.assertEquals(2, myList.getTodoList().size());
    }

    @Test
    public void checkCompleteIncomplete()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");

        Assertions.assertFalse(myList.getTodoList().get("walk the dog"));

        myList.completeIncomplete("walk the dog");

        Assertions.assertTrue(myList.getTodoList().get("walk the dog"));
    }

    @Test
    public void checkGetComplete()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");
        myList.addTask("get groceries");
        myList.addTask("laundry");

        myList.completeIncomplete("walk the dog");

        Assertions.assertEquals(1, myList.getComplete().size());
    }

    @Test
    public void checkGetIncomplete()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");
        myList.addTask("get groceries");
        myList.addTask("laundry");

        myList.completeIncomplete("walk the dog");

        Assertions.assertEquals(2, myList.getIncomplete().size());
    }

    @Test
    public void checkFindTask()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");
        myList.addTask("get groceries");
        myList.addTask("laundry");

        Assertions.assertEquals("walk the dog", myList.findTask("walk the dog"));
        Assertions.assertEquals("Task not found", myList.findTask("vacuum"));
    }

    @Test
    public void checkAscendingOrder()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");
        myList.addTask("get groceries");
        myList.addTask("laundry");

        List<String> returnList = myList.ascendingOrder();
        Assertions.assertEquals(List.of("get groceries", "laundry", "walk the dog"), returnList);
    }
    @Test
    public void checkDescendingOrder()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");
        myList.addTask("get groceries");
        myList.addTask("laundry");

        List<String> returnList = myList.descendingOrder();
        Assertions.assertEquals(List.of("walk the dog", "laundry", "get groceries"), returnList);
    }

    @Test
    public void checkRemoveTask()
    {
        TodoList myList = new TodoList();

        myList.addTask("walk the dog");
        myList.addTask("get groceries");
        myList.addTask("laundry");

        myList.removeTask("walk the dog");

        Assertions.assertEquals(2, myList.getTodoList().size());
    }
}
