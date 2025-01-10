package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

class TodoListExtensionTest {
    @Test
    public void checkForTaskInList() {
        TaskExtension task = new TaskExtension("Test");
        TodoListExtension todo = new TodoListExtension();
        Assertions.assertTrue(todo.add(task));
        Assertions.assertFalse(todo.add(task));

    }

    @Test
    public void checkViewTask() {
        TaskExtension task = new TaskExtension("Test");
        TodoListExtension todo = new TodoListExtension();
        ArrayList<TaskExtension> empty = new ArrayList<>();
        Assertions.assertIterableEquals(empty, todo.viewTasks());
        todo.add(task);
        empty.add(task);
        Assertions.assertIterableEquals(empty, todo.viewTasks());

    }

    @Test
    public void checkIncompleteTaskView() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension taskIncomplete = new TaskExtension("Task incomplete");
        TaskExtension taskComplete = new TaskExtension("Task complete");
        taskComplete.changeStatus(true);
        todo.add(taskIncomplete);
        todo.add(taskComplete);
        Assertions.assertNotEquals(todo.viewTasks(), todo.viewIncompleteTasks());
    }

    @Test
    public void checkCompleteTaskView() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension taskIncomplete = new TaskExtension("Task incomplete");
        TaskExtension taskComplete = new TaskExtension("Task complete");
        taskComplete.changeStatus(true);
        todo.add(taskIncomplete);
        todo.add(taskComplete);
        Assertions.assertNotEquals(todo.viewTasks(), todo.viewCompleteTasks());
    }

    @Test
    public void testSearchTaskName() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension example = new TaskExtension("Example");

        Assertions.assertNotEquals(example, todo.searchTask(example));
        todo.add(example);

        Assertions.assertEquals(example, todo.searchTask(example));

    }

    @Test
    public void testRemoveTask() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension example = new TaskExtension("Example");
        TaskExtension example2 = new TaskExtension("Example2");

        todo.add(example);
        ArrayList<TaskExtension> tasks = todo.viewTasks();
        todo.removeTask(example2);
        Assertions.assertEquals(tasks, todo.viewTasks());

        todo.add(example2);
        int tasks_size = todo.tasks.size();
        todo.removeTask(example2);
        Assertions.assertNotEquals(todo.tasks.size(), tasks_size);

    }

    @Test
    public void testAscending() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension a = new TaskExtension("A");
        TaskExtension z = new TaskExtension("Zebra");
        TaskExtension f = new TaskExtension("Fair");

        todo.add(z);
        todo.add(f);
        todo.add(a);

        Assertions.assertNotEquals(todo.viewTasks().get(0).name, todo.alphabeticallyAscView().get(0));
        Assertions.assertEquals(todo.viewTasks().get(1).name, todo.alphabeticallyAscView().get(1));
        Assertions.assertNotEquals(todo.viewTasks().get(2).name, todo.alphabeticallyAscView().get(2));

    }


    @Test
    public void testDescending() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension a = new TaskExtension("A");
        TaskExtension z = new TaskExtension("Zebra");
        TaskExtension f = new TaskExtension("Fair");

        todo.add(z);
        todo.add(f);
        todo.add(a);

        Assertions.assertEquals(todo.viewTasks().get(0).name, todo.alphabeticallyDescView().get(0));
        Assertions.assertEquals(todo.viewTasks().get(1).name, todo.alphabeticallyDescView().get(1));
        Assertions.assertEquals(todo.viewTasks().get(2).name, todo.alphabeticallyDescView().get(2));

    }

    @Test
    public void testUpdateName() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension task = new TaskExtension("Task1");
        UUID taskID = task.uid;
        todo.add(task);
        todo.updateTaskNameByID(taskID, "new Name");
        Assertions.assertEquals("new Name", task.name);
    }

    @Test
    public void testUpdateStatus() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension task = new TaskExtension("Task1");
        UUID taskID = task.uid;
        todo.add(task);
        todo.updateTaskStatusByID(taskID, true);
        Assertions.assertTrue(task.complete);
        todo.updateTaskStatusByID(taskID, false);
        Assertions.assertFalse(task.complete);
    }

    @Test
    public void testGetTask() {
        TodoListExtension todo = new TodoListExtension();
        TaskExtension task = new TaskExtension("Task1");
        UUID taskID = task.uid;
        todo.add(task);
        TaskExtension testTask = todo.getTaskByID(taskID);
        Assertions.assertEquals(task, testTask);
    }

}
