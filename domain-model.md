# Todo list Exercise
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

## Domain Model

| Classes  | Methods                      | Members                        | Scenario                             | Outputs/Results                              |
|----------|------------------------------|--------------------------------|--------------------------------------|----------------------------------------------|
| TodoList | add(String task)             | HashMap<String, boolean> tasks | Task not already in todo list.       | New task added to tasks as incomplete.       |
|          |                              |                                |                                      | Return true.                                 |
|          |                              |                                | Task already in list.                | Return false.                                |
| TodoList | getTasks()                   | HashMap<String, boolean> tasks | There are tasks in the list.         | Output formatted string of tasks.            |     
|          |                              |                                | There are no tasks.                  | Output empty string.                         |
| TodoList | changeStatus(String task)    | HashMap<String, boolean> tasks | The task exists.                     | Status changed. Return true.                 |
|          |                              |                                | The task does not exist.             | Return false.                                |
| TodoList | getStatus(boolean complete)  | HashMap<String, boolean> tasks | Input true, complete tasks exists.   | Return String[] with complete tasks.         |
|          |                              |                                | Input false, incomplete tasks exist. | Return String[] with incomplete tasks.       |
|          |                              |                                | There are no tasks with the given    | Return empty String[].                       |
|          |                              |                                | status in the list.                  |                                              |
| TodoList | getTask(String task)         | HashMap<String, boolean> tasks | Task exists.                         | String "The task .. is complete/incomplete". |
|          |                              |                                | Task does not exist.                 | String "The task .. wasn't found".           |
| TodoList | remove(String task)          | HashMap<String, boolean> tasks | Task in list.                        | Remove given task. Return true.              |
|          |                              |                                | Task not in list.                    | Return false.                                |
| TodoList | getTasksOrdered(boolean asc) | HashMap<String, boolean> tasks | List not empty. Asc = true.          | Return list in ascending order.              |
|          |                              |                                | List not empty. Asc = false.         | Return list in descending order.             |
|          |                              |                                | List is empty.                       | Return empty list.                           |

