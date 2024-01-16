package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAddToList(){
        TodoList toDoList = new TodoList();

        toDoList.addTask("Get mail");
        Assertions.assertEquals("Task: Get mail, false",toDoList.getTaskList().get(0).toString());
    }

    @Test
    public void testShowAll(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("Get mail");
        toDoList.addTask("Go running");
        Assertions.assertEquals("[Task: Get mail, false, Task: Go running, false]",toDoList.showAll());
    }

    @Test
    public void testChangeStatus(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("Get mail");
        Task task = new Task("Get mail",false);
        Assertions.assertFalse(task.getStatus());
        task.setStatus(true);
        Assertions.assertTrue(task.getStatus());

    }

    @Test
    public void testShowCompletedTasks(){
        TodoList toDoList = new TodoList();

        toDoList.addTask("Go running");
        toDoList.addTask("Check email");
        toDoList.taskList.get(0).setStatus(true);
        Assertions.assertEquals("[Task: Go running, true]",toDoList.showCompletedTasks());
    }

    @Test
    public void testShowIncompleteTasks(){
        TodoList toDoList = new TodoList();

        toDoList.addTask("Go running");
        toDoList.addTask("Check email");
        toDoList.taskList.get(0).setStatus(true);
        Assertions.assertEquals("[Task: Check email, false]",toDoList.showIncompleteTasks());
    }

    @Test
    public void testSearchNotExists(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("Go running");
        toDoList.addTask("Check email");
        toDoList.taskList.get(1).setStatus(true);
        Assertions.assertEquals("Task: Check email, true",toDoList.search("Check email"));
        Assertions.assertEquals("Task does not exist",toDoList.search("Look at the moon"));
    }

    @Test
    public void testRemoveTask(){
        TodoList toDoList = new TodoList();

        toDoList.addTask("Go running");
        toDoList.addTask("Check email");
        toDoList.addTask("Look at the moon");
        toDoList.removeTask("Look at the moon");
        Assertions.assertEquals("[Task: Go running, false, Task: Check email, false]",toDoList.showAll());
    }

    @Test
    public void testSortListAsc(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("Go running");
        toDoList.addTask("Check email");
        toDoList.addTask("Look at the moon");
        toDoList.sortListAsc();
        Assertions.assertEquals("[Task: Check email, false, Task: Go running, false, Task: Look at the moon, false]",toDoList.showAll());
    }
    @Test
    public void testSortListDesc(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("Go running");
        toDoList.addTask("Check email");
        toDoList.addTask("Look at the moon");
        toDoList.sortListDesc();
        Assertions.assertEquals("[Task: Look at the moon, false, Task: Go running, false, Task: Check email, false]",toDoList.showAll());
    }


}
