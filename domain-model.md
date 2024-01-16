
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

| Classes  | Methods            | Member Variables | Scenario                     | Output/Result/Return Value                   |
|----------|--------------------|------------------|------------------------------|----------------------------------------------|
| TodoList | changeTaskStatus() |                  | Selected task is incomplete  | Task is now complete                         |
|          |                    |                  | Selected task is complete    | Task is now incomplete                       |
|          |                    |                  | Selected task is not in list | Display message to user, no action performed |
