
```
- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.
```

| Class    | Member Variables                 | Method           | Scenario                   | Result                |
|----------|----------------------------------|------------------|----------------------------|-----------------------|
| TodoList | Hashmap<String, String> taskList | add(String task) | If String not in hashmap   | add to hashmap        |
|          |                                  |                  | If String exist in hashmap | don't add (key exist) |

| Class    | Member Variables                 | Method     | Scenario                   | Result          |
|----------|----------------------------------|------------|----------------------------|-----------------|
| TodoList | Hashmap<String, String> taskList | viewTask() | If taskList exist          | return taskList |
|          |                                  |            | If taskList doesn't exist  | return taskList |

| Class    | Member Variables                 | Method                  | Scenario                     | Result        |
|----------|----------------------------------|-------------------------|------------------------------|---------------|
| TodoList | Hashmap<String, String> taskList | updateTask(String task) | If String value is different | Set new value |
|          |                                  |                         | If String value is same      | Set new value |

| Class    | Member Variables                 | Method              | Scenario                 | Result          |
|----------|----------------------------------|---------------------|--------------------------|-----------------|
| TodoList | Hashmap<String, String> taskList | viewCompletedTask() | Loop to see value of key | return taskList |
|          |                                  |                     | is Complete              |                 |

| Class    | Member Variables                 | Method                | Scenario                 | Result          |
|----------|----------------------------------|-----------------------|--------------------------|-----------------|
| TodoList | Hashmap<String, String> taskList | viewIncompletedTask() | Loop to see value of key | return taskList |
|          |                                  |                       | is Incomplete            |                 |

| Class    | Member Variables                 | Method                | Scenario                   | Result                 |
|----------|----------------------------------|-----------------------|----------------------------|------------------------|
| TodoList | Hashmap<String, String> taskList | findTask(String task) | If value exist in taskList | return taskList<key>   |
|          |                                  |                       | If value not in taskList   | return "doesn't exist" |

| Class    | Member Variables                 | Method                  | Scenario                | Result                 |
|----------|----------------------------------|-------------------------|-------------------------|------------------------|
| TodoList | Hashmap<String, String> taskList | removeTask(String task) | If task exist taskList  | return true            |
|          |                                  |                         | If task not in taskList | return "doesn't exist" |

| Class    | Member Variables                 | Method                   | Scenario | Result        |
|----------|----------------------------------|--------------------------|----------|---------------|
| TodoList | Hashmap<String, String> taskList | sortAscTask()            |          | return String |
|          |                                  |                          |          |               |

| Class    | Member Variables                 | Method         | Scenario | Result        |
|----------|----------------------------------|----------------|----------|---------------|
| TodoList | Hashmap<String, String> taskList | sortDescTask() |          | return String |
|          |                                  |                |          |               |

