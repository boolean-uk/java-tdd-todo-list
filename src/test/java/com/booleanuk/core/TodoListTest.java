package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

class TodoListTest {

    TodoList toDo = new TodoList();
    @Test
    public void addTasReturnTrue() {

        Assertions.assertTrue(toDo.add("study", 0));
        Assertions.assertTrue(toDo.add("walk", 0));
        Assertions.assertFalse(toDo.add("study", 0));
    }

    @Test
    public void seeTasksReturnsList() {
        HashMap<String, Integer> test = new HashMap<>();
        test.put("study", 0);
        test.put("walk", 0);
        toDo.add("study", 0);
        toDo.add("walk", 0);
        Assertions.assertEquals(test, toDo.see());
    }

    @Test
    public void changeStatusReturnsCompleted() {
        toDo.add("study", 0);
        toDo.add("walk", 0);
        Assertions.assertEquals("completed", toDo.change("study", 1));
        Assertions.assertEquals("uncompleted", toDo.change("walk", 0));
    }

    @Test
    public void seeCompletedTasksReturnsList() {
        toDo.add("study", 1);
        toDo.add("walk", 1);
        ArrayList<String> list = new ArrayList<>();
        list.add("study");
        list.add("walk");
        Assertions.assertEquals(list, toDo.completed());
    }

    @Test
    public void seeUncompletedTasksReturnsList() {
        toDo.add("study", 0);
        toDo.add("walk", 0);
        ArrayList<String> list = new ArrayList<>();
        list.add("study");
        list.add("walk");
        Assertions.assertEquals(list, toDo.uncompleted());
    }

    @Test
    public void searchTasksReturnsTrue() {
        toDo.add("study", 0);
        toDo.add("walk", 0);
        Assertions.assertTrue(toDo.search("study"));
        Assertions.assertTrue(toDo.search("walk"));
        Assertions.assertFalse(toDo.search("market"));
    }

    @Test
    public void removeTaskReturnsTrue() {
        toDo.add("study", 0);
        toDo.add("walk", 0);
        Assertions.assertTrue(toDo.remove("study"));
        Assertions.assertFalse(toDo.remove("market"));
    }


}
