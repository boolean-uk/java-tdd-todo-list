package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TodoListTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private TodoList todoList;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        todoList = new TodoList();
    }

    private void addSomeTasks(TodoList todoList) {
        Task task1 = new Task("Go shopping");
        Task task2 = new Task("Clean your room");
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
        addSomeTasks(todoList);
        todoList.showTasks();
        String expected = "Task{" +
                "id=" + 0 +
                ", description='" + "Go shopping" + '\'' +
                ", status=" + "INCOMPLETE" +
                '}';
        expected += System.lineSeparator();
        expected += "Task{" +
                "id=" + 1 +
                ", description='" + "Clean your room" + '\'' +
                ", status=" + "INCOMPLETE" +
                '}';
        Assertions.assertEquals(expected.trim(), outputStreamCaptor.toString()
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
}
