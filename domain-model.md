# Todo List - Domain Model

### Core Requirements
* I want to add tasks to my todo list.
* I want to see all the tasks in my todo list.
* I want to change the status of a task between incomplete and complete.
* I want to be able to get only the complete tasks.
* I want to be able to get only the incomplete tasks.
* I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
* I want to remove tasks from my list.
* I want to see all the tasks in my list ordered alphabetically in ascending order.
* I want to see all the tasks in my list ordered alphabetically in descending order.

| Class    | Member  | Type                 |
|----------|---------|----------------------|
| TodoList | list    | Map<String, Boolean> |



| Requirement | Method                                             | Return              | Note                                                                                                                                      |
|-------------|----------------------------------------------------|---------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| **1**       | `addTask(String message)`                          | `void`              | Adds a task to the list and sets the boolean value to 'false' as default, <br/> indicating that the task is not completed.                |
| **2**       | `seeAllTasks()`                                    | `String`            | Returns all the tasks nicely formatted as a string.                                                                                       |
| **3**       | `changeTaskStatus(String message, Boolean status)` | `Boolean`           | Provide the task message and a boolean value to change the status of the task.                                                            |
| **4**       | `getCompletedTasks()`                              | `String`            | Provide the completed tasks as a nicely formatted string.                                                                                 |
| **5**       | `getTasks(Boolean status)`                         | `String`            | Changed the name and updated the method of requirement 4 to include a 'status'<br/> parameter so it can be used for both cases (4 and 5). |
| **6**       | `searchForTask(String message)`                    | `String`            | Search for a specific task and returns a message indicating if it exists or not.                                                          |
| **7**       | `removeTask(String message)`                       | `void`              | Removes the specified task from the task list.                                                                                            |
| **8**       | `getTasksInAscendingOrder()`                       | `ArrayList<String>` | Returns all the tasks ordered alphabetically in ascending order                                                                           |
| **9**       | `getTasksInDescendingOrder()`                      | `ArrayList<String>` | Returns all the tasks ordered alphabetically in descending order                                                                          |




