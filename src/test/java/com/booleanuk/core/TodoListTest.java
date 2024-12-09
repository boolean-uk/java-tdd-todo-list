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
    public void addTaskCorrect(){
        TodoList todoList=new TodoList();
        Assertions.assertTrue(todoList.add(new Task("Laundry")));
    }
    @Test
    public void addTaskIncorrect(){
        TodoList todoList=new TodoList();
        Task task = new Task("Laundry");
        todoList.add(task);
        Assertions.assertFalse(todoList.add(task));
    }
    @Test
    public void removeTaskCorrect(){
        TodoList todoList=new TodoList();
        Task task = new Task("Laundry");
        todoList.add(task);
        Assertions.assertTrue(todoList.remove(task));
    }
    @Test
    public void remoeTaskIncorrect(){
        TodoList todoList=new TodoList();
        Task task = new Task("Laundry");
        Assertions.assertFalse(todoList.remove(task));
    }
    @Test
    public void changeStatusCorrectly(){
        int index=2;
        TodoList todoList=new TodoList();
        todoList.add(new Task("Laundry"));
        todoList.add(new Task("Shopping"));
        todoList.add(new Task("Cleaning"));
        boolean taskStatusBefore= todoList.tasks.get(index).status;
        todoList.changeStatus(index);
        Assertions.assertEquals(taskStatusBefore,!todoList.tasks.get(index).status);
    }
    @Test
    public void changeStatusInorrectly(){
        int index=2;
        TodoList todoList=new TodoList();
        todoList.add(new Task("Laundry"));
        todoList.add(new Task("Shopping"));
        todoList.add(new Task("Cleaning"));
        boolean taskStatusBefore= todoList.tasks.get(index).status;
        todoList.changeStatus(index);
        Assertions.assertNotEquals(taskStatusBefore,todoList.tasks.get(index).status);
    }
    @Test
    public void getCompletedTasks(){
        TodoList todoList=new TodoList();
        todoList.add(new Task("Laundry"));
        todoList.add(new Task("Shopping"));
        todoList.add(new Task("Cleaning"));
        todoList.changeStatus(0);todoList.changeStatus(2);
        Assertions.assertEquals(2,todoList.getCompletedTasks().size());

    }
    @Test
    public void getIncompletedTasks(){
        TodoList todoList=new TodoList();
        todoList.add(new Task("Laundry"));
        todoList.add(new Task("Shopping"));
        todoList.add(new Task("Cleaning"));
        todoList.changeStatus(0);todoList.changeStatus(2);
        Assertions.assertEquals(1,todoList.getIncompletedTasks().size());

    }
    @Test
    public void searchForTaskCorrectly(){
        TodoList todoList=new TodoList();
        todoList.add(new Task("Laundry"));
        todoList.add(new Task("Shopping"));
        Task task = new Task("Cleaning");
        todoList.add(task);
        Assertions.assertEquals("Task found",todoList.searchForTask(task));
    }
    @Test
    public void searchForTaskIncorrectly(){
        TodoList todoList=new TodoList();
        todoList.add(new Task("Laundry"));
        todoList.add(new Task("Shopping"));
        Task task = new Task("Cleaning");
        Assertions.assertEquals("Task not found",todoList.searchForTask(task));
    }
    @Test
    public void getTaskAlphabeticallyAsc(){
        TodoList todoList=new TodoList();
        todoList.add(new Task("Laundry"));
        todoList.add(new Task("Shopping"));
        todoList.add(new Task("Cleaning"));
        Assertions.assertEquals("Cleaning, Laundry, Shopping",todoList.getTaskAlphabeticallyAsc());
    }
    @Test
    public void getTaskAlphabeticallyDesc(){
        TodoList todoList=new TodoList();
        todoList.add(new Task("Laundry"));
        todoList.add(new Task("Shopping"));
        todoList.add(new Task("Cleaning"));
        Assertions.assertEquals("Shopping, Laundry, Cleaning",todoList.getTaskAlphabeticallyDesc());
    }
}
