## Core Requirements
```
- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.
```

| Class    | Variables             | Methods                                       | Situation                                                                        | Output / Response                                                           |
|----------|-----------------------|-----------------------------------------------|----------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| Task     | String name           |                                               |                                                                                  |                                                                             |
|          | boolean complete      |                                               |                                                                                  |                                                                             |
|          |                       | boolean setComplete()                         |                                                                                  |                                                                             |
|          |                       | boolean setIncomplete()                       |                                                                                  |                                                                             |
| TodoList | ArrayList<Task> tasks |                                               |                                                                                  |                                                                             |
|          |                       | boolean addTask(Task task)                    | The user adds a task                                                             | If a new task is successfully added to tasks return true                    |
|          |                       | ArrayList<Task> showTasks()                   | The user wants to see what tasks are currently in tasks                          | The method returns an ArrayList of tasks                                    |
|          |                       | ArrayList<Task> getCompleteTasks()            | The user requests a list of complete Tasks                                       | returns an ArrayList of tasks where task.complete == true                   |
|          |                       | ArrayList<Task> getIncompleteTasks()          | The user requests a list of incomplete Tasks                                     | returns an ArrayList of tasks where task.complete == false                  |
|          |                       | String searchTasks(String taskName)           | the user searches for a task containing taskName                                 | returns string with message dependent on if there was a task with that name |
|          |                       | boolean removeTask(String taskName)           | the user removes a task with taskName                                            | returns true if the task was successfully removed otherwise returns false   |
|          |                       | ArrayList<Task> sortTasks(boolean descending) | the user requests an alphabetically sorted list in ascending or descending order | returns a sorted ArrayList in alphabetical order                            |

## Extension Requirements

```
- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.
```