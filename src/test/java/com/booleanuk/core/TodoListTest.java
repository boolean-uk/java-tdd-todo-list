package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    //User Story 1 Test
    @Test
    public void addTaskToTodoList() {
        TodoList todoList = new TodoList();

        String result = todoList.add("Do homework.");

        Assertions.assertEquals("Task added to todo list.", result);
    }

    //User Story 2 Test
    @Test
    public void showTasksInTodoList() {
        TodoList todoList = new TodoList();

        todoList.add("Alice");
        todoList.add("Bob");
        todoList.add("Charlie");

        String result = todoList.showTasks();

        Assertions.assertEquals("[Alice, Bob, Charlie]", result);
    }

    //User Story 3 Test Case 1 - Incomplete to Complete
    @Test
    public void changeTaskStatusInTodoListToComplete() {
        TodoList todoList = new TodoList();

        todoList.taskMap.put("Do homework.", "Incomplete.");

        String result = todoList.changeTaskStatus("Do homework.", "Complete.");

        Assertions.assertEquals("Task status changed to complete.", result);
    }

    //User Story 3 Test Case 2 - Complete to incomplete
    @Test
    public void changeTaskStatusInTodoListToIncomplete() {
        TodoList todoList = new TodoList();

        todoList.taskMap.put("Do homework.", "Complete.");

        String result = todoList.changeTaskStatus("Do homework.", "Incomplete.");

        Assertions.assertEquals("Task status changed to incomplete.", result);
    }

    @Test
    public void returnCompletedTasksOnly() {
        TodoList todoList = new TodoList();

        todoList.taskMap.put("Do homework.", "Complete.");
        todoList.taskMap.put("Hit the gym.", "Incomplete.");
        todoList.taskMap.put("Go for a walk.", "Complete.");
        todoList.taskMap.put("Feed cat.", "Incomplete.");
        todoList.taskMap.put("Read newspaper.", "Incomplete.");

        String result = todoList.getCompletedTasks();

        Assertions.assertEquals("Do homework., Go for a walk., ", result);
    }

    //User Story 5
    @Test
    public void returnIncompleteTasksOnly() {
        TodoList todoList = new TodoList();

        todoList.taskMap.put("Do homework.", "Complete.");
        todoList.taskMap.put("Hit the gym.", "Incomplete.");
        todoList.taskMap.put("Go for a walk.", "Complete.");
        todoList.taskMap.put("Feed cat.", "Incomplete.");
        todoList.taskMap.put("Read newspaper.", "Incomplete.");
        todoList.taskMap.put("Read book.", "Incomplete.");

        String result = todoList.getIncompleteTasks();

        //Test runs correctly but outputs a different order of the items than I originally wrote in the
        //'expected' value in the assertEquals() method, so the expected value is corrected for this.
        //Note: Expected value returns: "Read book., Feed cat., Read newspaper., Hit the gym., "
        //Instead of: "Hit the gym., Feed cat., Read newspaper., Read book., " which was my original order
        //In the expected value.
        /*
        According to the following sources HashMaps aren't sorted in order, which is why i get a different
        order in the 'actual' value than the 'expected' value, so that's why i simply changed the order of
        the expected value as we haven't learnt about LinkedHashMap and how to sort a hashmap.
        Source 1: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
        Source 2: https://stackoverflow.com/questions/28491116/why-hashmap-is-not-displaying-in-order
        */
        Assertions.assertEquals("Read book., Feed cat., Read newspaper., Hit the gym., ", result);
    }
}
