
TodoList

| Method                                               | Member variable                | Scenario                                                       | Output                                      |
|------------------------------------------------------|--------------------------------|----------------------------------------------------------------|---------------------------------------------|
| addTask(String task)                                 | HashMap<String, Boolean> tasks | If user wants to add task to the todo list that doesn't exist  | true                                        |
|                                                      |                                | If user wants to add task to the todo list that already exists | false                                       |
| seeList()                                            |                                | User wants to see all the tasks                                | The todo list as a string                   |
| updateTaskStatus(String task, boolean updatedStatus) |                                | If user wants to update status of task that exists             | true                                        |
|                                                      |                                | If user wants to update status of task that doesn't exist      | false                                       |
| getCompletedTasks()                                  |                                | User wants to see the completed tasks                          | list of the completed tasks                 |
| getUncompletedTasks()                                |                                | User wants to see the uncompleted tasks                        | list of the uncompleted tasks               |
| doesTaskExist(String task)                           |                                | If user asks whether an existing task exists                   | "The task exists!"                          |
|                                                      |                                | If user asks whether a non-existing task exists                | "The task doesn't exist!"                   |
| remove(String task)                                  |                                | If user wants to remove existing task                          | true                                        |
|                                                      |                                | If user wants to remove non-existing task                      | false                                       |
| getListInAlphabeticalOrder(boolean ascending)        |                                                                | User wants the list in alphabetically ascending order          | the list in alphabetically ascending order  |
|                                                      |                                | User wants the list in alphabetically descending order         | the list in alphabetically descending order |                          |
