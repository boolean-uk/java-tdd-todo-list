# Domain model for ToDo List


### Class ToDoList
Class members:
- ArrayList<Task> tasks

### Class Task
Class members:
- String name
- boolean complete

```
User story 1
I want to add tasks to my todo list.
```
#### Class Task
| Method            | Test | Return |
|-------------------|------|--------|
| Task(String name) |      |        |

#### Class TodoList
| Method             | Test                  | Return |
|--------------------|-----------------------|--------|
| addTask(Task task) | If task was added     | true   |
|                    | If task was not added | false  |
| getTask(Task task) | If task is found      | true   |
|                    | If task is not found  | false  |

```
User story 2
I want to see all the tasks in my todo list.
```
#### Class TodoList
| Method      | Test                                      | Return |
|-------------|-------------------------------------------|--------|
| getTasks()  | if all tasks from todo list are shown     | true   |
|             | if all tasks from todo list are not shown | false  |

```
User story 3
I want to change the status of a task between incomplete and complete.
```
#### Class Task
| Method                | Test                            | Return |
|-----------------------|---------------------------------|--------|
| setCompleted(boolean) |                                 |        |
|                       |                                 |        |
| isComplete()          | If task is set as completed     | true   |
|                       | If task is not set as completed | false  |

```
User story 4
I want to be able to get only the complete tasks.
```
#### Class TodoList
| Method              | Test                                            | Return |
|---------------------|-------------------------------------------------|--------|
| getCompletedTasks() | If all tasks in returned list are completed     | true   |
|                     | If all tasks in returned list are not completed | false  |

```
User story 5
I want to be able to get only the incomplete tasks.
```
#### Class TodoList
| Method               | Test                             | Return |
|----------------------|----------------------------------|--------|
| getIncompleteTasks() | If all tasks are incompleted     | true   |
|                      | If all tasks are not incompleted | false  |

```
User story 6
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
```
#### Class TodoList
| Method          | Test                 | Return |
|-----------------|----------------------|--------|
| searchForTask() | If task is found     | String |
|                 | If task is not found | String |

```
User story 7
I want to remove tasks from my list.
```
#### Class TodoList
| Method       | Test                    | Return |
|--------------|-------------------------|--------|
| removeTask() | If task is removed      | true   |
|              | If tasks is not removed | false  |

```
User story 8
I want to see all the tasks in my list ordered alphabetically in ascending order.
```
#### Class TodoList
| Method                                    | Test                                                       | Return |
|-------------------------------------------|------------------------------------------------------------|--------|
| sortTasksAlphabeticallyInAscendingOrder() | If tasks are ordered alphabetically in ascending order     | true   |
|                                           | If tasks are not ordered alphabetically in ascending order | false  |
```
User story 9
I want to see all the tasks in my list ordered alphabetically in descending order.
```
#### Class TodoList
| Method                                     | Test                                                        | Return |
|--------------------------------------------|-------------------------------------------------------------|--------|
| sortTasksAlphabeticallyInDescendingOrder() | If tasks are ordered alphabetically in descending order     | true   |
|                                            | If tasks are not ordered alphabetically in descending order | false  |