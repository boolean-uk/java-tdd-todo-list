package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void addNewTaskCorrectDescription() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.addTask(taskDescription);
        Assertions.assertEquals(result.getDescription(),"Walk the dog");
    }
    @Test
    public void addNewTaskCorrectId() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.addTask(taskDescription);
        Assertions.assertEquals(result.getId(),0);
    }
    @Test
    public void addNewTaskCorrectIsComplete() {
        String taskDescription = "Walk the dog";
        TodoList todolist = new TodoList();
        Task result = todolist.addTask(taskDescription);
        Assertions.assertEquals(result.isComplete(),false);
    }
    @Test
    public void getTasksShouldReturnAllTasks() {
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the hamster";

        TodoList todolist = new TodoList();
        todolist.addTask(taskDescription1);
        todolist.addTask(taskDescription2);

        ArrayList<Task> results = todolist.getTasks();

        Assertions.assertEquals(results.size(), 2  );
    }
    @Test
    public void changeTaskStatusToComplete() {
        String taskDescription1 = "Walk the dog";

        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);
        newTask.changeTaskStatus();

        Assertions.assertTrue(newTask.isComplete());
    }
    @Test
    public void changeTaskStatusToIncomplete() {
        String taskDescription1 = "Walk the dog";

        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);
        newTask.changeTaskStatus(); //change status to complete
        newTask.changeTaskStatus();

        Assertions.assertFalse(newTask.isComplete());

    }
    @Test
    public void testGetCompleteTasks() {
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the dog2";
        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);
        Task newTask2 = todolist.addTask(taskDescription2);

        newTask.changeTaskStatus();
        ArrayList<Task> result = todolist.getCompleteTasks();
        Assertions.assertEquals(result.size(), 1);
    }
    @Test
    public void testGetIncompleteTasks() {
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the dog2";
        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);
        Task newTask2 = todolist.addTask(taskDescription2);

        newTask.changeTaskStatus();
        ArrayList<Task> result = todolist.getIncompleteTasks();
        Assertions.assertEquals(result.size(), 1);
    }

    @Test
    public void testIsResultASpecificTask() throws Exception {
        String taskDescription = "Walk the dog";

        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription);

        Task result = todolist.getTask(0);

        Assertions.assertEquals(result.getDescription(), taskDescription);
    }

    @Test
    public void testGetTaskForInvalidId() {
        String taskDescription = "Walk the dog";

        TodoList todolist = new TodoList();
        todolist.addTask(taskDescription);

        String message = "";

        try {
            todolist.getTask(1);
        } catch(Exception e){
            message = e.toString();
        }

        Assertions.assertEquals(message, "java.lang.Exception: Task not found");
    }

    @Test
    public void removeTaskTaskRemoved(){
        String taskDescription1 = "Walk the dog";
        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);

        boolean result = todolist.removeTask(newTask.getId());

        Assertions.assertTrue(result);
    }

    @Test
    public void removeTaskTaskNotRemoved(){
        String taskDescription1 = "Walk the dog";
        TodoList todolist = new TodoList();
        Task newTask = todolist.addTask(taskDescription1);

        boolean result = todolist.removeTask(1);

        Assertions.assertFalse(result);
    }

    @Test
    public void removeAllTasksTasksRemoved(){
        String taskDescription1 = "Walk the dog";
        String taskDescription2 = "Walk the dog2";
        TodoList todolist = new TodoList();
        Task newTask1 = todolist.addTask(taskDescription1);
        Task newTask2 = todolist.addTask(taskDescription2);

        boolean result = todolist.removeAllTasks();

        Assertions.assertTrue(result);
    }

    @Test
    public void removeAllTasksTasksNotRemoved(){
        TodoList todolist = new TodoList();

        boolean result = todolist.removeAllTasks();

        Assertions.assertFalse(result);
    }

    @Test
    public void sortTasksAscCheckIsSorted(){
        String taskDescription1 = "b";
        String taskDescription2 = "a";
        TodoList todolist = new TodoList();
        Task newTask1 = todolist.addTask(taskDescription1);
        Task newTask2 = todolist.addTask(taskDescription2);

        ArrayList<Task> result = todolist.sortTasksAsc();

        Assertions.assertEquals(result.get(0).getDescription(), "a");
    }

    @Test
    public void sortTasksDscCheckIsSorted(){
        String taskDescription1 = "a";
        String taskDescription2 = "b";
        TodoList todolist = new TodoList();
        Task newTask1 = todolist.addTask(taskDescription1);
        Task newTask2 = todolist.addTask(taskDescription2);

        ArrayList<Task> result = todolist.sortTasksDsc();

        Assertions.assertEquals(result.get(0).getDescription(), "b");
    }

}
