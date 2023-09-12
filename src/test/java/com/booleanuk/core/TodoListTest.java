package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAddTaskSuccessful() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.tasks.containsKey("Feed the cat"));
        Assertions.assertFalse(todoList.tasks.get("Feed the cat"));
    }

    @Test
    public void testAddTaskFailed() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.tasks.containsKey("Feed the cat"));
        Assertions.assertFalse(todoList.addTask("Feed the cat"));
    }

    @Test
    public void testAddTaskFailsBecauseEmptyString() {
        TodoList todoList = new TodoList();
        Assertions.assertFalse(todoList.addTask("\n\r\t"));
        Assertions.assertEquals(0, todoList.tasks.size());
    }

    @Test
    public void testGetTasksWhenMapNotEmpty() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        String taskTwo = "Go shopping";
        todoList.addTask(taskOne);
        todoList.addTask(taskTwo);
        Assertions.assertEquals(String.format("Tasks: %s, %s", taskOne, taskTwo), todoList.getTasks());
    }

    @Test
    public void testGetTasksWhenMapIsEmpty() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("No tasks in your list yet!", todoList.getTasks());
    }

    @Test
    public void testChangeTaskStatusWithValidTask() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        Assertions.assertFalse(todoList.tasks.get(taskOne));
        Assertions.assertEquals(String.format("Task '%s' is now set to %s.",
                taskOne,"complete"),
                todoList.changeTaskStatus(taskOne));
        Assertions.assertTrue(todoList.tasks.get(taskOne));

    }

    @Test
    public void testChangeTaskStatusWithInvalidTask() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        String taskTwo = "Go shopping";
        todoList.addTask(taskOne);
        Assertions.assertEquals("Couldn't update status, task doesn't exist",
                todoList.changeTaskStatus(taskTwo));
    }

    @Test
    public void testGetCompleteTasksSuccessful() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        todoList.changeTaskStatus(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        Assertions.assertTrue(todoList.tasks.get(taskOne));
        Assertions.assertEquals("Feed the cat",todoList.getCompletedTasks());
        todoList.changeTaskStatus(taskTwo);
        Assertions.assertEquals("Feed the cat, Go shopping",todoList.getCompletedTasks());
    }

    @Test
    public void testGetCompleteTasksIsEmpty() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        Assertions.assertEquals("No completed tasks",todoList.getCompletedTasks());
    }
    @Test
    public void testGetIncompleteTasksSuccessful() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        todoList.changeTaskStatus(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        Assertions.assertEquals("Go shopping",todoList.getIncompleteTasks());
        todoList.changeTaskStatus(taskOne);
        Assertions.assertEquals("Feed the cat, Go shopping",todoList.getIncompleteTasks());
    }

    @Test
    public void testGetIncompleteTasksIsEmpty() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        todoList.changeTaskStatus(taskOne);
        todoList.changeTaskStatus(taskTwo);

        Assertions.assertEquals("No incomplete tasks",todoList.getIncompleteTasks());
    }
    @Test
    public void testSearchForValidTask() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        Assertions.assertEquals(String.format("Task %s is %s.",taskOne,todoList.tasks.get(taskOne)?"complete":"incomplete"),todoList.searchForTask(taskOne));

    }
    @Test
    public void testSearchForNonexistentTask() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        Assertions.assertEquals("No such task",todoList.searchForTask(taskTwo));
    }

    @Test
    public void testRemoveValidTask() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        Assertions.assertEquals(2, todoList.tasks.size());
        Assertions.assertTrue(todoList.removeTask(taskOne));
        Assertions.assertEquals(1, todoList.tasks.size());
    }
    @Test
    public void testRemoveValidTask() {
        TodoList todoList = new TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertFalse(todoList.removeTask(taskTwo));

    }
}
