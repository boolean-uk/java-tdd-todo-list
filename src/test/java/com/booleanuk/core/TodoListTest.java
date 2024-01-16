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
    public void addTaskTest() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Dishes"));
        Assertions.assertEquals(1, todoList.tasks.size());
    }
    @Test
    public void showTasksTest() {
        TodoList todoList = new TodoList();
        todoList.addTask("Dishes");
        Assertions.assertEquals("{Dishes=true}", todoList.showTasks());
    }
    @Test
    public void changeTaskStatusTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Dishes");
        Assertions.assertEquals("{Dishes=false}", todoList.showTasks());
        todoList.changeTaskStatus("Dishes");
        Assertions.assertEquals("{Dishes=true}", todoList.showTasks());
        todoList.changeTaskStatus("Dishes");
        Assertions.assertEquals("{Dishes=false}", todoList.showTasks());
    }
    @Test
    public void getCompletedTasks(){
        TodoList todoList = new TodoList();
        todoList.addTask("Dishes");
        todoList.addTask("Haircut");
        todoList.changeTaskStatus("Dishes");
        todoList.changeTaskStatus("Haircut");
        Assertions.assertEquals("Haircut\nDishes\n", todoList.seeStatus(true));
    }
    @Test
    public void getIncompletedTasks() {
        TodoList todoList = new TodoList();
        todoList.addTask("Dishes");
        todoList.addTask("Haircut");
        Assertions.assertEquals("Haircut\nDishes\n", todoList.seeStatus(false));
    }
    @Test
    public void getTaskTest() {
        TodoList todoList = new TodoList();
        todoList.addTask("Dishes");
        Assertions.assertEquals("Dishes=false", todoList.getTask("Dishes"));
    }
    @Test
    public void getTaskNotExistingTest() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("Dishes wasn't found", todoList.getTask("Dishes"));
    }
    @Test
    public void removeTaskTest() {
        TodoList todoList = new TodoList();
        todoList.addTask("Dishes");
        Assertions.assertEquals("Dishes was removed from list", todoList.removeTask("Dishes"));
    }
    @Test
    public void removeNonExistingTaskTest() {
        TodoList todoList = new TodoList();
        Assertions.assertEquals("Dishes was not found", todoList.removeTask("Dishes"));
    }
    @Test
    public void alphaTasksAscendingTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Dishes");
        todoList.addTask("Haircut");
        Assertions.assertEquals("Dishes: false\nHaircut: false\n", todoList.alphaTasks(true));
    }
    @Test
    public void alphaTaskDescendingTest(){
        TodoList todoList = new TodoList();
        todoList.addTask("Dishes");
        todoList.addTask("Haircut");
        Assertions.assertEquals("Haircut: false\nDishes: false\n", todoList.alphaTasks(false));
    }
}
