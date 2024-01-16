

``
I want to add tasks to my todo list.
I want to see all the tasks in my todo list.
I want to change the status of a task between incomplete and complete.
I want to be able to get only the complete tasks.
I want to be able to get only the incomplete tasks.
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
I want to remove tasks from my list.
I want to see all the tasks in my list ordered alphabetically in ascending order.
I want to see all the tasks in my list ordered alphabetically in descending order.
``



## 1

| Class Variables               | Methods                            | Scenarios                | Output/Return                 |
|-------------------------------|------------------------------------|--------------------------|-------------------------------|
| Map<String, Boolean> todoList | addTaskToTodolist(String task)     | Adds a task to todo list | void                          |
|                               | Map<String, Boolean> getTodoList() | Gets the todoList        | Map<String, boolean> todolist |
|                               |                                    |                          |                               |

## 2

| Class Variables               | Methods                            | Scenarios                    | Output/Return                 |
|-------------------------------|------------------------------------|------------------------------|-------------------------------|
| Map<String, Boolean> todoList | printTasksFromTodolist()           | prints the tasks of todolist | void                          |
|                               | Map<String, Boolean> getTodoList() | Gets the todoList            | Map<String, boolean> todolist |
|                               |                                    |                              |                               |


## 3

| Class Variables               | Methods                                       | Scenarios                           | Output/Return |
|-------------------------------|-----------------------------------------------|-------------------------------------|---------------|
| Map<String, Boolean> todoList | changeTaskToCompleteOrIncomplete(String task) | Changes task value to true or false | void          |
|                               |                                               |                                     |               |
|                               |                                               |                                     |               |


## 4 and 5

| Class Variables               | Methods                                                   | Scenarios                                    | Output/Return              |
|-------------------------------|-----------------------------------------------------------|----------------------------------------------|----------------------------|
| Map<String, Boolean> todoList | getCompleteOrIncompleteTasks(String CompleteOrIncomplete) | Gets either the complete or incomplete tasks | Map<String, Boolean> tasks |
|                               |                                                           |                                              |                            |
|                               |                                                           |                                              |                            |


## 6

| Class Variables               | Methods                | Scenarios                             | Output/Return                    |
|-------------------------------|------------------------|---------------------------------------|----------------------------------|
| Map<String, Boolean> todoList | checkTask(String task) | Checks if task is already in map      | True if it is in the listOfTasks |
|                               |                        | Also prints out that it was not found | and false if not                 |
|                               |                        |                                       |                                  |


## 7

| Class Variables               | Methods                             | Scenarios                         | Output/Return                  |
|-------------------------------|-------------------------------------|-----------------------------------|--------------------------------|
| Map<String, Boolean> todoList | removeTask(String task)             | Removes wanted task from Todolist | void                           |
|                               | Map<String, Boolean> getTodoList()  | Gets the todoList                 | Map<String, boolean> todolist  |
|                               |                                     |                                   |                                |

## 8

| Class Variables               | Methods                                  | Scenarios                                   | Output/Return                  |
|-------------------------------|------------------------------------------|---------------------------------------------|--------------------------------|
| Map<String, Boolean> todoList | printTasksFromTodolist(String AscOrDesc) | prints sorted list according to Asc or Desc | void                           |
|                               | Map<String, Boolean> getTodoList()       | Gets the todoList                           | Map<String, boolean> todolist  |
|   
