# Exercise to-do list
## Core requirements

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

| Class | Method                                    | Scenario                                                                   | Output                               |
|--|-------------------------------------------|----------------------------------------------------------------------------|--------------------------------------|
| TodoList | add(String task, boolean status)          |                                                                            | print "Task added"                   |
|  | seeAll()                                  | if not empty, list all of the tasks                                        | tasks                                |
|  | changeStatus(String task, boolean status) | change the status of the task between complete and incomplete              | print status change                  |
|  | getComplete()                             | list all of the tasks that are complete                                    | print complete tasks                 |
|  | getIncomplete()                           | list all of the tasks that are incomplete                                  | print incomplete tasks               |
|  | search(String task)                       | Check if the task is added, if not, receive a message that it wasn't found | print that the task was found or not |
|  | remove(String task)                       | Remove task from the list                                                  | print that the task was removed      |
|  | sortAscend()                              | Sort the list in aplhabetic order, ascending                               | print list of tasks sorted           |
|  | sortDescend()                             | Sort the list in aplhabetic order, descending                              | print list of tasks sorted           |


# Extension Criteria

```
I want to be able to get a task by a unique ID.
I want to update the name of a task by providing its ID and a new name.
I want to be able to change the status of a task by providing its ID.
I want to be able to see the date and time that I created each task.
```