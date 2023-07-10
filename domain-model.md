| Class      | Attributes                       | Methods                             | Scenarios                         | Outputs |
|------------|----------------------------------|-------------------------------------|-----------------------------------|---------|
| `TodoList` | `HashMap<String, Boolean> tasks` | `addTask(String text)`              | If task is in todo list           | false   |
|            |                                  |                                     | If task isn't in todo list        | true    |
|            |                                  | `displayTasks()`                    | When we want to display all tasks | String  |
|            |                                  | `changeTaskStatus(String text)`     |                                   | void    |
|            |                                  | `displayCompleteTasks()`            |                                   |         |
|            |                                  | `displayIncompleteTasks()`          |                                   |         |
|            |                                  | `getTask(String text)`              |                                   |         |
|            |                                  | `removeTask(String text)`           |                                   |         |
|            |                                  | `displayAlphabeticallyAscending()`  |                                   |         |
|            |                                  | `displayAlphabeticallyDescending()` |                                   |         |
