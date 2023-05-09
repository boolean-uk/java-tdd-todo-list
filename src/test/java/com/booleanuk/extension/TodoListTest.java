package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TodoListTest {

    @Test
    public void testSearchByID() {
        TodoList list = new TodoList();

        Task task1 = new Task("Go swimming", false);
        list.tasks.add(task1);
        System.out.println(task1.id);
        Assertions.assertEquals(null, list.searchByID("123"));
        Assertions.assertEquals(task1, list.searchByID(task1.id));
    }

    @Test
    public void testUpdateTaskName() {
        TodoList list = new TodoList();

        Task task1 = new Task("Go swimming", false);
        Task task2 = new Task("Walk the dog", true);

        list.tasks.add(task1);
        list.tasks.add(task2);

        list.updateTaskName(task2.id, "Walk the cat");
        Assertions.assertEquals("Walk the cat", list.tasks.get(1).name);

        Assertions.assertFalse(list.updateTaskName("123", "Walk the cat"));

    }


    @Test
    public void testUpdateTaskStatus(){
        TodoList list = new TodoList();

        Task task1 = new Task("Go swimming", false);
        Task task2 = new Task("Walk the dog", true);

        list.tasks.add(task1);
        list.tasks.add(task2);


        Assertions.assertFalse(list.updateTask("invalid-id"));

        list.updateTask(task1.id);
        Assertions.assertTrue(list.tasks.get(0).completed);

    }

    @Test
    public void testDisplayAllTaskDetails(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        TodoList list = new TodoList();


        Assertions.assertEquals("No tasks were found.", list.displayAllTaskDetails());

        Task task1 = new Task("Go swimming", false);
        Task task2 = new Task("Walk the dog", true);

        list.tasks.add(task1);
        list.tasks.add(task2);

        String testResult = "Go swimming, incomplete, " + dtf.format(task1.dateCreated) + "\n" + "Walk the dog, complete, " + dtf.format(task2.dateCreated) + "\n";

        Assertions.assertEquals(testResult, list.displayAllTaskDetails());


    }

    @Test
    public void testDisplayTaskDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        TodoList list = new TodoList();

        Task task1 = new Task("Go swimming", false);
        Task task2 = new Task("Walk the dog", true);

        list.tasks.add(task1);
        list.tasks.add(task2);

        String testResult = "This task does not exist";

        Assertions.assertEquals(testResult, list.displayTaskDateTime("invalid-id"));

        testResult = dtf.format(task2.dateCreated);
        Assertions.assertEquals(testResult, list.displayTaskDateTime(task2.id));
    }

}
