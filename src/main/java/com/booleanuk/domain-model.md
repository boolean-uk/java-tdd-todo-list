```I want to add tasks to my todo list.```

TodoList

| method               | object variable         | context                                                         | output/return      |
|----------------------|-------------------------|-----------------------------------------------------------------|--------------------|
| addTask(String name) | ArrayList\<Task\> tasks | Method creates a new Task, and adds it to the ArrayList\<Task\> | (Task) createdTask |

---
```I want to see all the tasks in my todo list.```

TodoList

| method                                    | object variable         | context                                                                                                   | output/return                     |
|-------------------------------------------|-------------------------|-----------------------------------------------------------------------------------------------------------|-----------------------------------|
| showTasks(ArrayList\<Task\> tasksToPrint) | ArrayList\<Task\> tasks | Print all tasks in terminal. Includes name and status of task. Order is chronological of time of creation | (String) allTasksFormattedToPrint |

---
```I want to change the status of a task between incomplete and complete.```

Task

| method                       | object variable | context                                                  | output/return |
|------------------------------|-----------------|----------------------------------------------------------|---------------|
| setStatus(boolean newStatus) | String name     | sets status to eiter true(complete) or false(incomplete) |               |
|                              | boolean status  |                                                          |               |
---
```I want to be able to get only the complete tasks.```

TodoList

| method              | object variable         | context                                                                                           | output/return                              |
|---------------------|-------------------------|---------------------------------------------------------------------------------------------------|--------------------------------------------|
| showCompleteTasks() | ArrayList\<Task\> tasks | creates new arrayList, adds all tasks with complete status and calls showTasks with new ArrayList | (String) allCompletedTasksFormattedToPrint |
|                     |                         |                                                                                                   |                                            |
---
```I want to be able to get only the incomplete tasks.```

TodoList

| method                | object variable         | context                                                                                             | output/return                               |
|-----------------------|-------------------------|-----------------------------------------------------------------------------------------------------|---------------------------------------------|
| showIncompleteTasks() | ArrayList\<Task\> tasks | creates new arrayList, adds all tasks with incomplete status and calls showTasks with new ArrayList | (String) allIncompleteTasksFormattedToPrint |

---
```I want to search for a task and receive a message that says it wasn't found if it doesn't exist.```

TodoList

| method              | object variable         | context                                                                                                       | output/return            |
|---------------------|-------------------------|---------------------------------------------------------------------------------------------------------------|--------------------------|
| search(String name) | ArrayList\<Task\> tasks | iterates over elements in ArrayList and checks if any element matches name. If found, return positive message | (String) foundMessage    |
|                     |                         | If not found, return negative message                                                                         | (String) notFoundMessage |
---
```I want to remove tasks from my list.```

TodoList

| method              | object variable         | context                                                                                                      | output/return      |
|---------------------|-------------------------|--------------------------------------------------------------------------------------------------------------|--------------------|
| delete(String name) | ArrayList\<Task\> tasks | iterates over elements in ArrayList and remove the first element that matches name. If deleted, return true. | (boolean) found    |
|                     |                         | If not deleted (not found), return false                                                                     | (boolean) notFound |
---
```I want to see all the tasks in my list ordered alphabetically in ascending order.```

TodoList

| method          | object variable        | context                                                                           | output/return                      |
|-----------------|------------------------|-----------------------------------------------------------------------------------|------------------------------------|
| orderTasksAsc() | ArrayList\<Task\> list | If there are elements in ArrayList, use sort-method to sort it in ascending order | (ArrayList\<Task\>) tasksSortedAsc |

---
```I want to see all the tasks in my list ordered alphabetically in descending order.```

TodoList

| method           | object variable        | context                                                                                                           | output/return                       |
|------------------|------------------------|-------------------------------------------------------------------------------------------------------------------|-------------------------------------|
| orderTasksDesc() | ArrayList\<Task\> list | If there are elements in ArrayList, use sort-method and Collections.reverseOrder() to sort it in descending order | (ArrayList\<Task\>) tasksSortedDesc |

```I want to be able to get a task by a unique ID.```

TodoList

| method             | object variable         | context                                                                                                      | output/return             |
|--------------------|-------------------------|--------------------------------------------------------------------------------------------------------------|---------------------------|
| searchById(int id) | ArrayList\<Task\> tasks | iterates over elements in ArrayList and checks if any element's id matches id. If found, return the element. | (Task) taskWithMatchingId |
|                    |                         | if not found, return null                                                                                    | (Task) null               |

---
```I want to update the name of a task by providing its ID and a new name.```

TodoList

| method                              | object variable         | context                                                                                                                        | output/return            |
|-------------------------------------|-------------------------|--------------------------------------------------------------------------------------------------------------------------------|--------------------------|
| setNameById(int id, String newName) | ArrayList\<Task\> tasks | iterates over elements in ArrayList and checks if any element's id matches id. If found, set the name to new name, return true | (boolean) changedName    |
|                                     |                         | if not found, return false                                                                                                     | (boolean) notChangedName |

---
```I want to be able to change the status of a task by providing its ID.```

TodoList

| method                                   | object variable         | context                                                                                                                            | output/return              |
|------------------------------------------|-------------------------|------------------------------------------------------------------------------------------------------------------------------------|----------------------------|
| setStatusById(int id, boolean newStatus) | ArrayList\<Task\> tasks | iterates over elements in ArrayList and checks if any element's id matches id. If found, set the status to new status, return true | (boolean) changedStatus    |
|                                          |                         | if not found, return false                                                                                                         | (boolean) notChangedStatus |

---
```I want to be able to see the date and time that I created each task.```

Task

| method | object variable     | context                                                                                                   | output/return |
|--------|---------------------|-----------------------------------------------------------------------------------------------------------|---------------|
| Task   | String name         | add a new object variable "createdAt" of type TimeStamp. Upon creation of object, set createdAt to 'now'  |               |
|        | boolean status      |                                                                                                           |               |
|        | TimeStamp createdAt |                                                                                                           |               |
