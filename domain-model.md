# Domain Model

## Core Requirements
- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

| Methods                       | Member                              | Scenario               | Return                    |
|-------------------------------|-------------------------------------|------------------------|---------------------------|
| addTask(String task)          | String task                         | Create a new task      | True                      |
|                               |                                     |                        | False                     |
| showTasks()                   | Hashmap<task, status>               | Show tasks             | List taskList             |
| changeTaskStatus()            | Hashmap<task, status>               | Change task status     | String task               |
| getTaskStatus(Boolean status) | Boolean status                      | Get complete tasks     | List completed tasks      |
|                               |                                     | Get incomplete tasks   | List incomplete tasks     |
| getTask(String task)          | Hashmap<task, status> , String task | Task exists            | String task               |
|                               |                                     | Task non existing      | String Information        |
| removeTask(String task)       | Hashmap<task, status>, String task  | Task exists            | String task + Information |
|                               |                                     | Task non existing      | String Information        |
| alphaTasks(Boolean Ascending) | taskList.ascending/descending       | Show tasks ascending   | List ascending            |
|                               |                                     | Show task descending   | List descending           |

## Extension Requirements
- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.

| Methods                             | Member                | Scenario              | Return                     |
|-------------------------------------|-----------------------|-----------------------|----------------------------|
| getTask(int ID)                     | int ID                | Show task             | String task                |
|                                     |                       | Task non existing     | String task + Information  |
| updateTaskName(int ID, String name) | Map<ArrayList<task>>  | Update task           | String task                |
|                                     |                       | Task non existing     | String task + Information  |
| updateTaskStatus(int ID)            | Map<ArrayList<task>>  | Update task           | String task                |
|                                     |                       | Task non existing     | String task + Information  |
| getTaskTime(int ID)                 | Map<ArrayList<task>>  | Update task           | String task                |                          
|                                     |                       | Task non existing     | String task + Information  |                         

Map<Integer, ArrayList<Object>>
object = name(str), status(bool), time(int)