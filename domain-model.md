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

| Class    | Member Variables         | Methods                   | Scenario              | Output/Result                                                         |
|----------|--------------------------|---------------------------|-----------------------|-----------------------------------------------------------------------|
| TodoList | ArrayList<String>        | String changeTaskStatus() | Change status of task | Change status of task in todo list and returns message affirming this |
|          | HashMap<String, boolean> |                           |                       |                                                                       |


4. I want to be able to get only the complete tasks.


5. I want to be able to get only the incomplete tasks.


6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.


7. I want to remove tasks from my list.


8. I want to see all the tasks in my list ordered alphabetically in ascending order.


9. I want to see all the tasks in my list ordered alphabetically in descending order.

