

| Class Members                         | Methods                    | Scenarios                      | Output           |
|---------------------------------------|----------------------------|--------------------------------|------------------|
| ArrayList<String> toDoList            | addTask(String task)       | add task to toDOList           | true             |
| ArrayList<Boolean> taskComplete       |                            | task already in list           | false            |
|                                       |                            |                                |                  |
|                                       | displayTasks()             | print all tasks in todolist    | true             |
|                                       |                            | todolist empty                 | false            |
|                                       |                            |                                |                  |
|                                       | taskStatus(String Task,    | Task status updated            | task status      |
|                                       | boolean status) (true =    | Task was not found             | false            |
|                                       | complete)                  |                                |                  |
|                                       |                            |                                |                  |
|                                       | displayCompletedTasks()    | Iterate through and get        | completedTasks   |
|                                       |                            | completed tasks                |                  |
|                                       |                            |                                |                  |
|                                       | displayIncompletedTasks()  | Iterate through and get        | incompletedTasks |
|                                       |                            | completed tasks                |                  |
|                                       |                            |                                |                  |
|                                       | searchTask(String task)    | Iterate through and get        | "Found"          |
|                                       |                            | task                           |                  |
|                                       |                            | Not found during search        | "Not Found"      |
|                                       |                            |                                |                  |
|                                       | removeTask(String task)    | Search tasks and remove task   | true             |
|                                       |                            | task if found                  |                  |
|                                       |                            | if not found                   | false            |
|                                       |                            |                                |                  |
|                                       | alphabetizeUp()            | Alphabetizes the todolist      | alphabetizedList |
|                                       |                            | in rising order                |                  |
|                                       |                            |                                |                  |
|                                       | alphabetizeDown()          | Alphabetizes the todolist      | alphabetizedList |
|                                       |                            | in decreasing order            |                  |
|                                       |                            |                                |                  |
|                                       |                            |                                |                  |
| Extensions                            | Extensions                 | Extensions                     | Extensions       |
| HashMap<String, String > mapIdToTask  | addTaskID(String task,     | same as addTask() but also     |                  |
|                                       | String ID)                 | adds the id and task in        |                  |
| HashMap<String, int> indexMap         |                            | mapIdToTask                    |                  |
| (Key ID, value index)                 |                            | Added                          | true             |
|                                       |                            | Already added                  | false            |
|                                       |                            |                                |                  |
|                                       | getTask(String ID)         | searches and finds task        | task             |
|                                       |                            | corresponding to ID            |                  |
|                                       |                            |                                |                  |
|                                       | newTaskName(String ID,     | updated toDoList and map       | true             |
|                                       | String newName)            | with new name                  |                  |
|                                       |                            | ID not found                   | false            |
|                                       |                            |                                |                  |
|                                       | taskStatusID(String ID     | Updates task status with id    | taskstatus       |
|                                       | boolean status)            | task not found                 | false            |
|                                       |                            |                                |                  |
| HashMap<String, String> mapTaskToTime | addTaskIDTime(String task, | Same as addTaskID(), but       | true             |
| (Key ID, value time)                  | String ID)                 | also logs the date and time    |                  |
|                                       |                            | task already added             | false            |
|                                       |                            |                                |                  |
|                                       | getTaskTime(String ID)     | Looks up time stamp for a task | time             |
|                                       |                            |                                |                  |
|                                       |                            |                                |                  |
|                                       |                            |                                |                  |
|                                       |                            |                                |                  |
|                                       |                            |                                |                  |
|                                       |                            |                                |                  |

