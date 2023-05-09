package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TodoListTest {

    @Test
    public void testSearchByID() {
        TodoList list = new TodoList();

        Task task1 = new Task("Go swimming", false);
        list.tasks.add(task1);

        Assertions.assertEquals(null, list.searchByID("123"));
        Assertions.assertEquals(task1, list.searchByID(task1.id));
    }

    @Test
    public void testUpdateTaskName() {
        TodoList list = new TodoList();

        Task task1 = new Task("Go swimming", false);
        Task task2 = new Task("Walk the dog", true);

        list.tasks.add(task1);
        list.tasks.add(task2);

        list.updateTaskName(task2.id, "Walk the cat");
        Assertions.assertEquals("Walk the cat", list.tasks.get(1).name);

        Assertions.assertFalse(list.updateTaskName("123", "Walk the cat"));

    }




}
