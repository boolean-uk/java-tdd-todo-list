
 # TodoList class
 
| Members                | Methods                                                | Scenarios                        | Result                      |
|------------------------|--------------------------------------------------------|----------------------------------|-----------------------------|
| ArrayList\<Task> tasks | boolean add(Task task)                                 | Task is already in list          | False                       |
|                        |                                                        | Task is not in list              | True                        |
|                        | ArrayList\<Task> viewTasks()                           |                                  | Return entire todo list     |
|                        | ArrayList\<Task> viewIncompleteTasks()                 |                                  | Return incomplete task list |
|                        | ArrayList\<Task> viewCompleteTasks()                   |                                  | Return complete task list   |
|                        | Task searchTask(Task task)                             | Task not found                   | Return null + error message |
|                        |                                                        | Task found                       | Return task                 |
|                        | void removeTask(Task task)                             | Task to be removed doesn't exist | Do nothing                  |
|                        |                                                        | Task to be removed exists        | Remove task from todo list  |
|                        | ArrayList\<String> alphabeticallyAscView()             |                                  | Return sorted todo list     |
|                        | ArrayList\<String> alphabeticallyDescView()            |                                  | Return sorted todo list     |
|                        | void updateTaskNameByID(UUID uid, String newName)      | Invalid ID or task doesn't exist | Do nothing                  |
|                        |                                                        | Valid ID and task exists         | Update the task name        |
|                        | void updateTaskStatusByID(UUID uid, boolean newStatus) | Invalid ID or task doesn't exist | Do nothing                  |
|                        |                                                        | Valid ID and task exists         | Update the task status      |
|                        | TaskExtension getTaskByID(UUID uid)                    | Invalid ID or task doesn't exist | Do nothing                  |
|                        |                                                        | Valid ID and task exists         | Return the task by ID       |

# Task class

| Members          | Methods                           | Scenarios       | Result                        |
|------------------|-----------------------------------|-----------------|-------------------------------|
| boolean complete | void changeStatus(boolean status) | status is true  | Member complete becomes true  |
| String name      |                                   | status is false | Member complete becomes false |
| UUID uid         |                                   |                 |                               |
