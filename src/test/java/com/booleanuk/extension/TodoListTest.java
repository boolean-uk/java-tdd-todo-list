package com.booleanuk.extension;

import com.booleanuk.extension.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class TodoListTest {

    /*Extension test user story 10 */
    @Test
    public void testGetTaskById(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        tl.addTask(new Task("Bowling"));
        tl.addTask(new Task("Gaming"));
        Assertions.assertEquals("Bowling, Not completed", tl.getTaskById(2));

    }

    /* test user story 11 */
    @Test
    public void testUpdateTaskById(){
        TodoList tl = new TodoList();
        tl.addTask(new Task("Shopping"));
        Assertions.assertTrue(tl.updateTaskById(1, "Dinner"));
        Assertions.assertEquals("Dinner, Not completed", tl.getTaskById(1));
    }
    /* test user story 12*/
    @Test
    public void testGettingCorrectDateTimeOfTask(){
        TodoList tl = new TodoList();
        LocalDateTime dt = LocalDateTime.now().withNano(0);
        tl.addTask(new Task("Shopping"));
        String expected = "Shopping: " + dt + "\n";
        Assertions.assertEquals(expected, tl.getCreationDateTask());
    }
    /*test revised user story 3 for extension*/
    @Test
    public void testToggleStatusWithId(){
        TodoList tl = new TodoList();
        Task task1 = new Task("Shopping");
        tl.addTask(task1);
        Assertions.assertTrue(tl.toggleStatus(1));

    }
}
