package com.booleanuk.core;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class TodoListTest {
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
    public void addTaskReturnTrue() {
        Assertions.assertTrue(todoList.add(taskComplete));
    }

    @Test
    public void addTaskReturnFalse() {
        todoList.add(taskComplete);
        Assertions.assertFalse(todoList.add(taskComplete));
    }

    @Test
    public void getTaskReturnEmptyList() {
        List<Task> result = todoList.getTasks() ;

        Assertions.assertEquals(0, result.size());
    }

    @Test
    public void getCompleteTaskReturnEmptyList() {
        List<Task> result = todoList.getCompleteTasks();

        Assertions.assertEquals(0, result.size());
    }

    @Test
    public void getCompleteTaskReturnList() {
        todoList.add(taskComplete);
        List<Task> result = todoList.getCompleteTasks();

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(todoList.tasks.get(0).status, Status.COMPLETE);
    }

    @Test
    public void getInCompleteTaskReturnEmptyList() {
        List<Task> result = todoList.getIncompleteTasks();

        Assertions.assertEquals(0, result.size());
    }

    @Test
    public void getInCompleteTaskReturnList() {
        todoList.add(taskIncomplete);
        List<Task> result = todoList.getIncompleteTasks();

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(todoList.tasks.get(0).status, Status.INCOMPLETE);
    }

    @Test
    public void searchTaskReturnFalseIfNotFound() {
        Assertions.assertEquals(todoList.search(taskComplete), "Task not found!");
    }

    @Test
    public void searchTaskReturnTaskIfFound() {
        todoList.add(taskComplete);

        Assertions.assertEquals(todoList.search(taskComplete), "Dishes");
    }

    @Test
    public void removeTaskReturnTrue() {
        todoList.add(taskComplete);
        Assertions.assertTrue(todoList.remove(taskComplete));
    }
    @Test
    public void removeTaskReturnFalse() {
        Assertions.assertFalse(todoList.remove(taskComplete));
    }

    @Test
    public void getTasksInAscendingOrderReturnListInAscendingOrder(){
        todoList.add(new Task("A"));
        todoList.add(new Task("C"));
        todoList.add(new Task("B"));
        todoList = todoList.getTaskInAscOrder();


        Assertions.assertEquals("A", todoList.getTasks().get(0));
        Assertions.assertEquals("B", todoList.getTasks().get(1));
        Assertions.assertEquals("C", todoList.getTasks().get(2));
    }


}
