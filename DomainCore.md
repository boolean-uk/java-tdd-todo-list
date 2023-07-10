##For Core Task


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

