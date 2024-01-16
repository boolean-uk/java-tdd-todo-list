# Domain Model for ToDo-List

## User Stories 

```
- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.
```

## Domain Model 

ToDo

| Member Variables      | Methods                                  | Scenario                                          | Output                                                           |
|-----------------------|------------------------------------------|---------------------------------------------------|------------------------------------------------------------------|
| ArrayList<Task> tasks | add(String task)                         | add task to todo-list.                            |                                                                  |
|                       | remove(String task)                      | remove task from todo-list.                       |                                                                  |
|                       | showTasks()                              | displays all tasks in list.                       |                                                                  |
|                       | changeStatus(String task, boolean status) | change between completed and not completed.       |                                                                  |
|                       | incompleteTasks()                        | display all incomplete tasks.                     |                                                                  |
|                       | completeTasks()                          | display all complete tasks.                       |                                                                  |
|                       | searchTask(String task)                  | search the list for a task.                       | the status of the task, a message if task doesn't exist in list. |
|                       | showTasksAscending()                     | displays tasks alphabetically in ascending order  |                                                                  |
|                       | showTasksDescending()                    | displays tasks alphabetically in descending order |                                                                  |

Task

| Member Variables   | Methods     | Output                                |
|--------------------|-------------|---------------------------------------|
| String description |             |                                       |
| boolean status     | getStatus() | true if complete, false if incomplete |

## User Stories - Extension

```
- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.
```