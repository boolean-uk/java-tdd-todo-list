##For extension task

| Classes  | Methods                                                       | Scenario                 | Output               |
|----------|---------------------------------------------------------------|--------------------------|----------------------|
| Task     | setTaskName(String newName)                                   |                          |                      |
|          | getTaskName()                                                 |                          | String               |
|          | getStatus()                                                   |                          | String               |
|          | changeStatusOfTask(int id)                                    | if status = "incomplete" | status = "complete"  |
|          |                                                               | if status = "complete    | status = "incomplete |
|          | getDate()                                                     |                          | Date                 |
| ToDoList | addTask(String taskName)                                      |                          | Task                 |
|          | getTaskById(int id)                                           | if Id is incorrect       | Exception            |
|          |                                                               | if Id is correct         | Task                 |
|          | updateTaskNameByProvidingIdAndNewName(int id, String newName) | if Id is incorrect       | Exception            |
|          |                                                               | if Id is correct         | Task                 |
|          | changeTaskStatusByProvidingId(int id)                         | if Id is incorrect       | Exception            |
|          |                                                               | if Id is correct         | Task                 |
