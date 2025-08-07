
- I want to add tasks to my todo list.

| Classes  | Member var.                       | Methods          | Scenario                 | Output |
| -------- | --------------------------------- | ---------------- | ------------------------ | ------ |
| TodoList | HashMap<String, Boolean> taskList | add(String task) | Empty string             | false  |
|          |                                   |                  | task name already exists | false  |
|          |                                   |                  | task name doesn't exist  | true   |


- I want to see all the tasks in my todo list.

| Classes  | Member var.                       | Methods | Scenario              | Output            |
| -------- | --------------------------------- | ------- | --------------------- | ----------------- |
| TodoList | HashMap<String, Boolean> taskList | show()  | taskList is empty     | Empty list        |
|          |                                   |         | taskList is not empty | List of all tasks |

- I want to change the status of a task between incomplete and complete.

| Classes  | Member var.                       | Methods                                      | Scenario                                                      | Output |
| -------- | --------------------------------- | -------------------------------------------- | ------------------------------------------------------------- | ------ |
| TodoList | HashMap<String, Boolean> taskList | changeStatus(String taskName, boolean compl) | compl is true and valid taskName                              | true   |
|          |                                   |                                              | compl is false and valid taskName                             | true   |
|          |                                   |                                              | if tasks already got the status that you want to change it to | true   |
|          |                                   |                                              | taskName not in list  or empty                                | false  |

- I want to be able to get only the complete tasks.

| Classes  | Member var.                       | Methods         | Scenario                  | Output                   |
| -------- | --------------------------------- | --------------- | ------------------------- | ------------------------ |
| TodoList | HashMap<String, Boolean> taskList | getCompleted()) | taskList is empty         | empty list               |
|          |                                   |                 | There are completed tasks | list of incomplete tasks |
|          |                                   |                 | no completed task         | empty list               |

- I want to be able to get only the incomplete tasks.

| Classes  | Member var.                       | Methods          | Scenario                   | Output                   |
| -------- | --------------------------------- | ---------------- | -------------------------- | ------------------------ |
| TodoList | HashMap<String, Boolean> taskList | getIncompleted() | taskList is empty          | empty list               |
|          |                                   |                  | There are incomplete tasks | list of incomplete tasks |
|          |                                   |                  | no incomplete task         | empty list               |

- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.

| Classes  | Member var.                       | Methods             | Scenario          | Output               |
| -------- | --------------------------------- | ------------------- | ----------------- | -------------------- |
| TodoList | HashMap<String, Boolean> taskList | search(String task) | taskList is empty | "No Tasks"           |
|          |                                   |                     | task not in list  | "Task was not found" |
|          |                                   |                     | task in list      | task                 |
- I want to remove tasks from my list.

| Classes  | Member var.                       | Methods             | Scenario               | Output |
| -------- | --------------------------------- | ------------------- | ---------------------- | ------ |
| TodoList | HashMap<String, Boolean> taskList | remove(String task) | String is empty string | false  |
|          |                                   |                     | Task not in list       | false  |
|          |                                   |                     | Task in list           | true   |

- I want to see all the tasks in my list ordered alphabetically in ascending order.

| Classes  | Member var.                       | Methods          | Scenario       | Output                                        |
| -------- | --------------------------------- | ---------------- | -------------- | --------------------------------------------- |
| TodoList | HashMap<String, Boolean> taskList | tasksAscending() | list is empty  | Empty list                                    |
|          |                                   |                  | list not empty | alphabetically sorted list in ascending order |

- I want to see all the tasks in my list ordered alphabetically in descending order.

| Classes  | Member var.                       | Methods          | Scenario       | Output                                         |
| -------- | --------------------------------- | ---------------- | -------------- | ---------------------------------------------- |
| TodoList | HashMap<String, Boolean> taskList | tasksAscending() | list is empty  | Empty list                                     |
|          |                                   |                  | list not empty | alphabetically sorted list in descending order |
