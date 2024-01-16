package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskTest() {
        TodoList todoList = new TodoList();

        Assertions.assertTrue(todoList.addTask(new Task("Do laundry", false)));
        Assertions.assertTrue(todoList.addTask(new Task("Walk dog", true)));
        Assertions.assertTrue(todoList.addTask(new Task("Clean Kitchen")));

        Assertions.assertEquals("Do laundry", todoList.tasks.get(0).name);
        Assertions.assertFalse(todoList.tasks.get(0).complete);
        Assertions.assertEquals("Walk dog", todoList.tasks.get(1).name);
        Assertions.assertTrue(todoList.tasks.get(1).complete);
        Assertions.assertEquals("Clean Kitchen", todoList.tasks.get(2).name);
        Assertions.assertFalse(todoList.tasks.get(2).complete);

    }

    @Test
    public void showTasksTest() {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task("Do laundry", false));
        todoList.addTask(new Task("Walk dog", true));

        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(new Task("Do laundry", false));
        listOfTasks.add(new Task("Walk dog", true));

        for(int i = 0; i < todoList.tasks.size(); i++) {
            Assertions.assertEquals(listOfTasks.get(i).name, todoList.tasks.get(i).name);
            Assertions.assertEquals(listOfTasks.get(i).complete, todoList.tasks.get(i).complete);
        }

    }

    @Test
    public void getCompleteTasksTest() {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task("Do laundry", false));
        todoList.addTask(new Task("Walk dog", true));
        todoList.addTask(new Task("Clean Kitchen"));
        todoList.addTask(new Task("Turn on washing machine", true));
        ArrayList<Task> completeTasks = todoList.getCompleteTasks();
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(new Task("Walk dog", true));
        listOfTasks.add(new Task("Turn on washing machine", true));


        for(int i = 0; i < completeTasks.size(); i++) {
            Assertions.assertEquals(listOfTasks.get(i).name, completeTasks.get(i).name);
            Assertions.assertEquals(listOfTasks.get(i).complete, completeTasks.get(i).complete);
        }
    }

    @Test
    public void getIncompleteTasksTest() {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task("Do laundry", false));
        todoList.addTask(new Task("Walk dog", true));
        todoList.addTask(new Task("Clean Kitchen"));
        todoList.addTask(new Task("Turn on washing machine", true));
        ArrayList<Task> incompleteTasks = todoList.getIncompleteTasks();
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(new Task("Do laundry", false));
        listOfTasks.add(new Task("Clean Kitchen"));

        for(int i = 0; i < incompleteTasks.size(); i++) {
            Assertions.assertEquals(listOfTasks.get(i).name, incompleteTasks.get(i).name);
            Assertions.assertEquals(listOfTasks.get(i).complete, incompleteTasks.get(i).complete);
        }
    }

    @Test
    public void searchTasksTest() {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task("Do laundry", false));
        todoList.addTask(new Task("Walk dog", true));
        todoList.addTask(new Task("Clean Kitchen"));
        todoList.addTask(new Task("Turn on washing machine", true));


        Assertions.assertEquals("Found result for Walk dog", todoList.searchTasks("Walk dog"));
        Assertions.assertEquals("No results for Mow lawn", todoList.searchTasks("Mow lawn"));

    }

    @Test
    public void removeTaskTest() {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task("Do laundry", false));
        todoList.addTask(new Task("Walk dog", true));
        todoList.addTask(new Task("Clean Kitchen"));
        todoList.addTask(new Task("Turn on washing machine", true));

        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(new Task("Do Laundry"));
        listOfTasks.add(new Task("Walk dog", true));
        listOfTasks.add(new Task("Turn on washing machine", true));

        Assertions.assertTrue(todoList.removeTask("Clean Kitchen"));
        for(int i = 0; i < todoList.tasks.size(); i++) {
            Assertions.assertEquals(listOfTasks.get(i).name, todoList.tasks.get(i).name);
            Assertions.assertEquals(listOfTasks.get(i).complete, todoList.tasks.get(i).complete);
        }
    }

}
