## class TodoList

| Methods                                                    | Members                 | Scenario                                                                                                                                                                           | Output  |
|------------------------------------------------------------|-------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------|
| `add(String task)`                                         | `ArrayList<Task> tasks` | Adds a task to the list of things todo.                                                                                                                                            | void    |
| `remove(String task)`                                      | `ArrayList<Task> tasks` | Removes a task from the tasks list.                                                                                                                                                | void    |
| `toggleTaskCompletion(String task)`                        | `ArrayList<Task> tasks` | Toggles the completion of the given targeted task.                                                                                                                                 | void    |
| `viewIncompleteTasks()`                                    |                         | Prints out a list of incomplete tasks.                                                                                                                                             | void    |
| `viewCompletedTasks()`                                     |                         | Prints out a list of completed tasks.                                                                                                                                              | void    |
| `doesTaskExist(String task)`                               | `ArrayList<Task> tasks` | Checks to see if a given task exist in the list or not.<br>Returns true or false depending on if it exists or not.                                                                 | boolean |
| `printAllTasksOrdered(boolean ascending, boolean specify)` |                         | Prints out a list of all the tasks in either ascending or descending order depending on user specification. The `specify` parameter is to directly set the state of the given Task | void    |

All error handling is handled inside the `add()` and `remove()` methods respectively

## class Task

| Members             |
|---------------------|
| `String text`       |
| `boolean completed` |

