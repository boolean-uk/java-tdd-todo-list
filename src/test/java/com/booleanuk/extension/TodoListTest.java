package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAddTaskSuccessful() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.tasks.containsKey("Feed the cat"));
        Assertions.assertFalse(todoList.tasks.get("Feed the cat"));
    }

    @Test
    public void testAddTaskFailed() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.tasks.containsKey("Feed the cat"));
        Assertions.assertFalse(todoList.addTask("Feed the cat"));
    }

    @Test
    public void testAddTaskFailsBecauseEmptyString() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        Assertions.assertFalse(todoList.addTask("\n\r\t"));
        Assertions.assertEquals(0, todoList.tasks.size());
    }

    @Test
    public void testGetTasksWhenMapNotEmpty() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        String taskOne = "Feed the cat";
        String taskTwo = "Go shopping";
        todoList.addTask(taskOne);
        todoList.addTask(taskTwo);
        Assertions.assertEquals(String.format("Tasks: %s, %s", taskOne, taskTwo), todoList.getTasks());
    }

    @Test
    public void testGetTasksWhenMapIsEmpty() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        Assertions.assertEquals("No tasks in your list yet!", todoList.getTasks());
    }

    @Test
    public void testChangeTaskStatusWithValidTask() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
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
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        String taskOne = "Feed the cat";
        String taskTwo = "Go shopping";
        todoList.addTask(taskOne);
        Assertions.assertEquals("Couldn't update status, task doesn't exist",
                todoList.changeTaskStatus(taskTwo));
    }

    @Test
    public void testGetCompleteTasksSuccessful() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
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
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        Assertions.assertEquals("No completed tasks",todoList.getCompletedTasks());
    }
    @Test
    public void testGetIncompleteTasksSuccessful() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
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
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
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
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        Assertions.assertEquals(String.format("Task %s is %s.",taskOne,todoList.tasks.get(taskOne)?"complete":"incomplete"),todoList.searchForTask(taskOne));

    }
    @Test
    public void testSearchForNonexistentTask() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        Assertions.assertEquals("No such task",todoList.searchForTask(taskTwo));
    }

    @Test
    public void testRemoveValidTask() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        Assertions.assertEquals(2, todoList.tasks.size());
        Assertions.assertTrue(todoList.removeTask(taskOne));
        Assertions.assertEquals(1, todoList.tasks.size());
    }
    @Test
    public void testRemoveInvalidTask() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertFalse(todoList.removeTask(taskTwo));

    }
    @Test
    public void testGetSortedTasksAscending() {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();
        Assertions.assertEquals("The to-do list is empty!",todoList.getSortedTasksAscending());
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        todoList.changeTaskStatus(taskTwo);
        Assertions.assertEquals("Feed the cat: incomplete\nGo shopping: completed\n", todoList.getSortedTasksAscending());


    }
    @Test
    public void testGetSortedTasksDescending() {
        com.booleanuk.core.TodoList todoList = new TodoList();
        Assertions.assertEquals("The to-do list is empty!",todoList.getSortedTasksDescending());
        String taskOne = "Feed the cat";
        todoList.addTask(taskOne);
        String taskTwo = "Go shopping";
        todoList.addTask(taskTwo);
        todoList.changeTaskStatus(taskTwo);

        Assertions.assertEquals("Go shopping: completed\nFeed the cat: incomplete\n", todoList.getSortedTasksDescending());

    }

}
