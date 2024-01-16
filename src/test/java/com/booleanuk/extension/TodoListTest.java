package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TodoListTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown()  {
        System.setOut(standardOut);
    }

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAddTaskNotInList()   {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        Assertions.assertTrue(todoList.addTask("Eat yoghurt"));
    }

    @Test
    public void testAddTaskAlreadyInList()  {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        Assertions.assertFalse(todoList.addTask("Eat yoghurt"));
    }

    @Test
    public void testAddMultipleTasks()  {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        Assertions.assertTrue(todoList.addTask("Eat yoghurt"));
        Assertions.assertTrue(todoList.addTask("Paint the Mona Lisa"));
        Assertions.assertTrue(todoList.addTask("Do laundry"));
        Assertions.assertTrue(todoList.addTask("Talk to janitor"));
        Assertions.assertFalse(todoList.addTask("Eat yoghurt"));
        Assertions.assertTrue(todoList.addTask("Sing a song"));
    }

    @Test
    public void testShowAllTasks()  {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        String expectedString = """
                Your tasks are:
                [ ] Eat yoghurt
                [ ] Paint the Mona Lisa
                [ ] Do laundry
                [ ] Talk to janitor
                """;
        todoList.showAllTasks();

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testShowNoTasks()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        String expectedString = "No tasks to display, todo list is empty";

        todoList.showAllTasks();
        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testChangeTaskFromIncompleteToComplete()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");

        Assertions.assertTrue(todoList.changeTaskStatus("Eat yoghurt"));
        Assertions.assertTrue(todoList.taskStatus.get("Eat yoghurt"));
    }

    @Test
    public void testChangeTaskNotExist()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        Assertions.assertFalse(todoList.changeTaskStatus("Eat yoghurt"));
    }

    @Test
    public void testGetCompleteTasks()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        todoList.changeTaskStatus(("Eat yoghurt"));
        todoList.changeTaskStatus("Talk to janitor");

        String expectedOutput = """
                You have 2 complete tasks:
                [X] Eat yoghurt
                [X] Talk to janitor
                """;

        todoList.showAllTasks(true);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetCompleteTasksOnlyIncomplete()    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        String expectedOutput = "No tasks to show";

        todoList.showAllTasks(true);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetCompleteTasksNoTasks()    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        String expectedOutput = "No tasks to show";

        todoList.showAllTasks(true);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetIncompleteTasks()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        todoList.changeTaskStatus(("Eat yoghurt"));
        todoList.changeTaskStatus("Talk to janitor");

        String expectedOutput = """
                You have 2 incomplete tasks:
                [ ] Paint the Mona Lisa
                [ ] Do laundry
                """;

        todoList.showAllTasks(false);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetInompleteTasksOnlyIncomplete()    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        todoList.changeTaskStatus(("Eat yoghurt"));
        todoList.changeTaskStatus("Paint the Mona Lisa");
        todoList.changeTaskStatus(("Do laundry"));
        todoList.changeTaskStatus("Talk to janitor");

        String expectedOutput = "No tasks to show";

        todoList.showAllTasks(false);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetIncompleteTasksNoTasks()    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        String expectedOutput = "No tasks to show";

        todoList.showAllTasks(false);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetTaskExistsIncomplete()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        String expectedOutput = """
                Task:
                [ ] Paint the Mona Lisa""";

        Assertions.assertTrue(todoList.getTask("Paint the Mona Lisa"));
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetTaskExistsComplete()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        todoList.changeTaskStatus("Paint the Mona Lisa");

        String expectedOutput = """
                Task:
                [X] Paint the Mona Lisa""";

        Assertions.assertTrue(todoList.getTask("Paint the Mona Lisa"));
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetTaskNotExists()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        String expectedOutput = "Task not found";

        Assertions.assertFalse(todoList.getTask("Paint the Mona Lisa"));
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testRemoveTaskExists()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        String expectedOutput1 = """
                Task:
                [ ] Do laundry""";
        todoList.getTask("Do laundry");
        Assertions.assertEquals(expectedOutput1, outputStreamCaptor.toString());

        Assertions.assertTrue(todoList.removeTask("Do laundry"));
        outputStreamCaptor.reset();
        String expectedOutput2 = "Task not found";

        todoList.getTask("Do laundry");
        Assertions.assertEquals(expectedOutput2, outputStreamCaptor.toString());
    }

    @Test
    public void testRemoveTaskNotExists()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        Assertions.assertFalse(todoList.removeTask("Do laundry"));
    }

    @Test
    public void testShowTasksAscending()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        String expectedString = """
                Your tasks are:
                [ ] Do laundry
                [ ] Eat yoghurt
                [ ] Paint the Mona Lisa
                [ ] Talk to janitor
                """;

        todoList.showAllTasksOrdered(true);

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testShowTasksAscendingEmpty()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        String expectedString = "No tasks to display, todo list is empty";

        todoList.showAllTasksOrdered(true);

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testShowTasksDescending()
    {
        com.booleanuk.core.TodoList todoList = new com.booleanuk.core.TodoList();

        todoList.addTask("Eat yoghurt");
        todoList.addTask("Paint the Mona Lisa");
        todoList.addTask("Do laundry");
        todoList.addTask("Talk to janitor");

        String expectedString = """
                Your tasks are:
                [ ] Talk to janitor
                [ ] Paint the Mona Lisa
                [ ] Eat yoghurt
                [ ] Do laundry
                """;

        todoList.showAllTasksOrdered(false);

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testShowTasksDescendingEmpty()
    {
        com.booleanuk.core.TodoList todoList = new TodoList();

        String expectedString = "No tasks to display, todo list is empty";

        todoList.showAllTasksOrdered(false);

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }
}
