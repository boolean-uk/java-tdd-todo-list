package com.booleanuk.extension;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TodoListExtensionTest {

    @BeforeEach
    public void setCounterToZero(){
        TaskExtension.setCounterToZero();
    }

    @Test
    public void shouldReturnTaskUniqueId(){

        //given && when
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        TaskExtension taskExtension2 = new TaskExtension("Extended Task 2");
        TaskExtension taskExtension3 = new TaskExtension("Extended Task 3");
        todoListExtension.addTask(taskExtension);

        //then
        assertEquals("ID0",taskExtension.getTaskExtensionId());
        assertEquals("ID1",taskExtension2.getTaskExtensionId());
        assertEquals("ID2",taskExtension3.getTaskExtensionId());

    }


    @Test
    public void shouldReturnTaskByProvidedID(){

        //given
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        todoListExtension.addTask(taskExtension);
        //When
        String id = "ID0";
        TaskExtension taskExtension1 = todoListExtension.getTaskById(id);

        //then
        assertEquals(taskExtension, taskExtension1);
    }

    @Test
    public void shouldReturnNullForNotExistingId(){

        //given
        TodoListExtension todoListExtension = new TodoListExtension();

        //When
        String id = "ID99";
        TaskExtension taskExtension1 = todoListExtension.getTaskById(id);

        //then
        assertNull(taskExtension1);
    }

    @Test
    public void shouldChangeTaskNameForProvidedId(){
        //given
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        todoListExtension.addTask(taskExtension);
        String id = "ID0";
        String expected ="Extended Task 2";
        //When
        todoListExtension.changeName(id,expected);

        //then
        assertEquals(expected,taskExtension.getTaskName());

    }
    @Test
    public void shouldChangeStatusByProvidedId(){
        //given
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        todoListExtension.addTask(taskExtension);
        String id = "ID0";

        //when
        todoListExtension.changeStatusById(id, true);

        //then
        assertTrue(taskExtension.getStatus());
    }

    @Test
    public void shouldReturnDateAndTimeForCreatedTask() {
        //given
        TodoListExtension todoListExtension = new TodoListExtension();
        TaskExtension taskExtension = new TaskExtension("Extended Task 1");
        TaskExtension taskExtension2 = new TaskExtension("Extended Task 2");
        TaskExtension taskExtension3 = new TaskExtension("Extended Task 3");
        todoListExtension.addTask(taskExtension);
        todoListExtension.addTask(taskExtension2);
        todoListExtension.addTask(taskExtension3);

        //when
        LocalDateTime createdAt1 = todoListExtension.getCreatedAt(taskExtension);
        LocalDateTime createdAt2 = todoListExtension.getCreatedAt(taskExtension2);
        LocalDateTime createdAt3 = todoListExtension.getCreatedAt(taskExtension3);


        //then
        assertEquals(createdAt1,todoListExtension.getCreatedAt(taskExtension));
        assertEquals(createdAt2,todoListExtension.getCreatedAt(taskExtension2));
        assertEquals(createdAt3,todoListExtension.getCreatedAt(taskExtension3));

    }


}
