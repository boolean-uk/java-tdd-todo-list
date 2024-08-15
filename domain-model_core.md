| Classes  | Methods                                        | Scenarios                         | Outputs                   |
|----------|------------------------------------------------|-----------------------------------|---------------------------|
| Todolist | addTask (String tasks)                         | If tasks are not in Todolist      | True                      |
|          |                                                | If tasks are in Todolist          | False                     |
|          |                                                |                                   |                           |
|          | getAllTasks()                                  | Always                            | List<Task>                |
|          |                                                |                                   |                           |
|          | changeTaskStatus(String tasks, boolean status) | If the task exists, update status | True                      |
|          |                                                | If the task does not exist        | False                     |  |                                   |                                | |                                   |                                |
|          |                                                |                                   |                           |
|          | searchTask(String)                             | If task find                      | Print(Task was found)     |
|          |                                                | If task not found                 | Print(No task found)      |
|          |                                                |                                   |                           |
|          | removeTask(String)                             | If task exist                     | True (removed)            |
|          |                                                | If task not exist                 | False ErrorMessage        |
|          |                                                |                                   |                           |
|          | sortListAscending()                            | Always                            | List<Task>                |
|          |                                                |                                   |                           |
|          | sortListDesvending()                           | Always                            | List<Task>                |
|          |                                                |                                   |                           |
| Task     | GetDescription(String)                         | Always                            | Description of the object |
|          |                                                |                                   |                           |
|          | Iscompleted(Boolean)                           | Always                            | True                      |
|          |                                                |                                   |                           |
|          | setComplete(Boolean)                           | Always if exists                  | True or False             |
