| Class  | Attributes                     |
|--------|--------------------------------|
| `Task` | `boolean isCompleted`          |
|        | `String text`                  |
|        | `LocalDateTime dateOfCreation` |



| Class      | Attributes                     | Methods                               | Scenarios | Outputs |
|------------|--------------------------------|---------------------------------------|-----------|---------|
| `TodoList` | `HashMap<Integer, Task> tasks` | `getTask(int id)`                     |           | Task    |
|            |                                | `updateTaskName(int id, String text)` |           | true    |
|            |                                | `changeTaskStatus(int id)`            |           | void    |
|            |                                | `displayTasks()`                      |           |         |
|            |                                | `addTask(String text)`                |           |         |
