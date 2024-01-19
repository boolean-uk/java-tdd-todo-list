package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TodoListExtensionTest {
    @Test
    public void addingTaskShouldReturnTrue(){
        TodoListExtension todoListExtension = new TodoListExtension();
        Assertions.assertTrue(todoListExtension.add("Watch video on JUnit", 1));
        Assertions.assertTrue(todoListExtension.add("Create a todo app", 2));

    }
    @Test
    public void addingTaskShouldReturnFalse(){
        TodoListExtension todoListExtension = new TodoListExtension();
        todoListExtension.add("Watch video on JUnit", 1);
        Assertions.assertFalse(todoListExtension.add("Watch video on JUnit", 1));
    }

    @Test
    public void shouldChangeStatus(){
        TodoListExtension todoListExtension = new TodoListExtension();
        todoListExtension.add("Watch video on JUnit", 1);
        Assertions.assertTrue(todoListExtension.changeStatus(1, true));
        Assertions.assertFalse(todoListExtension.changeStatus(3, true));
    }
    @Test
    public void shouldUpdateTaskName(){
        TodoListExtension todoListExtension = new TodoListExtension();
        todoListExtension.add( "Watch video on JUnit",1);
        Assertions.assertEquals("The task is updated to do bagels extension", todoListExtension.updateTaskName(1, "do bagels extension") );
        Assertions.assertNotEquals("The task is updated to do bagels extension", todoListExtension.updateTaskName(2, "do bagels extension") );
    }
    @Test
    public void shouldGetDateTime(){
        TodoListExtension todoListExtension = new TodoListExtension();
        todoListExtension.add("Watch video on JUnit", 1);
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = localDate.format(formatter);
        Assertions.assertEquals(dateTime, todoListExtension.getDateTime(1));

    }


}
