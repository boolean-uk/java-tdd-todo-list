package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTaskShouldBe0() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals(0, todoList.tasks.size());
    }
    @Test
    public void addTaskShouldBe1() {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task());
        Assertions.assertEquals(1, todoList.tasks.size());
    }

    @Test
    public void removeTaskShouldBeFalse() {
        TodoList todoList = new TodoList();

        Assertions.assertFalse(todoList.removeTask(new Task()));
    }
    @Test
    public void removeTaskShouldBeTrue() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        todoList.addTask(task);
        Assertions.assertTrue(todoList.removeTask(task));
    }

    @Test
    public void getTasksShouldBe0() {
        TodoList todoList = new TodoList();

        Assertions.assertEquals(0, todoList.getTasks().size());
    }
    @Test
    public void getTasksShouldBe1() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task());
        Assertions.assertEquals(1, todoList.getTasks().size());
    }

    @Test
    public void getCompleteTasksShouldBe0() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.status = false;
        todoList.addTask(task);
        Assertions.assertEquals(0, todoList.getCompleteTasks().size());
    }
    @Test
    public void getCompleteTasksShouldBe1() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.status = true;
        todoList.addTask(task);
        Assertions.assertEquals(1, todoList.getCompleteTasks().size());
    }

    @Test
    public void getIncompleteTasksShouldBe0() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.status = true;
        todoList.addTask(task);
        Assertions.assertEquals(0, todoList.getIncompleteTasks().size());
    }
    @Test
    public void getIncompleteTasksShouldBe1() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.status = false;
        todoList.addTask(task);
        Assertions.assertEquals(1, todoList.getIncompleteTasks().size());
    }

    @Test
    public void searchTaskByNameShouldBeError() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("Error not found", todoList.searchTaskByName("Code"));
    }

    @Test
    public void searchTaskByNameShouldBeMessage() {
        TodoList todoList = new TodoList();
        Task task = new Task();
        task.name = "Code";
        todoList.addTask(task);
        Assertions.assertEquals("Task found!", todoList.searchTaskByName("Code"));
    }

    @Test
    public void getTaskOrderedNameAscShouldBeEqual() {
        TodoList todoList = new TodoList();
        Task task1 = new Task();
        task1.name = "Emil";
        Task task2 = new Task();
        task2.name = "Nick";
        todoList.addTask(task2);
        todoList.addTask(task1);

        TodoList todoListTest = new TodoList(); // Test sample
        Task task1Test = new Task();
        task1Test.name = "Emil";
        Task task2Test = new Task();
        task2Test.name = "Nick";
        todoListTest.addTask(task1Test);
        todoListTest.addTask(task2Test);

        Assertions.assertEquals(todoListTest.tasks.get(0).name, todoList.getTaskOrderedNameAsc().get(0).name);
        Assertions.assertEquals(todoListTest.tasks.get(1).name, todoList.getTaskOrderedNameAsc().get(1).name);

    }

    @Test
    public void getTaskOrderedNameAscShouldBeNotEqual() {
        TodoList todoList = new TodoList();
        Task task1 = new Task();
        task1.name = "Emil";
        Task task2 = new Task();
        task2.name = "Nick";
        todoList.addTask(task2);
        todoList.addTask(task1);

        TodoList todoListTest = new TodoList(); // Test sample
        Task task1Test = new Task();
        task1Test.name = "Emil";
        Task task2Test = new Task();
        task2Test.name = "Nick";
        todoListTest.addTask(task2Test);  // Test sample is not ordered as previous one, so it should
        todoListTest.addTask(task1Test);  // true if the list is NOT sorted.

        Assertions.assertNotEquals(todoListTest.tasks.get(0).name, todoList.getTaskOrderedNameAsc().get(0).name);
        Assertions.assertNotEquals(todoListTest.tasks.get(1).name, todoList.getTaskOrderedNameAsc().get(1).name);
    }

    @Test
    public void getTaskOrderedNameDescShouldBeEqual() {
        TodoList todoList = new TodoList();
        Task task1 = new Task();
        task1.name = "Emil";
        Task task2 = new Task();
        task2.name = "Nick";
        todoList.addTask(task1);
        todoList.addTask(task2);

        TodoList todoListTest = new TodoList(); // Test sample
        Task task1Test = new Task();
        task1Test.name = "Emil";
        Task task2Test = new Task();
        task2Test.name = "Nick";
        todoListTest.addTask(task2Test);
        todoListTest.addTask(task1Test);

        Assertions.assertEquals(todoListTest.tasks.get(0).name, todoList.getTaskOrderedNameDesc().get(0).name);
        Assertions.assertEquals(todoListTest.tasks.get(1).name, todoList.getTaskOrderedNameDesc().get(1).name);

    }

    @Test
    public void getTaskOrderedNameDescShouldBeNotEqual() {
        TodoList todoList = new TodoList();
        Task task1 = new Task();
        task1.name = "Emil";
        Task task2 = new Task();
        task2.name = "Nick";
        todoList.addTask(task1);
        todoList.addTask(task2);

        TodoList todoListTest = new TodoList(); // Test sample
        Task task1Test = new Task();
        task1Test.name = "Emil";
        Task task2Test = new Task();
        task2Test.name = "Nick";
        todoListTest.addTask(task1Test);
        todoListTest.addTask(task2Test);

        Assertions.assertNotEquals(todoListTest.tasks.get(0).name, todoList.getTaskOrderedNameDesc().get(0).name);
        Assertions.assertNotEquals(todoListTest.tasks.get(1).name, todoList.getTaskOrderedNameDesc().get(1).name);

    }

}
