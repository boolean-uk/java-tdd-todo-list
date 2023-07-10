# Todo List

```
Core Requirements
I want to add tasks to my todo list.
I want to see all the tasks in my todo list.
I want to change the status of a task between incomplete and complete.
I want to be able to get only the complete tasks.
I want to be able to get only the incomplete tasks.
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
I want to remove tasks from my list.
I want to see all the tasks in my list ordered alphabetically in ascending order.
I want to see all the tasks in my list ordered alphabetically in descending order.
```

| Class    | Methods                                    | Fields                     | Outcome                                                                     |
|----------|--------------------------------------------|----------------------------|-----------------------------------------------------------------------------|
| TodoList | `addTask(Task task)`                       | ` ArrayList<Task> tasks`   | task added to list                                                          |
|          | `showTasks()`                              | ` ArrayList<Task> tasks`   | return String with tasks                                                    |
|          | `changeStatus(Task task, boolean status) ` | ` ArrayList<Task> tasks`   | changed task status                                                         |
|          | ` ArrayList<Task> getIncompleteTasks() `   | ` ArrayList<Task> tasks`   | return incomplete tasks                                                     |
|          | ` ArrayList<Task> getCompletedTasks() `    | ` ArrayList<Task> tasks`   | return completed tasks                                                      |
|          | `String findTask(Task task)`               |                            | if true return message "I found a message!"                                 |
|          |                                            |                            | if false return  message "I didn't find message"                            |
|          | `removeTask(Task task)`                    | ` ArrayList<Task> tasks`   | Delete task from ` ArrayList<Task> tasks`                                   |
|          | `alphabeticallyInAscendingOrder()`         | ` ArrayList<Task> tasks`   | Should return ` ArrayList<Task> tasks` alphabetically in ascending order    |
|          | `alphabeticallyInDescendingOrder()`        | ` ArrayList<Task> tasks`   | Should return ` ArrayList<Task> tasks` alphabetically in descending   order |
