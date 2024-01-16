```
I want to add tasks to my todo list.
```

| Method           | Variables                      | Scenario             | Return values/Output |
|------------------|--------------------------------|----------------------|----------------------|
| add(String task) | HashMap<String, boolean> todos | Task added to list   | Return true          |
|                  |                                | No task input        | Return false         |
|                  |                                | Task already in list | Return false         |

```
I want to see all the tasks in my todo list.
```
| Method        | Variables                      | Scenario          | Return values/Output                   |
|---------------|--------------------------------|-------------------|----------------------------------------|
| getTodoList() | HashMap<String, boolean> todos | Get the todo list | List in nicely formatted string format |
|               |                                | List empty        | Empty string                           |
```
I want to change the status of a task between incomplete and complete.
```
| Method                    | Variables                      | Scenario                                         | Return values/Output |
|---------------------------|--------------------------------|--------------------------------------------------|----------------------|
| completeTask(String task) | HashMap<String, boolean> todos | Search for task in hashmap and set value to true | Return true          |
|                           |                                | Task not found in map                            | Return false         |
|                           |                                | Task already complete                            | Return false         |
```
I want to be able to get only the complete tasks.
```
| Method             | Variables                      | Scenario          | Return values/Output |
|--------------------|--------------------------------|-------------------|----------------------|
| getCompleteTasks() | HashMap<String, boolean> todos | Get tasks         | List (String)        |
|                    |                                | No complete tasks | ""                   |
```
I want to be able to get only the incomplete tasks.
```
| Method               | Variables                      | Scenario            | Return values/Output |
|----------------------|--------------------------------|---------------------|----------------------|
| getIncompleteTasks() | HashMap<String, boolean> todos | Get tasks           | List (String)        |
|                      |                                | No incomplete tasks | ""                   |
```
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
```
| Method               | Variables                      | Scenario       | Return values/Output   |
|----------------------|--------------------------------|----------------|------------------------|
| getTask(String task) | HashMap<String, boolean> todos | Task found     | Task (String)          |
|                      |                                | Task not found | Task not found message |
```
I want to remove tasks from my list.
```
| Method                  | Variables                      | Scenario               | Return values/Output |
|-------------------------|--------------------------------|------------------------|----------------------|
| removeTask(String task) | HashMap<String, boolean> todos | Task found and removed | True                 |
|                         |                                | Task not found         | False                |
```
I want to see all the tasks in my list ordered alphabetically in ascending order.
```
| Method                | Variables                      | Scenario                        | Return values/Output  |
|-----------------------|--------------------------------|---------------------------------|-----------------------|
| getOrderedAscending() | HashMap<String, boolean> todos | list ordered in ascending order | List (String)         |
|                       |                                | List empty                      | List is empty message |
```
I want to see all the tasks in my list ordered alphabetically in descending order.
```
| Method                 | Variables                      | Scenario                         | Return values/Output  |
|------------------------|--------------------------------|----------------------------------|-----------------------|
| getOrderedDescending() | HashMap<String, boolean> todos | list ordered in descending order | List (String)         |
|                        |                                | List empty                       | List is empty message |