| Classes    | Members               | Methods                              | Scenario                                                         | Outputs                    |
| ---------- | --------------------- | ------------------------------------ | ---------------------------------------------------------------- | -------------------------- |
| `TodoList` | `List<Task> todoList` | `addTask(String taskName)`           | Task with the provided name is added to list.                    | void                       |
|            |                       | `displayList(List<Task> list)`       | List is displayed in readable format.                            | String                     |
|            |                       | `removeTask(String taskName)`        | Task with the provided name exists in the list -> it is removed. | void                       |
|            |                       | `removeTask(Task task)`              | Task is removed.                                                 | void                       |
|            |                       | ``getAllTasks()``                    | Return all the tasks in the todo list.                           | `List<Task>`               |
|            |                       | `getCompleteTasks()`                 | Return all completed tasks in todo list.                         | `List<Task>`               |
|            |                       | `getIncompleteTasks()`               | Return all incomplete tasks in todo list.                        | `List<Task>`               |
|            |                       | `search(String taskName)`            | Task with given name exists in list.                             | String "Task exists"       |
|            |                       |                                      | Task with given name does not exist in list.                     | String "Task wasn't found" |
|            |                       | `sortListAlphabeticallyAscending()`  | List is sorted alphabetically ascending.                         | `List<Task>`               |
|            |                       | `sortListAlphabeticallyDescending()` | List is sorted alphabetically descending.                        | `List<Task>`               |
| `Task`     | `boolean complete`    | `setComplete(boolean)`               | Sets boolean to true/false depending on input parameter.         | void                       |
|            |                       | ``isComplete()``                     | The task is set as completed.                                    | true                       |
|            |                       |                                      | The task is not set as completed.                                | false                      |
|            | `String name`         | `getName`                            | Return name of task.                                             | String                     |
