package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ToDoListTest {

    @Test
    public void canAddTask() {
        TodoList todoList = new TodoList();
        todoList.add("Task");
        Assertions.assertTrue(todoList.add("Task"));

    }

    @Test
    public void alreadyTaskInList() {
        TodoList todoList = new TodoList();
        todoList.add("Task");
        Assertions.assertFalse(todoList.add("Task"));

    }

    @Test
    public void canRemove() {
        TodoList todoList = new TodoList();
        todoList.add("Task");
        Assertions.assertTrue(todoList.remove("Task"));
        Assertions.assertFalse(todoList.ts.containsKey("Task"));

    }

    @Test
    public void cantRemove() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.remove("Task"));

    }

    @Test
    public void changeStatusTasks() {
        TodoList todoList = new TodoList();

        todoList.add("Run");
        Assertions.assertTrue(todoList.setStatus("Run"));
        Assertions.assertTrue(todoList.setStatus("Run"));
    }

    @Test
    public void getTasksTest(){
        TodoList todoList = new TodoList();
        todoList.add("Run");
        todoList.add("Shop");
        todoList.setStatus("Run");
        String res = "Shop incomplete\nRun complete\n";
        Assertions.assertEquals(res, todoList.fetchMultipleTask());

    }

    @Test
    public void getTask(){
        TodoList todoList = new TodoList();
        todoList.add("Run");
        String res = "Run incomplete";
        Assertions.assertEquals(res, todoList.retriveTask("Run"));
        todoList.setStatus("Run");
        res = "Run complete";
        Assertions.assertEquals(res, todoList.retriveTask("Run"));
        res = "Eat not found";
        Assertions.assertEquals(res, todoList.retriveTask("Eat"));
    }

    @Test
    public void completeTask(){
        TodoList todoList = new TodoList();
        todoList.add("Run");
        todoList.add("Shop");
        todoList.add("Training");
        todoList.setStatus("Run");
        todoList.setStatus("Training");
        List<String> doneTasks = new ArrayList<>();
        doneTasks.add("Training");
        doneTasks.add("Run");
        Assertions.assertEquals(doneTasks, todoList.showStatus(true));
    }

    @Test
    public void incompleteTasks(){
        TodoList todoList = new TodoList();
        todoList.add("Run");
        todoList.add("Shop");
        todoList.add("Training");
        todoList.setStatus("Run");
        todoList.setStatus("Training");
        List<String> incompleteTasks = new ArrayList<>();
        incompleteTasks.add("Shop");
        Assertions.assertEquals(incompleteTasks, todoList.showStatus(false));
    }

    @Test
    public void ascendinngOrder(){
        TodoList todoList = new TodoList();
        todoList.add("Run");
        todoList.add("Shop");
        todoList.add("Training");
        ArrayList<String> orderList = new ArrayList<>();
        orderList.add("Run");
        orderList.add("Shop");
        orderList.add("Training");
        Assertions.assertEquals(orderList, todoList.sort(true));
    }

    @Test
    public void descendinngOrder(){
        TodoList todoList = new TodoList();
        todoList.add("Run");
        todoList.add("Shop");
        todoList.add("Training");
        ArrayList<String> descendingList = new ArrayList<>();
        descendingList.add("Training");
        descendingList.add("Shop");
        descendingList.add("Run");
        Assertions.assertEquals(descendingList, todoList.sort(false));
    }

}