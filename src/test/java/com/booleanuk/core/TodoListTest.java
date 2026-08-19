package com.booleanuk.core;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    private TodoList tdl;
    Task t1 = new Task("Change bedsheets", true);
    Task t2 = new Task("Do laundry");
    Task t3 = new Task("Abandon all hope");
    Task t4 = new Task("Begin to cry");

    public TodoListTest() {
        tdl = new TodoList();
        tdl.addTask(t1);
        tdl.addTask(t2);
        tdl.addTask(t3);
    }

    @Test
    public void displayList_default() {
        Assertions.assertEquals("""
            ☑ Change bedsheets
            ☐ Do laundry
            ☐ Abandon all hope""", tdl.displayList());
    }

    @Test
    public void getTasks_incompleteOnly() {
        Assertions.assertEquals(List.of(t2, t3), tdl.getIncompleteTasks());
    }

    @Test
    public void task_changeStatus() {
        t2.setComplete(true);
        Assertions.assertTrue(t2.isComplete());
    }
    
    @Test
    public void getTasks_completeOnly() {
        t2.setComplete(true);
        Assertions.assertEquals(List.of(t1, t2), tdl.getCompletedTasks());
        
    }

    @Test
    public void removeTask_removeOneTaskByName() {
        tdl.removeTask("Change bedsheets");
        //tdl.removeTask(t1);
        Assertions.assertEquals(List.of(t2, t3), tdl.getAllTasks());
    }

    @Test
    public void removeTask_removeOneTaskByObject() {
        tdl.removeTask(t2);
        Assertions.assertEquals(List.of(t1, t3), tdl.getAllTasks());
    }

    @Test
    public void displayList_alphabeticallyAscending() {
        tdl.addTask(t4);
        Assertions.assertEquals("""
            ☐ Abandon all hope
            ☐ Begin to cry
            ☑ Change bedsheets
            ☐ Do laundry""", tdl.displayList(tdl.sortListAlphabeticallyAscending()));
    }

    @Test
    public void displayList_alphabeticallyDescending() {
        tdl.addTask(t4);
        Assertions.assertEquals("""
            ☐ Do laundry
            ☑ Change bedsheets
            ☐ Begin to cry
            ☐ Abandon all hope""", tdl.displayList(tdl.sortListAlphabeticallyDescending()));
    }

    @Test
    public void search_taskExists() {
        Assertions.assertEquals("Task exists!", tdl.search("Abandon all hope"));
    }
    
    @Test
    public void search_taskDoesNotExist() {
        Assertions.assertEquals("Task does not exist :-(", tdl.search("Be happy"));
    }
}
