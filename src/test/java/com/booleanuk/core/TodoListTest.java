package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class TodoListTest {

    @Test
    public void addTaskToListFail() {
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Incomplete");

        Assertions.assertFalse(todo.addTask(toDoList, "Task 1"));
    }

    @Test
    public void addTaskToList() {
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();

        Assertions.assertTrue(todo.addTask(toDoList, "Task 1"));
        Assertions.assertTrue(todo.addTask(toDoList, "Task 2"));
        Assertions.assertTrue(todo.addTask(toDoList, "Task 3"));
        Assertions.assertTrue(todo.addTask(toDoList, "Task 4"));
    }

    @Test
    public void printList(){
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Incomplete");

        Assertions.assertTrue(todo.printTask(toDoList));
    }

    @Test
    public void printEmptyList() {
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        Assertions.assertFalse(todo.printTask(toDoList));
    }

    @Test
    public void changeStatusOfTaskInList() {
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Incomplete");

        Assertions.assertEquals(true, todo.changeStatus(toDoList, "Task 1"));
    }

    @Test
    public void changeStatusOfNonExistingTask() {
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();

        Assertions.assertEquals(false, todo.changeStatus(toDoList, "Task 1"));
    }

    @Test
    public void completeTasksInList() {
        TodoList todo = new TodoList();

        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Completed");
        toDoList.put("Task 2", "Incomplete");
        List<String> list = new ArrayList<>();
        list.add("Task 1");

        Assertions.assertEquals(list, todo.completeTasks(toDoList));
    }

    @Test
    public void noCompleteTasks() {
        TodoList todo = new TodoList();

        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Incomplete");
        toDoList.put("Task 2", "Incomplete");
        List<String> list = new ArrayList<>();

        Assertions.assertEquals(list, todo.completeTasks(toDoList));
    }

    @Test
    public void incompleteTasksInList() {
        TodoList todo = new TodoList();

        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Completed");
        toDoList.put("Task 2", "Incomplete");
        List<String> list = new ArrayList<>();
        list.add("Task 2");

        Assertions.assertEquals(list, todo.inCompleteTasks(toDoList));
    }

    @Test
    public void noIncompleteTasks() {
        TodoList todo = new TodoList();

        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Completed");
        toDoList.put("Task 2", "Completed");
        List<String> list = new ArrayList<>();

        Assertions.assertEquals(list, todo.inCompleteTasks(toDoList));
    }

    @Test
    public void searchTaskNotFoundSuccessful() {
        TodoList todo = new TodoList();
        Map<String,String> completeTask = new HashMap<>();

        Assertions.assertTrue(todo.searchTaskNotFound(completeTask, "Task 1"));
    }

    @Test
    public void searchTaskNotFoundNoPrint() {
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Completed");

        Assertions.assertFalse(todo.searchTaskNotFound(toDoList, "Task 1"));
    }

    @Test
    public void removeTaskSuccessful(){
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Completed");

        Assertions.assertTrue(todo.removeTask(toDoList, "Task 1"));
    }

    @Test
    public void removeTaskUnsuccessful(){
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("Task 1", "Completed");

        Assertions.assertFalse(todo.removeTask(toDoList, "Task 2"));
    }

    @Test
    public void sortedAscendingList(){
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("B", "Completed");
        toDoList.put("A", "Completed");
        toDoList.put("D", "Incomplete");
        toDoList.put("C", "Completed");
        Map<String,String> toDoSortedAscending = todo.sortAscending(toDoList);

        Assertions.assertEquals("{A=Completed, B=Completed, C=Completed, D=Incomplete}", toDoSortedAscending.toString());
    }

    @Test
    public void sortedAscendingListEmpty(){
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();

        Assertions.assertEquals(toDoList, todo.sortAscending(toDoList));

    }
    @Test
    public void sortedDescendingList(){
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        toDoList.put("B", "Completed");
        toDoList.put("A", "Completed");
        toDoList.put("D", "Incomplete");
        toDoList.put("C", "Completed");

        Map<String,String> toDoDescending = todo.sortDescending(toDoList);
        Assertions.assertEquals("{D=Incomplete, C=Completed, B=Completed, A=Completed}", toDoDescending.toString());

    }

    @Test
    public void sortedDescendingListEmpty(){
        TodoList todo = new TodoList();
        Map<String,String> toDoList = new HashMap<>();
        Assertions.assertEquals(toDoList, todo.sortDescending(toDoList));

    }


}
