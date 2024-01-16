package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
    public HashMap<String,String> todoList = new HashMap<>();

    public String checkAllTasks(){
        if (todoList.isEmpty()){
            return "List is empty";
        }
        return todoList.toString();
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
