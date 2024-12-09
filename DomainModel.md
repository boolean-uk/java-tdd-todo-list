# Todo List

```
As an assitant,
So that I can organise better
I'd like to store, add, remove, get a brief look on my todo list. 
```

## Core Requirements

| Classes  | Methods                                                      | Scenario                                                                                  | Outcomes                    |
|----------|--------------------------------------------------------------|-------------------------------------------------------------------------------------------|-----------------------------|
| Task     | toString()                                                   | Create String of description of task with its status                                      | String                      |
| TodoList | boolean add(String description, boolean isComplete)          | If task in map                                                                            | false                       |
|          |                                                              | If task is not in map                                                                     | true                        |
|          | boolean contains()                                           | If map contains value                                                                     | true                        |
|          | toString()                                                   | Create String of a map of tasks                                                           | String of all tasks         |
|          | void changeStatus(String taskDescription, boolean newStatus) | If description in map change status                                                       |                             |
|          | String getTasksByCompletion(boolean isComplete)              | If complete status is true append only completed tasks                                    | String of completed tasks   |
|          |                                                              | If complete status is false append only uncompleted tasks                                 | String of uncompleted tasks |
|          | Task search(String taskDescription)                          | If task is in map                                                                         | String of task description  |
|          |                                                              | If task is not in map, print information <br/>"Task with matching description not found." | null                        |
|          | void remove(String taskDescription)                          | If task in map remove it by description                                                   |                             |
|          | List<Task> getInAlphabeticalOrder(boolean ascending)         | Sort by ascending alphabetic order map changed to list if ascending is true               | list of ascending tasks     |
|          |                                                              | Sort by descending alphabetic order map changed to list if ascending is true              | list of descending tasks    |


## Extension Requirements

| Classes           | Methods                                                   | Scenario                                                                    | Outcomes                      |
|-------------------|-----------------------------------------------------------|-----------------------------------------------------------------------------|-------------------------------|
| ExtensionTask     | toString()                                                | Create String of description of task with its status and with creation date | String                        |
| ExtensionToDoList | ExtensionTask getTaskById(int id)                         | Get value from map by given ID                                              | String of description of task |
|                   | void updateDescriptionById(int id, String newDescription) | Get value from map by given ID and set new description for task             |                               |
|                   | void updateStatusById(int id, String newCompletion)       | Get value from map by given ID and set new status for task                  |                               |
|                   | LocalDateTime getCreationDateById(int id)                 | If value from map by given ID is null                                       | null                          |
|                   |                                                           | If value from map by given ID is not null                                   | LocalDateTime                 |
