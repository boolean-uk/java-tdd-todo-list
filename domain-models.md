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