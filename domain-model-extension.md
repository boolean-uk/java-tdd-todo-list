#Domain model for Extension

```
- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.
```

| Class             | Members           | Methods                    | Scenarios             | Results/OutPuts           |
|-------------------|-------------------|----------------------------|-----------------------|---------------------------|
| Task              | int id            | int getID()                | Access task ID        | returns ID                |
|                   | String name       |                            |                       |                           |
|                   | String status     | String getName()           | Access task name      | returns name              |
|                   | String created    |                            |                       |                           |
|                   |                   | void setName()             | Sets/changes name     | returns nothing           |
|                   |                   |                            |                       |                           |
|                   |                   | String getStatus()         | Access task           | returns status            |
|                   |                   |                            | status                |                           |
|                   |                   | void setStatus()           | Sets/changes          | returns nothing           |
|                   |                   |                            | task status           |                           |
|                   |                   | String getCreatedAt()      | Access date           | returns date of           |
|                   |                   |                            | created               | creation in simple format |
|                   |                   | String toString()          | Turns specific tasks  | returns string with       |
|                   |                   |                            | with attributes to    | all attributes            |
|                   |                   |                            | a string              |                           |
|                   |                   |                            |                       |                           |
| TodoListExtension | Arraylist<String> | String addTask()           | Adds task to list of  | returns task added if,    |
|                   | tasks             |                            | tasks with all        | changes attribute         |
|                   |                   |                            | attributes            |                           |
|                   |                   | String getTaskByID()       | Accesses the list     | returns the entire task   |
|                   |                   |                            | of tasks to get task  | if it exists              |
|                   |                   |                            | by unique ID          |                           |
|                   |                   | boolean updateTaskName()   | Changes the name of   | changes attribute,        |
|                   |                   |                            | a task with unique ID | returns true if changed   |
|                   |                   | boolean updateTaskStatus() | Changes the status of | changes attribute,        |
|                   |                   |                            | a task with unique ID | returns true if changed   |
