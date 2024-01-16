```
I want to add tasks to my todo list.
I want to see all the tasks in my todo list.
I want to change the status of a task between incomplete and complete.
I want to be able to get only the complete tasks.
I want to be able to get only the incomplete tasks.
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
I want to remove tasks from my list.
I want to see all the tasks in my list ordered alphabetically in ascending order.
I want to see all the tasks in my list ordered alphabetically in descending order.
```

| Classes     | Member Variable                             | Method                   | Scenario             | Output             |
|-------------|---------------------------------------------|--------------------------|----------------------|--------------------|
| ToDoManager | ArrayList<String> toDoList <br/> Task task  | add(String task)         | User adds task       | return true        |
|             | ArrayList<String> toDoList <br/> Task task  | listTasks()              | if list not null     | return list.size() |
|             | ArrayList<String> toDoList <br/> Task task  | changeStatusOfTask(task) | if task not null     | return true        |
|             | ArrayList<String> toDoList <br/> Task task  | getCompletedTasks()      | if toDoList not null | return true        |
|             | ArrayList<String> toDoList <br/> Task task  | getIncompleteTasks()     | if toDoList not null | return true        |
|             | ArrayList<String> toDoList <br/> Task task  | removeTask(String task)  | if task in list      | return true        |
|             | ArrayList<String> toDoList <br/> Task task  | searchTask(String task)  | if task is null      | return false       |
|             | ArrayList<String> toDoList <br/> Task task  | sortedListAsc()          | if toDoList not null | void               |
|             | ArrayList<String> toDoList <br/> Task task  | sortedListDes()          | if toDoList not null | void               |

| Class | Attribute   |
|-------|-------------|
| Task  | Description |
|       | Complete    |
|       | Incomplete  |

