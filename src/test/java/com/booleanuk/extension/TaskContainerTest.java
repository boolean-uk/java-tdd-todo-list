package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TaskContainerTest {

    @Test
    public void getTaskById() {
        TaskContainer taskContainer = new TaskContainer();

        String task1 = "Do the dishes";
        String task2 = "Wash the car";
        taskContainer.todolist.put(task1, "incomplete");
        taskContainer.todolist.put(task2, "complete");

        taskContainer.createMap();
        HashMap<String, String> task = taskContainer.getTaskById(1);

        Assertions.assertEquals(1, task.size());
        Assertions.assertEquals("incomplete", task.values().iterator().next());
        Assertions.assertEquals(task1, task.keySet().iterator().next());

        HashMap<String, String> taskk = taskContainer.getTaskById(99);
        Assertions.assertNull(taskk);
    }

    @Test
    public void updateTaskName() {
        TaskContainer taskContainer = new TaskContainer();

        String task1 = "Do the dishes";
        String task2 = "Wash the car";
        taskContainer.todolist.put(task1, "incomplete");
        taskContainer.todolist.put(task2, "complete");

        taskContainer.createMap();

        Assertions.assertFalse(taskContainer.updateTaskName(1, task1));
        Assertions.assertTrue(taskContainer.updateTaskName(1, "Go for a walk"));
    }

    @Test
    public void updateStatus() {
        TaskContainer taskContainer = new TaskContainer();

        String task1 = "Do the dishes";
        String task2 = "Wash the car";
        taskContainer.todolist.put(task1, "incomplete");
        taskContainer.todolist.put(task2, "complete");

        taskContainer.createMap();
        Assertions.assertFalse(taskContainer.updateStatus(1, "incomplete"));
        Assertions.assertTrue(taskContainer.updateStatus(1, "complete"));
    }
}
