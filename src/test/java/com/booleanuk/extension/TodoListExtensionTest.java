package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class TodoListExtensionTest {
    private ArrayList<TodoItem> items = new ArrayList<>(){{
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 10, 25, 8, 50, 11);
        TodoItem todoItem1 = new TodoItem(1, "Clean room", true, dateTime1);
        add(todoItem1);

        LocalDateTime dateTime2 = LocalDateTime.of(2024, 10, 26, 10, 22, 18);
        TodoItem todoItem2 = new TodoItem(2, "Buy groceries", false, dateTime2);
        add(todoItem2);

        LocalDateTime dateTime3 = LocalDateTime.of(2024, 10, 30, 17, 30, 44);
        TodoItem todoItem3 = new TodoItem(3, "Write CV", false, dateTime3);
        add(todoItem3);
    }};

    // EXTENSION 1
    @Test
    public void enteringNonExistingID(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 4;

        Assertions.assertEquals("ID is not in todo list", todoList.getTaskByID(nonExistingID));
    }

    @Test
    public void enteringExistingID(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 3;

        Assertions.assertEquals("Write CV, not completed", todoList.getTaskByID(nonExistingID));
    }

    // EXTENSION 2
    @Test
    public void enteringNonExistingIDWhenUpdatingName(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 4;

        Assertions.assertEquals("ID is not in todo list", todoList.updateNameByID(nonExistingID, "Do homework"));
    }

    @Test
    public void enteringExistingIDWhenUpdatingName(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 1;

        Assertions.assertEquals("Task with ID 1 has a new name: Do homework", todoList.updateNameByID(nonExistingID, "Do homework"));
    }

    // EXTENSION 3
    @Test
    public void enteringNonExistingIDWhenUpdatingStatus(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 4;

        Assertions.assertEquals("ID is not in todo list", todoList.updateStatusByID(nonExistingID, true));
    }

    @Test
    public void enteringExistingIDWhenUpdatingStatus(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 3;

        Assertions.assertEquals("Task with ID 3 has a new status: completed", todoList.updateStatusByID(nonExistingID, true));
    }

    // EXTENSION 4
    @Test
    public void noTasksAreInTheList(){
        ArrayList<TodoItem> emptyList = new ArrayList<>(){};
        TodoListExtension todoList = new TodoListExtension(emptyList);

        Assertions.assertEquals("There are no tasks in the list!", todoList.showDateTimeForEachTask());
    }

    @Test
    public void thereExistsTasksInTheList(){
        TodoListExtension todoList = new TodoListExtension(items);
        String correctString =
                                "Task with id: 1, Clean room, was created: 2024-10-25T08:50:11\n" +
                                "Task with id: 2, Buy groceries, was created: 2024-10-26T10:22:18\n" +
                                "Task with id: 3, Write CV, was created: 2024-10-30T17:30:44\n";



        Assertions.assertEquals(correctString, todoList.showDateTimeForEachTask());
    }
}
