- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.*
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

| ClassName | Fields                           | Methods                                 | Scenarios                    | Outputs                                           |
|-----------|----------------------------------|-----------------------------------------|------------------------------|---------------------------------------------------|
| ToDoList  | ArrayList<Task> tasks            | boolean addTask(Task task)              | Duplicate task               | return false                                      |
|           |                                  |                                         | Task doesnt exist            | return true                                       |
|           |                                  | String getAllTasks()                    |                              | return string representation of task list         |
|           |                                  | String getAllTasks(boolean isCompleted) | Status for completed tasks   | return string representation of completed tasks   |
|           |                                  |                                         | Status for incompleted tasks | return string representation of incompleted tasks |
|           |                                  | String searchTask(String name)          | Task found                   | return 'found'                                    |
|           |                                  |                                         | Task not found               | returns 'not found'                               |
|           |                                  | boolean removeTask(Task task)           | Task removed                 | true                                              |
|           |                                  |                                         | Task not found               | false                                             |
|           |                                  | String listTasks(String order)          | order = ascending            | lists tasks in asc order                          |
|           |                                  |                                         | order = descending           | lists tasks in desc order                         |
|           |                                  |                                         | order is anything else       | lists tasks in asc order (default)                |
|           |                                  | boolean changeStatus(String name)       |                              | changes status to opposite                        |
|           |                                  |                                         |                              |                                                   |
| Task      | String name, boolean isCompleted |                                         |                              |                                                   |
