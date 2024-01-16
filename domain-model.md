# java-tdd-todo-list

## Core Requirements

```
I want to add tasks to my todo list.
```
| Methods                    | Member variables               | Scenario         | Outputs/Results  |
|----------------------------|--------------------------------|------------------|------------------|
| addToTodo(String taskName) | HashMap<String, boolean> todo  | Want to add task | Add task to list |
|                            | String task                    | to todo list     |                  |
|                            |                                |                  |                  |

```
I want to see all the tasks in my todo list.
```
| Methods       | Member variables               | Scenario            | Outputs/Results |
|---------------|--------------------------------|---------------------|-----------------|
| displayTodo() | HashMap<String, boolean> todo  | Call display method | Print Todo list |
|               |                                |                     |                 |
|               |                                |                     |                 |

```
I want to change the status of a task between incomplete and complete.
```
| Methods            | Member variables              | Scenario                             | Outputs/Results             |
|--------------------|-------------------------------|--------------------------------------|-----------------------------|
| getStatus()        | HashMap<String, boolean> todo | status automatically false           |                             |
| statusComplete()   | boolean status                | statusComplete()                     | Change status to complete   |
| statusIncomplete() |                               | statusIncomplete()                   | Change status to incomplete |

```
I want to be able to get only the complete tasks.
```
| Methods     | Member variables              | Scenario            | Outputs/Results |
|-------------|-------------------------------|---------------------|-----------------|
| getStatus() | HashMap<String, boolean> todo | getStatus() == true | Print all       |
|             | boolean status                |                     | completed tasks |
|             |                               |                     |                 |

```
I want to be able to get only the incomplete tasks.
```
| Methods     | Member variables               | Scenario             | Outputs/Results  |
|-------------|--------------------------------|----------------------|------------------|
| getStatus() | HashMap<String, boolean> todo  | getStatus() == false | Print all        |
|             |                                |                      | incomplete tasks |
|             |                                |                      |                  |

```
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
```
| Methods                     | Member variables               | Scenario                | Outputs/Results  |
|-----------------------------|--------------------------------|-------------------------|------------------|
| searchTodo(String taskName) | HashMap<String, boolean> todo  | if taskname not in todo | Print(Not found) |
|                             |                                |                         |                  |
|                             |                                |                         |                  |

```
I want to remove tasks from my list.
```
| Methods                     | Member variables               | Scenario              | Outputs/Results |
|-----------------------------|--------------------------------|-----------------------|-----------------|
| removeTask(String taskName) | HashMap<String, boolean> todo  | if taskname in todo   | Remove task     |
|                             |                                |                       |                 |
|                             |                                |                       |                 |

```
I want to see all the tasks in my list ordered alphabetically in ascending order.
```
| Methods               | Member variables               | Scenario  | Outputs/Results          |
|-----------------------|--------------------------------|-----------|--------------------------|
| todoAlphabeticalAsc() | HashMap<String, boolean> todo  | See tasks | Print(List alphabetical) |
|                       |                                |           |                          |
|                       |                                |           |                          |

```
I want to see all the tasks in my list ordered alphabetically in descending order.
```
| Methods                | Member variables        | Scenario  | Outputs/Results                  |
|------------------------|-------------------------|-----------|----------------------------------|
| todoAlphabeticalDesc() | ArrayList<String> todo  | See tasks | Print(List reverse alphabetical) |
|                        |                         |           |                                  |
|                        |                         |           |                                  |


## Extension Requirements

I want to be able to get a task by a unique ID.
I want to update the name of a task by providing its ID and a new name.
I want to be able to change the status of a task by providing its ID.
I want to be able to see the date and time that I created each task.