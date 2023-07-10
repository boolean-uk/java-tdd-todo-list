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

    @BeforeAll
    public static void createTasks(){
        task = new Task("Do homework", false);
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

}
