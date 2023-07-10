package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTest(){
        TodoList todo = new TodoList("First task", false);
        Assertions.assertEquals("Task added to to-do list", todo.add("Second task", false) );
    }

    @Test
    public void seeAllTest(){
        TodoList todo = new TodoList();
        todo.add("First todo", false);
        todo.add("Second task", true);
        todo.add("Third task", true);
        Assertions.assertEquals(todo.tasks, todo.seeAll());
    }

    @Test
    public void changeStatusTest(){
        TodoList todo = new TodoList();
        todo.add("First todo", false);
        Assertions.assertEquals("Status changed", todo.statusChange("First todo", true));
    }

    @Test
    public void getCompleteTest(){
        TodoList todo = new TodoList();
        todo.add("First todo", false);
        todo.add("Second task", true);
        Assertions.assertEquals(todo.tasks.get(1), todo.getComplete().get(0));
    }

    @Test
    public void getIncompleteTest(){
        TodoList todo = new TodoList();
        todo.add("Second task", true);
        todo.add("First todo", false);
        Assertions.assertEquals(todo.tasks.get(1), todo.getIncomplete().get(0));
    }

    @Test
    public void SearchForTaskTest(){
        TodoList todo = new TodoList();
        todo.add("First task", false);
        todo.add("Second task", true);
        todo.add("Third task", false);
        Assertions.assertEquals("Task was found", todo.search("Second task"));
    }

    @Test
    public void RemoveTest(){
        TodoList todo = new TodoList();
        todo.add("First task", false);
        todo.add("Second task", true);
        Assertions.assertEquals("Task was deleted", todo.remove("First task"));
    }



}
