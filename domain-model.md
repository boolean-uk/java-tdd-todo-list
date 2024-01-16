### User Stories

1. I want to add tasks to my todo list.

| Class    | Member Variables  | Methods                 | Scenario              | Output/Result                                             |
|----------|-------------------|-------------------------|-----------------------|-----------------------------------------------------------|
| TodoList | ArrayList<String> | String add(String task) | Add task to todo list | Adds task to todo list and returns message affirming this |
|          |                   |                         |                       |                                                           |


2. I want to see all the tasks in my todo list.


| Class    | Member Variables  | Methods            | Scenario                    | Output/Result                                   |
|----------|-------------------|--------------------|-----------------------------|-------------------------------------------------|
| TodoList | ArrayList<String> | String showTasks() | Show all tasks in todo list | Output tasks in todo list and returns todo list |
|          |                   |                    |                             |                                                 |


3. I want to change the status of a task between incomplete and complete.

| Class    | Member Variables        | Methods                                | Scenario              | Output/Result                                                         |
|----------|-------------------------|----------------------------------------|-----------------------|-----------------------------------------------------------------------|
| TodoList | ArrayList<String>       | String changeTaskStatus(String status) | Change status of task | Change status of task in todo list and returns message affirming this |
|          | HashMap<String, String> |                                        |                       |                                                                       |


4. I want to be able to get only the complete tasks.

| Class    | Member Variables        | Methods                    | Scenario                      | Output/Result           |
|----------|-------------------------|----------------------------|-------------------------------|-------------------------|
| TodoList | ArrayList<String>       | String getCompletedTasks() | Retrieve completed tasks only | Returns completed tasks |
|          | HashMap<String, String> |                            |                               |                         |



5. I want to be able to get only the incomplete tasks.


| Class    | Member Variables        | Methods                     | Scenario                       | Output/Result            |
|----------|-------------------------|-----------------------------|--------------------------------|--------------------------|
| TodoList | ArrayList<String>       | String getIncompleteTasks() | Retrieve incomplete tasks only | Returns incomplete tasks |
|          | HashMap<String, String> |                             |                                |                          |



6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.

| Class    | Member Variables        | Methods                      | Scenario             | Output/Result                      |
|----------|-------------------------|------------------------------|----------------------|------------------------------------|
| TodoList | ArrayList<String>       | String findTask(String task) | If task is found     | Returns "Task is in todo list"     |
|          | HashMap<String, String> |                              | if task is not found | Returns "Task is not in todo list" |


7. I want to remove tasks from my list.


8. I want to see all the tasks in my list ordered alphabetically in ascending order.


9. I want to see all the tasks in my list ordered alphabetically in descending order.

