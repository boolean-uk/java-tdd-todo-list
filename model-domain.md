## Core Requirments

## Task
| Class | Attributes | 
|-------|------------|
| Task  | name       |
|       | completed  |
|       |            |

## Todo List
| Class    | Attributes  | Methods | Scenario | Result |
|----------|-------------|---------|----------|--------|
| TodoList | List<Tasks> |         |          |        |

## Core 1
```
I want to add tasks to my todo list.
```
| Class    | Attributes  | Methods   | Scenario                                               | Result       |
|----------|-------------|-----------|--------------------------------------------------------|--------------|
| TodoList | List<Tasks> | add(Task) | if task with the same name and completed values exists | return false |
|          |             |           | otherwise                                              | return true  |

## Core 2
```
I want to see all the tasks in my todo list.
```
| Class    | Attributes  | Methods | Scenario | Result                           |
|----------|-------------|---------|----------|----------------------------------|
| TodoList | List<Tasks> | tasks() |          | return a List with all the tasks |
|          |             |         |          |                                  |

## Core 3
```
I want to change the status of a task between incomplete and complete.
```
| Class    | Attributes  | Methods                                                                   | Scenario                             | Result       |
|----------|-------------|---------------------------------------------------------------------------|--------------------------------------|--------------|
| TodoList | List<Tasks> | update(Task task, boolean status) (true = complete or false = incomplete) | if completed and status is true      | return false |
|          |             |                                                                           | if completed and status is false     | return true  |
|          |             |                                                                           | if not completed and status is true  | return true  |
|          |             |                                                                           | if not completed and status is false | return false |

## Core 4
```
I want to be able to get only the complete tasks.
```
| Class    | Attributes  | Methods          | Scenario | Result                                              |
|----------|-------------|------------------|----------|-----------------------------------------------------|
| TodoList | List<Tasks> | completedTasks() |          | return a List with all the tasks that are completed |
|          |             |                  |          |                                                     |

## Core 5
```
I want to be able to get only the incomplete tasks.
```
| Class    | Attributes  | Methods           | Scenario | Result                                                  |
|----------|-------------|-------------------|----------|---------------------------------------------------------|
| TodoList | List<Tasks> | incompleteTasks() |          | return a List with all the tasks that are not completed |
|          |             |                   |          |                                                         |

## Core 6
```
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
```
| Class    | Attributes  | Methods        | Scenario                                                      | Result                                            |
|----------|-------------|----------------|---------------------------------------------------------------|---------------------------------------------------|
| TodoList | List<Tasks> | contains(Task) | if task with the same name and completed values exists        | Return a message that says the task exists        |
|          |             |                | if task with the same name and completed values doesn't exist | Return a message that says the task doesn't exist |

## Core 7
```
I want to remove tasks from my list.
```
| Class    | Attributes  | Methods      | Scenario                                               | Result                          |
|----------|-------------|--------------|--------------------------------------------------------|---------------------------------|
| TodoList | List<Tasks> | remove(Task) | if task with the same name and completed values exists | remove the task and return true |
|          |             |              | otherwise                                              | return false                    |

## Core 8
```
I want to see all the tasks in my list ordered alphabetically in ascending order.
```
| Class    | Attributes  | Methods                       | Scenario | Result                                                                           |
|----------|-------------|-------------------------------|----------|----------------------------------------------------------------------------------|
| TodoList | List<Tasks> | sortAlphabeticallyAscending() |          | sort all tasks according to the name variable in ascending order and return them |
|          |             |                               |          |                                                                                  |

## Core 9
```
I want to see all the tasks in my list ordered alphabetically in descending order.
```
| Class    | Attributes  | Methods                        | Scenario | Result                                                                            |
|----------|-------------|--------------------------------|----------|-----------------------------------------------------------------------------------|
| TodoList | List<Tasks> | sortAlphabeticallyDescending() |          | sort all tasks according to the name variable in descending order and return them |
|          |             |                                |          |                                                                                   |
