I want to add tasks to my todo list.

| Classes  | Variable    | Method    | Scenario | Output |
|----------|-------------|-----------|----------|--------|
| TodoList | String task | addTask() | Can add  | true   |
|          |             |           | cant add | false  |
|          |             |           |          |        |


I want to see all the tasks in my todo list.


| Classes  | Variable                       | Method              | Scenario   | Output |
|----------|--------------------------------|---------------------|------------|--------|
| TodoList | HashMap<String, Boolean> tasks | fetchMultipleTask() | show tasks | true   |
|          |                                |                     |            |        |

I want to change the status of a task between incomplete and complete.


| Classes  | Variable    | Method      | Scenario   | Output |
|----------|-------------|-------------|------------|--------|
| TodoList | String task | setStatus() | Complete   | true   |
|          |             |             | incomplete | false  |
|          |             |             |            |        |

I want to be able to get only the complete tasks.

| Classes  | Variable                   | Method       | Scenario | Output |
|----------|----------------------------|--------------|----------|--------|
| TodoList | boolean completitionStatus | showStatus() | complete | true   |
|          |                            |              |          |        |
|          |                            |              |          |        |
I want to be able to get only the incomplete tasks.

| Classes  | Variable                   | Method       | Scenario   | Output |
|----------|----------------------------|--------------|------------|--------|
| TodoList | boolean completitionStatus | showStatus() | incomplete | true   |
|          |                            |              |            |        |
|          |                            |              |            |        |

I want to search for a task and receive a message that says it wasn't found if it doesn't exist.


| Classes  | Variable   | Method        | Scenario       | Output |
|----------|------------|---------------|----------------|--------|
| TodoList | int taskId | retriveTask() | Task not found | false  |
|          |            |               |                |        |
|          |            |               |                |        |

I want to remove tasks from my list.


| Classes  | Variable    | Method   | Scenario    | Output |
|----------|-------------|----------|-------------|--------|
| TodoList | String task | remove() | Can remove  | true   |
|          |             |          | Cant remove | false  |
|          |             |          |             |        |

I want to see all the tasks in my list ordered alphabetically in ascending order.


| Classes  | Variable           | Method | Scenario          | Output |
|----------|--------------------|--------|-------------------|--------|
| TodoList | boolean sortOneWay | sort() | List in ascending | true   |
|          |                    |        |                   |        |
|          |                    |        |                   |        |

I want to see all the tasks in my list ordered alphabetically in descending order.


| Classes  | Variable           | Method | Scenario           | Output |
|----------|--------------------|--------|--------------------|--------|
| TodoList | boolean sortOneWay | sort() | List in descending | true   |
|          |                    |        |                    |        |
|          |                    |        |                    |        |