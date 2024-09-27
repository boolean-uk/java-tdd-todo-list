# Domain Model Extension
Create domain models based on the extension requirements outlined below.

## Extension Requirements
1. I want to be able to get a task by a unique ID.
2. I want to update the name of a task by providing its ID and a new name.
3. I want to be able to change the status of a task by providing its ID.
4. I want to be able to see the date and time that I created each task. (Not implemented)

### Task Class

| Method                    | Attributes                          | Scenario                            | Outcome                                                                           |
|---------------------------|-------------------------------------|-------------------------------------|-----------------------------------------------------------------------------------|
| Task(String name, int id) | String name, boolean status, int id | Create a new task                   | Constructor - Create a new task object with given name,id and set status to false |
| getName()                 |                                     | Get the task name                   | Return name of task                                                               |
| getId()                   |                                     | Get the task id                     | Return id of task                                                                 |
| setStatus()               |                                     | Change status to the opposite value | No Return Value, Status condition inverted                                        |
| getStatus()               |                                     | Get status of a task                | Return value of status                                                            |

### Todo List Class

| Method                             | Attributes                          | Scenario                      | Outcome                                                                                                                                     |
|------------------------------------|-------------------------------------|-------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|
| TodoList()                         | ArrayList<Task> tasks2, int idCount | Initiate Todo List            | Constructor - Create an empty list of tasks and initiate idCount to 0                                                                       |
| add(String name)                   |                                     | Add a new task to the list    | No Return Value, There is no capacity factor, therefore task is added successfully, give this task id equal to idCount and increase it by 1 |
| updateTask(int id, String newName) |                                     | 2. Update task with new name: |                                                                                                                                             |
|                                    |                                     | - If task in list             | True, Task name updated                                                                                                                     |
|                                    |                                     | - If task not in list         | False, No message                                                                                                                           |
| getTasks()                         |                                     | Get all tasks                 | String built from all task names                                                                                                            |
| getTaskById(int id)                |                                     | 1. Get task by unique id:     |                                                                                                                                             |
|                                    |                                     | - If task in list             | Task                                                                                                                                        | 
|                                    |                                     | - If task not in list         | null                                                                                                                                        |
| setStatus(int id)                  |                                     | 3. Change task status:        |                                                                                                                                             |
|                                    |                                     | - If task in list             | True, Status condition inverted                                                                                                             |
|                                    |                                     | - If task not in list         | False, No Message                                                                                                                           | |