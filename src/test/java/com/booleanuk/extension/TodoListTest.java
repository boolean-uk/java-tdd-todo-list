package com.booleanuk.extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListTest {
    @Test
    public void testGetTaskById(){

        TodoList list = new TodoList();
        //Here I make a new Task with a fixed id and i check to see if i can get it from my function
        Task myTask = new Task("Go to the beach",10);
        list.addTask(myTask);
        Assertions.assertEquals(myTask,list.getTaskById(10));
        //Here I want the result to be null because there is no Task with id 100(unless I lose the 1 in a million).
        Assertions.assertNull(list.getTaskById(100));
    }
    @Test
    public void testUpdateTask(){
        TodoList list = new TodoList();
        Task myTask = new Task("Go to the beach",10);
        list.addTask(myTask);
//      list.updateTask(10,"Leave the beach");
        Assertions.assertTrue(list.updateTask(10,"Leave the beach")); //returns true if it all worked out
        Assertions.assertFalse(list.updateTask(10023,"Stay at the beach")); //returns false it the task does not exist
        Assertions.assertEquals(list.getTaskById(10).name,"Leave the beach");
        //Here I check to see if my change was successful with the first and second check
    }
    @Test
    public void testChangeStatusById(){
        TodoList list = new TodoList();
        Task myTask = new Task("Grab lunch",10);
        list.addTask(myTask);
        Assertions.assertTrue(list.changeStatusByID(10));
        System.out.println(myTask); //visual representation of the task
        //I changed the completed value of the task two times and it switched form false to true to false again.
        Assertions.assertFalse(list.getTaskById(10).completed);
    }
    @Test
    public void testShowTasks(){
        TodoList list = new TodoList(); //has 3 basic tasks already
        Assertions.assertEquals(list.showTasks(),"Go to the doctor\nWork out\nWrite some Java\n");
        Task mytask = new Task("Play Skyrim again");
        list.addTask(mytask);
        Assertions.assertEquals(list.showTasks(),"Go to the doctor\nWork out\nWrite some Java\nPlay Skyrim again\n");
        //what is important here is to not forget the new line in the end. But everything workds as expected.
    }

}
