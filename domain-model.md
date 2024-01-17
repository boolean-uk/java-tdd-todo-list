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

| Member Variables      | Methods                                      | Scenario                                                 | Output                                                                   |
|-----------------------|----------------------------------------------|----------------------------------------------------------|--------------------------------------------------------------------------|
| ArrayList<Task> tasks | add(String task)                             | add task to todo-list.                                   |                                                                          |
|                       | remove(String task)                          | remove task from todo-list.                              |                                                                          |
|                       | showTasks()                                  | displays all tasks in list.                              | prints name of tasks if list.                                            |
|                       | changeStatus(String task, boolean newStatus) | change between completed and not completed.              | identifies task by name and changes status to <newStatus>.               |
|                       | incompleteTasks()                            | display all incomplete tasks.                            | returns all tasks where status is false.                                 |
|                       | completeTasks()                              | display all complete tasks.                              | returns all tasks where status is true.                                  |
|                       | tasksAscending()                             | displays tasks alphabetically in ascending order         | orders tasks in opposite alphabetical order and prints.                  |
|                       | tasksDescending()                            | displays tasks alphabetically in descending order        | orders tasks in alphabetical order and prints.                           |
|                       | status(String task)                          | takes name of a task and returns status.                 | true if task if complete, false if not complete, message if not in list. |
|                       | contains(String task, ArrayList<Task> tasks) | checks if task is in list of tasks.                      | true if task is found, false and displays message if not found.          |
|                       | find(String task)                            | takes name of task and returns the task-object if found. | displays message if task not found in list.                              |

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

ToDoExtension

| Member Variables   | Methods                                    | Scenario                                                   | Output/Result                                      |
|--------------------|--------------------------------------------|------------------------------------------------------------|----------------------------------------------------|
| ArrayList<IDTask\> | add(String ID, String name)                | adds a task to todoList, takes unique ID and name of task. | adds task to todo-list if ID is not already there. |
|                    | getTask(String ID)                         | takes ID as input and returns matching task in list.       | returns matching task if it exists, else null.     |
|                    | changeName(String ID, String newName)      | identifies task with ID and changes name to <newName>.     | changes name if ID is found, else nothing.         |
|                    | changeStatus(String ID, boolean newStatus) | identifies task with ID and changes status to <newStatus>. | changes status if ID is found, else nothing.       |
|                    | displayTimeCreated()                       | displays all tasks and the time they were created.         | full list with following date and time.            |

IDTask

| Member Variables      | Scenario                              |
|-----------------------|---------------------------------------|
| String ID             | a unique identifier of the task.      |
| LocalDateTime created | is set to now when task is created.   |
| String description    | a description of task, name.          |
| boolean status        | true is task is complete, else false. |
