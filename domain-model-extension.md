# Task creator

## Extension Requirements
```
- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.
```

| Classes        | Methods                                                        | Scenario                                              | Outputs                                  |
|----------------|----------------------------------------------------------------|-------------------------------------------------------|------------------------------------------|
| `Task`         | `getId(): String`                                              | Get the unique ID of the task                         | Unique ID of the task                    |
|                | `getId(): String`                                              | Get the name of the task                              | Name of the task                         |
|                | `getName(): String`                                            | Update the name of the task                           | Updated name of the task                 |
|                | `getStatus(): TaskStatus`                                      | Get the status of the task                            | Status of the task (e.g., "IN_PROGRESS") |
| `TaskCreator ` | `setStatus(status: TaskStatus)`                                | Change the status of the task                         | Updated status of the task               |
|                | `getCreationDateTime(): LocalDateTime`                         | Get the date and time the task was created            | Date and time of task creation           |
|                | `getTaskById(id: String): Optional<Task>`                      | Get a task by its unique ID                           | -                                        |
|                | `updateTaskName(id: String, newName: String): void`            | Update the name of a task given its ID                | -                                        |
|                | `changeTaskStatus(id: String, newStatus: TaskStatus): void`    | Change the status of a task given its ID              | -                                        |
|                | `getTaskCreationDateTime(id: String): Optional<LocalDateTime>` | Get the date and time a task was created given its ID | -                                        |

```



