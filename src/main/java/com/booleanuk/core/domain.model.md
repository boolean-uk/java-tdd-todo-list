# ToDoList Exercise


## User Stories
- I want to add tasks to my todo list. √
- I want to see all the tasks in my todo list. √ 
- I want to change the status of a task between incomplete and complete. √
- I want to be able to get only the complete tasks. √
- I want to be able to get only the incomplete tasks. √
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

### Class ToDoList
 
| Member Variables  | Methods            | Scenario                         | Return                               | Type       |
|-------------------|--------------------|----------------------------------|--------------------------------------|------------|
| listOfTasks: List | addTasks()         | I want to add task to list       | Add the list to the to-do-list       | boolean    |
|                   | retrieveTasks()    | I want to know what tasks I have | Print the tasks, and return the list | List<Task> |
|                   | getCompleteTasks() | I want to see completed tasks    | Print the tasks, and return the list | List<Task> |
|                   | searchTask()       | I want to know if tasks exists   | Print the tasks, and return it       | Task       |
|                   |                    |                                  |                                      |            |


### Task

| Member Variables | Methods | Scenario                          | Return | Type |
|------------------|---------|-----------------------------------|--------|------|
| name: String     |         |                                   |        |      |
| status: boolean  |         | If incomplete: false _ else: true |        |      |
|                  |         |                                   |        |      |
|                  |         |                                   |        |      |
|                  |         |                                   |        |      |