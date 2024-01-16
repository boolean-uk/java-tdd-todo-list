package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {
    HashMap<String, Boolean> taskStatus;
    ArrayList<String> taskList;

    public TodoList() {
        taskStatus = new HashMap<>();
        taskList = new ArrayList<>();
    }

    public boolean addTask(String task)  {
        if(!taskList.contains(task))
        {
            taskList.add(task);
            taskStatus.put(task, false);
            return true;
        }
        return false;
    }

    /*
    expectedString = """
        Your tasks are:
        [ ] Eat yoghurt
        [ ] Paint the Mona Lisa
        [ ] Do laundry
        [ ] Talk to janitor
        """;
     */
    public void showAllTasks()   {
        if(!taskList.isEmpty()) {
            StringBuilder outputString = new StringBuilder();
            outputString.append("Your tasks are:\n");
            for(String task : taskList)  {
                outputString.append("[");
                outputString.append(!taskStatus.get(task) ? " " : "X");
                outputString.append(("] "));
                outputString.append(task);
                outputString.append("\n");
            }
            System.out.print(outputString);
        }   else {
            System.out.print("No tasks to display, todo list is empty");
        }

    }
}
