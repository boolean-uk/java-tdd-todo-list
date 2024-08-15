package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask("Make Dinner"));
    }

    @Test
    public void changeStatusTest(){
        TodoList todoList = new TodoList();

        todoList.addTask("Make Dinner");
        Assertions.assertTrue(todoList.changeStatus("Make Dinner", true));

    }

    @Test
    public void getAllTasksTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Work out");
        todoList.addTask("Make dinner");
        ArrayList<String> newList = new ArrayList<>();
        newList = todoList.getAllTasks();

        Assertions.assertEquals("Work out Status: Incomplete", newList.get(1));
    }

    @Test
    public void getCompletedTasksTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Work out");
        todoList.addTask("Make dinner");
        ArrayList<String> newList = new ArrayList<>();
        todoList.changeStatus("Work out", true);
        newList = todoList.getCompletedTasks();

        Assertions.assertTrue(newList.contains("Work out"));
        Assertions.assertFalse(newList.contains("Make dinner"));
    }

    @Test
    public void getUncompletedTasksTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Work out");
        todoList.addTask("Make dinner");
        ArrayList<String> newList = new ArrayList<>();
        todoList.changeStatus("Work out", true);
        newList = todoList.getUncompletedTasks();

        Assertions.assertFalse(newList.contains("Work out"));
        Assertions.assertTrue(newList.contains("Make dinner"));
    }

    @Test
    public void searchTasksTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Work out");
        todoList.addTask("Make dinner");
        todoList.changeStatus("Work out", true);

        String search = todoList.searchTasks("Work out");
        Assertions.assertEquals("Work out Status: complete", search);
    }

    @Test
    public void removeTaskTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Work out");
        todoList.addTask("Make dinner");
        todoList.changeStatus("Work out", true);

        Assertions.assertTrue(todoList.removeTask("Make dinner"));

    }

    @Test
    public void getSortedTasks(){
        TodoList todoList = new TodoList();
        todoList.addTask("Work out");
        todoList.addTask("Make dinner");
        todoList.changeStatus("Work out", true);
        ArrayList<String> ascendingList = todoList.getSortedTasks("Ascending");
        ArrayList<String> descendingList = todoList.getSortedTasks("Descending");

        Assertions.assertEquals("Make dinner Status: uncomplete",ascendingList.getFirst());
        Assertions.assertEquals("Work out Status: complete",descendingList.getFirst());
    }

}
