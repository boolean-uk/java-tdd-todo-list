| Class: TodoList                          |                                                                                                             |                  |
|------------------------------------------|-------------------------------------------------------------------------------------------------------------|------------------|
| **Attributes**                           | **Scenario**                                                                                                | **Return type**  |
| List\<Task\> taskList                    | N/A                                                                                                         | N/A              |
| **Methods**                              |                                                                                                             |                  |
| addTask(String name, String description) | Adding a new task to the todo list.                                                                         | void             |
| getAllTasks()                            | Retrieving all the tasks in the todo list.                                                                  | List\<Task\>     |
| getCompleteTasks()                       | Retrieving all the tasks in the todo list. with status == "COMPLETE"                                        | List\<Task\>     |
| getIncompleteTasks()                     | Retrieving all the tasks in the todo list. with status == "INCOMPLETE"                                      | List\<Task\>     |
| searchTask(string)                       | Searching for an existing task in the todo list.<br><br>Searching for a non-existent task in the todo list. | Task<br><br>null |
| removeTask(Task)                         | Removing an existing task from the todo list.<br><br>Removing a non-existent task from the todo list.       | void<br><br>void |
| getAllTasksAscending()                   | Retrieving all the tasks in the todo list ordered alphabetically in ascending order                         | List\<Task\>     |
| getAllTasksDescending()                  | Retrieving all the tasks in the todo list ordered alphabetically in descending order                        | List\<Task\>     |


| Class: Task                              | Scenario:                                                                                                                      | Returns:                     |
|------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|------------------------------|
| **Attributes**                           |                                                                                                                                |                              |
| String name                              | N/A                                                                                                                            | N/A                          |
| String description                       | N/A                                                                                                                            | N/A                          |
| TaskStatus status                        | N/A                                                                                                                            | N/A                          |
| **Methods**                              |                                                                                                                                |                              |
| changeStatus(String name, String status) | Changing the status of existing task<br><br>Changing the status of nonexisting task<br><br>Changing the status with wrong type | void<br><br>void<br><br>void |
