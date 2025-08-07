package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {

    @Test
    public void addTask(){
        Task task1 = new Task("Clean house", "Incomplete");
        Task task2 = null;
        Task task3 = new Task("", "");


        TodoList todo = new TodoList();


        Assertions.assertTrue(todo.addTask(task1));
        Assertions.assertFalse(todo.addTask(task2));
        Assertions.assertFalse(todo.addTask(task3));
    }

    @Test
    public void removeTask(){
        Task task1 = new Task("Clean house", "Incomplete");
        Task task2 = new Task("Wash car", "Incomplete");
        TodoList todo = new TodoList(new ArrayList<>(List.of(task1,task2)));



        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task1);

        Assertions.assertTrue(todo.removeTasks(task1));
        Assertions.assertFalse(todo.removeTasks(task1));

    }


    @Test
    public void getAllTasks(){

        Task task1 = new Task("Clean house", "Incomplete");
        Task task2 = new Task("Wash car", "Incomplete");

        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task1);
        correct.add(task2);

        TodoList todoTrue = new TodoList(new ArrayList<>(List.of(task1,task2)));
        TodoList todoFalse = new TodoList(new ArrayList<>(List.of(task1)));
        TodoList todoNull = new TodoList(new ArrayList<>());

        Assertions.assertEquals(correct, todoTrue.getAllTask());
        Assertions.assertNotEquals(correct, todoFalse.getAllTask());
        Assertions.assertNull(todoNull.getAllTask());

    }

    @Test
    public void changeStatus(){

        Task task1 = new Task("Eat food", "Complete");
        Task task2 = new Task("Clean house", "Complete");
        Task task3 = new Task("Paint stairs", "Complete");

        TodoList todoList = new TodoList(new ArrayList<>(List.of(task1,task2,task3)));

        boolean bool1 = todoList.changeStatus("Paint stairs", "Incomplete");
        boolean bool2 = todoList.changeStatus("Paint stairs", "");


        Assertions.assertEquals(true,bool1);
        Assertions.assertFalse(bool2);
        Assertions.assertNull(todoList.changeStatus("Paint stairs", null));

    }
    @Test
    public void getCompleteTasks(){

        Task task1 = new Task("Clean house", "Complete");
        Task task2 = new Task("Wash car", "Incomplete");
        Task task3 = new Task("Eat food", "Complete");
        Task task4 = new Task("Wash car", "Incomplete");

        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task1);
        correct.add(task3);


        TodoList todoList = new TodoList(new ArrayList<>(List.of(task1,task2,task3)));
        TodoList todoList2 = new TodoList(new ArrayList<>(List.of(task4,task2)));

        Assertions.assertEquals(correct, todoList.getAllCompleteTasks());
        Assertions.assertTrue(todoList2.getAllCompleteTasks().isEmpty());

    }

    @Test
    public void getIncompleteTask(){

        Task task1 = new Task("Clean house", "Complete");
        Task task2 = new Task("Wash car", "Incomplete");
        Task task3 = new Task("Eat food", "Complete");
        Task task4 = new Task("Go to work", "Incomplete");

        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task2);
        correct.add(task4);

        TodoList todoList1 = new TodoList(new ArrayList<>(List.of(task1,task2,task3,task4)));
        TodoList todoList2 = new TodoList(new ArrayList<>(List.of(task1,task3)));

        Assertions.assertEquals(correct, todoList1.getAllIncompleteTasks());
        Assertions.assertTrue(todoList2.getAllIncompleteTasks().isEmpty());

    }

    @Test
    public void searchTask(){

        Task task1 = new Task("Eat food", "Complete");
        Task task2 = new Task("Clean house", "Complete");


        TodoList todoTrue = new TodoList(new ArrayList<>(List.of(task1,task2)));

        todoTrue.searchTask("Eat food");
        Assertions.assertEquals("Task found" ,todoTrue.searchTask("Eat food"));
        Assertions.assertEquals("Task not found" ,todoTrue.searchTask("Go to school"));
        Assertions.assertEquals("Task not found" ,todoTrue.searchTask(null));
    }



    @Test
    public void descendingAlphabetical(){

        Task task1 = new Task("Clean house", "Complete");
        Task task2 = new Task("Wash car", "Incomplete");
        Task task3 = new Task("Eat food", "Complete");
        Task task4 = new Task("Go to work", "Incomplete");

        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task2);
        correct.add(task4);
        correct.add(task3);
        correct.add(task1);

        TodoList todoTrue = new TodoList(new ArrayList<>(List.of(task1,task2,task3,task4)));

        Assertions.assertEquals(correct, todoTrue.descAlphabetical());
    }

    @Test
    public void ascendingAlphabetical(){

        Task task1 = new Task("Clean house", "Complete");
        Task task2 = new Task("Wash car", "Incomplete");
        Task task3 = new Task("Eat food", "Complete");
        Task task4 = new Task("Go to work", "Incomplete");

        ArrayList<Task> correct = new ArrayList<>();
        correct.add(task1);
        correct.add(task3);
        correct.add(task4);
        correct.add(task2);

        TodoList todoTrue = new TodoList(new ArrayList<>(List.of(task1,task2,task3,task4)));

        Assertions.assertEquals(correct, todoTrue.ascAlphabetical());
    }



}
