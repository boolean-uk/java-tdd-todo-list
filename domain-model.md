| Class | Attributes | Methods       | Scenario | Result                                                   |
|-|-|---------------|-|----------------------------------------------------------|
| todoList | Map<String,boolean> | getTodoList() | Return the entire toDoList | return toDo list                                         |
| todoList |      Map<String,boolean> | addTask(task:String) | adding a new task to the list | inserts a task                                           |
| todoList | Map<String,boolean> | listTasks()   | list all tasks | prints the tasks                                         |
| todoList | Map<String,boolean> | completeIncomplete(task:String): boolean | check if a task is completed | boolean returns true if is completed                     |
| todoList | Map<String,boolean> | getCompleteTasks () | return completed tasks | Returns a Map containing completed tasks                 |
| todoList | Map<String,boolean> | findTask(task: String): String | find aspecific task | returns the name or prints not found                     |
| todoList | Map<String,boolean> | getTasksAscendingOrder() | Retrieves tasks in ascending alphabetical order.| Returns a list of task names sorted in ascending order.  |
| todoList | Map<String,boolean> | getTasksDescendingOrder() | Retrieves tasks in descending alphabetical order. | Returns a list of task names sorted in descending order. |
| todoList  | Map<String,boolean>    | removeTask(task: String)              |  Removes a task from the todo list.| removes the task fro the map                             |
