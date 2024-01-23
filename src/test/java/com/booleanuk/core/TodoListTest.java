package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testEmptyTodoList() {
        TodoList list = new TodoList();
        Assertions.assertArrayEquals(new String[]{"List is empty"}, list.checkAllTasks(""));
    }

    @Test
    public void testIfReturnsAllTasks() {
        TodoList list = new TodoList();
        list.todoList = new HashMap<>();
        list.todoList.put("Clean room", "Complete");
        list.todoList.put("Clean kitchen", "Incomplete");
        list.todoList.put("Walk dog", "Complete");
        Assertions.assertArrayEquals(new String[]{"Walk dog: Complete","Clean room: Complete"
                ,"Clean kitchen: Incomplete"}, list.checkAllTasks(""));

    }

    @Test
    public void testAddTask() {
        TodoList list = new TodoList();
        String task = "Workout";
        String status = "Incomplete";
        Assertions.assertEquals("Task added", list.addTask(task, status));
        Assertions.assertArrayEquals(new String[]{"Workout: Incomplete"}, list.checkAllTasks(""));
    }

    @Test
    public void testAddTaskIfTaskExists() {
        TodoList list = new TodoList();
        String task = "Workout";
        String status = "Incomplete";
        list.todoList.put("Workout", "Incomplete");
        Assertions.assertEquals("Can not add: Task already added", list.addTask(task, status));
    }

    @Test
    public void testRemoveTask() {
        TodoList list = new TodoList();
        String task = "Workout";
        list.addTask(task, "Complete");
        Assertions.assertArrayEquals(new String[]{"Workout: Complete"}, list.checkAllTasks(""));
        Assertions.assertEquals("Task removed", list.removeTask(task));
        Assertions.assertArrayEquals(new String[]{"List is empty"}, list.checkAllTasks(""));
    }

    @Test
    public void testRemoveNonExistingTask() {
        TodoList list = new TodoList();
        String task = "Workout";
        list.addTask("Go swimming", "Incomplete");
        list.addTask("Eat dinner", "Incomplete");
        Assertions.assertArrayEquals(new String[]{"Eat dinner: Incomplete","Go swimming: Incomplete"}, list.checkAllTasks(""));
        Assertions.assertEquals("Task does not exist", list.removeTask(task));
    }

    @Test
    public void testCheckOneTask() {
        TodoList list = new TodoList();
        String task = "Workout";
        list.addTask(task, "Incomplete");
        list.addTask("Shower", "Complete");
        list.addTask("Go party", "Incomplete");
        Assertions.assertEquals("Workout: Incomplete", list.checkOneTask(task));
    }

    @Test
    public void testCheckOneTaskIfExists() {
        TodoList list = new TodoList();
        String task = "Play football";
        list.addTask("Workout", "Incomplete");
        list.addTask("Shower", "Complete");
        list.addTask("Go party", "Incomplete");
        Assertions.assertEquals("Task not found", list.checkOneTask(task));
    }

    @Test
    public void testChangeTaskStatus() {
        TodoList list = new TodoList();
        String status = "Complete";
        String task = "Workout";
        list.addTask(task, "Incomplete");
        list.addTask(" Walk dog", "Incomplete");
        Assertions.assertEquals("Status changed", list.changeTaskStatus(task, status));
        Assertions.assertEquals("Workout: Complete", list.checkOneTask("Workout"));
    }

    @Test
    public void testGetCompleted() {
        TodoList list = new TodoList();
        String status = "Complete";
        list.addTask("Workout", "Incomplete");
        list.addTask("Sleep", status);
        list.addTask("Get to work", status);
        list.addTask("Watch TikTok", status);
        list.addTask("Make food", "Incomplete");
        Assertions.assertArrayEquals(new String[]{"Sleep", "Get to work", "Watch TikTok"}, list.getCompleteOrIncomplete(status));
    }

    @Test
    public void testGetIncompleted() {
        TodoList list = new TodoList();
        String status = "Incomplete";
        list.addTask("Workout", "Incomplete");
        list.addTask("Sleep", "Complete");
        list.addTask("Get to work", "Complete");
        list.addTask("Watch TikTok", "Complete");
        list.addTask("Make food", "Incomplete");
        Assertions.assertArrayEquals(new String[]{"Workout", "Make food"}, list.getCompleteOrIncomplete(status));
    }

    @Test
    public void testOrderAlphabeticallyAscending() {
        TodoList list = new TodoList();
        list.addTask("Workout", "Incomplete");
        list.addTask("Bathe", "Complete");
        list.addTask("Sleep", "Complete");
        list.addTask("Get to work", "Complete");
        list.addTask("Watch TikTok", "Complete");
        list.addTask("Make food", "Incomplete");
        Assertions.assertArrayEquals(new String[]{"Bathe: Complete", "Get to work: Complete",
                "Make food: Incomplete", "Sleep: Complete", "Watch TikTok: Complete",
                "Workout: Incomplete"}, list.checkAllTasks("ascending"));
    }

    @Test
    public void testOrderAlphabeticallyDescending() {
        TodoList list = new TodoList();
        list.addTask("Workout", "Incomplete");
        list.addTask("Bathe", "Complete");
        list.addTask("Sleep", "Complete");
        list.addTask("Get to work", "Complete");
        list.addTask("Watch TikTok", "Complete");
        list.addTask("Make food", "Incomplete");
        Assertions.assertArrayEquals(new String[]{"Workout: Incomplete", "Watch TikTok: Complete",
                "Sleep: Complete", "Make food: Incomplete", "Get to work: Complete",
                "Bathe: Complete"}, list.checkAllTasks("descending"));
    }
}
