package com.booleanuk.extension;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class TodoListExtendedTest {
    @Test
    public void addTaskGetAllTasks() {
        TodoList todoList = new TodoList();

        Task task1 = new Task(0, "Create domain model", "Turn user stories into domain model", false);
        Task task2 = new Task(1, "Fork repo", "Go to Github repo and click fork", false);

        todoList.addTask(task1);
        todoList.addTask(task2);

        List<Task> allTasks = todoList.getAllTasks();

        assertEquals(2, allTasks.size());
        assertTrue(allTasks.contains(task1));
        assertTrue(allTasks.contains(task2));
    }
    @Test
    public void returnAllCompletedTasks() {
        TodoList todoList = new TodoList();
        Task task1 = new Task(0, "Create domain model", "Turn user stories into domain model", true);
        Task task2 = new Task(1, "Fork repo", "Go to Github repo and click fork", false);
        Task task3 = new Task(2, "Create diagram", "Visualizes classes", false);

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        assertTrue(todoList.getCompleteTasks().contains(task1));
        assertEquals(task1, todoList.getCompleteTasks().get(0));
    }
    @Test
    public void returnAllIncompletedTasks(){
        TodoList todoList = new TodoList();
        Task task1 = new Task(0, "Create domain model", "Turn user stories into domain model", true);
        Task task2 = new Task(1, "Fork repo", "Go to Github repo and click fork", false);
        Task task3 = new Task(2, "Create diagram", "Visualizes classes", false);

        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);

        assertEquals(2, todoList.getIncompleteTasks().size());
        assertTrue(todoList.getIncompleteTasks().contains(task2));
        assertTrue(todoList.getIncompleteTasks().contains(task3));
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
        Task task3 = new Task(2, "Create diagram", "Visualizes classes", false);
        Task task2 = new Task(1, "Create domain model", "Turn user stories into domain model", false);

        todoList.addTask(task1);
        todoList.addTask(task3);
        todoList.addTask(task2);

        assertEquals(task3, todoList.getAlphabeticalTasks(true).get(0));
        assertEquals(task1, todoList.getAlphabeticalTasks(false).get(0));
    }

    @Test
    void changeTaskStatus() {
        TodoList todoList = new TodoList();
        Task task1 = new Task(0, "Fork repo", "Go to Github repo and click fork", false);
        todoList.addTask(task1);

        assertFalse(task1.getStatus());
        todoList.changeTaskStatus(task1, true);
        assertTrue(task1.getStatus());
    }
    @Test
    void getTaskById() {
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Fork repo", "Go to Github repo and click fork", false);
        todoList.addTask(task);

        assertEquals(task, todoList.getTaskById(1));
        assertNull(todoList.getTaskById(2));
    }

    @Test
    void updateTaskNameById() {
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Fork repo", "Go to Github repo and click fork", false);
        todoList.addTask(task);

        todoList.setTask(1, "Updated Fork repo");
        assertEquals("Updated Fork repo", task.getTitle());
    }

    @Test
    void changeTaskStatusById() {
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Fork repo", "Go to Github repo and click fork", false);
        todoList.addTask(task);

        todoList.changeTaskStatusById(1, true);
        assertTrue(task.getStatus());
    }
    @Test
    void getCreationDateTime() {
        TodoList todoList = new TodoList();
        Task task = new Task(1, "Fork repo", "Go to Github repo and click fork", false);
        todoList.addTask(task);

        LocalDateTime creationDateTime = task.getCreationDateTime();

        assertNotNull(creationDateTime);
        assertTrue(creationDateTime.isBefore(LocalDateTime.now()));
    }


}
