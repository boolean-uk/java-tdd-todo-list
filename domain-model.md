| Classes    | Methods                        | Scenario                             | Outputs    |
|------------|--------------------------------|--------------------------------------|------------|
| `TodoList` | `addTask(String task)`         | new Task is added to list            | task       |
|            | `getTasks()`                   | if list is not empty                 | List<Task> |
|            | `changeTaskStatus(int taskId)` | task status is changed to complete   | task       |
|            |                                | task status is changed to incomplete | task       |
|            | `getCompleteTasks()`           | return all complete                  | List<Task> |
|            | `getIncompleteTasks()`         | return all incomplete tasks          | List<Task> |
|            | `getTask(int taskId)`          | task is present in the list          | task       |
|            |                                | task is not present in the list      | Exception  |
|            | `removeTask(int taskId)`       | if task exists in list it is removed | true       |
|            |                                | if task does not exist               | false      |
|            | `removeAllTasks()`             | if tasks exist in list it is removed | true       |
|            |                                | if tasks do not exist                | false      |
|            | `sortTasksAsc()`               | tasks are getting sorted  asc        | List<Task> |
|            | `sortTasksDsc()`               | tasks are getting sorted   dsc       | List<Task> |