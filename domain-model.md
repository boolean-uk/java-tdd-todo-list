
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
| Classes  | Methods      | Scenario         | Output       |
|----------|--------------|------------------|--------------|
| TodoList | String add() | want to add task | "task added" |
|          |              |                  |              |

```

I want to see all the tasks in my todo list.

```

| Classes  | Methods       | Scenario          | Output                       |
|----------|---------------|-------------------|------------------------------|
| TodoList | String show() | want to see tasks | prints out all tasks in list |
|          |               |                   |                              |
```

I want to change the status of a task between incomplete and complete.

```


| Classes  | Methods         | Scenario              | Output                         |
|----------|-----------------|-----------------------|--------------------------------|
| TodoList | String status() | want to change status | "task1 is incomplete/complete" |
|          |                 | of task               |                                |

```

I want to be able to get only the complete tasks.

```


| Classes  | Methods               | Scenario                    | Output                      |
|----------|-----------------------|-----------------------------|-----------------------------|
| TodoList | String showComplete() | want to see completed tasks | list of all tasks completed |
|          |                       |                             |                             |
```

I want to be able to get only the incomplete tasks.

```


| Classes  | Methods                 | Scenario                     | Output           |
|----------|-------------------------|------------------------------|------------------|
| TodoList | String showIncomplete() | want to see incomplete tasks | List of all      |
|          |                         |                              | incomplete tasks |
```

I want to search for a task and receive a message that says it wasn't found if it doesn't exist.

```

| Classes  | Methods         | Scenario                    | Output                   |
|----------|-----------------|-----------------------------|--------------------------|
| TodoList | String search() | want to search for task     | "task"                   |
|          |                 | search for task not in list | "no task with that name" |
```

I want to remove tasks from my list.

```


| Classes  | Methods         | Scenario            | Output         |
|----------|-----------------|---------------------|----------------|
| TodoList | String remove() | want to remove task | "task removed" |
|          |                 |                     |                |
```

I want to see all the tasks in my list ordered alphabetically in ascending order.
I want to see all the tasks in my list ordered alphabetically in descending order.
```


| Classes  | Methods       | Scenario                         | Output                    |
|----------|---------------|----------------------------------|---------------------------|
| TodoList | String sort() | want to see tasks alphabetically | list tasks alphabetically |
|          |               |                                  |                           |