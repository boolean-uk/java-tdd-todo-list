# Domain model TODO-list extended

10 I want to be able to get a task by a unique ID.
11 I want to update the name of a task by providing its ID and a new name.
12 I want to be able to change the status of a task by providing its ID.
13 I want to be able to see the date and time that I created each task.

| Classes          | Methods                                  | Member Variables         | Scenarios                         | OutPut/Result                                       |
|------------------|------------------------------------------|--------------------------|-----------------------------------|-----------------------------------------------------|
| TodoListExtended |                                          | ArrayList<Task> todoList |                                   |                                                     |
|                  |                                          |                          |                                   |                                                     |
|                  | Add(String name)                         |                          | 1 Adds a task to the list         | creates a new instance of task and adds to todoList |
|                  | getToDos()                               |                          | 2 show all tasks                  | Returns the name of all tasks in list               |
|                  | changeCompletion(String name)            |                          | 3 completes/incompletes a task    | Changes isComplete to true/false                    |
|                  | getTasksByCompletion(Boolean completion) |                          | 4 if completion is true           | Return names of completed tasks                     |
|                  |                                          |                          | 5 if completion is false          | Return names of uncompleted tasks                   |
|                  | getTask (String name)                    |                          | 6 if name is in list of tasks     | Return name of task                                 |
|                  |                                          |                          | 6 if name is not in list of tasks | Return "Task doesnt exist"                          |
|                  |                                          |                          |                                   |                                                     |
|                  | Remove(String name)                      |                          | if task in list                   | Remove task                                         |
|                  |                                          |                          | if task not in list               | Return "task doesnt exist"                          |
|                  |                                          |                          |                                   |                                                     |
|                  | getListAlphabeticly(String order)        |                          | if order is ascending             | return tasks ascending                              |
|                  |                                          |                          | if order is descending            | return tasks descending                             |
|                  |                                          |                          |                                   |                                                     |
|                  | getTask(int Id)                          |                          | if task exists                    | return name of task                                 |
|                  |                                          |                          | if task diesnt exist              | Return "task doesnt exist"                          |
|                  | ChangeName(int Id)                       |                          | if task exists                    | Change name of task                                 |
|                  |                                          |                          |                                   |                                                     |
|                  | changeCompletion(int Id)                 |                          | 13 completes/incompletes a task   | Changes isComplete to true/false                    |                                                     |
|                  |                                          |                          |                                   |                                                     |
|                  | getTime(String Name)                     |                          |                                   | Returns return time and date when task was created  |

| Classes | Methods                               | Member Variables   | Scenarios                 | OutPut/Result                              |
|---------|---------------------------------------|--------------------|---------------------------|--------------------------------------------|
| Task    |                                       | String name        |                           |                                            |
|         |                                       | boolean isComplete |                           |                                            |
|         | getName()                             | int Id             |                           | 2 Returns the name of the task             |
|         | changeCompletion (boolean isComplete) | String timeCreated |                           | 3 Changes status of isComplete             |
|         | setName(int Id, String name)          |                    | if Id matches this.id     | 12 Set this.name to name                   |
|         |                                       |                    | if Id not matches this.id | Do nothing                                 |
|         | getTime()                             |                    |                           | return time and date when task was created |
|         |                                       |                    |                           |                                            |
|         |                                       |                    |                           |                                            |
|         |                                       |                    |                           |                                            |