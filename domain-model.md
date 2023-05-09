| Classes    | Members            | Methods                         | Scenario               | Outputs                |
|------------|--------------------|---------------------------------|------------------------|------------------------|
| `TodoList` | `List<Task> tasks` | `addTask(Task task)`            |                        |                        |
|            |                    | `removeTask(Task task)`         | If task exists         | Return true            |
|            |                    |                                 | If task doesn't exists | Return false           |
|            |                    | `getTasks()`                    |                        | Return list of Tasks   |
|            |                    | `getCompleteTasks()`            |                        | Return list of Tasks   |
|            |                    | `getIncompleteTasks()`          |                        | Return list of Tasks   |
|            |                    | `searchTaskByName(String name)` | If Task exists         | Return found message   |
|            |                    |                                 | If Task doesn't exist  | Return failure message |
|            |                    | `getTasksOrderedNameAsc()`      |                        | Return list of Tasks   |
|            |                    | `getTasksOrderedNameDesc()`     |                        | Return list of Tasks   |
| `Task`     |                    | `changeStatus()`                |                        |                        |