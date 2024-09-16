## Core Requirements

``` 
- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.
```

| Classes  | Methods                       | Scenarios                                        | Outputs                 |
|----------|-------------------------------|--------------------------------------------------|-------------------------|
| TodoList | printList()                   | Print every task in the list                     | toString print of tasks |
|          | addTask(Task task)            | Add new task to list                             | task added to list      |
|          | setComplete(boolean complete) | Set task to complete                             | true                    |
|          |                               | Set task to incomplete                           | false                   |
|          | printComplete()               | Print every complete task in list                | toString of tasks       |
|          | printIncomplete()             | Print every incomplete task in list              | toString of tasks       |
|          | getTask(int id)               | Task is in list                                  | task                    |
|          |                               | Task is not in list                              | NotInListException      |
|          | removeTask(int id)            | Task in list                                     | remove task from list   |
|          |                               | Task not in list                                 | NotInListException      |
|          | printListAsc()                | Print every task in the list in ascending order  | toString of tasks       |
|          | printListDesc()               | Print every task in the list in descending order | toString of tasks       |
|          |                               |                                                  |                         |

```
- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.

```

| Classes  | Methods                                    | Scenarios                       | Outputs                         |
|----------|--------------------------------------------|---------------------------------|---------------------------------|
| ToDoList | setDescription(int id, String description) | Task is in list                 | Description is updated          |
|          |                                            | Task is not in list             | NotInListException              |
| Task     | setDescription(String description)         | updates description             | description is updated          |
|          | getDate()                                  | gets the date and time variable | returns date and time as String |
|          |                                            |                                 |                                 |
