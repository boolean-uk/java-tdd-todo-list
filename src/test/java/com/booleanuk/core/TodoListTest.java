package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

class TodoListTest {

    @Test
    public void addTaskToList(){
        TodoList todoList = new TodoList();
        Task t1 = new Task("First Task");

        Assertions.assertTrue(todoList.add(t1));
        Assertions.assertFalse(todoList.add(t1));
    }

    @Test
    public void viewTodoListTest() {
        TodoList todoList = new TodoList();
        //Test list is to make sure the list
        ArrayList<Task> testList = new ArrayList<>();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");
        //Populate the lists
        todoList.add(t1);
        todoList.add(t2);
        testList.add(t1);
        testList.add(t2);

        Assertions.assertEquals(testList, todoList.viewList());
    }

    @Test
    public void changeTaskStatusTest() {
        TodoList todoList = new TodoList();
        Task t1 = new Task("First Task");

        //False in the beginning
        Assertions.assertFalse(t1.getTaskStatus());

        //Change the isComplete to true
        todoList.changeTaskStatus(t1);

        //isComplete is now true
        Assertions.assertTrue(t1.getTaskStatus());
    }

    @Test
    public void getCompletedTasksTest() {
        TodoList todoList = new TodoList();
        ArrayList<Task> listChecker = new ArrayList<>();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");
        Task t3 = new Task("Third Task");

        //Add tasks to todolist
        todoList.add(t1);
        todoList.add(t2);
        todoList.add(t3);

        //Change the status of tasks and populate a reference list to compare
        todoList.changeTaskStatus(t1);
        todoList.changeTaskStatus(t3);
        listChecker.add(t1);
        listChecker.add(t3);

        Assertions.assertEquals(listChecker, todoList.getComplete());
    }

    @Test
    public void getInCompletedTasksTest() {
        TodoList todoList = new TodoList();
        ArrayList<Task> listChecker = new ArrayList<>();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");
        Task t3 = new Task("Third Task");

        //Add tasks to todolist
        todoList.add(t1);
        todoList.add(t2);
        todoList.add(t3);

        //Change the status of tasks and populate a reference list to compare
        todoList.changeTaskStatus(t1);
        todoList.changeTaskStatus(t3);
        listChecker.add(t2);


        Assertions.assertEquals(listChecker, todoList.getInComplete());
    }

    @Test
    public void searchTaskTest() {
        TodoList todoList = new TodoList();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");
        Task t3 = new Task("Third Task");

        //Add tasks to todolist
        todoList.add(t1);
        todoList.add(t2);
        todoList.add(t3);

        Assertions.assertEquals(todoList.searchTask("First Task"), t1);
    }

    @Test
    public void removeTaskTest() {
        TodoList todoList = new TodoList();
        ArrayList<Task> checkerList = new ArrayList<>();
        Task t1 = new Task("First Task");
        Task t2 = new Task("Second Task");
        Task t3 = new Task("Third Task");

        //Add tasks to todolist
        todoList.add(t1);
        todoList.add(t2);
        todoList.add(t3);
        checkerList.add(t1);
        checkerList.add(t2);
        checkerList.add(t3);

        Assertions.assertEquals(todoList.viewList(), checkerList);

        todoList.removeTask(t2);

        Assertions.assertNotEquals(todoList.viewList(), checkerList);
    }

    @Test
    public void viewListAscendingTest(){
        TodoList todoList = new TodoList();
        ArrayList<Task> checkerList = new ArrayList<>();
        Task t1 = new Task("ccc");
        Task t2 = new Task("bbb");
        Task t3 = new Task("aaa");

        //Add tasks to todolist
        todoList.add(t1);
        todoList.add(t2);
        todoList.add(t3);
        checkerList.add(t1);
        checkerList.add(t2);
        checkerList.add(t3);

        for (Task task : todoList.viewList()) {
            System.out.println(task.getName() + "\n");
        }
        Assertions.assertEquals(todoList.viewList(), checkerList);

        System.out.println("Change order");
       todoList.sortAscending();
        for (Task task : todoList.viewList()) {
            System.out.println(task.getName() + "\n");
        }
        //This is after sorting the list and should not be equal anymore
        Assertions.assertNotEquals(todoList.viewList(), checkerList);

    }

    @Test
    public void viewListDescendingTest(){
        TodoList todoList = new TodoList();
        ArrayList<Task> checkerList = new ArrayList<>();
        Task t1 = new Task("aaa");
        Task t2 = new Task("ccc");
        Task t3 = new Task("bbb");

        //Add tasks to todolist
        todoList.add(t1);
        todoList.add(t2);
        todoList.add(t3);
        checkerList.add(t1);
        checkerList.add(t2);
        checkerList.add(t3);

        /*
        For debugging printing out the list
        for (Task task : todoList.viewList()) {
            System.out.println(task.getName() + "\n");
        }
        */

        Assertions.assertEquals(todoList.viewList(), checkerList);

        System.out.println("Change order");
        todoList.sortDescending();
        /*
        For debugging printing out the list
        for (Task task : todoList.viewList()) {
            System.out.println(task.getName() + "\n");
        }
        */
        //This is after sorting the list and should not be equal anymore
        Assertions.assertNotEquals(todoList.viewList(), checkerList);

    }
}
