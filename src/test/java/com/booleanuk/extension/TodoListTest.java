package com.booleanuk.extension;

import com.booleanuk.extension.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListTest {

    /*Extension test user story 10 */
    @Test
    public void testGetTaskById(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        tl.addTask(new Task("Bowling"));
        Assertions.assertEquals("Bowling, Not completed", tl.getTaskById(2));

    }

    /* test user story 11 */
    @Test
    public void testUpdateTaskById(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        Assertions.assertTrue(tl.updateTaskById(1, "Dinner"));
    }
}
