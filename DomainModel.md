# Domain Model
Create domain models based on the requirements outlined below.

## Requirements
1. I want to add tasks to my todo list.
2. I want to see all the tasks in my todo list.
3. I want to change the status of a task between incomplete and complete.
4. I want to be able to get only the complete tasks.
5. I want to be able to get only the incomplete tasks.
6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
7. I want to remove tasks from my list.
8. I want to see all the tasks in my list ordered alphabetically in ascending order.
9. I want to see all the tasks in my list ordered alphabetically in descending order.

### Task Class

| Method            | Attributes                  | Scenario                            | Outcome                                                                        |
|-------------------|-----------------------------|-------------------------------------|--------------------------------------------------------------------------------|
| Task(String name) | String name, boolean status | Create a new task                   | Constructor - Create a new task object with given name and set status to false |
| getName()         |                             | Get the task name                   | Return name of task                                                            |
| setStatus()       |                             | Change status to the opposite value | No Return Value, Status condition inverted                                     |
| getStatus()       |                             | Get status of a task                | Return value of status                                                         |


### ToDoList Class

| Method                 | Attributes            | Scenario                               | Outcome                                                                            |
|------------------------|-----------------------|----------------------------------------|------------------------------------------------------------------------------------|
| TodoList()             | ArrayList<Task> tasks | Initiate Todo List                     | Constructor - Create an empty list of tasks                                        |
| add(String name)       |                       | 1. Add a new task to the list          | No Return Value, There is no capacity factor, therefore task is added successfully |
| getTasks()             |                       | 2. Get all tasks                       | String built from all task names                                                   |
| setStatus(String name) |                       | 3. Change task status:                 |                                                                                    |
|                        |                       | - If task in list                      | True, Status condition inverted                                                    |
|                        |                       | - If task not in list                  | False, No Message                                                                  |
| getComplete()          |                       | 4. Get complete tasks:                 |                                                                                    |
| getIncomplete()        |                       | 5. Get incomplete tasks:               |                                                                                    |
|                        |                       | - If list empty / not exists           | Empty String                                                                       |
|                        |                       | - If list not empty, exists            | String with the corresponding tasks (complete/incomplete)                          |
| search(String name)    |                       | 6. Look for task:                      |                                                                                    |
|                        |                       | - Task found                           | Return Task                                                                        |
|                        |                       | - Task not found                       | Null, Print Message                                                                |
| remove(String name)    |                       | 7. Remove task from list (use search): |                                                                                    |
|                        |                       | - If task exists                       | True, Task Removed                                                                 |
|                        |                       | - If task doesn't exist                | False, Message printed from search method                                          |
| printAsc()             |                       | 8. See tasks in asc name order         | No Return Value, Tasks printed in asc name order                                   |
| printDesc()            |                       | 9. See tasks in desc name order        | No Return Value, Tasks printed in desc name order                                  |
