| Classes    | Members                | Methods                               | Scenario            | Outputs          |
|------------|------------------------|---------------------------------------|---------------------|------------------|
| `TodoList` |                        | `getById(int id)`                     | If task found       | Returns the task |
|            |                        |                                       | If task not found   | Returns null     |
|            |                        | `updateNameById(String name, int id)` | If it exists        | Returns true     |
|            |                        |                                       | If it doesn't exist | Returns false    |
|            |                        | `changeStatusById(int id)`            | If it exists        | Returns true     |
|            |                        |                                       | If it doesn't exist | Returns false    |
|            |                        | `getDateTimeById(int id)`             | If it exists        | Returns DateTime |
|            |                        |                                       | If it doesn't exist | Returns null     |
| `Task`     | `DateTime timeCreated` |                                       |                     |                  |
|            |                        | `changeStatus()`                      |                     |                  |