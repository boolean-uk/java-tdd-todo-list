package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }
    @Test
    public void addTaskTest() {


        boolean isCompleted = false;
        Task newTask = new Task("taskName", isCompleted);
        Task newTask1 = new Task("taskName1", isCompleted);
        TodoList newTodoList = new TodoList();
        System.out.println( newTodoList.addTask(newTask));
        Assertions.assertEquals(false,newTodoList.addTask(newTask));
        Assertions.assertEquals(true,newTodoList.addTask(newTask1));


    }

    @Test
    public void showTasksTest() {


        boolean isCompleted = false;
        Task newTask = new Task("taskName", isCompleted);
        Task newTask1 = new Task("taskName1", isCompleted);
        TodoList newTodoList = new TodoList();
        newTodoList.addTask(newTask);
        newTodoList.addTask(newTask1);
        System.out.println(newTodoList.showTasks());
        Assertions.assertEquals("task: taskName is completed: false\ntask: taskName1 is completed: false\n",newTodoList.showTasks());


    }
    @Test
    public void modifyCompetedValueTest() {


        boolean isCompleted = false;
        Task newTask = new Task("taskName", isCompleted);
        Task newTask1 = new Task("taskName1", isCompleted);
        TodoList newTodoList = new TodoList();

        newTodoList.addTask(newTask);
        newTodoList.addTask(newTask1);

        Assertions.assertEquals(false, newTask.isCompleted);
        newTodoList.modifyCompletedValue("taskName",true);
        Assertions.assertEquals(true, newTask.isCompleted);


    }
    @Test
    public void getCompletedTasksOnlyTest(){
        Task newTask = new Task("taskName", true);
        Task newTask1 = new Task("taskName1", false);
        Task newTask2 = new Task("taskName2", true);
        TodoList newTodoList = new TodoList();
        newTodoList.addTask(newTask);
        newTodoList.addTask(newTask1);
        newTodoList.addTask(newTask2);

        List<Task> completedTasks = newTodoList.getCompletedTasksOnly();

        for (Task task: completedTasks){
            Assertions.assertTrue(task.isCompleted);
        }



    }
    @Test
    public void getUncompletedTasksOnlyTest(){
        Task newTask = new Task("taskName", true);
        Task newTask1 = new Task("taskName1", false);
        Task newTask2 = new Task("taskName2", false);
        TodoList newTodoList = new TodoList();
        newTodoList.addTask(newTask);
        newTodoList.addTask(newTask1);
        newTodoList.addTask(newTask2);

        List<Task> uncompletedTasks = newTodoList.getUncompletedTasksOnly();
        System.out.println(uncompletedTasks);
        for (Task task: uncompletedTasks){
            Assertions.assertFalse(task.isCompleted);
        }
    }
    @Test
    public void findTaskTest(){
        Task newTask = new Task("taskName", true);
        Task newTask1 = new Task("taskName1", false);
        Task newTask2 = new Task("taskName2", false);
        TodoList newTodoList = new TodoList();
        newTodoList.addTask(newTask);
        newTodoList.addTask(newTask1);
        newTodoList.addTask(newTask2);


        Assertions.assertEquals("Task was found",newTodoList.findTask("taskName1"));
        Assertions.assertEquals("Task wasn't found",newTodoList.findTask("wrongName"));


    }

    @Test
    public void testRemoveTask() {
        Task newTask = new Task("taskName", true);
        Task newTask1 = new Task("taskName1", false);
        Task newTask2 = new Task("taskName2", false);
        Set<Task> expectedTasks = new HashSet<>();
        expectedTasks.add(newTask);
        expectedTasks.add(newTask1);
        expectedTasks.add(newTask2);

        TodoList newTodoList = new TodoList();
        newTodoList.tasks = expectedTasks;
        newTodoList.removeTask(newTask1);
        expectedTasks.remove(newTask2);

        Assertions.assertIterableEquals(expectedTasks, newTodoList.tasks);
    }

    @Test
    void testGetTasksOrderedAlphabeticallyAscending() {
        Task newTask = new Task("taskName", true);
        Task newTask1 = new Task("taskName2", false);
        Task newTask2 = new Task("taskName1", false);

        TodoList todoList = new TodoList();
        todoList.addTask(newTask);
        todoList.addTask(newTask1);
        todoList.addTask(newTask2);
        List<Task> expectedArray = new ArrayList<>();
        expectedArray.add(newTask);
        expectedArray.add(newTask2);
        expectedArray.add(newTask1);
        Assertions.assertIterableEquals(expectedArray, todoList.getTasksOrderedAlphabeticallyAscending());
    }

    @Test
    void testGetTasksOrderedAlphabeticallyDescending() {
        Task newTask = new Task("taskName", true);
        Task newTask1 = new Task("taskName2", false);
        Task newTask2 = new Task("taskName1", false);
        TodoList todoList = new TodoList();
        todoList.addTask(newTask);
        todoList.addTask(newTask1);
        todoList.addTask(newTask2);
        List<Task> expectedArray = new ArrayList<>();
        expectedArray.add(newTask1);
        expectedArray.add(newTask2);
        expectedArray.add(newTask);
        Assertions.assertIterableEquals(expectedArray, todoList.getTasksOrderedAlphabeticallyDescending());
    }


}
