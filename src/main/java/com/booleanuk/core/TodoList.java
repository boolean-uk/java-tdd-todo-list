package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TodoList {
    public HashMap<String,String> todoList = new HashMap<>();

    public boolean isTaskInList(String task){
        return todoList.containsKey(task);
    }

    public String checkAllTasks(){
        if (todoList.isEmpty()){
            return "List is empty";
        }
        return todoList.toString();
    }

    public String addTask(String task, String status){
        if (isTaskInList(task)){
            return "Can not add: Task already added";
        }
        todoList.put(task,status);
        return "Task added";
    }

    public String removeTask(String task){
        if (!isTaskInList(task)){
            return "Task does not exist";
        }
        todoList.remove(task);
        return "Task removed";
    }

    public String checkOneTask(String task){
        if (!isTaskInList(task)){
            return "Task not found";
        }
        return task +": "+ todoList.get(task);
    }

    public String changeTaskStatus(String task, String status){
        todoList.replace(task,status);
        return "Status changed";
    }

    public String [] getCompleteOrIncomplete(String status){
        ArrayList<String> tasks = new ArrayList<>();
        if (todoList.containsValue(status)){
            for (HashMap.Entry<String,String> entry: todoList.entrySet()){
                if (Objects.equals(entry.getValue(), status)){
                    tasks.add(entry.getKey());
                }
            }
        }
        String [] taskArray = new String[tasks.size()];
        for(int i = 0; i < taskArray.length; i++){
            taskArray[i] = tasks.get(i);
        }
        return taskArray;
    }
}

/*

| Class    | Members                | Methods                  | Scenario                        | Output/Result                |
|----------|------------------------|--------------------------|---------------------------------|------------------------------|
| TodoList | HashMap<String,String> | String                   | User wants to list all tasks    | returns the current          |
|          | todoList               | checkAllTasks()          |                                 | todoList                     |
|          |                        |                          |                                 |                              |
|          |                        | String changeTaskStatus( | User wants to set specific      | returns "status changed"     |
|          |                        | String task, String      | task as complete or incomplete  | returns "Invalid task" if    |
|          |                        | status)                  |                                 | task does not exist          |
|          |                        |                          |                                 |                              |
|          |                        | String                   | User wants to look up a task    | returns task name and value  |
|          |                        | checkOneTask(String      | and check it's status           | returns "task not found" if  |
|          |                        | task)                    |                                 | task does not exist          |
|          |                        |                          |                                 |                              |
|          |                        | String                   | User wants to add a task to     | returns "Task added"         |
|          |                        | addTask(String task,     | the todoList                    | returns "Could not add task" |
|          |                        | String status)           |                                 | if task already exists       |
|          |                        |                          |                                 |                              |
|          |                        | String                   | User wants to remove a task     | return "task removed"        |
|          |                        | removeTask(String task)  | from the todoList               | if removed and "task does    |
|          |                        |                          |                                 | not exist" task is not found |
|          |                        |                          |                                 |                              |
|          |                        | boolean                  | Checks if a task is in the list | returns true if it exists    |
|          |                        | isTaskInList()           |                                 | returns false if it does not |
 */
