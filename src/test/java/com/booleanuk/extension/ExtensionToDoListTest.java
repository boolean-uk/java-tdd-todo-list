package com.booleanuk.extension;
import com.booleanuk.core.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionToDoListTest {
    @Test
    public void getTaskProper(){
        ExtensionToDoList toDoList=new ExtensionToDoList();
        ExtensionTask task = new ExtensionTask("Laundry");
        toDoList.tasks.put(1,task);
        Assertions.assertEquals(task,toDoList.getTask(1));
    }
    @Test
    public void getTaskWrong(){
        ExtensionToDoList toDoList=new ExtensionToDoList();
        Assertions.assertEquals(null,toDoList.getTask(1));
    }
    @Test
    public void updateTaskNameCorrectly(){
        ExtensionToDoList toDoList=new ExtensionToDoList();
        ExtensionTask task = new ExtensionTask("Laundry");
        toDoList.tasks.put(1,task);
        String name=task.name;
        toDoList.updateTaskName(1,"Washing");
        Assertions.assertNotEquals(name,toDoList.getTask(1).name);
    }
    @Test
    public void updateTaskNameIncorrectly(){
        ExtensionToDoList toDoList=new ExtensionToDoList();
        ExtensionTask task = new ExtensionTask("Laundry");
        toDoList.tasks.put(1,task);
        String name=task.name;
        toDoList.updateTaskName(1,"");
        Assertions.assertEquals(name,toDoList.getTask(1).name);
    }
    @Test
    public void changeTaskStatusCorrectly(){
        ExtensionToDoList toDoList = new ExtensionToDoList();
        ExtensionTask task = new ExtensionTask("Laundry");
        toDoList.tasks.put(1,task);
        Assertions.assertTrue(toDoList.changeTaskStatus(1));
    }
    @Test
    public void changeTaskStatusIncorrectly(){
        ExtensionToDoList toDoList = new ExtensionToDoList();
        Assertions.assertFalse(toDoList.changeTaskStatus(1));
    }
    @Test
    public void getDateAndTime(){
        ExtensionToDoList toDoList=new ExtensionToDoList();
        ExtensionTask task = new ExtensionTask("Laundry");
        toDoList.tasks.put(1,task);
        Assertions.assertEquals(task.getDateAndTime(),toDoList.getDateAndTime(1));
    }
    @Test
    public void getDateAndTimeNotFound(){
        ExtensionToDoList toDoList=new ExtensionToDoList();
        ExtensionTask task = new ExtensionTask("Laundry");
        Assertions.assertEquals("Task not found",toDoList.getDateAndTime(1));
    }
}
