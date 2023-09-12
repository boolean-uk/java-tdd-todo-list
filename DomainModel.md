## Domain model To-do list

### Core Requirements:

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

### Extension Requirements

Class TodoList:

| Member Variables          | Methods                             | Scenario                         | Output |
|---------------------------|-------------------------------------|----------------------------------|--------|
| ArrayList<Task> tasksList | getTaskById(int id)                 | Task with this id exists         | String |
|                           |                                     | Task with this id does not exist | String |
|                           | updateTaskName(int id, String name) | Task with this id exists         | true   |
|                           |                                     | Task with this id does not exist | false  |
|                           | changeTaskStatus(int id)            | Task with this id exists         | String |
|                           |                                     | Task with this id does not exist | String |
|                           | getTaskTimeAndDate(int id)          | Task with this id exists         | String |
|                           |                                     | Task with this id does not exist | String |

Class Task:

| Member Variables | Methods        | Scenario                | Output |
|------------------|----------------|-------------------------|--------|
| static? int id   | id getter      |                         |        |
| String name      | id setter?     |                         |        |
| boolean status   | name getter    |                         |        |
|                  | name setter    | name is valid           | void   |
|                  |                | name is an empty string | void   |
|                  | status setter  |                         |        |
|                  | status getter  |                         |        |
|                  | toggleStatus() |                         |        |
