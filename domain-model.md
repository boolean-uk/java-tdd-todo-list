| `Classes`   | `Members`                      | `Methods`                      | `Scenario`                     | `Outcome`                                       |
|-------------|--------------------------------|--------------------------------|--------------------------------|-------------------------------------------------|
| `Todo-list` | `HashMap<String,String> Tasks` | `Add(String task)`             | Task in Tasklist               | Return false, Task is not added anew            |
|             |                                |                                | Task not in Tasklist           | Return true, Task is added                      |
|             |                                | `Display()`                    | Tasklist is empty              | Return false, Print nothing                     |
|             |                                |                                | Tasklist is not empty          | Return true, Print tasks                        |
|             |                                | `changeStatus(String task)`    | Task exists                    | Return true, change status of task              |
|             |                                |                                | Task does not exist            | Return false                                    |
|             |                                | `statusDisplay(String status)` | Tasks of status exist          | Return ArrayList of all tasks with given status |
|             |                                |                                | Tasks of status do not exist   | Return empty ArrayList                          |
|             |                                | `search(String task)`          | Task exists                    | Return true                                     |
|             |                                |                                | Task does not exist            | Return false                                    |
|             |                                | `remove(String task)`          | Task exists                    | Return true, remove task from Tasks             |
|             |                                |                                | Task does not exist            | Return false                                    |
|             |                                | `sort(boolean order)`          | Tasks has values               | Return sorted array                             |
|             |                                |                                | Tasks is empty                 | Return empty array                              |