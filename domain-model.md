| Classes    | Members            | Methods                  | Scenario                           | Outputs    |
|------------|--------------------|--------------------------|------------------------------------|------------|
| `TodoList` | `List<Task> tasks` | `Add(Task task)`         | Add task to todoList               | -          |
|            |                    | `getTasks()`             | Get all tasks                      | List<Task> |
|            |                    | `getCompletedTasks()`    | Get complete tasks                 | List<Task> |
|            |                    | `getIncompletedTasks()`  | Get incomplete tasks               | List<Task> |
|            |                    | `removeTask(Task task)`  | Remove a particular task           | -          |
|            |                    | `search(Task task)`      | Search for a particular task       | String     |
|            |                    | `sortAscending()`        | Sort the tasks in ascending order  | List<Task> |
|            |                    | `sortDescending()`       | Sort the tasks in descending order | List<Task> |



| Classes | Members             | Methods     | Scenario           | Outputs |
|---------|---------------------|-------------|--------------------|---------|
| `Task`  | `String title`      | `setStatus` | Change task status | -       |
|         | `TaskStatus status` | `getStatus` | Get task status    | Enum    |
|         |                     | `getTitle`  | Get task title     | String  |

