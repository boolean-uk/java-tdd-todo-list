| Class    | Attributes              | Method                                        | Scenarios            | Output                 |
|----------|-------------------------|-----------------------------------------------|----------------------|------------------------|
| TodoList | List<Task>              | add                                           | if it's not added    | returns true           |
|          |                         |                                               | if it's added        | return false           |
|          |                         | show                                          |                      | returns tasks          |
|          |                         | modify                                        |                      | change task            |
|          |                         | get complete                                  |                      | list completed tasks   |
|          |                         | get incomplete                                |                      | list incompleted tasks |
|          |                         | search task                                   | if task is found     | return task            |
|          |                         |                                               | if task is not found | return task not found  |
|          |                         | remove task                                   |                      | remove task            |
|          |                         | show tasks alphabetically in ascending order  |                      | return tasks           |
|          |                         | show tasks alphabetically in descending order |                      | return tasks           |
| Tasks    | Name, Date, isCompleted |                                               |                      |                        |

## Core Requirements


- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

## Extension

| Class     | Attributes                  | Methods                 | Scenarios                                                                  | Output                                      |
|-----------|-----------------------------|-------------------------|----------------------------------------------------------------------------|---------------------------------------------|
| TodoList	 | List<Task>                  |                         |                                                                            |                                             |
|           |                             | getTaskById             | given a task ID                                                            | returns the task                            |
|           |                             | updateTaskName          | given a task ID and a new name                                             | returns true if success or false if failure |
|           |                             | setTaskStatus           | given a task ID and a new status (true for complete, false for incomplete) | returns true if success or false if failure |
|           |                             | getTaskCreationDateTime | given a task ID                                                            | returns the creation date and time          |
| Task      | id,Name, Date, isCompleted	 |                         |                                                                            |                                             |


- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.