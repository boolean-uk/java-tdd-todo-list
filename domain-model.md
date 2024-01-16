
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
