
TodoList

| Method                                             | Member variable             | Scenario                                                                  | Output                                        |
|----------------------------------------------------|-----------------------------|---------------------------------------------------------------------------|-----------------------------------------------|
| addTask(String name, String id)                    | HashMap<String, Task> tasks | If user wants to add task to the todo list with an ID that doesn't exist  | true                                          |
|                                                    |                             | If user wants to add task to the todo list with an ID that already exists | false                                         |
| seeList()                                          |                             | User wants to see all the tasks                                           | The todo list as a string                     |
| updateTaskStatus(String id, boolean updatedStatus) |                             | If user wants to update status of task with id that exists                | true                                          |
|                                                    |                             | If user wants to update status of task with id that doesn't exist         | false                                         |
| getCompletedTasks()                                |                             | User wants to see the completed tasks                                     | list of the completed tasks                   |
| getUncompletedTasks()                              |                             | User wants to see the uncompleted tasks                                   | list of the uncompleted tasks                 |
| doesTaskExist(String id)                           |                             | If user asks whether an existing task exists                              | "The task exists!"                            |
|                                                    |                             | If user asks whether a non-existing task exists                           | "The task doesn't exist!"                     |
| remove(String id)                                  |                             | If user wants to remove existing task                                     | true                                          |
|                                                    |                             | If user wants to remove non-existing task                                 | false                                         |
| getListInAlphabeticalOrder(boolean ascending)      |                             | User wants the list in alphabetically ascending order                     | the list in alphabetically ascending order    |
|                                                    |                             | User wants the list in alphabetically descending order                    | the list in alphabetically descending order   |                          |
| updateNameOfTask(String id, String newName)        |                             | If user wants to change the name of a task with an id that exists         | true                                          |
|                                                    |                             | If user wants to change the name of a task with an id that doesn't exist  | false                                         |
| getCreationInfo(String id)                         |                             | User wants to see the date and time that the task was created             | String of time and date when task was created |

Task

| Member variable    |
|--------------------|
| String id          |
| String name        |
| boolean status     |
| String timeCreated |
| String dateCreated |
