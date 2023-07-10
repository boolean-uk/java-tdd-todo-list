

| Classes  | Methods                                | Fields              | Scenario                            | Outcome                                    |
|----------|----------------------------------------|---------------------|-------------------------------------|--------------------------------------------|
| TodoList | add(Task task)                         | List<Task> tasks    | Add task to todo list               | boolean whether succeeded                  |
|          | getAll()                               |                     | Show all tasks                      | String with all tasks                      |
|          | toggleStatus(int id)                   |                     | Toggle task status                  | boolean status                             |
|          | getCompleteTasks()                     |                     | Get complete tasks                  | List<Task> with complete tasks             |
|          | getIncompleteTasks()                   |                     | Get incomplete tasks                | List<Task> with incomplete tasks           |
|          | findTask(int id)                       |                     | Search whether task exists          | String message with search result          |
|          | removeTask(int id)                     |                     | Remove task from list               | boolean whether succeeded                  |
|          | getTasksAscending()                    |                     | Show all tasks in ascending order   | List<Task> with tasks in ascending order   |
|          | getTasksDescending()                   |                     | Show all tasks in descending order  | List<Task> with tasks in descending order  |
|          | getById(int id)                        |                     | If task exists                      | Task with given id                         |
|          |                                        |                     | If task doesn't exist               | NotFoundException                          |
|          | updateTaskName(int id, String newName) |                     | Update task name                    | boolean whether succeeded                  |
|          | getTaskByDate()                        |                     | Show all tasks sorted by createTime | List<Task> with tasks sorted by createTime |
| Task     |                                        | int id              |                                     |                                            |
|          |                                        | String name         |                                     |                                            |
|          |                                        | boolean status      |                                     |                                            |
|          |                                        | DateTime createTime |                                     |                                            |
|          | toggleStatus()                         |                     | Toggle task status                  | boolean whether succeeded                  |