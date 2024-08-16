package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("Make coffee", "Put nescafe in cup, follow with milk, sugar and hot water.");
        Task task = toDoList.tasks.get(0);
        System.out.println(task);
        Assertions.assertEquals(task.taskName, "Make coffee");
        Assertions.assertEquals(task.taskDesc, "Put nescafe in cup, follow with milk, sugar and hot water.");
        Assertions.assertEquals(task.taskStatus, "Incomplete");


    }

    @Test
    public void testPrintList() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        System.out.println(toDoList.toString());
        String list = toDoList.printList();
        Assertions.assertEquals("Name: 1 | Description: One | Status: Incomplete\nName: 2 | Description: Two | Status: Incomplete\nName: 3 | Description: Three | Status: Incomplete\n", list);
        System.out.println(list);
    }

    @Test
    public void testSearchTask() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        Task task = toDoList.searchTask("1");
        Task expectedTask = new Task("1","One");

        Assertions.assertEquals(expectedTask.taskName,task.taskName );
        Assertions.assertEquals(expectedTask.taskDesc,task.taskDesc );

        task = toDoList.searchTask("3");
        expectedTask = new Task("3","Three");

        Assertions.assertEquals(expectedTask.taskName,task.taskName );
        Assertions.assertEquals(expectedTask.taskDesc,task.taskDesc );

    }


    @Test
    public void testChangeTaskStatus() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        toDoList.changeTaskStatus("1", "Complete");
        Task searchTask = toDoList.searchTask("1");
        Assertions.assertEquals("Complete", searchTask.taskStatus);
    }
    @Test
    public void testFilterList(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        toDoList.changeTaskStatus("1", "Complete");
        toDoList.changeTaskStatus("3", "Complete");
        ArrayList<Task> filteredList = toDoList.filterList("Complete", toDoList.tasks);
        Assertions.assertEquals("Complete", filteredList.get(0).taskStatus);
        Assertions.assertEquals("Complete", filteredList.get(1).taskStatus);
        Assertions.assertEquals(2, filteredList.size());
        ArrayList<Task> filteredList2 = toDoList.filterList("Incomplete", toDoList.tasks);
        Assertions.assertEquals("Incomplete", filteredList2.get(0).taskStatus);
    }

    @Test
    public void testDeleteTask(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        toDoList.deleteTask("2");
        Assertions.assertEquals(null, toDoList.searchTask("2"));
        Task expectedTask = new Task("1","One");
        Assertions.assertEquals(expectedTask.taskName, toDoList.searchTask("1").taskName);
    }

    @Test
    public void testSortList(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("A", "One");
        toDoList.addTask("B", "Two");
        toDoList.addTask("C", "Three");
        TodoList expectedSortedList = new TodoList();
        expectedSortedList.addTask("C", "Three");
        expectedSortedList.addTask("B", "Two");
        expectedSortedList.addTask("A", "One");
        toDoList.sortListDescending();
        Assertions.assertEquals(expectedSortedList.tasks.get(0).taskName, toDoList.tasks.get(0).taskName);
        Assertions.assertEquals(expectedSortedList.tasks.get(2).taskName, toDoList.tasks.get(2).taskName);
        TodoList expectedSortedListAsc = new TodoList();
        expectedSortedListAsc.addTask("A", "One");
        expectedSortedListAsc.addTask("B", "Two");
        expectedSortedListAsc.addTask("C", "Three");
        toDoList.sortListAscending();
        Assertions.assertEquals(expectedSortedListAsc.tasks.get(0).taskName, toDoList.tasks.get(0).taskName);
        Assertions.assertEquals(expectedSortedListAsc.tasks.get(2).taskName, toDoList.tasks.get(2).taskName);
    }


}
