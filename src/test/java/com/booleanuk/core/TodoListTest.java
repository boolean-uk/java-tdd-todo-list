package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testEmptyTodoList(){
        TodoList list = new TodoList();
        Assertions.assertEquals("List is empty",list.checkAllTasks());
    }

    @Test
    public void testIfReturnsAllTasks(){
        TodoList list = new TodoList();
        list.todoList = new HashMap<>();
        list.todoList.put("Clean room","Complete");
        list.todoList.put("Clean kitchen","Incomplete");
        list.todoList.put("Walk dog","Complete");
        Assertions.assertEquals("{Walk dog=Complete, Clean room=Complete, " +
                "Clean kitchen=Incomplete}",list.checkAllTasks());
    }

    @Test
    public void testAddTask(){
        TodoList list = new TodoList();
        String task = "Workout";
        String status = "Incomplete";
        Assertions.assertEquals("Task added",list.addTask(task,status));
        Assertions.assertEquals("{Workout=Incomplete}",list.checkAllTasks());
    }

    @Test
    public void testAddTaskIfTaskExists(){
        TodoList list = new TodoList();
        String task = "Workout";
        String status = "Incomplete";
        list.todoList.put("Workout","Incomplete");
        Assertions.assertEquals("Can not add: Task already added", list.addTask(task,status));
    }

    @Test
    public void testRemoveTask(){
        TodoList list = new TodoList();
        String task = "Workout";
        list.addTask(task,"Complete");
        Assertions.assertEquals("{Workout=Complete}",list.checkAllTasks());
        Assertions.assertEquals("Task removed", list.removeTask(task));
        Assertions.assertEquals("List is empty", list.checkAllTasks());
    }

    @Test
    public void testRemoveNonExistingTask(){
        TodoList list = new TodoList();
        String task = "Workout";
        list.addTask("Go swimming", "Incomplete");
        list.addTask("Eat dinner", "Incomplete");
        Assertions.assertEquals("{Eat dinner=Incomplete, Go swimming=Incomplete}", list.checkAllTasks());
        Assertions.assertEquals("Task does not exist", list.removeTask(task));

    }
}
