package com.booleanuk.core;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

class TodoListTest {

    @Test
    public void checkGetCompleteTasks()
    {
        TodoList myList = new TodoList();

        myList.addTask("study for the exam");
        myList.addTask("clean house");
        myList.addTask("prepare dinner");

        // Mark tasks as completed
        myList.completeIncomplete("study for the exam");
        myList.completeIncomplete("clean house");

        // Check if it returns the correct number of completed tasks
        Assertions.assertEquals(2, myList.getCompleteTasks().size());
    }

    @Test
    public void checkGetIncompleteTasks()
    {
        TodoList myList = new TodoList();

        myList.addTask("study for the exam");
        myList.addTask("clean house");
        myList.addTask("prepare dinner");

        // Mark a task as completed
        myList.completeIncomplete("study for the exam");

        // Check if it returns the correct number of incomplete tasks
        Assertions.assertEquals(2, myList.getIncompleteTasks().size());
    }

    @Test
    public void checkRemoveTaskNotFound()
    {
        TodoList myList = new TodoList();

        myList.addTask("study for the exam");
        myList.addTask("clean house");
        myList.addTask("prepeare dinner");

        Assertions.assertEquals(3, myList.getTodoList().size());

        myList.removeTask("vacuum");

        Assertions.assertEquals(3, myList.getTodoList().size());
    }

    @Test
    public void checkRemoveTask()
    {
        TodoList myList = new TodoList();

        myList.addTask("study for the exam");
        myList.addTask("clean house");
        myList.addTask("prepare dinner");

        Assertions.assertEquals(3, myList.getTodoList().size());

        myList.removeTask("study for the exam");

        Assertions.assertEquals(2, myList.getTodoList().size());
        Assertions.assertNull(myList.getTodoList().get("study for the exam"));
    }
}
