````
1. I want to add tasks to my todo list.
2. I want to see all the tasks in my todo list.
3. I want to change the status of a task between incomplete and complete.
4. I want to be able to get only the complete tasks.
5. I want to be able to get only the incomplete tasks.
6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
7. I want to remove tasks from my list.
8. I want to see all the tasks in my list ordered alphabetically in ascending order.
9. I want to see all the tasks in my list ordered alphabetically in descending order.
````

| Classes  | Methods                                   | Member Variables                  | Scenario                                                              | Results                              |
|----------|-------------------------------------------|-----------------------------------|-----------------------------------------------------------------------|--------------------------------------|
| TodoList | 1. addTask(String task, boolean)          | HashMap<String, boolean> taskList | 1. Add task to todo list success fully                                | todolist changed                     |
|          |                                           |                                   |                                                                       | return true                          |
|          |                                           |                                   |                                                                       |                                      |
|          | 2. getTasks( )                            |                                   | 2. See all tasks in todo list                                         | string                               |
|          |                                           |                                   |                                                                       |                                      |
|          | 3. changeTaskStatus(String task, boolean) |                                   | 3. change the status of tasks to completed                            | task status changed to completed     |
|          |                                           |                                   |                                                                       | return true  ?                       |
|          |                                           |                                   | change the status of the task to not completed                        | task status changed to not completed |
|          |                                           |                                   |                                                                       | return false?                        |
|          |                                           |                                   |                                                                       |                                      |
|          | 4. getCompletedTasks()                    |                                   | 4. get all completed tasks                                            | string                               |
|          |                                           |                                   |                                                                       |                                      |
|          |                                           |                                   |                                                                       |                                      |
|          | 5. getIncompleteTasks()                   |                                   | 5. get all the incomplete tasks                                       | string                               |
|          |                                           |                                   |                                                                       |                                      |
|          |                                           |                                   |                                                                       |                                      |
|          | 6. searchForTaskFailed(string)            |                                   | 6. search a specific task and receive message if it's not in the list | string                               |
|          |                                           |                                   |                                                                       |                                      |
|          |                                           |                                   |                                                                       |                                      |
|          | 7. removeTask(string)                     |                                   | 7. remove a task from the list                                        | todolist changed                     |
|          |                                           |                                   |                                                                       | return true                          |
|          |                                           |                                   |                                                                       |                                      |
|          | 8. sortTasksAscending()                   |                                   | 8. See all the tasks in alphabetically ascending order.               | String                               |
|          |                                           |                                   |                                                                       |                                      |
|          | 9. sortTasksDescending()                  |                                   | 9. See all the tasks in alphabetically descending order.              | String                               |