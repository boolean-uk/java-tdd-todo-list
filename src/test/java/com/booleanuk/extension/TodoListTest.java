package com.booleanuk.extension;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.*;
import java.util.*;

import static org.mockito.Mockito.when;

class TodoListTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private TodoList todoList;
    private static Task task1;
    private static Task task2;

    @BeforeAll
    public static void setUpTasks() {
        task1 = new Task("Go shopping");
        task2 = new Task("Clean your room");
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        todoList = new TodoList();
        task1.setDescription("Go shopping");
        task2.setDescription("Clean your room");
    }

    @AfterEach
    public void cleanUp() {
        task1.setStatus(TaskStatus.INCOMPLETE);
        task2.setStatus(TaskStatus.INCOMPLETE);
    }

    private void addSomeTasks(TodoList todoList) {
        todoList.add(task1);
        todoList.add(task2);
    }

    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testShowTasksOutput() {
        // Setup
        addSomeTasks(todoList);

        // Execute
        todoList.showTasks();
        String expected = "Task{" +
                "id=" + task1.getId() +
                ", description='" + "Go shopping" + '\'' +
                ", status=" + "INCOMPLETE" +
                '}';
        expected += System.lineSeparator();
        expected += "Task{" +
                "id=" + task2.getId() +
                ", description='" + "Clean your room" + '\'' +
                ", status=" + "INCOMPLETE" +
                '}';

        // Verify
        Assertions.assertEquals(expected, outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void addTaskShouldReturnTrue() {
        // Execute
        boolean added1 = todoList.add(new Task("test1"));
        boolean added2 = todoList.add(new Task("test2"));

        // Verify
        Assertions.assertTrue(added1);
        Assertions.assertTrue(added2);
    }

    @Test
    public void addTaskShouldReturnFalse() {
        // Setup
        addSomeTasks(todoList);


        // Execute
        boolean added = todoList.add(task1);

        // Verify
        Assertions.assertFalse(added);
    }

    @Test
    public void shouldChangeTestStatus( ){
        // Setup
        addSomeTasks(todoList);

        // Execute
        todoList.setStatus(task1.getId(), TaskStatus.COMPLETE);

        // Verify
        Assertions.assertEquals(TaskStatus.COMPLETE, task1.getStatus());
    }

    @Test
    public void getCompletedTasksTest() {
        // Setup
        addSomeTasks(todoList);
        todoList.setStatus(task1.getId(), TaskStatus.COMPLETE);
        todoList.setStatus(task2.getId(), TaskStatus.COMPLETE);

        // Execute
        List<Task> completedTasks = todoList.getCompletedTasks();

        // Verify
        List<Task> expectedTasks = new ArrayList<Task>(Arrays.asList(task1, task2));
        Assertions.assertEquals(expectedTasks, completedTasks);
    }

    @Test
    void shouldGetIncompleteTasks(){
        // Setup
        addSomeTasks(todoList);

        // Execute
        List<Task> incompleteTasks = todoList.getIncompleteTasks();

        // Verify
        List<Task> expectedTasks = new ArrayList<Task>(Arrays.asList(task1, task2));
        Assertions.assertEquals(expectedTasks, incompleteTasks);
    }

    @Test
    void shouldFindTask1UsingSearch() {
        // Setup
        addSomeTasks(todoList);

        // Execute
        Task task = todoList.search(task1.getId());

        // Verify
        Assertions.assertEquals(task1, task);
    }

    @Test
    void shouldNotFindTask1UsingSearch() {
        // Execute
        Exception exception = Assertions.assertThrows(NoSuchElementException.class, () -> todoList.search(task1.getId()));

        // Verify
        String expectedMessage = "No task with id " + task1.getId() + " found";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    void shouldRemoveTaskFromListById() {
        // Setup
        addSomeTasks(todoList);

        // Execute
        todoList.remove(task1.getId());

        // Verify
        List<Task> expectedTasks = new ArrayList<Task>(Collections.singletonList(task2));
        Assertions.assertEquals(expectedTasks, todoList.getTasks());
    }

    @Test
    void shouldSortTasksAscendingByName() {
        // Setup
        addSomeTasks(todoList);

        //Execute
        todoList.showAllTasksSortedAlphabetically(true);

        // Verify
        String expected = "Task{" +
                "id=" + task2.getId() +
                ", description='" + "Clean your room" + '\'' +
                ", status=" + "INCOMPLETE" +
                '}';
        expected += System.lineSeparator();
        expected +=  "Task{" +
                "id=" + task1.getId() +
                ", description='" + "Go shopping" + '\'' +
                ", status=" + "INCOMPLETE" +
                '}';
        Assertions.assertEquals(expected,outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void shouldSortTasksDescendingByName() {
        // Setup
        addSomeTasks(todoList);

        // Execute
        todoList.showAllTasksSortedAlphabetically(false);

        // Verify
        String expected =  "Task{" +
                "id=" + task1.getId() +
                ", description='" + "Go shopping" + '\'' +
                ", status=" + "INCOMPLETE" +
                '}';
        expected += System.lineSeparator();
        expected += "Task{" +
                "id=" + task2.getId() +
                ", description='" + "Clean your room" + '\'' +
                ", status=" + "INCOMPLETE" +
                '}';
        Assertions.assertEquals(expected,outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void shouldChangeTaskName() {
        // Setup
        addSomeTasks(todoList);

        // Execute
        todoList.changeTaskName(task1.getId(), "Go to the gym");

        // Verify
        Assertions.assertEquals("Go to the gym", task1.getDescription());
    }

    @Test
    void givenFixedClockWhenNowThenGetFixedLocalDateTime() {
        Task task = Mockito.mock(Task.class);
        todoList = Mockito.spy(new TodoList());
        todoList.add(task);
        when(todoList.search(Mockito.anyInt())).thenReturn(task);

        LocalDateTime expectedDate = LocalDateTime.parse("2018-08-22T10:00:00");
        when(task.getLocalDateTime()).thenReturn(expectedDate);

        // Execute
        LocalDateTime actualDate = todoList.getTaskCreationDate(task1.getId());

        // Verify
        Assertions.assertEquals(expectedDate, actualDate);
    }
}
