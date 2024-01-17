package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TodoListTest {
    @Test
    public void addTaskGetAllTasks() {
        TodoList todoList = new TodoList();

        Task task1 = new Task(0, "Create domain model", "Turn user stories into domain model", false);
        Task task2 = new Task(1, "Fork repo", "Go to Github repo and click fork", false);
        todoList.addTask(task1);
        todoList.addTask(task2);

        Assertions.assertEquals(1, todoList.getAllTasks().size());
        Assertions.assertEquals(task2, todoList.getAllTasks().get(1));
    }
    @Test
    public void returnAllCompletedTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task(0, "Create domain model", "Turn user stories into domain model", true);
        Task task2 = new Task(1, "Fork repo", "Go to Github repo and click fork", false);

        assertEquals(1, todoList.getCompleteTasks().size());
        assertEquals(task2, todoList.getCompleteTasks().get(0));
    }
    @Test
    public void returnAllIncompletedTasks(){
        TodoList todoList = new TodoList();
        Task task1 = new Task(0, "Create domain model", "Turn user stories into domain model", true);
        Task task2 = new Task(1, "Fork repo", "Go to Github repo and click fork", false);

        todoList.addTask(task1);
        todoList.addTask(task2);

        assertEquals(1, todoList.getIncompleteTasks().size());
        assertEquals(task1, todoList.getIncompleteTasks().get(0));
    }

    @Test
    void searchTask() {
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Fork repo", "Go to Github repo and click fork", false);
        todoList.addTask(task);

        assertEquals(task, todoList.searchTask("Fork repo"));
        assertNull(todoList.searchTask("Nonexistent Task"));
    }

    @Test
    void removeTask() {
        TodoList todoList = new TodoList();
        Task task1 = new Task(0, "Fork repo", "Go to Github repo and click fork", false);
        todoList.addTask(task1);

        todoList.removeTask(task1);
        assertEquals(0, todoList.getAllTasks().size());
    }

    @Test
    void getAlphabeticalTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task(0, "Fork repo", "Go to Github repo and click fork", false);
        Task task2 = new Task(1, "Create domain model", "Turn user stories into domain model", false);
        Task task3 = new Task(2, "Create diagram", "Visualizes classes", false);

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        assertEquals(task2, todoList.getAlphabeticalTasks(true).get(0));
        assertEquals(task1, todoList.getAlphabeticalTasks(false).get(0));
    }

    @Test
    void changeTaskStatus() {
        TodoList todoList = new TodoList();
        Task task1 = new Task(0, "Fork repo", "Go to Github repo and click fork", false);
        Task task2 = new Task(1, "Create domain model", "Turn user stories into domain model", false);
        Task task3 = new Task(2, "Create diagram", "Visualizes classes", false);
        todoList.addTask(task1);

        todoList.changeTaskStatus(task1, true);
        assertTrue(task1.isStatus());
    }

}
