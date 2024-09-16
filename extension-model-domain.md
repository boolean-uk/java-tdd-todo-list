# Extension requirements

## Task
| Class | Attributes  | Methods          | Scenario                                  | Result                                              |
|-------|-------------|------------------|-------------------------------------------|-----------------------------------------------------|
| Task  | name        | name()           |                                           | returns a String representation of the task         |
|       | completed   | isCompleted()    | if completed is true                      | return true                                         |
|       |             | isCompleted()    | if completed is not true                  | return false                                        |
|       | TaskId      |                  | A unique identifier for each Task.        |                                                     |
|       | timeCreated |                  | A timestamp of when the Task was created. |                                                     |
|       |             | getTimeCreated() |                                           | Returns the formated time when the Task was created |

## Todo List
| Class    | Attributes            | Methods              | Scenario | Result |
|----------|-----------------------|----------------------|----------|--------|
| TodoList | List<Tasks> tasksList | addTask(String name) |          |        |
|          |                       | addTask(Task task)   |          |        |

## Extension 1
```
I want to be able to get a task by a unique ID.
```

| Class    | Attributes  | Methods         | Scenario                           | Result           |
|----------|-------------|-----------------|------------------------------------|------------------|
| TodoList | List<Tasks> | getTaskById(ID) | A task with the argument ID exists | return that Task |
|          |             |                 | otherwise                          | return null      |

## Extension 2
```
I want to update the name of a task by providing its ID and a new name.
```

| Class    | Attributes  | Methods                 | Scenario                            | Result                                                         |
|----------|-------------|-------------------------|-------------------------------------|----------------------------------------------------------------|
| TodoList | List<Tasks> | updateTask(ID, newName) | A task with the argument ID exists  | return true and update the task name with the newName argument |
|          |             |                         | otherwise                           | return false                                                   |

## Extension 3
```
I want to be able to change the status of a task by providing its ID.
```

| Class    | Attributes  | Methods              | Scenario                            | Result                                                             |
|----------|-------------|----------------------|-------------------------------------|--------------------------------------------------------------------|
| TodoList | List<Tasks> | changeStatusByID(ID) | A task with the argument ID exists  | return true and change the completed attribute of the task to true |
|          |             |                      | otherwise                           | return false                                                       |

## Extension 4
```
I want to be able to see the date and time that I created each task.
```

| Class    | Attributes  | Methods     | Scenario | Result                                                           |
|----------|-------------|-------------|----------|------------------------------------------------------------------|
| TodoList | List<Tasks> | showTasks() |          | Show a list of all Tasks as well ass the time they were created. |
|          |             |             |          |                                                                  |

For this, the Task now contains an Attribute called timeCreated
comment