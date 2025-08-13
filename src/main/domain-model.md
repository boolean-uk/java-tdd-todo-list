Requirements
as a user i want
I want to add tasks to my todo list.
I want to see all the tasks in my todo list.
I want to change the status of a task between incomplete and complete.
I want to be able to get only the complete tasks.
I want to be able to get only the incomplete tasks.
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
I want to remove tasks from my list.
I want to see all the tasks in my list ordered alphabetically in ascending order.
I want to see all the tasks in my list ordered alphabetically in descending order.



I want to add tasks to my todo list.


| Classes                                            | Members           | Methods       | Scenario                         | Outputs |
|----------------------------------------------------|-------------------|---------------|----------------------------------|---------|
| `TodoList(List of Task objects (Also A object??))` | (`Task (Object)`) | `Add(Task())` | Add a task to todolist (success) | true    |

I want to see all the tasks in my todo list.



| Classes                          | Members           | Methods   | Scenario                 | Outputs                         |
|----------------------------------|-------------------|-----------|--------------------------|---------------------------------|
| `TodoList(List of Task objects)` | (`Task (Object)`) | `show()`  | if todolist is empty     | false                           |
|                                  |                   |           | if todolist is has tasks | return tasks in todolist (true) |

I want to change the status of a task between incomplete and complete.
I want to be able to get only the complete tasks.
I want to be able to get only the incomplete tasks.
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
I want to remove tasks from my list.
I want to see all the tasks in my list ordered alphabetically in ascending order.


| Classes                                            | Members           | Methods                 | Scenario                                      | Outputs                        |
|----------------------------------------------------|-------------------|-------------------------|-----------------------------------------------|--------------------------------|
| `TodoList(List of Task objects)`                   | (`Task (Object)`) | `changeStatus(Task() )` | if todolist has a task which is not completed | "Task turned to completed"     |
|                                                    |                   |                         | if todolist has a task which is  completed    | "Task turned to not completed" |
|                                                    |                   |                         | if task is null                               | "task not found"               |  
|                                                    |                   |                         |                                               |                                |
| `TodoList(List of Task objects)`                   | (`Task (Object)`) | `show()`                | if todolist is empty                          | false                          |
|                                                    |                   |                         | if todolist is has tasks                      | return tasks in todolist       |
| `TodoList(List of Task objects (Also A object??))` | (`Task (Object)`) | `Add(Task())`           | Add a task to todolist (success)              | true                           |
|                                                    |                   |                         | if task not exist                             | false                          |
|                                                    |                   | `completed()`           | if zero completed tasks                       | false                          |   
|                                                    |                   |                         | if there are completed tasks                  | true                           |   
|                                                    |                   | `notCompleted()`        | if all tasks completed or zero tasks          | false                          |   
|                                                    |                   |                         | if there are incompleted  tasks               | todolist with the tasks        |   
|                                                    |                   | `search(Task())`        | if task is found                              | true                           |   
|                                                    |                   | `remove(Task())`        | if task is not found                          | false                          |   
|                                                    |                   |                         | if task is found                              | returns the deleted task       |   
|                                                    |                   | `ascending()`           | if todo list is empty                         | false                          |   
|                                                    |                   |                         | if todo list has tasks                        | true                           |   
|                                                    |                   | `descending()`          | if todo list is empty                         | false                          |   
|                                                    |                   |                         | if todo list has tasks                        | true                           |
|                                                    |                   |                         |                                               |                                |   


