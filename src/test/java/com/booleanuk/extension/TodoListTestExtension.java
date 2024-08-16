package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TodoListTestExtension {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    TodoList todoList = new TodoList();

    @Test
    public void testAdd(){
        Task taskOne = new Task("taskOne");
        Assertions.assertEquals("taskOne added.", todoList.add(taskOne));
        Assertions.assertTrue(todoList.tasks.contains(taskOne));
    }

    @Test
    public void testSeeTasks(){
        Task taskOne = new Task("taskOne");
        Task taskTwo = new Task("taskTwo");
        todoList.add(taskOne);
        todoList.add(taskTwo);
        Assertions.assertEquals("taskOne incomplete, taskTwo incomplete", todoList.seeTasks());
    }

    @Test
    public void testChangeStatus(){
        Task taskOne = new Task("taskOne");
        Task taskTwo = new Task("taskTwo");
        todoList.add(taskOne);
        Assertions.assertTrue(todoList.changeStatus(taskOne));
        Assertions.assertFalse(todoList.changeStatus(taskOne));
        //Assertions.assertFalse(todoList.changeStatus(taskOne));
        Assertions.assertFalse(todoList.changeStatus(taskTwo));
        //Assertions.fail(todoList.changeStatus(taskTwo));
    }

    @Test
    public void testSeeCompletedTasks(){
        Task taskOne = new Task("taskOne");
        Task taskTwo = new Task("taskTwo");
        Task taskThree = new Task("taskThree");
        todoList.add(taskOne);
        todoList.add(taskTwo);
        todoList.add(taskThree);
        todoList.changeStatus(taskOne);
        todoList.changeStatus(taskThree);
        Assertions.assertEquals("taskOne, taskThree", todoList.seeCompletedTasks());
    }

    @Test
    public void testSeeTasksIncomplete(){
        Task taskOne = new Task("taskOne");
        Task taskTwo = new Task("taskTwo");
        Task taskThree = new Task("taskThree");
        todoList.add(taskOne);
        todoList.add(taskTwo);
        todoList.add(taskThree);
        todoList.changeStatus(taskOne);
        todoList.changeStatus(taskThree);
        Assertions.assertEquals("taskTwo, ", todoList.seeIncompleteTasks());
    }

    @Test
    public void testSearch(){
        Task taskOne = new Task("taskOne");
        todoList.add(taskOne);
        Assertions.assertEquals("taskOne incomplete", todoList.search("taskOne"));
        Assertions.assertEquals("Task not found", todoList.search("taskTwo"));
    }

    @Test
    public void testRemove(){
        Task taskOne = new Task("taskOne");
        Assertions.assertEquals("Task not found", todoList.remove(taskOne));
        todoList.add(taskOne);
        Assertions.assertTrue(todoList.tasks.contains(taskOne));
        Assertions.assertEquals("taskOne removed", todoList.remove(taskOne));
        Assertions.assertFalse(todoList.tasks.contains(taskOne));
    }

    @Test
    public void testSeeTasksAscending(){
        Task taskA = new Task("taskA");
        Task taskB = new Task("taskB");
        Task taskC = new Task("taskC");
        todoList.add(taskC);
        todoList.add(taskA);
        todoList.add(taskB);
        Assertions.assertEquals("taskA taskB taskC", todoList.seeTasksAscending());
    }

    @Test
    public void testSeeTasksDescending(){
        Task taskA = new Task("taskA");
        Task taskB = new Task("taskB");
        Task taskC = new Task("taskC");
        todoList.add(taskC);
        todoList.add(taskA);
        todoList.add(taskB);
        Assertions.assertEquals("taskC taskB taskA", todoList.seeTasksDescending());
    }

    @Test
    public void testGetTaskById(){
        Task taskA = new Task("taskA");
        todoList.add(taskA);
        Assertions.assertEquals(taskA, todoList.getTaskById(taskA.getId()));
    }

    @Test
    public void testSetNameById(){
        Task taskA = new Task("taskA");
        todoList.add(taskA);
        Assertions.assertEquals("newName", todoList.setNameById(taskA.getId(), "newName"));
    }

    @Test
    public void testChangeStatusById(){
        Task taskA = new Task("taskA");
        todoList.add(taskA);
        Assertions.assertTrue(todoList.changeStatusById(taskA.getId()));
    }

    @Test
    public void testSeeDates(){
        Task taskA = new Task("taskA");
        Task taskB = new Task("taskB");
        todoList.add(taskA);
        todoList.add(taskB);
        Assertions.assertEquals("taskA " + LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString() +
                " taskB " + LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS).toString(), todoList.seeDates());
    }
}
