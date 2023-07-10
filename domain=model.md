# Domain model
## ToDo list

| Classes  | Attributes                  | Methods                   | Scenario                                                        | Output           |
|----------|-----------------------------|---------------------------|-----------------------------------------------------------------|------------------|
| ToDoList | ArrayList < Task > Tasks    | addTask(Task task)        | If task added correctly                                         | true             |
|          |                             |                           | If task added incorrectly                                       | false            |
|          |                             | removeTask(Task task)     | If task removed correctly                                       | true             |
|          |                             |                           | If task removed incorrectly                                     | false            |
|          |                             | changeStatus(int number)  | If status changed correctly                                     | true             |
|          |                             |                           | If status changed incorrectly                                   | false            |
|          |                             | getCompletedTasks()       | Returns list of completed tasks                                 | ArrayList<Task>  |
|          |                             | getIncompletedTasks()     | Returns list of incompleted tasks                               | ArrayList<Task>  |
|          |                             | searchForTask(Task task)  | When task found returns positive message                        | String message   |
|          |                             |                           | When task not found returns negative message                    | String message   |
|          |                             | getTaskAlphabeticallyAsc  | Returns list of tasks ordered alphabetically in ascending order | String tasksAsc  |
|          |                             | getTaskAlphabeticallyDesc | Returns list of taks ordered alphabetically in descending order | String tasksDesc |
|          |                             |                           |                                                                 |                  |
| Task     | String name, bollean isDone | changeStatus()            | Changes the status of a task to the opposite                    | returns nothing  |
|          |                             |                           |                                                                 |                  |

