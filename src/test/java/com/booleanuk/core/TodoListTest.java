package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

class TodoListTest {

    @Test
    public void addingTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("Take out the garbage");

        Assertions.assertTrue(todoList.add(task));
        Assertions.assertFalse(todoList.add(task));
    }

    @Test
    public void viewAllTasks() {
        TodoList todoList = new TodoList();
        ArrayList<Task> empty = new ArrayList<>();
        Assertions.assertIterableEquals(empty, todoList.viewTasks());

        Task task = new Task("Take out the garbage");
        todoList.add(task);
        empty.add(task);

        Assertions.assertIterableEquals(empty, todoList.viewTasks());
    }

    @Test
    public void checkViewAllIncompleteTasks() {
        TodoList todoList = new TodoList();

        Task task = new Task("Take out the garbage");
        Task taskComplete = new Task("Take out the garbage");
        taskComplete.setComplete(true);
        todoList.add(taskComplete);
        todoList.add(task);

        Assertions.assertNotEquals(todoList.viewTasks(), todoList.viewIncompleteTasks());
    }

    @Test
    public void checkViewAllCompleteTasks() {
        TodoList todoList = new TodoList();

        Task task = new Task("Take out the garbage");
        Task taskComplete = new Task("Take out the garbage");
        taskComplete.setComplete(true);
        todoList.add(task);
        todoList.add(taskComplete);

        Assertions.assertNotEquals(todoList.viewTasks(), todoList.viewCompleteTasks());
    }

    @Test
    public void searchForTask() {
        TodoList todoList = new TodoList();

        Task task = new Task("Take out the garbage");
        Assertions.assertNotEquals(task, todoList.search(task));

        todoList.add(task);

        Assertions.assertEquals(task, todoList.search(task));
    }

    @Test
    public void removeTaskFromTodoList() {
        TodoList todoList = new TodoList();

        int numOfTasks = todoList.viewTasks().size();

        Task task = new Task("Take out the garbage");
        todoList.add(task);

        Assertions.assertNotEquals(numOfTasks, todoList.viewTasks().size());

        todoList.remove(task);

        Assertions.assertEquals(numOfTasks, todoList.viewTasks().size());
    }

    @Test
    public void viewTasksAlphabeticallyAsc() {
        TodoList todoList = new TodoList();
        ArrayList<Task> testTaskList = new ArrayList<>();
        ArrayList<String> alphabeticalAsc = new ArrayList<>();

        Task task = new Task("A");
        Task task2 = new Task("Z");
        Task task3 = new Task("D");

        todoList.add(task);
        todoList.add(task2);
        todoList.add(task3);

        testTaskList.add(task);
        testTaskList.add(task2);
        testTaskList.add(task3);

        for(int i = 0; i < testTaskList.size(); i++) {
            alphabeticalAsc.add(testTaskList.get(i).getName());
        }

        alphabeticalAsc.sort(null);

        Assertions.assertEquals(alphabeticalAsc, todoList.viewAlphabeticalAsc());
    }

    @Test
    public void viewTasksAlphabeticallyDesc() {
        TodoList todoList = new TodoList();
        ArrayList<Task> testTaskList = new ArrayList<>();
        ArrayList<String> alphabeticalAsc = new ArrayList<>();

        Task task = new Task("A");
        Task task2 = new Task("Z");
        Task task3 = new Task("D");

        todoList.add(task);
        todoList.add(task2);
        todoList.add(task3);

        testTaskList.add(task);
        testTaskList.add(task2);
        testTaskList.add(task3);

        for(int i = 0; i < testTaskList.size(); i++) {
            alphabeticalAsc.add(testTaskList.get(i).getName());
        }

        alphabeticalAsc.sort(Comparator.reverseOrder());

        Assertions.assertEquals(alphabeticalAsc, todoList.viewAlphabeticalDesc());
    }

}
