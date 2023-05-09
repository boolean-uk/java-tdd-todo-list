| Class    | Members                       | Method                      | Senarios                                     | Output  |
|----------|-------------------------------|-----------------------------|----------------------------------------------|---------|
| TodoList | List<Task>todos               |                             |                                              |         |
|          |                               | `add(Task task)  `          | add the task to the List                     | void    |
|          |                               | `view()  `                  | return the List                              | List<>  |
|          |                               | `changeStatus(Task task) `  | changes the boolean completed of the task !  | void    |
|          |                               | `getCompletedTasks()`       | get only the task with task.completed==True  | List<>  |
|          |                               | `getInompletedTasks`        | get only the task with task.completed==False | List<>  |
|          |                               | `seach(Task task)`          | contains()                                   | String  |
|          |                               | `remove(List<tasks> tasks)` | remove tasks from todos                      | void    |
|          |                               | `ascOrder()`                | ordered alphabetically in ascending          | List<>  |
|          |                               | `dscOrder()`                | ordered alphabetically in descending         | List<>  |
| Task     | String name,boolean completed |                             |                                              |         |
|          |                               | `getName()`                 | Get task name                                | String  |
|          |                               | `isCompleted`               | Get task completion                          | boolean |


