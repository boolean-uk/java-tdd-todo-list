## Domain Model


```
- I want to add tasks to my todo list.
```

| Classes  | Methods                    | Scenario                      | Returns |
|----------|----------------------------|-------------------------------|---------|
| TodoList | boolean addTask(Task task) | User adds a non-existent task | True    |
|          |                            | User adds a existent task     | False   |


```
- I want to see all the tasks in my todo list.
```

| Classes  | Methods            | Scenario          | Returns               |
|----------|--------------------|-------------------|-----------------------|
| TodoList | String getTodoList | List is not empty | String with all tasks |
|          |                    | List is empty     | "You have no tasks"   |


```
- I want to change the status of a task between incomplete and complete.
```

| Classes  | Methods                          | Scenario                   | Returns                              |
|----------|----------------------------------|----------------------------|--------------------------------------|
| TodoList | String toggleStatus(String name) | Task exists and is changed | "Status changed to (Current status)" |
|          |                                  | Task does not exist        | "Task does not exist"                |

```
- I want to be able to get only the complete tasks.
```

| Classes  | Methods                    | Scenario                 | Returns                           |
|----------|----------------------------|--------------------------|-----------------------------------|
| TodoList | String getCompletedTasks() | Completed tasks exist    | String containing completed tasks |
|          |                            | No completed tasks exist | "There are no completed tasks"    |

```
- I want to be able to get only the incomplete tasks.
```

| Classes  | Methods                     | Scenario                 | Returns                            |
|----------|-----------------------------|--------------------------|------------------------------------|
| TodoList | String getIncompleteTasks() | Incomplete tasks exist   | String containing incomplete tasks |
|          |                             | No completed tasks exist | "There are no incomplete tasks"     |

```
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
```

| Classes  | Methods                        | Scenario    | Returns                   |
|----------|--------------------------------|-------------|---------------------------|
| TodoList | String taskExists(String name) | Task exists | Task + " exists"          |
|          |                                |             | Task + " does not exist"  |


```
- I want to remove tasks from my list.
```

| Classes  | Methods                             | Scenario           | Returns |
|----------|-------------------------------------|--------------------|---------|
| TodoList | boolean removeTasks(String[] tasks) | Tasks exist        | true    |
|          |                                     | Tasks do not exist | false   |

```
- I want to see all the tasks in my list ordered alphabetically in ascending order.
```

| Classes  | Methods                | Scenario          | Returns                              |
|----------|------------------------|-------------------|--------------------------------------|
| TodoList | String ascendingList() | List has items    | String with ascending order of tasks |
|          |                        | List has no items | "List has no tasks"                  |

```
- I want to see all the tasks in my list ordered alphabetically in descending order.
```

| Classes  | Methods                 | Scenario          | Returns                               |
|----------|-------------------------|-------------------|---------------------------------------|
| TodoList | String descendingList() | List has items    | String with descending order of tasks |
|          |                         | List has no items | "List has no tasks"                   |
