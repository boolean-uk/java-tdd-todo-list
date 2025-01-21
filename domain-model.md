## Core TodoList class

| Method                        | Member Variable                | Scenario                                                                      | Result                              |
|-------------------------------|--------------------------------|-------------------------------------------------------------------------------|-------------------------------------|
| add(String name)              | HashMap<String, Boolean> tasks | Task with the provided name is not already in the todolist                    | true                                |
|                               |                                | Task with the provided name is already in the todolist                        | false                               |
|                               |                                |                                                                               |                                     |
| listTasks()                   |                                | There are tasks in the todolist                                               | string with all tasks               |
|                               |                                | There are no tasks in the todolist                                            | string with error message           |
|                               |                                |                                                                               |                                     |
| updateTaskStatus(String name) |                                | There is a task with the provided name and has the requested status           | true                                |
|                               |                                | There is no task with the provided name or does not have the requested status | false                               |
|                               |                                |                                                                               |                                     |
| listCompletedTasks()          |                                | There are completed tasks in the todolist                                     | string with all completed tasks     |
|                               |                                | There are no completed tasks in the todolist                                  | string with error message           |
|                               |                                |                                                                               |                                     |
| listNotCompletedTasks()       |                                | There are uncompleted tasks in the todolist                                   | string with all uncompleted tasks   |
|                               |                                | There are no uncompleted tasks in the todolist                                | string with error message           |
|                               |                                |                                                                               |                                     |
| searchForTask(String)         |                                | There was a task with the provided name                                       | string with the task                |
|                               |                                | There was no task with the provided name                                      | string with error message           |
|                               |                                |                                                                               |                                     |
| removeTask(String)            |                                | Task was in todolist and has been removed                                     | string with confirmation of removal |
|                               |                                | Task was not in todolist or could not be removed                              | string with error message           |
|                               |                                |                                                                               |                                     |
| taskDescending()              |                                | There are tasks in the todolist                                               | string in descending order by name  |
|                               |                                | There are no tasks in the todolist                                            | string with error message           |
|                               |                                |                                                                               |                                     |
| taskAscending()               |                                | There are tasks in the todolist                                               | string in ascending order by name   |
|                               |                                | There are no tasks in the todolist                                            | string with error message           |

## Extension TodoList class

| Method                              | Member Variables | Scenario                                 | Result                      |
|-------------------------------------|------------------|------------------------------------------|-----------------------------|
|                                     | ArrayList<Task>  |                                          |                             |
|                                     |                  |                                          |                             |
| getTaskById(int id)                 |                  | incomplete task                          | message string              |
|                                     |                  | completed task                           | message string              |
| updateTaskName(int id, String name) |                  | incomplete task                          | message string              |
|                                     |                  | completed task                           | message string              |
| updateTaskStatus(int id)            |                  | task exists and has been completed       | true                        |
|                                     |                  | task exists and is not completed anymore | false                       |
| showDateTime()                      |                  | list has tasks                           | string of tasks             |
|                                     |                  | last has no tasks                        | string message for no tasks |

## Extension Task class

| Method  | Member variables | Scenario | Result |
|---------|------------------|----------|--------|
|         | int id           |          |        |
|         | String name      |          |        |
|         | boolean status   |          |        |
|         | String time      |          |        |
| getters |                  |          |        |
| setters |                  |          |        |

