I want to add tasks to my todo list.

| Classes  | Variable                | Method    | Scenario | Output |
|----------|-------------------------|-----------|----------|--------|
| TodoList | String task             | addTask() | Can add  | true   |
|          | Arraylist<String> tasks |           | cant add | false  |
|          |                         |           |          |        |


I want to see all the tasks in my todo list.


| Classes  | Variable                | Method      | Scenario | Output |
|----------|-------------------------|-------------|----------|--------|
| TodoList | Arraylist<String> tasks | viewTasks() | can view | true   |
|          |                         |             |          |        |

I want to change the status of a task between incomplete and complete.


| Classes  | Variable    | Method     | Scenario   | Output |
|----------|-------------|------------|------------|--------|
| TodoList | String task | complete() | Complete   | true   |
|          | boolean     |            | incomplete | false  |
|          |             |            |            |        |

I want to be able to get only the complete tasks.

| Classes  | Variable | Method         | Scenario | Output |
|----------|----------|----------------|----------|--------|
| TodoList |          | completeTask() | complete | true   |
|          |          |                |          |        |
|          |          |                |          |        |
I want to be able to get only the incomplete tasks.

| Classes  | Variable | Method           | Scenario   | Output |
|----------|----------|------------------|------------|--------|
| TodoList |          | incompleteTask() | incomplete | true   |
|          |          |                  |            |        |
|          |          |                  |            |        |

I want to search for a task and receive a message that says it wasn't found if it doesn't exist.


| Classes  | Variable   | Method   | Scenario       | Output |
|----------|------------|----------|----------------|--------|
| TodoList | int taskId | exists() | Task not found | false  |
|          |            |          |                |        |
|          |            |          |                |        |

I want to remove tasks from my list.


| Classes  | Variable   | Method   | Scenario    | Output |
|----------|------------|----------|-------------|--------|
| TodoList | int taskId | remove() | Can remove  | true   |
|          |            |          | Cant remove | false  |
|          |            |          |             |        |

I want to see all the tasks in my list ordered alphabetically in ascending order.


| Classes  | Variable | Method      | Scenario          | Output |
|----------|----------|-------------|-------------------|--------|
| TodoList |          | ascending() | List in ascending | true   |
|          |          |             |                   |        |
|          |          |             |                   |        |

I want to see all the tasks in my list ordered alphabetically in descending order.


| Classes  | Variable | Method       | Scenario           | Output |
|----------|----------|--------------|--------------------|--------|
| TodoList |          | descending() | List in descending | true   |
|          |          |              |                    |        |
|          |          |              |                    |        |