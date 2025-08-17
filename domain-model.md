
## Domain Model ##
| Classes      | Members                                                           | Methods                              | Scenario                                                           | Outputs                 |
|--------------|-------------------------------------------------------------------|--------------------------------------|--------------------------------------------------------------------|-------------------------|
| **TodoList** | `hashMap<String, Boolean> tasks` (key: name, value: true or false | boolean `addTask(String name)`       | If task with the provided name is nor in the to do list            | `true`                  |
|              |                                                                   |                                      | Task with the provided name is already in to do list` → do nothing | `false`                 |
|              |                                                                   | List<String> getAll()                | List that contains tasks                                           | HashMap<String, Boolean |
|              |                                                                   | Boolean changeStatus(String name)    | Name exists, then flip status                                      | True                    |
|              |                                                                   |                                      | Not found                                                          | False                   |
|              |                                                                   | List<String> getCompleteTasks()      | when tasks are completed, then get completed tasks with name       | True                    |
|              |                                                                   | List<String> getIncomplete           | look for incomplete tasks and return them                          | True                    |
|              |                                                                   | List<String> getIncomplete           | All tasks completed or no tasks exist                              | empty List              |
|              |                                                                   | String search(String name)           | found                                                              | String                  |
|              |                                                                   |                                      | not found                                                          | String                  |
|              |                                                                   | boolean remove(String name)          | found --> delete                                                   | True                    |
|              |                                                                   |                                      | not found --> delete                                               | False                   |
|              |                                                                   | List<String> sortedInAscendingOrder  | Go through list and sort                                           | String                  |
|              |                                                                   | List<String> sortedInDescendingOrder | go through list and sort                                           | String                  |


