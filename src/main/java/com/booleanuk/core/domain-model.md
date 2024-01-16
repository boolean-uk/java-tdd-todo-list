# Domain Model - Core

- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

| Classes  | Methods                                 | Member Variables                         | Scenario                                | Outputs / Return Value |
|----------|-----------------------------------------|------------------------------------------|-----------------------------------------|------------------------|
| Task     | setCompleted(boolean completed)         | boolean completed                        | Task set to complete                    | True                   |
|          |                                         |                                          | Task set to incomplete                  | False                  |
|          | getDescription()                        | String description                       |                                         | String                 |
|          | isCompleted()                           | boolean completed                        |                                         | boolean                |
|          | toString()                              | String description<br/>boolean completed | Get Task as a String                    | String                 |
| TodoList | add(Task task)                          | ArrayList\<Task> tasks                   | Task added to todolist                  | True                   |
|          |                                         |                                          | Task could not be added                 | False                  |
|          | remove(Task task)                       | ArrayList\<Task> tasks                   | Task removed from todolist              | True                   |
|          |                                         |                                          | Task could not be removed from todolist | False                  |
|          | getTask(String description)             | ArrayList\<Task> tasks                   | Task exists                             | Task                   |
|          |                                         |                                          | Task does not exist                     | null                   |
|          | getTasks()                              | ArrayList\<Task> tasks                   | Get all tasks                           | ArrayList\<Task>       |
|          |                                         |                                          | There are no tasks                      | ArrayList\<Task>       |
|          | getTasks(boolean completion)            | ArrayList\<Task> tasks                   | Get all tasks by completion             | ArrayList\<Task>       |
|          |                                         |                                          | There are no tasks                      | ArrayList\<Task>       |
|          | getAlphabeticalTasks(boolean ascending) | ArrayList\<Task> tasks                   | Get all tasks alphabetically            | ArrayList\<Task>       |
|          |                                         |                                          | There are no tasks                      | ArrayList\<Task>       |
|          | clear()                                 | ArrayList\<Task> tasks                   | Removes all tasks from the todo-list    | void                   |
