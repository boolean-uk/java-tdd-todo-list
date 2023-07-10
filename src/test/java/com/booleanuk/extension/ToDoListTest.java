package com.booleanuk.extension;

import com.booleanuk.extension.ToDoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ToDoListTest {

    ToDoList todoList;

    public ToDoListTest() {
        this.todoList = new ToDoList();
    }

    @Test
    public void getTaskByIdTest() throws Exception{
        Task task1 = todoList.addTask("walk");
        Task task2 = todoList.addTask("run");
        Task task3 = todoList.addTask(("swim"));

        Assertions.assertEquals(todoList.getTaskById(0).getTaskName(), "walk");
        Assertions.assertEquals(todoList.getTaskById(1).getTaskName(), "run");
        Assertions.assertEquals(todoList.getTaskById(2).getTaskName(), "swim");
    }

    @Test
    public void updateNameOfTaskByProvidingIdTest() throws Exception {
        Task task1 = todoList.addTask("walk");
        Task task2 = todoList.addTask("run");
        Task task3 = todoList.addTask(("swim"));

        todoList.updateTaskNameByProvidingIdAndNewName(2, "extremeSwimming");
        Assertions.assertEquals(todoList.getTaskById(2).getTaskName(), "extremeSwimming");
    }

    @Test
    public void changeStatusOfTaskProvidingIdTest() throws Exception {
        Task task1 = todoList.addTask("walk");

        Assertions.assertEquals(true,todoList.getTaskById(0).getStatus().equals("incomplete"));

        todoList.changeTaskStatusByProvidingId(0);
        Assertions.assertEquals(true,todoList.getTaskById(0).getStatus().equals("complete"));
    }

    @Test
    public void getDateAndTimeTest() {
        Task task1 = todoList.addTask("walk");
        Date querry;


        try {
            querry = todoList.getTaskById(0).getDate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Assertions.assertEquals(querry.getYear(), new Date().getYear());
        Assertions.assertEquals(querry.getMonth(), new Date().getMonth());
        Assertions.assertEquals(querry.getDay(), new Date().getDay());
        Assertions.assertEquals(querry.getHours(), new Date().getHours());
        Assertions.assertEquals(querry.getMinutes(), new Date().getMinutes());
    }

}
