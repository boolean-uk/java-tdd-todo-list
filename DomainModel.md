## Domain model To-do list

Class TodoList:



| Member Variables               | Methods                       | Scenario                      | Output       |
|--------------------------------|-------------------------------|-------------------------------|--------------|
| HashMap<String, boolean> tasks | addTask(String task)          | Task added successfully       | true         |
|                                |                               | Task already exists           | false        |
|                                | getTasks()                    | mapTasks in NOT empty         | String       |
|                                |                               | mapTasks is empty             | String       |
|                                | changeTaskStatus(String task) | Task is incomplete            | String?/void |
|                                |                               | Task is complete?             | String?/void |
|                                | getCompletedTasks()           | There are completed tasks     | String       |
|                                |                               | There are NO completed tasks  | String       |
|                                | getIncompleteTasks()          | There are incomplete tasks    | String       |
|                                |                               | There are NO incomplete tasks | String       |
|                                | searchForTask(String task)    | Task exists in list           | String/true  |
|                                |                               | Task doesn't exist            | String/false |
|                                | removeTask()                  | Task exists in list           | true         |
|                                |                               | Task doesn't exist            | false        |
|                                | getSortedTasksAscending()     | listTasks is NOT empty        | String       |
|                                |                               | listTasks is empty            | String       |
|                                | getSortedTasksDescending()    | listTasks is NOT empty        | String       |
|                                |                               | listTasks is empty            | String       |
|                                |                               |                               |              |
|                                |                               |                               |              |

