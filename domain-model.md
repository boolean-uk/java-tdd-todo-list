| Classes  | Methods                                        | Scenario                                                     | Outputs                                               |
|----------|------------------------------------------------|--------------------------------------------------------------|-------------------------------------------------------|
| TodoList | addTask(String taskDescription)                | Add a new task to the todo list.                             | None                                                  |
|          | viewAllTasks()                                 | View all tasks in the todo list.                             | List of all tasks in the todo list.                   |
|          | changeTaskStatus(int taskId, boolean complete) | Change the status of a task between incomplete and complete. | None                                                  |
|          | getCompleteTasks()                             | Get only the complete tasks from the todo list.              | List of complete tasks in the todo list.              |
|          | getIncompleteTasks()                           | Get only the incomplete tasks from the todo list.            | List of incomplete tasks in the todo list.            |
|          | searchTask(String taskDescription)             | Search for a task and receive a message if it doesn't exist. | Message indicating whether the task was found or not. |
|          | removeTask(int taskId)                         | Remove a task from the todo list.                            | None                                                  |
|          | viewAllTasksOrderedAlphabeticallyAscending()   | View all tasks ordered alphabetically in ascending order.    | List of all tasks in alphabetical ascending order.    |
|          | viewAllTasksOrderedAlphabeticallyDescending()  | View all tasks ordered alphabetically in descending order.   | List of all tasks in alphabetical descending order.   |
