# Todo list core

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


## TodoList Class



| Member variable | Data type         |
|-----------------|-------------------|
| `task`          | `Task`            |
| `todoList`      | `ArrayList<task>` |
|                 |                   |

#### Task Class
| Member variable | Data type |
|-----------------|-----------|
| `taskName`      | `String`  |
| `taskStatus`    | `String`  |




| Method                   | Scenario                                                                            | Output                                                                                    |
|--------------------------|-------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| `addTask(String)`        | Task is added to todoList<br/>Task is not added to todoList                         | `Return` true<br/>`Return` false                                                          |
| `getTasks()`             | todoList is not empty<br/>todoList is empty                                         | `Return` all tasks in todo list<br/>`Return` "Todo list is empty."                        |
| `getCompletedTasks()`    | todoList contains completed tasks<br/>todoList does not contain completed tasks     | `Return` tasks with status 'complete'<br/>`Return` "No completed tasks in todo list."     |
| `getUncompletedTasks()`  | todoList contains uncompleted tasks<br/>todoList does not contain uncompleted tasks | `Return` tasks with status 'incomplete'<br/>`Return` "No uncompleted tasks in todo list." |
| `searchTask(String)`     | Task exists in todoList<br/>Task does not exist in todoList                         | `Return` task<br/>`Return` "Task not found."                                              |
| `setCompleted(String)`   | Task exists in todoList<br/>Task does not exist in todoList                         | `Return` "Task status is now 'Completed'."<br/>`Return` "Task not found."                 |
| `setUncompleted(String)` | Task exists in todoList<br/>Task does not exist in todoList                         | `Return` "Task status is now 'Incomplete'."<br/>`Return` "Task not found."                |                                                                                                                
| `removeTask(String)`     | Task exist in todoList<br/>Task does not exist in todoList                          | `Return` "Task removed from todo list."<br/>`Return` "Task not found."                    |
| `getTasksAscending()`    | todoList is not empty<br/>todoList is empty                                         | `Return` all tasks in todo list in ascending order<br/>`Return` "Todo list is empty."     |
| `getTasksDescending()`   | todoList is not empty<br/>todoList is empty                                         | `Return` all tasks in todo list in descending order<br/>`Return` "Todo list is empty."    |


# Todo list extension

| Member variable | Data type         |
|-----------------|-------------------|
| `task`          | `Task`            |
| `todoList`      | `ArrayList<task>` |
| `idCounter`     | `int`             |

#### Task Class
| Member variable | Data type       |
|-----------------|-----------------|
| `taskId`        | `int`           |
| `taskName`      | `String`        |
| `taskStatus`    | `String`        |
| `dateTime`      | `LocalDateTime` |




| Method                      | Scenario                                                                            | Output                                                                                                          |
|-----------------------------|-------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| `addTask(String)`           | Task is added to todoList<br/>Task is not added to todoList                         | `Return` true<br/>`Return` false                                                                                |
| `getTasks()`                | todoList is not empty<br/>todoList is empty                                         | `Return` all tasks in todo list<br/>`Return` "Todo list is empty."                                              |
| `getCompletedTasks()`       | todoList contains completed tasks<br/>todoList does not contain completed tasks     | `Return` tasks with status 'complete'<br/>`Return` "No completed tasks in todo list."                           |
| `getUncompletedTasks()`     | todoList contains uncompleted tasks<br/>todoList does not contain uncompleted tasks | `Return` tasks with status 'incomplete'<br/>`Return` "No uncompleted tasks in todo list."                       |
| `searchTask(String)`        | Task exists in todoList<br/>Task does not exist in todoList                         | `Return` task<br/>`Return` "Task not found."                                                                    |
| `setCompleted(String)`      | Task exists in todoList<br/>Task does not exist in todoList                         | `Return` "Task status is now 'Completed'."<br/>`Return` "Task not found."                                       |
| `setUncompleted(String)`    | Task exists in todoList<br/>Task does not exist in todoList                         | `Return` "Task status is now 'Incomplete'."<br/>`Return` "Task not found."                                      |
| `removeTask(String)`        | Task exist in todoList<br/>Task does not exist in todoList                          | `Return` "Task removed from todo list."<br/>`Return` "Task not found."                                          |
| `getTasksAscending()`       | todoList is not empty<br/>todoList is empty                                         | `Return` all tasks in todo list in ascending order<br/>`Return` "Todo list is empty."                           |
| `getTasksDescending()`      | todoList is not empty<br/>todoList is empty                                         | `Return` all tasks in todo list in descending order<br/>`Return` "Todo list is empty."                          |
| `getTaskById(int)`          | Task exists in todoList<br/>Task does not exist in todoList<br/>todoList is empty   | `Return` task<br/>`Return` "Task not found."<br/>`Return` "Todo list is empty."                                 |
| `editTaskName(int, String)` | Task exists in todoList<br/>Task does not exist in todoList<br/>todoList is empty   | `Return` "Task name changed."<br/>`Return` "Task not found." <br/>`Return` "Todo list is empty."                |
| `setCompletedById(int)`     | Task exists in todoList<br/>Task does not exist in todoList<br/>todoList is empty   | `Return` "Task status is now 'Completed'."<br/>`Return` "Task not found." <br/>`Return` "Todo list is empty."   |
| `setUncompletedById(int)`   | Task exists in todoList<br/>Task does not exist in todoList<br/>todoList is empty   | `Return` "Task status is now 'Incomplete'."<br/>`Return` "Task not found."  <br/>`Return` "Todo list is empty." |                                                                                                                                              
| `getCreationDateTime(int)`  | Task exists in todoList<br/>Task does not exist in todoList<br/>todoList is empty   | `Return` "Task was created at 'DateTime'"<br/>`Return` "Task not found."  <br/>`Return` "Todo list is empty."   |



