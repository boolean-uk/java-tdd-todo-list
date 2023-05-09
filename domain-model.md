## Core part

| Classes  | Attributes            | Methods                 | Scenario                        | Output                              |
|----------|-----------------------|-------------------------|---------------------------------|-------------------------------------|
| Task     | String isComplete     | getIsComplete()         | task is complete                | returns true                        |
|          | String name           |                         | task is incomplete              | returns false                       |
|          |                       | setIsComplete()         |                                 |                                     |
| TodoList | ArrayList<Task> tasks | addTask(String name)    |                                 | adds new task to the list           |
|          |                       | getList()               |                                 | returns all tasks in the list       |
|          |                       | getCompletedTasks()     | list has no completed tasks     | returns null                        |
|          |                       |                         | list contains completed tasks   | returns list of completed tasks     |    
|          |                       | getIncompletedTasks()   | list has no incompleted tasks   | returns null                        |
|          |                       |                         | list has incompleted tasks      | returns list of incompleted tasks   |       
|          |                       | search(String name)     | list does not contain this task | prints "This task was not found"    |
|          |                       |                         | list contains this task         | prints "Task was found in the list" |
|          |                       | removeTask(String name) |                                 | task is removed from the list       |
|          |                       | getAscOrder()           |                                 | returns list in ascending order     |
|          |                       | getDescOrder()          |                                 | returns list in descending order    |

## Extension part

| Classes  | Attributes                         | Methods                               | Output                                         |
|----------|------------------------------------|---------------------------------------|------------------------------------------------|
| Task     | long id                            |                                       |                                                |
|          | String name                        |                                       |                                                |
|          | bollean status                     |                                       |                                                |
|          | LocaleDateTime creationDateAndTime |                                       |                                                |
|          |                                    |                                       |                                                |
| TodoList | List<Task> tasks                   |                                       |                                                |
|          |                                    | getTaskById (long id)                 | Found retunrs task else null                   |
|          |                                    | updateTaskNameByById(long id)         |                                                |
|          |                                    | updateTaskStatusByById (long id)      |                                                |
|          |                                    | getCreationDateTimeByTaskId (long id) | Retunrs string of date and time else not found |


