package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAdd(){
        TodoList todo = new TodoList();

        Assertions.assertTrue(todo.tasks.isEmpty());

        todo.add("buy milk");
        todo.add("brush teeth");
        
        Assertions.assertTrue(todo.tasks.contains("buy milk"));
        Assertions.assertTrue(todo.tasks.contains("brush teeth"));
    }

    @Test
    public void testTaskStatus(){
        TodoList todo = new TodoList();
        todo.add("wash toilet");
        todo.add("clean roof");

        Assertions.assertFalse(todo.status("wash toilet"));
        Assertions.assertFalse(todo.status("clean roof"));

        todo.changeStatus("wash toilet", true);

        Assertions.assertTrue(todo.status("wash toilet"));
    }

    @Test
    public void testCompleteAndIncomplete(){
        TodoList todo = new TodoList();
        todo.add("pet cat");
        todo.add("scream");
        todo.add("tie shoelaces");
        todo.changeStatus("pet cat", true);
        todo.changeStatus("scream", true);

        Assertions.assertEquals(2, todo.completeTasks().length());
        Assertions.assertEquals(1, todo.incompleteTasks().length());
        Assertions.assertTrue(todo.contains("scream", todo.completeTasks()));
        Assertions.assertFalse(todo.contains("scream", todo.incompleteTasks()));
    }

    @Test
    public void testSearch(){

    }

    @Test
    public void testRemove(){

    }
    
    @Test 
    public void testRemoveFromEmptyList(){
        
    }
    
    @Test 
    public void testRemoveNonExistingTask(){

    }

    @Test
    public void testAscending(){

    }

    @Test
    public void testDescending(){

    }
}
