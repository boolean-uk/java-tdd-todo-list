
| Classes    | Members                    | Methods                                        | Scenario                                     | Outputs                                   |
|------------|----------------------------|------------------------------------------------|----------------------------------------------|-------------------------------------------|
| `ToDoList` | `HashMap<String, String>`  | `addTask(String taskName, String status)`      | Adds a task                                  | "Done"                                    |
|            | `HashMap<Integer, String>` |                                                | Task already exists                          | "Task already exists"                     |
|            | `HashMap<String, String>`  | `printTasks()`                                 | Prints the list                              | the List                                  |
|            |                            | `changeStatus(String taskName, String status)` | Changes the status of a task                 | "Status changed"                          |
|            |                            |                                                | Task does not exists                         | "Non-existent task"                       |
|            |                            | `printCompleteTasks()`                         | Prints the completed tasks                   | a list with the completed tasks           |
|            |                            | `printUncompleteTasks()`                       | Prints the uncompleted tasks                 | a list with the uncompleted tasks         |
|            |                            | `searchTask(String taskName)`                  | Returns the task                             | The task                                  |
|            |                            |                                                | Task was not found so returns a message      | "The task was not found"                  |
|            |                            | `RemoveTask(String taskName)`                  | Remove a task from the List                  | "Done"                                    |
|            |                            |                                                | In the case which the task does not exists   | "The task does not exist"                 |
|            |                            | `ascendingSort()`                              | Returns the list ordered in ascending order  | A list with the tasks in ascending order  |
|            |                            | `descedingSort()`                              | Returns the list ordered in descending order | A list with the tasks in descending order |
|            |                            | `searchWithId(int id)`                         | Return the task by a unique id               | The task                                  |
|            |                            |                                                |                                              | "Task was not found"                      |
|            |                            | `updateNameWithId(int id, String taskName)`    | Updates the task by providing id and name    | "Done"                                    |
|            |                            |                                                |                                              | "Task was not found"                      |
|            |                            | `changeStatusWithId(int id, String status)`    | Changes the status of a task by providing ID | "Done"                                    |
|            |                            |                                                |                                              | "Task was not found"                      |
|            |                            | `tasksCreationTimeFn(String task)`             | Returns the creation time of the task        | The date and time                         |
|            |                            |                                                |                                              | "Task was not found"                      |
