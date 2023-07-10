# Domain Model

| Classes  | Members                           | Methods               | Scenario                                                    | Outputs                        |
|----------|-----------------------------------|-----------------------|-------------------------------------------------------------|--------------------------------|
| Task     | String description, Status status | changeTheStatus()     | if the status is complete change to incomplete              |                                |
|          |                                   |                       | if the status is incomplete change to complete              |                                |
| TodoList | List<Task> tasks                  | addTask(Task task)    | if the task is not in todo list return true and add to list | true                           |
|          |                                   |                       | if the task is in todo list return false                    | false                          |
|          |                                   | getTasks()            | if the todo list is empty                                   | List<Task> list                |
|          |                                   |                       | if the todo list is not empty                               | List<Task> list                |
|          |                                   | getCompleteTasks()    | returns completed tasks only                                | List<Task> completedTaskList   |
|          |                                   | getIncompleteTasks()  | returns incompleted tasks only                              | List<Task> uncompletedTaskList |
|          |                                   | searchTask(Task task) | return task if it present                                   | Optional<Task> task            |
|          |                                   | removeTask(Task task) | if the task is in todo list return true and remove the task | true                           |
|          |                                   |                       | if the task is not in todo list return false                | false                          |
|          |                                   | getTaskInAscOrder()   | returns todo list  in ascending order                       | List<Task> listInAscOrder      |
|          |                                   | getTaskInDescOrder()  | returns todo list  in descending order                      | List<Task> listInDescOrder     |

| Enum   | Values               |
|--------|----------------------|
| Status | COMPLETE, INCOMPLETE |
