# Domain model TODO-list

...
1 I want to add tasks to my todo list.
...
2 I want to see all the tasks in my todo list.
...
3 I want to change the status of a task between incomplete and complete.
...
4 I want to be able to get only the complete tasks.
...
5 I want to be able to get only the incomplete tasks.
...
6 I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
...
7 I want to remove tasks from my list.
...
8 I want to see all the tasks in my list ordered alphabetically in ascending order.
...
9 I want to see all the tasks in my list ordered alphabetically in descending order.
...

| Classes  | Methods                                  | Member Variables         | Scenarios                         | OutPut/Result                                       |
|----------|------------------------------------------|--------------------------|-----------------------------------|-----------------------------------------------------|
| TodoList |                                          | ArrayList<Task> todoList |                                   |                                                     |
|          |                                          |                          |                                   |                                                     |
|          | Add(String name)                         |                          | 1 Adds a task to the list         | creates a new instance of task and adds to todoList |
|          | getToDos()                               |                          | 2 show all tasks                  | Returns the name of all tasks in list               |
|          | changeCompletion(String name)            |                          | 3 completes/incompletes a task    | Changes isComplete to true/false                    |
|          | getTasksByCompletion(Boolean completion) |                          | 4 if completion is true           | Return names of completed tasks                     |
|          |                                          |                          | 5 if completion is false          | Return names of uncompleted tasks                   |
|          | getTask (String name)                    |                          | 6 if name is in list of tasks     | Return name of task                                 |
|          |                                          |                          | 6 if name is not in list of tasks | Return "Task doesnt exist"                          |
|          |                                          |                          |                                   |                                                     |
|          | Remove(String name)                      |                          | if task in list                   | Remove task                                         |
|          |                                          |                          | if task not in list               | Return "task doesnt exist"                          |
|          |                                          |                          |                                   |                                                     |
|          | getListAlphabeticly(String order)        |                          | if order is ascending             | return tasks ascending                              |
|          |                                          |                          | if order is descending            | return tasks descending                             |


| Classes | Methods                               | Member Variables   | Scenarios | OutPut/Result                  |
|---------|---------------------------------------|--------------------|-----------|--------------------------------|
| Task    |                                       | String name        |           |                                |
|         |                                       | boolean isComplete |           |                                |
|         | getName()                             |                    |           | 2 Returns the name of the task |
|         | changeCompletion (boolean isComplete) |                    |           | 3 Changes status of isComplete |
|         |                                       |                    |           |                                |
|         |                                       |                    |           |                                |
|         |                                       |                    |           |                                |
