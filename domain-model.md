

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

| Class Variables                   | Methods                            | Scenarios                | Output/Return                     |
|-----------------------------------|------------------------------------|--------------------------|-----------------------------------|
| Map<Map<String, Boolean> todoList | addTaskToTodolist(String task)     | Adds a task to todo list | void                              |
|                                   | Map<String, Boolean> getTodoList() | Gets the todoList        | Map<Map<String, boolean> todolist |
|                                   |                                    |                          |                                   |

## 2

| Class Variables                   | Methods                            | Scenarios                    | Output/Return                     |
|-----------------------------------|------------------------------------|------------------------------|-----------------------------------|
| Map<Map<String, Boolean> todoList | printTasksFromTodolist()           | prints the tasks of todolist | void                              |
|                                   | Map<String, Boolean> getTodoList() | Gets the todoList            | Map<Map<String, boolean> todolist |
|                                   |                                    |                              |                                   |


## 3

| Class Variables                   | Methods                                       | Scenarios                           | Output/Return |
|-----------------------------------|-----------------------------------------------|-------------------------------------|---------------|
| Map<Map<String, Boolean> todoList | changeTaskToCompleteOrIncomplete(String task) | Changes task value to true or false | void          |
|                                   |                                               |                                     |               |
|                                   |                                               |                                     |               |

