package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionTest {
    @Test
    public void CheckSearch() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        todoList.add("Walk the dog");
        todoList.add("Water the flowers");
        todoList.doSetCompletion(1,true);
        todoList.doSetCompletion(3,true);
        //Search using description
        Assertions.assertEquals(todoList.search("Walk the dog"),"Task 3: Walk the dog  ~~Completed: true\n");
        Assertions.assertEquals(todoList.search("Wash the car"),"Task doesn't exist");
        //Search using Id
        Assertions.assertEquals(todoList.search(3),"Task 3: Walk the dog  ~~Completed: true\n");
        Assertions.assertEquals(todoList.search(12),"Task doesn't exist");
    }
    @Test
    public void CheckUpdateDescription() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        todoList.add("Walk the dog");
        todoList.add("Water the flowers");
        todoList.doSetCompletion(1,true);
        todoList.doSetCompletion(3,true);
        Assertions.assertTrue(todoList.doUpdateDescription(1,"Wash the Kitchen"));
        Assertions.assertFalse(todoList.doUpdateDescription(15,"Drink some water"));
        Assertions.assertEquals(todoList.search(1),"Task 1: Wash the Kitchen  ~~Completed: true\n");
    }
}
