# java-tdd-todo-list

## Core Requirements

```
I want to add tasks to my todo list.
```
| Methods                    | Member variables             | Scenario         | Outputs/Results  |
|----------------------------|------------------------------|------------------|------------------|
| addToTodo(String taskName) | HashMap<String, String> todo | Want to add task | Add task to list |
|                            |                              | to todo list     |                  |
|                            |                              |                  |                  |

```
I want to see all the tasks in my todo list.
```
| Methods       | Member variables               | Scenario            | Outputs/Results |
|---------------|--------------------------------|---------------------|-----------------|
| displayTodo() | HashMap<String, String> todo  | Call display method | Print Todo list |
|               |                                |                     |                 |
|               |                                |                     |                 |

```
I want to change the status of a task between incomplete and complete.
```
| Methods            | Member variables             | Scenario                             | Outputs/Results             |
|--------------------|------------------------------|--------------------------------------|-----------------------------|
| changeStatus()     | HashMap<String, String> todo | status automatically false           |                             |
| statusComplete()   |                              | statusComplete()                     | Change status to Complete   |
| statusIncomplete() |                              | statusIncomplete()                   | Change status to Incomplete |

```
I want to be able to get only the complete tasks.
```
| Methods     | Member variables              | Scenario            | Outputs/Results |
|-------------|-------------------------------|---------------------|-----------------|
| getStatus() | HashMap<String, String> todo | getStatus() == true | Print all       |
|             | boolean status                |                     | completed tasks |
|             |                               |                     |                 |

```
I want to be able to get only the incomplete tasks.
```
| Methods     | Member variables               | Scenario             | Outputs/Results  |
|-------------|--------------------------------|----------------------|------------------|
| getStatus() | HashMap<String, String> todo  | getStatus() == false | Print all        |
|             |                                |                      | incomplete tasks |
|             |                                |                      |                  |

```
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
```
| Methods                     | Member variables               | Scenario                | Outputs/Results  |
|-----------------------------|--------------------------------|-------------------------|------------------|
| searchTodo(String taskName) | HashMap<String, String> todo  | if taskname not in todo | Print(Not found) |
|                             |                                |                         |                  |
|                             |                                |                         |                  |

```
I want to remove tasks from my list.
```
| Methods                     | Member variables               | Scenario              | Outputs/Results |
|-----------------------------|--------------------------------|-----------------------|-----------------|
| removeTask(String taskName) | HashMap<String, String> todo  | if taskname in todo   | Remove task     |
|                             |                                |                       |                 |
|                             |                                |                       |                 |

```
I want to see all the tasks in my list ordered alphabetically in ascending order.
```
| Methods               | Member variables               | Scenario  | Outputs/Results          |
|-----------------------|--------------------------------|-----------|--------------------------|
| todoAlphabeticalAsc() | HashMap<String, String> todo  | See tasks | Print(List alphabetical) |
|                       |                                |           |                          |
|                       |                                |           |                          |

```
I want to see all the tasks in my list ordered alphabetically in descending order.
```
| Methods                | Member variables              | Scenario  | Outputs/Results                  |
|------------------------|-------------------------------|-----------|----------------------------------|
| todoAlphabeticalDesc() | HashMap<String, String> todo  | See tasks | Print(List reverse alphabetical) |
|                        |                               |           |                                  |
|                        |                               |           |                                  |




## Extension Requirements
```
I want to be able to get a task by a unique ID.
```
| Methods              | Member variables | Scenario             | Outputs/Results |
|----------------------|------------------|----------------------|-----------------|
| int getID()          | int taskID       | if taskID exists     | return true     |
| searchID(int taskID) |                  | if taskID dont exist | return false    |
|                      |                  |                      |                 |

```
I want to update the name of a task by providing its ID and a new name.
```
| Methods | Member variables | Scenario | Outputs/Results |
|---------|------------------|----------|-----------------|
|         |                  |          |                 |
|         |                  |          |                 |
|         |                  |          |                 |

```
I want to be able to change the status of a task by providing its ID.
```
| Methods | Member variables | Scenario | Outputs/Results |
|---------|------------------|----------|-----------------|
|         |                  |          |                 |
|         |                  |          |                 |
|         |                  |          |                 |

```
I want to be able to see the date and time that I created each task.
```
| Methods | Member variables | Scenario | Outputs/Results |
|---------|------------------|----------|-----------------|
|         |                  |          |                 |
|         |                  |          |                 |
|         |                  |          |                 |