# Domain models

## Core
```
I want to add tasks to my todo list.
I want to see all the tasks in my todo list.
I want to change the status of a task between incomplete and complete.
I want to be able to get only the complete tasks.
I want to be able to get only the incomplete tasks.
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
I want to remove tasks from my list.
I want to see all the tasks in my list ordered alphabetically in ascending order.
I want to see all the tasks in my list ordered alphabetically in descending order.
```

```
In case of lists we typed <Task<Task>> to make it visible on the preview
```

| Class    | Field                  | Method                                    | Scenario                                                                     | Output                  |
|----------|------------------------|-------------------------------------------|------------------------------------------------------------------------------|-------------------------|
| ToDoList | List<Task<Task>> tasks | void addTask(Task task)                   | If you want to add a task to your to-do list                                 |                         |
|          |                        | List<Task<Task>> getAllTasks()            | If you want to see all the tasks                                             | List of tasks           |
|          |                        | void changeStatusOfTask(String content)   | If you want to change your task's status                                     |                         |
|          |                        | List<Task<Task>> getAllCompletedTasks()   | If you want to see all completed tasks                                       | List of completed tasks |
|          |                        | List<Task<Task>> getAllUncompletedTasks() | If you want to see all uncompleted tasks                                     |                         |
|          |                        | String searchForATask(String content)     | If you want to search for a particular task and it is present in the list    | Null string             |
|          |                        |                                           | If you want to search for a particular task and it isn't present in the list | String with message     |
|          |                        | void removeTask(String content)           | If you want to remove a particular task from your list                       |                         |
|          |                        | List<Task<Task>> allTasksOrderedAsc()     | If you want to get your list ordered alphabetically in ascending order       | List of tasks           |
|          |                        | List<Task<Task>> allTasksOrderedDesc()    | If you want to get your list ordered alphabetically in descending order      | List of tasks           |
|          |                        |                                           |                                                                              |                         |
| Task     | String content         |                                           |                                                                              |                         |
|          | boolean complete       |                                           |                                                                              |                         |


## Extension

```
- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.
```

| Class    | Field                      | Methods                                  | Scenario                                                                     | Output             |
|----------|----------------------------|------------------------------------------|------------------------------------------------------------------------------|--------------------|
| Task     | String content             |                                          |                                                                              |                    |
|          | boolean complete           |                                          |                                                                              |                    |
|          | int id                     |                                          |                                                                              |                    |
|          | LocalDateTime dateTimeTask |                                          |                                                                              |                    |
|          |                            |                                          |                                                                              |                    |
| ToDoList | List<Task<Task>> tasks     | Task getTask(int id)                     | If you want to get a task by its id                                          | Task task          |
|          |                            | void updateTask(String name, int id)     | If you want to update the name of a task by providing its ID and a new name. |                    |
|          |                            | void changeStatusOfTask(int id)          | If you want to change the status of a task by providing its ID               |                    |
|          |                            | LocalDateTime getDateAndTimeTask(int id) | If you want to see the date and time of task you just created                | LocalDateTime time |
