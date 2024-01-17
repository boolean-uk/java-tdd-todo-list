package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAddingTask(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        Assertions.assertTrue(todoList.list.containsKey("Wash clothes"));

    }

    @Test
    public void testRemovingTask(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        Assertions.assertTrue(todoList.list.containsKey("Wash clothes"));
        Assertions.assertEquals(todoList.remove("Wash clothes"),"Wash clothes removed from TodoList");
        todoList.remove("Wash clothes");
        Assertions.assertFalse(todoList.list.containsKey("Wash clothes"));
    }

    @Test
    public void testShowAllTasks(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.add("Wash");
        String expected="Wash : Incomplete\nWash clothes : Incomplete\n";


        Assertions.assertEquals(expected,todoList.show());

    }

    @Test
    public void testChangeStatus(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.status("Wash clothes", "Complete");
        String str=todoList.list.get("Wash clothes");
        Assertions.assertEquals("Complete", str);

    }

    @Test
    public void testShowAllIncompleteTasks(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.add("Wash");
        todoList.add("Shopping");
        todoList.status("Shopping","Complete");
        String expected="Wash : Incomplete\nWash clothes : Incomplete\n";



        Assertions.assertEquals(expected,todoList.showIncomplete());
    }

    @Test
    public void testShowAllCompleteTasks(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.add("Wash");
        todoList.add("Shopping");
        todoList.status("Wash","Complete");
        todoList.status("Wash clothes", "Complete");
        String expected="Wash : Complete\nWash clothes : Complete\n";

        Assertions.assertEquals(expected,todoList.showComplete());
    }

    @Test
    public void testSortedAlphabetically(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.add("Eat");
        todoList.add("Shopping");
        String expected="Eat : Incomplete\nShopping : Incomplete\nWash clothes : Incomplete\n";
        Assertions.assertEquals(expected,todoList.sortAlphabetically());


    }
    @Test
    public void testSortedAlphabeticallyReverse(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.add("Eat");
        todoList.add("Shopping");
        String expected="Wash clothes : Incomplete\nShopping : Incomplete\nEat : Incomplete\n";
        Assertions.assertEquals(expected,todoList.sortAlphabeticallyReverse());


    }

    @Test
    public void testSearchForTask(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.add("Eat");
        todoList.add("Shopping");
        todoList.search("");
        Assertions.assertEquals("Eat : Incomplete",todoList.search("Eat"));

    }
    @Test
    public void testSearchForTaskNotInList(){
        TodoList todoList = new TodoList();
        todoList.add("Wash clothes");
        todoList.add("Shopping");
        todoList.search("");
        Assertions.assertEquals("Eat not a task in TodoList",todoList.search("Eat"));

    }

}
