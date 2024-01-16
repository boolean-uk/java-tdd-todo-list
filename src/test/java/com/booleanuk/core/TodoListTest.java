package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAddToList(){
        TodoList toDoList = new TodoList();

        toDoList.add("Get mail");
        Assertions.assertEquals("Get mail",toDoList.taskList.get(toDoList.taskList.size()-1));
    }

    @Test
    public void testShowAll(){
        TodoList toDoList = new TodoList();

        Assertions.assertEquals("Task: Get mail, incomplete",toDoList.showAll());
    }

    @Test
    public void testChangeStatus(){
        TodoList toDoList = new TodoList();

        toDoList.changeStatus("Get mail");
        Assertions.assertTrue(toDoList.taskList.get(0).getStatus());
    }

    @Test
    public void testShowCompletedTasks(){
        TodoList toDoList = new TodoList();

        toDoList.add("Go running");
        toDoList.add("Check email");
        toDoList.changeStatus("Go running");
        Assertions.assertEquals("Task: Get mail, Complete, Task: Go running, Complete",toDoList.showCompletedTasks());
    }

    @Test
    public void testShowIncompleteTasks(){
        TodoList toDoList = new TodoList();

        toDoList.add("Check fav yt");
        Assertions.assertEquals("Task: Check email, Incomplete, Task: Check fav yt, Incomplete",toDoList.showIncompleteTasks());
    }

    @Test
    public void testSearchNotExists(){
        TodoList toDoList = new TodoList();

        Assertions.assertEquals("Task: Get mail, Complete",toDoList.search("Get mail"));
        Assertions.assertEquals("Task does not exist",toDoList.search("Look at the moon"));
    }

    @Test
    public void testRemoveTask(){
        TodoList toDoList = new TodoList();

        toDoList.removeTask("Get mail");
        Assertions.assertEquals("Task: Go running, Complete, Task: Check email, Incomplete, Task: Check fav yt, Incomplete",toDoList.showAll());
    }

    @Test
    public void testSortListAsc(){
        TodoList toDoList = new TodoList();

        toDoList.sortListAsc();
        Assertions.assertEquals("Task: Check email, Incomplete, Task: Check fav yt, Incomplete, Task: Go running, Complete",toDoList.showAll());
    }
    @Test
    public void testSortListDesc(){
        TodoList toDoList = new TodoList();

        toDoList.sortListDesc();
        Assertions.assertEquals("Task: Go running, Complete, Task: Check fav yt, Incomplete, Task: Check email, Incomplete",toDoList.showAll());
    }


}
