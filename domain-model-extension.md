| Classes    | Members                | Methods                               | Scenario            | Outputs                                     |
|------------|------------------------|---------------------------------------|---------------------|---------------------------------------------|
| `TodoList` |                        | `getById(int id)`                     | If task found       | Returns the task                            |
|            |                        |                                       | If task not found   | Returns null                                |
|            |                        | `updateNameById(String name, int id)` | If it exists        | Returns true                                |
|            |                        |                                       | If it doesn't exist | Returns false                               |
|            |                        | `changeStatusById(int id)`            | If it exists        | Returns true                                |
|            |                        |                                       | If it doesn't exist | Returns false                               |
|            |                        | `showMeDateTimes()`                   |                     | Returns messages of Date Time for each task |
| `Task`     | `DateTime timeCreated` |                                       |                     |                                             |
|            |                        | `changeStatus()`                      |                     |                                             |