# Domain Model

- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

| Methods                                   | Member                        | Scenario               | Return                    |
|-------------------------------------------|-------------------------------|------------------------|---------------------------|
| addTask(String task)                      | String task                   | Create a new task      | True                      |
|                                           |                               |                        | False                     |
| showTasks()                               | Array<taskList>               | Show tasks             | List taskList             |
| changeTaskStatus()                        | Array<taskList>               | Change task status     | String task               |
| getTaskStatus(Boolean status)             | Boolean status                | Get complete tasks     | List completed tasks      |
|                                           |                               | Get incomplete tasks   | List incomplete tasks     |
| getTask(String task)                      | Array<taskList>, String task  | Task exists            | String task               |
|                                           |                               | Task non existing      | String Information        |
| removeTask(String task)                   | Array<taskList>, String task  | Task exists            | String task + Information |
|                                           |                               | Task non existing      | String Information        |
| alphaTasks(String ascendingOrDescending)  | taskList.ascending/descending | Show tasks ascending   | List ascending            |
|                                           |                               | Show task descending   | List descending           |

