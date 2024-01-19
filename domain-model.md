# Core Requirements

```
I want to add tasks to my todo list.
```

| Method           | Member variables           | Scenario                        | Output/Results |
|------------------|----------------------------|---------------------------------|----------------|
| add(String task) | ArrayList<String> todoList | If task *doesn't* exist in list | Append to list |
|                  |                            | If task *does* exist in list    | false          |


```
I want to see all the tasks in my todo list.
```

| Method      | Member variables           | Scenario              | Output/Results |
|-------------|----------------------------|-----------------------|----------------|
| viewTasks() | ArrayList<String> todoList | If list *isn't* empty | true           |
|             |                            | If list *is* empty    | false          |


```
I want to change the status of a task between incomplete and complete.
```

| Method                    | Member variables                 | Scenario                | Output/Results |
|---------------------------|----------------------------------|-------------------------|----------------|
| changeStatus(String task) | HashMap<String, String> todoList | If task *does* exist    | true           |
|                           |                                  | If task *doesn't* exist | false          |


```
I want to be able to get only the complete tasks.
```

| Method             | Member variables                 | Scenario                        | Output/Results |
|--------------------|----------------------------------|---------------------------------|----------------|
| getCompleteTasks() | HashMap<String, String> todoList | If complete tasks *do* exist    | true           |
|                    |                                  | If complete tasks *don't* exist | false          |


```
I want to be able to get only the incomplete tasks.
```

| Method               | Member variables                 | Scenario                          | Output/Results |
|----------------------|----------------------------------|-----------------------------------|----------------|
| getIncompleteTasks() | HashMap<String, String> todoList | If incomplete tasks *do* exist    | true           |
|                      |                                  | If incomplete tasks *don't* exist | false          |


```
I want to search for a task and receive a message
that says it wasn't found if it doesn't exist.
```

| Method                     | Member variables                 | Scenario                        | Output/Results |
|----------------------------|----------------------------------|---------------------------------|----------------|
| searchForTask(String task) | HashMap<String, String> todoList | If task *does* exist in list    | true           |
|                            |                                  | If task *doesn't* exist in list | false          |


```
I want to remove tasks from my list.
```

| Method              | Member variables                 | Scenario                        | Output/Results |
|---------------------|----------------------------------|---------------------------------|----------------|
| remove(String task) | HashMap<String, String> todoList | If task *does* exist in list    | true           |
|                     |                                  | If task *doesn't* exist in list | false          |


```
I want to see all the tasks in my list
ordered alphabetically in ascending order.
```

| Method           | Member variables | Scenario               | Output/Results |
|------------------|------------------|------------------------|----------------|
| ascendingOrder() | String[] tasks   | If array *isn't* empty | true           |
|                  |                  | If array *is* empty    | false          |


```
I want to see all the tasks in my list
ordered alphabetically in descending order.
```

| Method            | Member variables | Scenario               | Output/Results |
|-------------------|------------------|------------------------|----------------|
| descendingOrder() | String[] tasks   | If array *isn't* empty | true           |
|                   |                  | If array *is* empty    | false          |



## Extension requirements

```
I want to be able to get a task 
by a unique ID.
```

| Method          | Member variables                    | Scenario              | Output/Results |
|-----------------|-------------------------------------|-----------------------|----------------|
| getTask(int id) | HashMap<Integer, String> taskIdList | If id *does* exist    | Task name      |
|                 |                                     | If id *doesn't* exist | false          |


```
I want to update the name of a task
by providing its ID and a new name.
```

| Method                          | Member variables                    | Scenario              | Output/Results |
|---------------------------------|-------------------------------------|-----------------------|----------------|
| updateTask(int id, String name) | HashMap<Integer, String> taskIdList | If id *does* exist    | true           |
|                                 |                                     | If id *doesn't* exist | false          |


```
I want to be able to change the status
of a task by providing its ID.
```

| Method                              | Member variables                    | Scenario              | Output/Results |
|-------------------------------------|-------------------------------------|-----------------------|----------------|
| updateStatus(int id, String status) | HashMap<Integer, String> taskIdList | If id *does* exist    | true           |
|                                     |                                     | If id *doesn't* exist | false          |


```
I want to be able to see the date
and time that I created each task.
```

| Method        | Member variables                    | Scenario                       | Output/Results |
|---------------|-------------------------------------|--------------------------------|----------------|
| timeCreated() | HashMap<Integer, String> taskIdList | If tasks *do* exist in list    | true           |
|               |                                     | If tasks *don't* exist in list | false          |            