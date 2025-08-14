package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TodoListTest {


    @Test
    public void shouldAddName() {
        TodoList newToDo = new TodoList();
        String name = "Clean";
        boolean result = newToDo.add(name);

        Assertions.assertEquals(true, result);
    }
    @Test
    public void shouldView() {

        TodoList newToDo = new TodoList();
        newToDo.add("Clean");

       String[] result = newToDo.view();

        Assertions.assertArrayEquals(new String[]{"Clean"}, result);

        newToDo.add("Cook");

        result = newToDo.view();

        Assertions.assertArrayEquals(new String[]{"Clean", "Cook"}, result);
    }
    @Test
    public void shouldChangeStatus() {
        TodoList newToDo = new TodoList();
        newToDo.add("Nap");
        boolean result = newToDo.changeStatus("Nap");

        Assertions.assertEquals(true, result);

    }
    @Test
    public void shouldViewCompletedTasks() {

        TodoList newToDo = new TodoList();
        newToDo.add("Nap");
        newToDo.add("Fire someone");
        newToDo.changeStatus("Fire someone");
        String[] result = newToDo.viewCompletedTasks();

        Assertions.assertArrayEquals(new String[]{"Fire someone"}, result);
    }
    @Test
    public void shouldViewIncompletedTasks() {
        TodoList newToDo = new TodoList();
        newToDo.add("Nap");
        newToDo.add("Fire someone");
        String[] result = newToDo.viewIncompletedTasks();

        Assertions.assertArrayEquals(new String[]{"Fire someone", "Nap"}, result);
    }
    @Test
    public void shouldRemoveTask() {
        TodoList newToDo = new TodoList();
        newToDo.add("Nap");
        newToDo.add("Fire someone");

        boolean result = newToDo.removeTask("Nap");
        Assertions.assertEquals(true,  result);

    }
    @Test
    public void shouldSearchTask() {
        TodoList newToDo = new TodoList();
        newToDo.add("Nap");
        newToDo.add("Fire someone");

        String result = newToDo.searchTask("Nap");
        Assertions.assertEquals("Nap was found.",  result);

        result = newToDo.searchTask("Daydreaming");
        Assertions.assertEquals("No matching task was found.",  result);


    }
    @Test
    public void shouldSortAsc() {
        TodoList newToDo = new TodoList();
        newToDo.add("Nap");
        newToDo.add("Fire someone");
        newToDo.add("A little bit of this and that");

        String[] result = newToDo.sortAsc();

        Assertions.assertArrayEquals(new String[]{"A little bit of this and that", "Fire someone", "Nap"},  result);

    }
    @Test
    public void shouldSortDesc() {
        TodoList newToDo = new TodoList();
        newToDo.add("Nap");
        newToDo.add("Fire someone");
        newToDo.add("A little bit of this and that");

        String[] result = newToDo.sortDesc();

        Assertions.assertArrayEquals(new String[]{"Nap", "Fire someone", "A little bit of this and that"},  result);

    }

}
