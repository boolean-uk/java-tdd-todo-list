package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    /*Domain model user story 1 test*/
    @Test
    public void testAddToTodoList(){
        TodoList tl = new TodoList();
        Assertions.assertTrue(tl.addTask(new Task("Shopping")));


    }
    @Test
    public void testAddExistingTaskToTodoList(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        Assertions.assertFalse(tl.addTask(new Task("Shopping")));
    }

    /*Domain model user story 2 test*/
    @Test
    public void testGetTodoList(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        tl.addTask(new Task("Bowling"));
        String expected = "Shopping" + ", Not Complete\n"
                + "Bowling" + ", Not Complete\n";

        Assertions.assertEquals(expected, tl.getTodoList());
    }

    /*Domain model user story 3 test*/
    @Test
    public void testToggleStatusOfTask(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        Assertions.assertTrue(tl.toggleStatus("Shopping"));
    }

    /*Domain model user story 4 test*/
    @Test
    public void testGettingCompletedTasks(){
        TodoList tl = new TodoList();
        Task t1 = new Task("Shopping");
        t1.setComplete(true);
        Task t2 = new Task("Bowling");
        tl.addTask(t1);
        tl.addTask(t2);
        String expected = "Completed Tasks\n" + t1.getName() + "\n";
        Assertions.assertEquals(expected, tl.getCompletedTasks());

    }

    /*Domain model user story 5 test*/
    @Test
    public void testGettingIncompleteTasks(){
        TodoList tl = new TodoList();
        Task t1 = new Task("Shopping");
        t1.setComplete(true);
        Task t2 = new Task("Bowling");
        tl.addTask(t1);
        tl.addTask(t2);
        String expected = "Incomplete Tasks\n" + t2.getName() + "\n";
        Assertions.assertEquals(expected, tl.getIncompleteTasks());
    }

    /* domain model user story 6*/
    @Test
    public void testSearchForTaskInList(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        tl.addTask(new Task("Bowling"));
        String expected = "Bowling" + " exists";
        Assertions.assertEquals(expected, tl.taskExists("Bowling"));
    }

    /* domain model user story 7 */
    @Test
    public void testRemoveTaskFromList(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        tl.addTask(new Task("Bowling"));
        String expected = "Shopping" + ", Not Complete\n"
                + "Bowling" + ", Not Complete\n";
        Assertions.assertEquals(expected, tl.getTodoList());
        tl.removeTasks("Shopping");
        expected = "Bowling" + ", Not Complete\n";
        Assertions.assertEquals(expected, tl.getTodoList());
    }

    /* Domain model user story 8*/
    @Test
    public void testIfStringIsInAscendingOrder(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        tl.addTask(new Task("Bowling"));
        tl.addTask(new Task("Gaming"));
        String expected = "Bowling" + ", Not Complete\n"
                + "Gaming" + ", Not Complete\n"
                + "Shopping" + ", Not Complete\n";
        Assertions.assertEquals(expected, tl.ascendingList());
    }

    /* Domain model user story 9*/
    @Test
    public void testIfStringIsInDescendingOrder(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        tl.addTask(new Task("Bowling"));
        tl.addTask(new Task("Gaming"));
        String expected = "Shopping" + ", Not Complete\n"
                + "Gaming" + ", Not Complete\n"
                + "Bowling" + ", Not Complete\n";
        Assertions.assertEquals(expected, tl.descendingList());
    }
}
