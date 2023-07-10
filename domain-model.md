Domain model:

| Classes     | Methods                           | Scenario                                    | Outputs                                                              |
|-------------|-----------------------------------|---------------------------------------------|----------------------------------------------------------------------|
| `TodoList`  | `add(String task)`                | Task should be added                        | void                                                                 |
|             | `taskList()`                      | There are tasks in Todo list                | outputs the list of task                                             |
|             |                                   | There are no tasks in Todo list             | error message                                                        |
|             | `statusChange(String task)`       | Task has been completed                     | void                                                                 |
|             | `completedTasks()`                | There are no completed tasks in Todo list   | error message                                                        |
|             |                                   | Task has been completed                     | outputs the list of completed task                                   |
|             | `incompletedTasks()`              | There are no incompleted tasks in Todo list | error message                                                        |
|             |                                   | Task has been completed                     | outputs the list of incompleted task                                 |
|             | `taskSearch(String task)`         | There is such task in Todo list             | message which says that the task exists                              |
|             |                                   | There is no such task in Todo list          | message which says that the task doesnt exist                        |
|             | `taskRemove(String task)`         | There is such task in Todo list             | void                                                                 |
|             | `tasksAsc()`                      | There are tasks in Todo list                | outputs the list of tasks ordered aplhabetically in ascending order  |
|             |                                   | There are no tasks in Todo list             | error message                                                        |
|             | `tasksDesc()`                     | There are tasks in Todo list                | outputs the list of tasks ordered aplhabetically in descending order |
|             |                                   | There are no tasks in Todo list             | error message                                                        |
| `Extension` | `getTask(int id)`                 | There is a task with such ID                | outputs a task with mentioned id                                     |
|             |                                   | There is no task with such ID               | outputs an error message                                             |
|             | `updateTask(int id, String name)` | There is a task with such ID                | void                                                                 |
|             | `updateTask(int id)`              | There is a task with such ID                | void                                                                 |
|             | `updateStatus(int id)`            | There is a task with such ID                | void                                                                 |
|             | `getTimeOfCreation(int id)`       | There is a task with such ID                | outputs a time of task creation                                      |


