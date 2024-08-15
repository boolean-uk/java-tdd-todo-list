package com.booleanuk.extension;

import com.booleanuk.core.Task;
import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTestExtension {
    @Test
    public void addTaskTest() {
        TodoListExtension todoList = new TodoListExtension();

        Assertions.assertTrue(todoList.addTask("Make Dinner"));
    }

    @Test
    public void seeAllTasksTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");
        Assertions.assertTrue(todoList.seeAllTasks());
    }


    @Test
    public void updateTaskNameByIDTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");

        Assertions.assertTrue(todoList.updateTaskNameByID(1, "Walk the dog"));
        Assertions.assertEquals("Walk the dog", todoList.todoList.get(0).getTaskName());
    }

    @Test
    public void updateStatusByIDTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");

        Assertions.assertTrue(todoList.updateStatusByID(1, true));

        //Sanity check
        for (int i = 0; i < todoList.todoList.size(); i++){
            System.out.println(todoList.todoList.get(i));
        }
    }

    @Test
    public void getDateAndTimeTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");

        Assertions.assertTrue(todoList.getDateAndTime());
    }

    //Recreate the core exercise with the Task class instead from here
    //

    @Test
    public void removeTaskTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");

        Assertions.assertTrue(todoList.removeTask(1));
    }

    @Test
    public void getCompletedTasksTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");
        todoList.updateStatusByID(1, true);


        Assertions.assertEquals("Work out", todoList.getCompletedTasks().get(0).getTaskName());
    }

    @Test
    public void getUncompletedTasksTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");
        todoList.updateStatusByID(1, true); // set workout to true


        Assertions.assertEquals("Eat dinner", todoList.getUncompletedTasks().get(0).getTaskName());
    }

    @Test
    public void getTaskByIDTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");
        todoList.updateStatusByID(1, true); // set workout to true

        Assertions.assertTrue(todoList.getTaskByID(1));
    }

    @Test
    public void getSortedTasksTest(){
        TodoListExtension todoList = new TodoListExtension();
        todoList.addTask("Work out");
        todoList.addTask("Eat dinner");
        todoList.updateStatusByID(1, true); // set workout to true

        ArrayList<Task> ascendingList = todoList.getSortedTasks("Ascending");
        ArrayList<Task> descendingList = todoList.getSortedTasks("Descending");

        Assertions.assertEquals("Eat dinner",ascendingList.getFirst().getTaskName());
        Assertions.assertEquals("Work out",descendingList.getFirst().getTaskName());



    }





}
