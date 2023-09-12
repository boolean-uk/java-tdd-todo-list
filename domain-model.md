<!--
1. I want to add tasks to my todo list.
2. I want to see all the tasks in my todo list.
3. I want to change the status of a task between incomplete and complete.
4. I want to be able to get only the complete tasks.
5. I want to be able to get only the incomplete tasks.
6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
7. I want to remove tasks from my list.
8. I want to see all the tasks in my list ordered alphabetically in ascending order.
9. I want to see all the tasks in my list ordered alphabetically in descending order.

-->

| Classes  | Methods               | Scenario                                              | Outputs                                              |
|----------|-----------------------|-------------------------------------------------------|------------------------------------------------------|
| TodoList | addTask(String task)  | 1. The task has been added successfully               | message: The task has been added                     |
|          |                       |                                                       |                                                      |
|          |                       | 1. The task didn't get added                          | message: The task has not been added                 |
|          |                       |                                                       |                                                      |
|          |                       |                                                       |                                                      |
|          | seeTasks()            | 2. The tasks are displayed                            | message: (all the tasks)                             |
|          |                       | 2. The tasks are not displayed                        | message: (error)                                     |
|          |                       |                                                       |                                                      |
|          | changeStatus()        | 3. The task' status has been changed                  | message: The status has been updated                 |
|          |                       |                                                       | true                                                 |
|          |                       | 3. The task has not been found                        | message: The task wasn't found                       |
|          |                       |                                                       | false                                                |
|          |                       |                                                       |                                                      |
|          | getCompletedTasks()   | 4. The user gets a list of tasks that are completed   | message: List of all the completed tasks             |
|          |                       |                                                       | list of tasks                                        |
|          |                       |                                                       |                                                      |
|          | getUncompletedTasks() | 5. The user gets a list of tasks that are uncompleted | message: List of all the uncompleted tasks           |
|          |                       |                                                       | list of tasks                                        |
|          | searchTask()          | 6. The task has been found                            | message: The task you searched for has been found    |
|          |                       |                                                       | true                                                 |
|          |                       | 6. The task doesn't exist                             | message: The task you searched for hasn't been found |
|          |                       |                                                       | false                                                |
|          |                       |                                                       |                                                      |
|          | removeTask()          | 7. The task has been removed                          | message: The task has been removed                   |
|          |                       |                                                       | true                                                 |
|          |                       | 7. The task isn't present in the list                 | message: The task hasn't been found                  |
|          |                       |                                                       | false                                                |
|          |                       |                                                       |                                                      |
|          | getAscendingOrder()   | 8. Get a list of all the items in ascending order     | List                                                 |
|          |                       |                                                       |                                                      |
|          | getDescendingOrder()  | 9. Get a list of all the items in descending order    | List                                                 |
|          |                       |                                                       |                                                      |

