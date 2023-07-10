package com.booleanuk.extension;

import com.booleanuk.extension.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoListTest {

    TodoList todoList;
    Task taskComplete;
    Task taskIncomplete;

    @BeforeEach
    public void setup() {
        todoList = new TodoList();
        taskComplete = new Task(Status.COMPLETE,"Dishes");
        taskIncomplete = new Task(Status.INCOMPLETE,"Dishes");
    }

    @AfterEach
    public void empty() {
        todoList.tasks.clear();
    }

    @Test
    public void getTaskWithIdReturnTaskIfExists(){
        todoList.add(taskComplete);
        Assertions.assertTrue(todoList.getTask(taskComplete.ID).isPresent());
        Assertions.assertEquals(todoList.getTask(taskComplete.ID).get(), taskComplete);
    }
    @Test
    public void getTaskWithIdReturnFalseIfNotExists(){

        Assertions.assertFalse(todoList.getTask(taskComplete.ID).isPresent());
    }

    @Test
    public void updateTaskUsingId(){
        String beforeUpdateTaskDescription = taskComplete.description;
        todoList.add(taskComplete);
        todoList.updateTask(taskComplete.ID, "New description");
        String afterUpdateTaskDescription = taskComplete.description;

        Assertions.assertNotEquals(beforeUpdateTaskDescription, afterUpdateTaskDescription);
        Assertions.assertEquals("New description", afterUpdateTaskDescription);
    }


}
