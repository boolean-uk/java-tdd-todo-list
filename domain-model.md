
````dtd
I want to add tasks to my todo list
````

HashMap<String, Boolean> taskList

| Classes  | Methods              | Member Variables | Scenario                 | Output/Result/Return value                       |
|----------|----------------------|------------------|--------------------------|--------------------------------------------------|
| TodoList | addTask(String task) |                  | Task not already in list | Task is added and set to incomplete. Return true |
|          |                      |                  | Task is already in list  | Task is not added. Return false                  |

````dtd
I want to see all the tasks in my todo list.
````

HashMap<String, Boolean> taskList

| Classes  | Methods        | Member Variables    | Scenario                   | Output/Result/Return Value        |
|----------|----------------|---------------------|----------------------------|-----------------------------------|
| TodoList | showAllTasks() | String outputString | There are tasks in list    | Show all tasks and status         |
|          |                |                     | There are no tasks in list | Show message saying list is empty |

````dtd
I want to change the status of a task between incomplete and complete.
````

HashMap<String, Boolean> taskList

| Classes  | Methods                       | Member Variables | Scenario                     | Output/Result/Return Value                   |
|----------|-------------------------------|------------------|------------------------------|----------------------------------------------|
| TodoList | changeTaskStatus(String task) |                  | Selected task is incomplete  | Task is now complete                         |
|          |                               |                  | Selected task is complete    | Task is now incomplete                       |
|          |                               |                  | Selected task is not in list | Display message to user, no action performed |

````dtd
I want to be able to get only the complete tasks.
````

HashMap<String, Boolean> taskList

| Classes  | Methods                        | Member Variables | Scenario                                          | Output/Result/Return Value           |
|----------|--------------------------------|------------------|---------------------------------------------------|--------------------------------------|
| TodoList | showAllTasks(boolean complete) | complete = true  | There are completed tasks in list                 | Show all completed tasks             |
|          |                                |                  | There are only incomplete tasks, or list is empty | Show message saying no tasks to show |

````dtd
I want to be able to get only the incomplete tasks.
````

HashMap<String, Boolean> taskList

| Classes  | Methods                        | Member Variables | Scenario                                        | Output/Result/Return                 |
|----------|--------------------------------|------------------|-------------------------------------------------|--------------------------------------|
| TodoList | showAllTasks(boolean complete) | complete = false | There are incompleted tasks in list             | Show all incompleted tasks           |
|          |                                |                  | There are only complete tasks, or list is empty | Show message saying no tasks to show |

````dtd
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
````

HashMap<String, Boolean> taskList

| Classes  | Methods               | Member Variables | Scenario            | Output/Result/Return                             |
|----------|-----------------------|------------------|---------------------|--------------------------------------------------|
| TodoList | showTask(String task) |                  | Task is in list     | Show task and task status. Return true           |
|          |                       |                  | Task is not in list | Show message saying task not found. Return false |

````dtd
I want to remove tasks from my list.
````

HashMap<String, Boolean> taskList

| Classes  | Methods                 | Member Variables | Scenario            | Output/Result/Return Value                |
|----------|-------------------------|------------------|---------------------|-------------------------------------------|
| TodoList | removeTask(String task) |                  | Task is in list     | Remove task, display message, return true |
|          |                         |                  | Task is not in list | Do nothing, display message, return false |

````dtd
I want to see all the tasks in my list ordered alphabetically in ascending order.
````

HashMap<String, Boolean> taskList

| Classes  | Methods                                | Member Variables | Scenario            | Output/Result/Return Value                                |
|----------|----------------------------------------|------------------|---------------------|-----------------------------------------------------------|
| TodoList | showAllTasksOrdered(boolean ascending) | ascending = true | Task list not empty | Show all tasks in ascending order. Return true            |
|          |                                        |                  | Task list empty     | Show message to user about list being empty. Return false |

````dtd
I want to see all the tasks in my list ordered alphabetically in descending order.
````

HashMap<String, Boolean> taskList

| Classes  | Methods                                | Member Variables  | Scenario            | Output/Result/Return Value                        |
|----------|----------------------------------------|-------------------|---------------------|---------------------------------------------------|
| TodoList | showAllTasksOrdered(boolean ascending) | ascending = false | Task list not empty | Show all tasks in descending order. Return true   |
|          |                                        |                   | Task list empty     | Show message about list being empty. Return false |
