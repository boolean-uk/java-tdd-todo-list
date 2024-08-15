
Class Task

| Variables       | Methods       |   |   |
|-----------------|---------------|---|---|
| int uniqueID    | getID()       |   |   |
| Boolean status  | getStatus()   |   |   |
| int dateCreated | getDate()     |   |   |
| String taskName | getTaskName() |   |   |
|                 | setStatus()   |   |   |
|                 | setTaskName() |   |   |
|                 |               |   |   |
|                 |               |   |   |

Class TodoListExtension 

| Variables       | Methods                                  | scenario                                                | result                                                | user story |
|-----------------|------------------------------------------|---------------------------------------------------------|-------------------------------------------------------|------------|
|                 | addTask(String task)                     | Task exists                                             | print error, return false                             | 1          |
|                 |                                          | task doesn't exist                                      | return true                                           |            |
| ArrayList<Task> | getTaskByID(int id)                      | task exists                                             | returns task.toString()                               | 10         |
|                 |                                          | task doesn't exist                                      | returns empty object                                  |            |
|                 | seeALlTasks()                            | tasklist is not empty                                   | print tasks, return true                              | 2          |
|                 |                                          | tasklist is empty                                       | print error, return false                             |            |
|                 | updateTaskNameByID(int id, String name)  | task exists                                             | setTaskName() and return true                         | 3 11       |
|                 |                                          | task doesn't exist                                      | print error and return false                          |            |
|                 | updateStatusByID(int id, Boolean status) | task exists                                             | setStatus(id, newStatus), return true                 | 12         |
|                 |                                          | task doesn't exists                                     | print error, return false                             |            |
|                 | getDateAndTime()                         | List isn't empty                                        | print and return true                                 | 13         |
|                 |                                          | getCompletedTasks()                                     | Iterate map and construct<br/>list of completed tasks | 4          |
|                 | getUncompletedTasks()                    | Iterate map and construct<br/>list of uncompleted tasks | returns list of incomplete tasks                      | 5          |
|                 | searchTasks(String task)                 | task doesn't exist in map                               | print error, return empty String                      | 6          |
|                 |                                          | task exists in map                                      | return list of all tasks with that name               |            |
|                 | removeTask(Int id)                       | task doesn't exist in map                               | print error, return false                             | 7          |
|                 |                                          | task exists in map                                      | remove task key from list, return true                |            |
|                 | getSortedTasks(String order)             | order is "Ascending"                                    | return sorted list in ascending order                 | 8 9        |
|                 |                                          | order is "Descending"                                   | return sorted list in descending order                |            |                 |                                          | List is empty       | return false                          |            |
|                 |                                          |                                                         |                                                       |            |



