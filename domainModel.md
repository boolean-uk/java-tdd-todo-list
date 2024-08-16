## Domain Model

### Core Requirements

- [x] I want to add tasks to my todo list.
- [x] I want to see all the tasks in my todo list.
- [x] I want to change the status of a task between incomplete and complete.
- [x] I want to be able to get only the complete tasks.
- [x] I want to be able to get only the incomplete tasks.
- [x] I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- [x] I want to remove tasks from my list.
- [x] I want to see all the tasks in my list ordered alphabetically in ascending order.
- [x] I want to see all the tasks in my list ordered alphabetically in descending order.


| Class    | Variables                     | Method                   | Scenario                                  | Outcome                                                |
|----------|-------------------------------|--------------------------|-------------------------------------------|--------------------------------------------------------|
| TodoList | ArrayList<Task task> todoList | add(String name)         | Append task to todoList                   | "Successfully added task "name" to list                |
|          |                               |                          |                                           | "Task with name "name" already exists"                 |
|          |                               | viewList()               | Get all tasks from todoList               | "Todo 'name' - 'incomplete"                            |
|          |                               |                          |                                           | "Task list is empty"                                   |
|          |                               | changeStatus(Task task)  | Change state of task status               | "Task incomplete" -> "Task complete"                   |
|          |                               |                          |                                           | "Task complete" -> "Task incomplete"                   |
|          |                               | getComplete()            | Get all completed tasks                   | Get incomplete completed tasks                         |
|          |                               |                          |                                           | "There is no completed tasks"                          |
|          |                               | getInComplete()          | Get all incomplete tasks                  | Get all incomplete tasks                               |
|          |                               |                          |                                           | "All tasks are completed"                              |
|          |                               | searchTasks(String name) | Get task with input name                  | "Task - in/complete"                                   |
|          |                               |                          |                                           | "Task with name 'name' does not exist"                 |
|          |                               | removeTask(Task task)    | Remove specific task with the name 'name' | "Task 'name' is removed"                               |
|          |                               |                          |                                           | "Task 'name' does not exist and therefore not deleted" |
|          |                               | viewListAscending        | Get all tasks in Ascending order of name  | task1, task2, task3...                                 |
|          |                               |                          |                                           | "Task list is empty"                                   |
|          |                               | viewListDescending       | Get all tasks in descending order of name | "...task3, task2, task1"                               |
|          |                               |                          |                                           | "Task list is empty"                                   |
| Task     | String name                   | createTask(String name)  | Create a task object                      | "Task created"                                         |
|          | boolean isComplete            |                          |                                           | "Task name is already taken"                           |
|          |                               | getTaskName()            | Get task name                             | "Task 'name'"                                          |
|          |                               |                          |                                           | "Task with 'name' does not exist"                      |
|          |                               | getTaskStatus()          | Get task status from task                 | "Complete"/ "Incomplete"                               |
|          |                               |                          |                                           | "Task does not exist"                                  |
|          |                               | changeStatus()           | Change the current status of task         | isComplete: false -> true                              |
|          |                               |                          |                                           | isComplete: true -> false                              |


