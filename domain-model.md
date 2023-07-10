| Class: TodoList                              |                                                                                                                               |                                       |
|----------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|---------------------------------------|
| **Attributes**                               | **Scenario**                                                                                                                  | **Return type**                       |
| HashMap\<Task\> taskList                     | N/A                                                                                                                           | N/A                                   |
| **Methods**                                  |                                                                                                                               |                                       |
| addTask(String name, String description)     | Adding a new task to the todo list.<br><br>Adding a new task to the todo list failed (duplicate, etc.)                        | boolean<br><br>boolean                |
| getAllTasks()                                | Retrieving all the tasks in the todo list.                                                                                    | HashMap\<String, Task\>               |
| getCompleteTasks()                           | Retrieving all the tasks in the todo list. with status == "COMPLETE"                                                          | HashMap\<String, Task\>               |
| getIncompleteTasks()                         | Retrieving all the tasks in the todo list. with status == "INCOMPLETE"                                                        | HashMap\<String, Task\>               |
| searchTask(String name)                      | Searching for an existing task in the todo list.<br><br>Searching for a non-existent task in the todo list.                   | Task<br><br>Task                      |
| removeTask(String name)                      | Removing an existing task from the todo list.<br><br>Removing a non-existent task from the todo list.                         | boolean<br><br>boolean                |
| getAllTasksAscending()                       | Retrieving all the tasks in the todo list ordered alphabetically in ascending order                                           | HashMap\<String, Task\>               |
| getAllTasksDescending()                      | Retrieving all the tasks in the todo list ordered alphabetically in descending order                                          | HashMap\<String, Task\>               |
| changeStatus(String name, TaskStatus status) | Changing the status of existing task<br><br>Changing the status of nonexisting task<br><br>Changing the status with wrong type | boolean<br><br>boolean<br><br>boolean |


| Class: Task                              | Scenario:                                                                                                                      | Returns:                     |
|------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|------------------------------|
| **Attributes**                           |                                                                                                                                |                              |
| String name                              | N/A                                                                                                                            | N/A                          |
| String description                       | N/A                                                                                                                            | N/A                          |
| TaskStatus status                        | N/A                                                                                                                            | N/A                          |
