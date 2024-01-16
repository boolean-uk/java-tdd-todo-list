## Core Requirements

```
I want to add tasks to my todo list.
```

| Method           | Member variable            | Scenario                        | Output/Results |
|------------------|----------------------------|---------------------------------|----------------|
| add(String task) | ArrayList<String> todoList | If task *doesn't* exist in list | Append to list |
|                  |                            | If task *does* exist in list    | false          |


```
I want to see all the tasks in my todo list.
```

| Method      | Member variable            | Scenario              | Output/Results |
|-------------|----------------------------|-----------------------|----------------|
| viewTasks() | ArrayList<String> todoList | If list *isn't* empty | true           |
|             |                            | If list *is* empty    | false          |


```
I want to change the status of a task between incomplete and complete.
```

| Method                    | Member variable                  | Scenario                | Output/Results |
|---------------------------|----------------------------------|-------------------------|----------------|
| changeStatus(String task) | HashMap<String, String> todoList | If task *does* exist    | true           |
|                           |                                  | If task *doesn't* exist | false          |


```
I want to be able to get only the complete tasks.
```

| Method             | Member variable                  | Scenario                        | Output/Results |
|--------------------|----------------------------------|---------------------------------|----------------|
| getCompleteTasks() | HashMap<String, String> todoList | If complete tasks *do* exist    | true           |
|                    |                                  | If complete tasks *don't* exist | false          |


```
I want to be able to get only the incomplete tasks.
```

| Method               | Member variable                  | Scenario                          | Output/Results |
|----------------------|----------------------------------|-----------------------------------|----------------|
| getIncompleteTasks() | HashMap<String, String> todoList | If incomplete tasks *do* exist    | true           |
|                      |                                  | If incomplete tasks *don't* exist | false          |


```
I want to search for a task and receive a message
that says it wasn't found if it doesn't exist.
```

| Method                     | Member variable                  | Scenario                        | Output/Results |
|----------------------------|----------------------------------|---------------------------------|----------------|
| searchForTask(String task) | HashMap<String, String> todoList | If task *does* exist in list    | true           |
|                            |                                  | If task *doesn't* exist in list | false          |


```
I want to remove tasks from my list.
```

| Method              | Member variable                  | Scenario                        | Output/Results |
|---------------------|----------------------------------|---------------------------------|----------------|
| remove(String task) | HashMap<String, String> todoList | If task *does* exist in list    | true           |
|                     |                                  | If task *doesn't* exist in list | false          |


```
I want to see all the tasks in my list
ordered alphabetically in ascending order.
```

| Method           | Member variable | Scenario               | Output/Results |
|------------------|-----------------|------------------------|----------------|
| ascendingOrder() | String[] tasks  | If array *isn't* empty | true           |
|                  |                 | If array *is* empty    | false          |


```
I want to see all the tasks in my list
ordered alphabetically in descending order.
```

| Method            | Member variable | Scenario               | Output/Results |
|-------------------|-----------------|------------------------|----------------|
| descendingOrder() | String[] tasks  | If array *isn't* empty | true           |
|                   |                 | If array *is* empty    | false          |

