
## Task Class

| Methods                 | Variables            | Scenario                    | Output                |
|-------------------------|----------------------|-----------------------------|-----------------------|
|                         | `boolean completed ` |                             |                       |
|                         | `String name `       |                             |                       |
| `void completeTask() `  |                      | A task is completed         | Set completed to true |
| `String getName() `     |                      | Want to fetch a task name   | Return task name      |
| `boolean getStatus()  ` |                      | Want to fetch a task status | Return task status    |
|                         |                      |                             |                       |


## ToDoList Class

| Methods                                 | Variables                    | Scenario                                           | Output                                                  |
|-----------------------------------------|------------------------------|----------------------------------------------------|---------------------------------------------------------|
|                                         | `ArrayList<Task task> list ` |                                                    |                                                         |
| ` void addTask(Task task) `             |                              | Want to add a task to the ToDo List                | Adds task to list                                       |
| ` Arraylist<String> seeAllTasks() `     |                              | Want to see all tasks in the list                  | Shows tasks in list                                     |
| ` void changeStaus(Task task) `         |                              | Want to change status of existing task             | Changes completed variable in chosen task               |
| ` Arraylist<Task> getCompletedTasks() ` |                              | Want to get only completed tasks                   | Returns all completed tasks                             |
| ` Arraylist<Task> getInompleteTasks() ` |                              | Want to get only incomplete tasks                  | Returns all incomplete tasks                            |
| ` Task search(String taskName) `        |                              | Want to search for tasks                           | Searches for and returns task, and informs if not found |
| ` void removeTask(String taskName) `    |                              | Want to remove a task                              | removes task from list                                  |
| ` Arraylist<String> alphabeticalA() `   |                              | Want to see tasks in alphabetical ascending order  | Shows tasks in alphabetical ascending order             |
| ` Arraylist<String> alphabeticalD() `   |                              | Want to see tasks in alphabetical descending order | Shows tasks in alphabetical descending order            |