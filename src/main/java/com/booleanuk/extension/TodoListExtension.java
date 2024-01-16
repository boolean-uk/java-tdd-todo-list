package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoListExtension {
    ArrayList<Task> taskList;
    public int lastID = 0;

    public TodoListExtension() {
        taskList = new ArrayList<>();
    }

    public boolean addTask(String task)  {
        Task newTask = new Task(task, this.lastID);
        this.lastID += 1;
        taskList.add(newTask);
        if(taskList.contains(newTask))
            return true;
        else return false;
    }

    public void changeTaskName(int ID, String name)
    {
        for(Task t : taskList)
        {
            if(t.ID == ID)
            {
                t.name = name;
                return;
            }
        }
    }

    public boolean changeTaskStatus(String task)   {
        for(Task t : taskList)
        {
            if(t.name.equals(task))
            {
                t.complete = !t.complete;
                return true;
            }
        }
        return false;
    }

    public String getName(int ID)
    {
        for(Task t : taskList)
        {
            if(t.ID == ID) return t.name;
        }
        return "";
    }

    public boolean getTask(String task) {
        StringBuilder outputString = new StringBuilder();

        for(Task t : taskList)
        {
            if(t.name.equals(task))
            {
                outputString.append("Task:\n");
                outputString.append("[");
                outputString.append(!t.complete ? " " : "X");
                outputString.append("] ");
                outputString.append(t.name);

                System.out.print(outputString);
                return true;
            }
        }
        System.out.print("Task not found");
        return false;
    }

    public boolean getTask(int ID) {
        StringBuilder outputString = new StringBuilder();

        for(Task t : taskList)
        {
            if(t.ID == ID)
            {
                outputString.append("Task:\n");
                outputString.append("[");
                outputString.append(!t.complete ? " " : "X");
                outputString.append("] ");
                outputString.append(t.name);

                System.out.print(outputString);
                return true;
            }
        }
        System.out.print("Task not found");
        return false;
    }

    public boolean removeTask(String task)
    {
        for(Task t : taskList)
        {
            if(t.name.equals(task))
            {
                taskList.remove(t);
                return true;
            }
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
            for(Task task : taskList)  {
                outputString.append("[");
                outputString.append(!task.complete ? " " : "X");
                outputString.append(("] "));
                outputString.append(task.name);
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
            for(Task task : taskList)
            {
                if(task.complete == complete) count++;
            }

            if(count > 0) {
                StringBuilder outputString = new StringBuilder();
                outputString.append("You have ");
                outputString.append(count);
                outputString.append(" ");
                outputString.append(complete ? "complete " : "incomplete ");
                outputString.append("tasks:\n");

                for (Task task : taskList) {
                    if(task.complete == complete) {
                        outputString.append("[");
                        outputString.append(!task.complete ? " " : "X");
                        outputString.append(("] "));
                        outputString.append(task.name);
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
            ArrayList<Task> taskListCopy = taskList;
            taskListCopy.sort(Comparator.comparing(Task::getName));
            if(!ascending) Collections.reverse(taskListCopy);

            StringBuilder outputString = new StringBuilder();
            outputString.append("Your tasks are:\n");
            for(Task task : taskList)  {
                outputString.append("[");
                outputString.append(!task.complete ? " " : "X");
                outputString.append(("] "));
                outputString.append(task.name);
                outputString.append("\n");
            }
            System.out.print(outputString);
        }   else {
            System.out.print("No tasks to display, todo list is empty");
        }
    }

}
