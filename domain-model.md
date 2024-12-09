## class TodoList

| Methods                                                    | Scenario                                                                                                                                                                            | Output   |
|------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------|
| `add(String task)`                                         | Adds a task to the list of things todo.                                                                                                                                             | void     |
| `remove(String task)`                                      | Removes a task from the tasks list.                                                                                                                                                 | void     |
| `setTaskCompletionStatus(int id, boolean status)`          | Sets the task's completion status. In case the task ID matches or not it returns either true or false.                                                                              | boolean  |
| `viewIncompleteTasks()`                                    | Returns a list of incomplete tasks.                                                                                                                                                 | String[] |
| `viewCompletedTasks()`                                     | Returns a list of completed tasks.                                                                                                                                                  | String[] |
| `doesTaskExist(String task)`                               | Checks to see if a given task exist in the list or not.<br>Returns true or false depending on if it exists or not.                                                                  | boolean  |
| `printAllTasksOrdered(boolean ascending, boolean specify)` | Returns a list of all the tasks in either ascending or descending order depending<br>on user specification. The `specify` parameter is to directly set the state of the given Task. | String[] |
| `getTaskByID(int id)`                                      | Returns the task by its ID. If the task does not exist, it returns a null string.                                                                                                   | String   |
| `updateTaskText(int id, String newText)`                   | Updates a task given its ID. Will return true or false depending<br>on whether or not the task exists or not.                                                                       | boolean  |
| `getTaskDate(int id)`                                      | Returns the date the task was originally created.                                                                                                                                   | String   |

All error handling is handled inside the `add()` and `remove()` methods respectively

## class Task

| Members               |
|-----------------------|
| `int id`              |
| `String text`         |
| `boolean completed`   |
| `String creationDate` |
