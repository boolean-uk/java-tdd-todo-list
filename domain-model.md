#Domain model for TodoList

###User Stories

```
- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.
```

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
|          |                        | String                   | User wants to remove a task     | return "Task removed"        |
|          |                        | removeTask(String task)  | from the todoList               | if removed and "task does    |
|          |                        |                          |                                 | not exist" task is not found |
|          |                        |                          |                                 |                              |
|          |                        | boolean                  | Checks if a task is in the list | returns true if it exists    |
|          |                        | isTaskInList()           |                                 | returns false if it does not |
|          |                        |                          |                                 |                              |
|          |                        | String []                | User wants to see all complete  | returns String [] containing |
|          |                        | getCompleteOrIncomplete  | or incomplete tasks             | all wanted tasks             |
|          |                        | (String status)          |                                 |                              |
|          |                        |                          |                                 |                              |


