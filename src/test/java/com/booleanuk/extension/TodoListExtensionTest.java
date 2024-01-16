package com.booleanuk.extension;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TodoListExtensionTest {
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
        TodoListExtension todoListExtension = new TodoListExtension();

        Assertions.assertTrue(todoListExtension.addTask("Eat yoghurt"));
    }

    @Test
    public void testAddMultipleTasks()  {
        TodoListExtension todoListExtension = new TodoListExtension();

        Assertions.assertTrue(todoListExtension.addTask("Eat yoghurt"));
        Assertions.assertTrue(todoListExtension.addTask("Paint the Mona Lisa"));
        Assertions.assertTrue(todoListExtension.addTask("Do laundry"));
        Assertions.assertTrue(todoListExtension.addTask("Talk to janitor"));
        Assertions.assertTrue(todoListExtension.addTask("Sing a song"));
    }

    @Test
    public void testShowAllTasks()  {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        String expectedString = """
                Your tasks are:
                [ ] Eat yoghurt
                [ ] Paint the Mona Lisa
                [ ] Do laundry
                [ ] Talk to janitor
                """;
        todoListExtension.showAllTasks();

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testShowNoTasks()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        String expectedString = "No tasks to display, todo list is empty";

        todoListExtension.showAllTasks();
        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testChangeTaskFromIncompleteToComplete()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");

        Assertions.assertTrue(todoListExtension.changeTaskStatus("Eat yoghurt"));
        //Assertions.assertTrue(todoListExtension.taskStatus.get("Eat yoghurt"));
    }

    @Test
    public void testChangeTaskNotExist()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        Assertions.assertFalse(todoListExtension.changeTaskStatus("Eat yoghurt"));
    }

    @Test
    public void testGetCompleteTasks()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        todoListExtension.changeTaskStatus(("Eat yoghurt"));
        todoListExtension.changeTaskStatus("Talk to janitor");

        String expectedOutput = """
                You have 2 complete tasks:
                [X] Eat yoghurt
                [X] Talk to janitor
                """;

        todoListExtension.showAllTasks(true);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetCompleteTasksOnlyIncomplete()    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        String expectedOutput = "No tasks to show";

        todoListExtension.showAllTasks(true);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetCompleteTasksNoTasks()    {
        TodoListExtension todoListExtension = new TodoListExtension();

        String expectedOutput = "No tasks to show";

        todoListExtension.showAllTasks(true);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetIncompleteTasks()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        todoListExtension.changeTaskStatus(("Eat yoghurt"));
        todoListExtension.changeTaskStatus("Talk to janitor");

        String expectedOutput = """
                You have 2 incomplete tasks:
                [ ] Paint the Mona Lisa
                [ ] Do laundry
                """;

        todoListExtension.showAllTasks(false);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetInompleteTasksOnlyIncomplete()    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        todoListExtension.changeTaskStatus(("Eat yoghurt"));
        todoListExtension.changeTaskStatus("Paint the Mona Lisa");
        todoListExtension.changeTaskStatus(("Do laundry"));
        todoListExtension.changeTaskStatus("Talk to janitor");

        String expectedOutput = "No tasks to show";

        todoListExtension.showAllTasks(false);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetIncompleteTasksNoTasks()    {
        TodoListExtension todoListExtension = new TodoListExtension();

        String expectedOutput = "No tasks to show";

        todoListExtension.showAllTasks(false);

        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetTaskExistsIncomplete()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        String expectedOutput = """
                Task:
                [ ] Paint the Mona Lisa""";

        Assertions.assertTrue(todoListExtension.getTask("Paint the Mona Lisa"));
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetTaskExistsComplete()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        todoListExtension.changeTaskStatus("Paint the Mona Lisa");

        String expectedOutput = """
                Task:
                [X] Paint the Mona Lisa""";

        Assertions.assertTrue(todoListExtension.getTask("Paint the Mona Lisa"));
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetTaskNotExists()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        String expectedOutput = "Task not found";

        Assertions.assertFalse(todoListExtension.getTask("Paint the Mona Lisa"));
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testRemoveTaskExists()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        String expectedOutput1 = """
                Task:
                [ ] Do laundry""";
        todoListExtension.getTask("Do laundry");
        Assertions.assertEquals(expectedOutput1, outputStreamCaptor.toString());

        Assertions.assertTrue(todoListExtension.removeTask("Do laundry"));
        outputStreamCaptor.reset();
        String expectedOutput2 = "Task not found";

        todoListExtension.getTask("Do laundry");
        Assertions.assertEquals(expectedOutput2, outputStreamCaptor.toString());
    }

    @Test
    public void testRemoveTaskNotExists()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        Assertions.assertFalse(todoListExtension.removeTask("Do laundry"));
    }

    @Test
    public void testShowTasksAscending()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        String expectedString = """
                Your tasks are:
                [ ] Do laundry
                [ ] Eat yoghurt
                [ ] Paint the Mona Lisa
                [ ] Talk to janitor
                """;

        todoListExtension.showAllTasksOrdered(true);

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testShowTasksAscendingEmpty()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        String expectedString = "No tasks to display, todo list is empty";

        todoListExtension.showAllTasksOrdered(true);

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testShowTasksDescending()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        String expectedString = """
                Your tasks are:
                [ ] Talk to janitor
                [ ] Paint the Mona Lisa
                [ ] Eat yoghurt
                [ ] Do laundry
                """;

        todoListExtension.showAllTasksOrdered(false);

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testShowTasksDescendingEmpty()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        String expectedString = "No tasks to display, todo list is empty";

        todoListExtension.showAllTasksOrdered(false);

        Assertions.assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    public void testGetTaskExistsByID()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");
        todoListExtension.addTask("Paint the Mona Lisa");
        todoListExtension.addTask("Do laundry");
        todoListExtension.addTask("Talk to janitor");

        String expectedOutput = """
                Task:
                [ ] Paint the Mona Lisa""";

        Assertions.assertTrue(todoListExtension.getTask(1));
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testGetTaskExistsByIDNotExists()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        String expectedOutput = "Task not found";

        Assertions.assertFalse(todoListExtension.getTask(1));
        Assertions.assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    public void testUpdateNameWithID()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");

        todoListExtension.changeTaskName(0, "Eat porridge");
        Assertions.assertEquals("Eat porridge", todoListExtension.getName(0));
    }

    @Test
    public void testUpdateNameWithIDNotExist()
    {
        TodoListExtension todoListExtension = new TodoListExtension();


        todoListExtension.changeTaskName(0, "Eat porridge");
        Assertions.assertEquals("", todoListExtension.getName(0));
    }

    @Test
    public void testUpdateStatusWithID()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");

        todoListExtension.changeTaskStatus(0);
        Assertions.assertTrue(todoListExtension.getStatus(0));
    }

    @Test
    public void testUpdateStatusWithIDTwice()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        todoListExtension.addTask("Eat yoghurt");

        todoListExtension.changeTaskStatus(0);
        todoListExtension.changeTaskStatus(0);
        Assertions.assertFalse(todoListExtension.getStatus(0));
    }

    @Test
    public void testUpdateStatusWithIDNotExists()
    {
        TodoListExtension todoListExtension = new TodoListExtension();

        Assertions.assertFalse(todoListExtension.changeTaskStatus(0));
    }
}
