package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
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

    public boolean changeTaskStatus(String task)   {
        if(taskList.contains(task))
        {
            taskStatus.put(task, !taskStatus.get(task));
            return true;
        }   else {
            System.out.println("Task not in list");
            return false;
        }
    }

    public boolean getTask(String task) {
        StringBuilder outputString = new StringBuilder();
        if(taskList.contains(task))
        {
            outputString.append("Task:\n");
            outputString.append("[");
            outputString.append(!taskStatus.get(task) ? " " : "X");
            outputString.append("] ");
            outputString.append(task);

            System.out.print(outputString);
            return true;
        }
        System.out.print("Task not found");
        return false;
    }

    public boolean removeTask(String task)
    {
        if(taskList.contains(task))
        {
            taskList.remove(task);
            taskStatus.remove(task);
            return true;
        }
        System.out.print("Task not found");
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

    public void showAllTasks(boolean complete)  {
        if(!taskList.isEmpty()) {
            int count = 0;
            for(String task : taskList)
            {
                if(taskStatus.get(task) == complete) count++;
            }

            if(count > 0) {
                StringBuilder outputString = new StringBuilder();
                outputString.append("You have ");
                outputString.append(count);
                outputString.append(" ");
                outputString.append(complete ? "complete " : "incomplete ");
                outputString.append("tasks:\n");

                for (String task : taskList) {
                    if(taskStatus.get(task) == complete) {
                        outputString.append("[");
                        outputString.append(!taskStatus.get(task) ? " " : "X");
                        outputString.append(("] "));
                        outputString.append(task);
                        outputString.append("\n");
                    }
                }
                System.out.print(outputString);
            } else {
                System.out.print("No tasks to show");
            }
        }   else {
            System.out.print("No tasks to show");
        }
    }

    public void showAllTasksOrdered(boolean ascending)
    {
        if(!taskList.isEmpty()) {
            ArrayList<String> taskListCopy = taskList;
            Collections.sort(taskListCopy);
            if(!ascending) Collections.reverse(taskListCopy);

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
