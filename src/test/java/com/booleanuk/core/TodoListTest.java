package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TodoListTest {
    @Test
    public void shouldAddTask() {
        TodoList testList = new TodoList();

        Assertions.assertTrue(testList.add("clean"));
        Assertions.assertEquals(1, testList.getTaskMap().size());
        Assertions.assertTrue(testList.getTaskMap().containsKey("clean"));

        Assertions.assertTrue(testList.add("wash"));
        Assertions.assertEquals(2, testList.getTaskMap().size());
        Assertions.assertTrue(testList.getTaskMap().containsKey("wash"));
        Assertions.assertTrue(testList.getTaskMap().containsKey("clean"));

        Assertions.assertFalse(testList.add("clean"));
        Assertions.assertFalse(testList.add(""));
        Assertions.assertFalse(testList.add(" "));
    }

    @Test
    public void shouldInitializeFalse() {
        TodoList testList = new TodoList();

        testList.add("clean");

        Assertions.assertFalse(testList.getTaskMap().get("clean"));
    }

    @Test
    public void shouldShowList() {
        TodoList testList = new TodoList();

        testList.add("clean");
        testList.add("wash");

        List<String> expectedList = List.of("clean", "wash");
        Assertions.assertEquals(expectedList.size(), testList.showTasks().size());
        Assertions.assertTrue(testList.showTasks().containsAll(expectedList));
    }

    @Test
    public void shouldShowEmptyList() {
        TodoList testList = new TodoList();

        Assertions.assertTrue(testList.showTasks().isEmpty());
    }

    @Test
    public void shouldChangeStatus() {
        TodoList testList = new TodoList();

        testList.add("clean");
        testList.changeStatus("clean", true);
        Assertions.assertTrue(testList.getTaskMap().get("clean"));

        testList.changeStatus("clean", false);
        Assertions.assertFalse(testList.getTaskMap().get("clean"));

        testList.changeStatus("clean", false);
        Assertions.assertFalse(testList.getTaskMap().get("clean"));
    }

    @Test
    public void shouldShowCompletedTasks() {
        TodoList testList = new TodoList();

        Assertions.assertTrue(testList.getCompleted().isEmpty());

        testList.add("clean");
        testList.add("wash");
        testList.add("cook");

        Assertions.assertTrue(testList.getCompleted().isEmpty());

        testList.changeStatus("clean", true);
        testList.changeStatus("wash", true);

        List<String> expectedCompleted = List.of("clean", "wash");
        Assertions.assertEquals(expectedCompleted.size(), testList.getCompleted().size());
        Assertions.assertTrue(testList.getCompleted().containsAll(expectedCompleted));
        Assertions.assertFalse(testList.getCompleted().contains("cook"));
    }

    @Test
    public void shouldShowIncompletedTasks() {
        TodoList testList = new TodoList();

        Assertions.assertTrue(testList.getIncompleted().isEmpty());

        testList.add("clean");
        testList.add("wash");
        testList.add("cook");

        testList.changeStatus("clean", true);

        List<String> expectedIncompleted = List.of("wash", "cook");
        Assertions.assertEquals(expectedIncompleted.size(), testList.getIncompleted().size());
        Assertions.assertTrue(testList.getIncompleted().containsAll(expectedIncompleted));
        Assertions.assertFalse(testList.getIncompleted().contains("clean"));

        testList.changeStatus("wash", true);
        testList.changeStatus("cook", true);

        Assertions.assertTrue(testList.getIncompleted().isEmpty());
    }

    @Test
    public void shouldSearch() {
        TodoList testList = new TodoList();

        Assertions.assertEquals("No tasks", testList.search("clean"));

        testList.add("clean");
        testList.add("wash");
        testList.add("cook");

        Assertions.assertEquals("clean", testList.search("clean"));
        Assertions.assertEquals("Task wasn't found", testList.search("iron"));
    }

    @Test
    public void shouldRemove() {
        TodoList testList = new TodoList();;

        testList.add("clean");
        testList.add("wash");
        testList.add("cook");
        testList.remove("cook");

        List expectedList = List.of("clean", "wash");

        Assertions.assertEquals(expectedList.size(), testList.getTaskMap().size());
        Assertions.assertTrue(testList.showTasks().containsAll(expectedList));
        Assertions.assertFalse(testList.getTaskMap().containsKey("cook"));

        Assertions.assertFalse(testList.remove("iron"));
        Assertions.assertFalse(testList.remove(""));
        Assertions.assertFalse(testList.remove(" "));
    }

    @Test
    public void shouldGiveTasksInAscendingOrder() {
        TodoList testList = new TodoList();

        Assertions.assertTrue(testList.tasksAscending().isEmpty());

        testList.add("clean");
        testList.add("wash");
        testList.add("cook");

        List<String> expected = List.of("clean", "cook", "wash");

        Assertions.assertEquals(expected, testList.tasksAscending());
    }

    @Test
    public void shouldGiveTasksInDescendingOrder() {
        TodoList testList = new TodoList();

        Assertions.assertTrue(testList.tasksDescending().isEmpty());

        testList.add("clean");
        testList.add("wash");
        testList.add("cook");

        List<String> expected = List.of("wash", "cook", "clean");

        Assertions.assertEquals(expected, testList.tasksDescending());
    }

}
