package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAdd() {
        TodoList todo = new TodoList();
        Assertions.assertEquals(true, todo.add("Need to wash my hands"));
    }

    @Test
    public void testListTasks(){
        TodoList todo = new TodoList();
        todo.add("Need to wash my hands");
        todo.add("Wash car");
        todo.listTasks();
        Assertions.assertEquals(2, todo.listTasks());
        todo.add("Trim beard");
        todo.listTasks();
        Assertions.assertEquals(3, todo.listTasks());
    }

    @Test
    public void testChangeTaskStatus(){
        TodoList todo = new TodoList();
        todo.add("Wash car");
        todo.add("Make food");
        Assertions.assertFalse(todo.list.get(0).isCompleted);
        todo.changeTaskStatus("Wash car");
        Assertions.assertTrue(todo.list.get(0).isCompleted);
        todo.changeTaskStatus("Develop software");
        Assertions.assertFalse(todo.list.get(1).isCompleted);
    }

    @Test
    public void testGetIncompleteTasks(){
        TodoList todo = new TodoList();
        todo.add("Wash car");
        todo.add("Make food");
        todo.add("Brush teeth");
        todo.add("Workout");
        todo.add("Walk the dog");
        Assertions.assertEquals(5, todo.getIncompleteTasks());
        todo.changeTaskStatus("Wash car");
        todo.changeTaskStatus("Brush teeth");
        Assertions.assertEquals(3, todo.getIncompleteTasks());
    }
    @Test
    public void testGetCompletedTasks(){
        TodoList todo = new TodoList();
        todo.add("Wash car");
        todo.add("Make food");
        todo.add("Brush teeth");
        todo.add("Workout");
        todo.add("Walk the dog");
        Assertions.assertEquals(0, todo.getCompletedTasks());
        todo.changeTaskStatus("Wash car");
        todo.changeTaskStatus("Brush teeth");
        Assertions.assertEquals(2, todo.getCompletedTasks());
    }
    @Test
    public void testSearchTask(){
        TodoList todo = new TodoList();
        todo.add("Wash car");
        todo.add("Make food");
        todo.add("Brush teeth");
        todo.add("Workout");
        Assertions.assertTrue(todo.searchTask("Workout"));
        Assertions.assertFalse(todo.searchTask("Trim beard"));
    }
    @Test
    public void testRemoveTask(){
        TodoList todo = new TodoList();
        todo.add("Wash car");
        todo.add("Make food");
        todo.add("Brush teeth");
        todo.add("Workout");
        Assertions.assertTrue(todo.removeTask("Workout"));
        Assertions.assertFalse(todo.removeTask("Workout"));
        Assertions.assertFalse(todo.removeTask("Trim beard"));
    }
    @Test
    public void testAscendingOrderInList(){
        TodoList todo = new TodoList();
        todo.add("Wash car");
        todo.add("Make food");
        todo.add("Brush teeth");
        todo.add("Workout");
        todo.sortedListAsc();

        Assertions.assertEquals("Brush teeth", todo.list.get(0).description);
        Assertions.assertEquals("Make food", todo.list.get(1).description);
        Assertions.assertEquals("Wash car", todo.list.get(2).description);
        Assertions.assertEquals("Workout", todo.list.get(3).description);
    }

    @Test
    public void testDescendingOrderInList(){
        TodoList todo = new TodoList();
        todo.add("Wash car");
        todo.add("Make food");
        todo.add("Brush teeth");
        todo.add("Workout");
        todo.sortedListDes();

        Assertions.assertEquals("Brush teeth", todo.list.get(3).description);
        Assertions.assertEquals("Make food", todo.list.get(2).description);
        Assertions.assertEquals("Wash car", todo.list.get(1).description);
        Assertions.assertEquals("Workout", todo.list.get(0).description);
    }
}
