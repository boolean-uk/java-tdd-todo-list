# TodoList extension Domain Model
#### With all the required fields, think it would be easier to create new object class for the tasks:
| Task (Class)        |
|---------------------|
| taskId (String)     |
| name (String)       |
| status (boolean)    |
| creationTime (Date) |
```
I want to be able to get a task by a unique ID.
```
| Method                     | Variables             | Scenario                                            | Return values/Output   |
|----------------------------|-----------------------|-----------------------------------------------------|------------------------|
| getTaskById(String taskId) | ArrayList<Task> todos | Task found by id and turned into presentable string | Task (String)          |
|                            |                       | List empty or not in list                           | Task not found message |
```
I want to update the name of a task by providing its ID and a new name.
```
| Method                                  | Variables             | Scenario                     | Return values/Output |
|-----------------------------------------|-----------------------|------------------------------|----------------------|
| setTaskName(String taskId, String name) | ArrayList<Task> todos | Task found by id and renamed | true                 |
|                                         |                       | List empty or not in list    | false                |
```
I want to be able to change the status of a task by providing its ID.
```
| Method                       | Variables             | Scenario                                     | Return values/Output |
|------------------------------|-----------------------|----------------------------------------------|----------------------|
| setTaskStatus(String taskId) | ArrayList<Task> todos | Task found by id and status is set "!status" | true                 |
|                              |                       | List empty or not in list                    | false                |
```
I want to be able to see the date and time that I created each task.
```
#### creationTime added to Task class for this purpose. Can create a getTasks that displays all the fields except id
| Method     | Variables             | Scenario                                                | Return values/Output  |
|------------|-----------------------|---------------------------------------------------------|-----------------------|
| getTasks() | ArrayList<Task> todos | Tasks list presented nicely in a string with all fields | String list           |
|            |                       | List empty                                              | List is empty message |

