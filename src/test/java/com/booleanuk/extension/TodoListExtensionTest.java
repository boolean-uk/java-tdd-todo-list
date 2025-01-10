package com.booleanuk.extension;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {
    @Test
    void testGetAll() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("task3");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        ArrayList<Task> tasks = todoList.getAll();

        Assertions.assertEquals(tasks.get(0), task1);
        Assertions.assertEquals(tasks.get(1), task2);
        Assertions.assertEquals(tasks.get(2), task3);
    }

    @Test
    void testAddTask() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("task1");

        Assertions.assertEquals(task1, todoList.addTask(task1).get(0));
    }

    @Test
    void testCompleteTask() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("task1");
        todoList.addTask(task1);
        todoList.completeTask("task1");

        Assertions.assertTrue(todoList.getAll().get(0).isComplete());
    }

    @Test
    void testGetCompleted() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("task3");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        todoList.completeTask("task1");

        ArrayList<Task> completed = todoList.getCompleted();

        Assertions.assertEquals("task1", completed.get(0).getName());
        Assertions.assertEquals(1, completed.size());
    }

    @Test
    void testGetIncompleted() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("task3");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        todoList.completeTask("task1");

        ArrayList<Task> incompleted = todoList.getIncompleted();

        Assertions.assertEquals("task2", incompleted.get(0).getName());
        Assertions.assertEquals("task3", incompleted.get(1).getName());
        Assertions.assertEquals(2, incompleted.size());
    }

    @Test
    void testSearch() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("task3");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        Assertions.assertTrue(todoList.search("task1"));
        Assertions.assertFalse(todoList.search("task0"));
    }

    @Test
    void testGetAllAscending() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");

        todoList.addTask(task1);
        todoList.addTask(task3);
        todoList.addTask(task2);

        ArrayList<Task> tasks = todoList.getAllAscending();

        Assertions.assertEquals("a", tasks.get(0).getName());
        Assertions.assertEquals("b", tasks.get(1).getName());
        Assertions.assertEquals("c", tasks.get(2).getName());
    }

    @Test
    void testGetAllDescending() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        ArrayList<Task> tasks = todoList.getAllDescending();

        Assertions.assertEquals("c", tasks.get(0).getName());
        Assertions.assertEquals("b", tasks.get(1).getName());
        Assertions.assertEquals("a", tasks.get(2).getName());
    }

    @Test
    void testRemoveTask() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);


        Assertions.assertEquals("b", todoList.removeTask("b").getName());

        ArrayList<Task> tasks = todoList.getAll();

        Assertions.assertEquals(2, tasks.size());
    }

    @Test
    void testRemoveTaskThatDoesNotExist() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals(null, todoList.removeTask("task1"));
    }

    @Test
    void testGetExistingTaskId() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a", 1);
        Task task2 = new Task("b", 2);
        Task task3 = new Task("c", 3);

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        Assertions.assertEquals("b", todoList.getTaskId(2).getName());
    }

    @Test
    void testGetNonExistingTaskId() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a", 1);
        Task task2 = new Task("b", 2);
        Task task3 = new Task("c", 3);

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        Assertions.assertEquals(null, todoList.getTaskId(4));
    }

    @Test
    void testChangeExistingTaskName() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        Assertions.assertEquals("d", todoList.changeTaskName(task3.getId(), "d").getName());
    }

    @Test
    void testChangeNonExistingTaskName() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a", 1);
        Task task2 = new Task("b", 2);
        Task task3 = new Task("c", 3);

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        Assertions.assertEquals(null, todoList.changeTaskName(4, "d"));
    }

    @Test
    void testSetExistingTaskStatus() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        Assertions.assertTrue(todoList.setTaskStatus(true, task2.getId()).isComplete());
        Assertions.assertFalse(todoList.setTaskStatus(false, task2.getId()).isComplete());
    }
    @Test

    void testSetNonExistingTaskStatus() {
        TodoList todoList = new TodoList();

        Task task1 = new Task("a", 1);
        Task task2 = new Task("b", 2);
        Task task3 = new Task("c", 3);

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        Assertions.assertEquals(null, todoList.setTaskStatus(true, 4));
    }
}
