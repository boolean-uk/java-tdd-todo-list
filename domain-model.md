| Classes    | Methods                               | Fields                 | Scenario                   | Outputs                   |
|------------|---------------------------------------|------------------------|----------------------------|---------------------------|
| `Task`     |                                       | String name            |                            |                           |
|            |                                       | Boolean completed      |                            |                           |
| `TodoList` |                                       | ArrayList<Task>  tasks |                            |                           |
|            | `addTask(String taskName)`            |                        | If task is in the list     | `false`                   |
|            |                                       |                        | If task is not in the list | `true`                    |
|            | `removeTask(String taskName)`         |                        | If task is in the list     | `String taskRemoved`      |
|            |                                       |                        | If task is not in the list | `String taskRemoved`      |
|            | `displayAll()`                        |                        |                            | `String tasks`            |
|            | `changeStatus()`                      |                        |                            | `Boolean status`          |
|            | `getComplete()`                       |                        |                            | `String completedTasks`   |
|            | `getUncomplete()`                     |                        |                            | `String uncompletedTasks` |
 |            | `searchTaskByName(String taskName)`   |                        | If task is in the list     | `String task`             |
|            |                                       |                        | If task is not in the list | `String message`          |
|            | `displayInAlphabeticalOrder()`        |                        |                            | `String orderedTasks`     |
|            | `displayInReverseAlphabeticalOrder()` |                        |                            | `String orderedTasks`     |
|            |                                       |                        |                            |                           |
|            | `getTaskByID()`                       |                        |                            | `String task`             |
|            | `updateName()`                        |                        |                            | `String taskName`         |
|            | `changeStatusByID()`                  |                        |                            | `Boolean status`          |
|            | `taskGetDate()`                       |                        |                            | `String dateCreated`      |


