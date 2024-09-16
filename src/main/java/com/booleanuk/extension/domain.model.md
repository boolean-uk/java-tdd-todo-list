# ToDoList Exercise


## User Stories
- I want to add tasks to my todo list. √
- I want to see all the tasks in my todo list. √ 
- I want to change the status of a task between incomplete and complete. √
- I want to be able to get only the complete tasks. √
- I want to be able to get only the incomplete tasks. √
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist. √
- I want to remove tasks from my list. √
- I want to see all the tasks in my list ordered alphabetically in ascending order. √
- I want to see all the tasks in my list ordered alphabetically in descending order. √

- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.

### Class ToDoListExtension
 
| Member Variables  | Methods                | Scenario                               | Return                               | Type          |
|-------------------|------------------------|----------------------------------------|--------------------------------------|---------------|
| listOfTasks: List | addTasks()             | I want to add task to list             | Add the list to the to-do-list       | boolean       |
|                   | retrieveTasks()        | I want to know what tasks I have       | Print the tasks, and return the list | List<Task>    |
|                   | getCompleteTasks()     | I want to see completed tasks          | Print the tasks, and return the list | List<Task>    |
|                   | searchTask()           | I want to know if tasks exists         | Print the tasks, and return it       | Task          |
|                   | removeTask()           | I want to remove a task                | Print which task was removed         | Sys.out       |
|                   | removeAllTasks()       | I want to remove all tasks             | Print which tasks was removed        | Sys.out       |
|                   | showTasksAscending()   | I want to see tasks ascending order    | Print all tasks in ascending order   | Sys.out       |
|                   | showTasksDescending()  | I want to see tasks descending order   | Print all tasks in descending order  | Sys.out       |
|                   | getTaskByID()          | I want to see a task with certain ID   | Return TaskExtension if found        | TaskExtension |
|                   | setNameByID()          | I want to update the name of a task    | Print if name changed                | Sys.out       |
|                   | changeStatusByID()     | I want to update status                | Nothing                              |               |
|                   | showDateTimeForTasks() | I want to see when tasks where created | Print the date and time              | Sys.out       |


### TaskExtension

| Member Variables   | Methods | Scenario                          | Return | Type |
|--------------------|---------|-----------------------------------|--------|------|
| name: String       |         |                                   |        |      |
| status: boolean    |         | If incomplete: false _ else: true |        |      |
| ID: int            |         |                                   |        |      |
| dateTime: DateTime |         |                                   |        |      |
|                    |         |                                   |        |      |