package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {

    @Test
    public void addTaskSuccessfullyTest() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("laundry", true);
        Assertions.assertTrue(todoList.addTask(newTask));
    }

    /*@Test
    public void addTaskUnsuccessfullyTest() {
        TodoList tasks = new TodoList();
        Task newTask = new Task("laundry", true);
        Assertions.assertTrue(tasks.addTask(newTask));
    }
    */

    @Test
    public void changeStatusSuccessfullyTest() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("laundry", true);
        todoList.addTask(newTask);
        Assertions.assertTrue(todoList.changeStatus(newTask));
    }

    @Test
    public void changeStatusUnsuccessfullyTest() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("laundry", true);
        todoList.addTask(newTask);
        Assertions.assertFalse(todoList.changeStatus(new Task("swimming", false)));
    }

    @Test
    public void getCompletedTasksTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("laundry", true);
        Task task2 = new Task("buy groceries", true);
        Task task3 = new Task("running", false);
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        ArrayList<Task> completeTasks = new ArrayList<>() {{
                add(task1);
                add(task2);
        }};
        Assertions.assertIterableEquals(completeTasks, todoList.getCompletedTasks());
    }

    @Test
    public void getIncompleteTasksTest() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("laundry", true);
        Task task2 = new Task("buy groceries", false);
        Task task3 = new Task("running", false);
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        ArrayList<Task> incompleteTasks = new ArrayList<>() {{
            add(task2);
            add(task3);
        }};
        Assertions.assertIterableEquals(incompleteTasks, todoList.getIncompleteTasks());
    }

    @Test
    public void getTaskSuccessfullyTest() {
        TodoList todoList = new TodoList();
        Task task = new Task("laundry", true);
        todoList.addTask(task);
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        Assertions.assertEquals(task.taskName, todoList.getTask("laundry").taskName);
        Assertions.assertEquals(task.isCompeted, todoList.getTask("laundry").isCompeted);
    }

    @Test
    public void getTaskUnsuccessfullyTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        Task task = new Task("fishing", false);
        Assertions.assertNotEquals(task, todoList.getTask("fishing"));
    }

    @Test
    public void removeTaskSuccessfullyTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        Assertions.assertTrue(todoList.removeTask("laundry"));
    }

    @Test
    public void removeTaskUnsuccessfullyTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        Assertions.assertFalse(todoList.removeTask("fishing"));
    }

    @Test
    public void getCorrectTaskByIdTest() {
        TodoList todoList = new TodoList();
        Task task = new Task("laundry", true);
        todoList.addTask(task);
        Assertions.assertEquals(task, todoList.getTaskByID(task.id));
    }

    @Test
    public void getIncorrectTaskByIdTest() {
        TodoList todoList = new TodoList();
        Task task = new Task("laundry", true);
        Task task2 = new Task("fishing", false);
        todoList.addTask(task);
        Assertions.assertNull(todoList.getTaskByID(task2.id));
    }

    @Test
    public void setTaskNameSuccessfullyByIdTest() {
        TodoList todoList = new TodoList();
        Task task = new Task("laundry", true);
        todoList.addTask(task);
        todoList.updateTaskNameByID(task.id, "Rowing");
        Assertions.assertEquals("Rowing", task.taskName);
    }

    @Test
    public void setStatusSuccessfullyByIdTest() {
        TodoList todoList = new TodoList();
        Task task = new Task("laundry", true);
        todoList.addTask(task);
        todoList.updateTaskStatusByID(task.id, false);
        Assertions.assertFalse(task.isCompeted);
    }
}
