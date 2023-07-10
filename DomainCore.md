##For Core Task

| Classes    | Methods                                            | Scenario                            | Outputs    |
|------------|----------------------------------------------------|-------------------------------------|------------|
| `TodoList` | `add(String task)`                                 | new Task is added to list           | Task       |
|            | `getTasks()`                                       | if list is not empty                | List<Task> |
|            | `getCompleteTasks()`                               | return all complete                 | List<Task> |
|            | `getIncompleteTasks()`                             | return all incomplete tasks         | List<Task> |
|            | `getTask(int taskId)`                              | task is present in the list         | Task       |
|            |                                                    | task is not present in the list     | Exception  |
|            | `removeTask(int taskId)`                           | if task exists in list it is removed| true       |
|            |                                                    | if task does not exist              | false      |
|            | `removeAllTasks()`                                 | if tasks exist in list it is removed| true       |
|            |                                                    | if tasks do not exist               | false      |
|            | `sortTasksAsc()`                                   | tasks are getting sorted  asc       | List<Task> |
|            | `sortTasksDsc()`                                   | tasks are getting sorted   dsc      | List<Task> |
|            | `updateDescription(int id, String newDescription)` | if task exists                      | Task       |
|            |                                                    | if task not exists                  | Exception  |
|            | `changeTaskStatusById(int id)`                     | if task exists                      | Task       |
|            |                                                    | if task not exists                  | Exception  |

| Classes  | Methods                         | Scenario                 | Outputs                                         |
|----------|---------------------------------|--------------------------|-------------------------------------------------|
| ToDoList | add(String task                 |                          | Map<String, String>                             |
|          | allTasks()                      |                          | List<Task>                                      |
|          | changeStatusOfTask(String task) | if Map contains task     | status is change on opposite                    |
|          | completeTask()                  |                          | List<String> of tasks with status = "complete   |
|          | inCompleteTask()                |                          | List<String> of tasks with status = "incomplete |
|          | search(String task)             | if Map contains task     | String                                          |
|          |                                 | if Map not contains task | "Task wasn't found"                             |
|          | remove(String task)             |                          |                                                 |
|          | sortTasksAsc()                  |                          | List<String>                                    |
|          | sortTasksDesc()                 |                          | List<String>                                    |

