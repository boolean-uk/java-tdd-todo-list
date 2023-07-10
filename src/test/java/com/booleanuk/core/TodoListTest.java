package com.booleanuk.core;

import org.junit.jupiter.api.*;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    private static TodoList todolist;
    private static Task task;
    private static Task task2;

    @BeforeAll
    public static void createTasks(){
        task = new Task("Do homework", false);
        task2 = new Task("Wash dishes", true);
    }
    @BeforeEach
    public void create(){
        todolist = new TodoList();
    }
    @Test
    public void addTask(){
        boolean result1 = todolist.addTask(task);
        Assertions.assertTrue(result1);
        boolean result2 = todolist.addTask(task);
        Assertions.assertFalse(result2);
    }

    @Test
    public void getAllTasks() {
        String tasks = todolist.getAllTasks();
        Assertions.assertEquals("[]", tasks);

        todolist.addTask(task);

        String tasks2 = todolist.getAllTasks();
        Assertions.assertEquals("[Task{name='Do homework', isCompleted=false}]", tasks2);
    }

    @Test
    public void getAllTasksWithStatus(){
        todolist.addTask(task);
        todolist.addTask(task2);

        String tasks = todolist.getAllTasks(true);
        Assertions.assertEquals("[Task{name='Wash dishes', isCompleted=true}]",tasks);

        String tasks2 = todolist.getAllTasks(false);
        Assertions.assertEquals("[Task{name='Do homework', isCompleted=false}]",tasks2);
    }

    @Test
    public void searchTask() {
        todolist.addTask(task);

        String task = todolist.search("Wash dishes");
        Assertions.assertEquals("not found", task);

        String task2 = todolist.search("Do homework");
        Assertions.assertEquals("found", task2);
    }

    @Test
    public void removeTaskTest(){
        todolist.addTask(task2);
        boolean result1 = todolist.removeTask(task2);
        Assertions.assertTrue(result1);
        boolean result2 = todolist.removeTask(task2);
        Assertions.assertFalse(result2);
    }
}
