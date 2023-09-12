# Todo List

## Core User Stories
1. I want to add tasks to my todo list.
2. I want to see all the tasks in my todo list.
3. I want to change the status of a task between incomplete and complete.
4. I want to be able to get only the complete tasks.
5. I want to be able to get only the incomplete tasks.
6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
7. I want to remove tasks from my list.
8. I want to see all the tasks in my list ordered alphabetically in ascending order.
9. I want to see all the tasks in my list ordered alphabetically in descending order.

## Extension User Stories
10. I want to be able to get a task by a unique ID.
11. I want to update the name of a task by providing its ID and a new name.
12. I want to be able to change the status of a task by providing its ID.
13. I want to be able to see the date and time that I created each task.

## Domain Model 

| Class      | Method                                           | Description                                                    | Variables                                  | Output                                         | User Story |
|------------|--------------------------------------------------|----------------------------------------------------------------|--------------------------------------------|------------------------------------------------|------------|
| `Task`     | `Task`                                           | Constructor method                                             | `String Description`, `boolean completion` | void                                           |            |
| `TodoList` | `todoList()`                                     | Constructor method that initializes tasksList                  | `HashMap<Integer,Task> taskList`           | void                                           |            |
|            | `add(String descreption)`                        | Adds a task to tasksList and automatically assigns an Id to it |                                            | `true` if task added successfully              | 1          |
|            |                                                  |                                                                |                                            | `false` if task already exists                 | 1          |
|            | `doShowTaskList()`                               | Used to preview all the tasks in the taskList                  |                                            | String with all the tasks                      | 2          |
|            | `doSetCompletion(int Id,boolean completion)`     | Used to change the completion status of a task in the taskList |                                            | `true` if task is found and updated            | 3 , 12     |
|            |                                                  |                                                                |                                            | `false` if no task is found with the passed id | 3          |
|            | `doShowCompleted()`                              | Used to preview all the completed tasks                        |                                            | String with all the completed tasks            | 4          |
|            | `doShowIncomplete()`                             | Used to preview all the incomplete tasks                       |                                            | String with all the incomplete tasks           | 5          |
|            | `search(String description)` or `search(int Id)` | Used to search the taskList for specific task                  |                                            | String with the task description if found      | 6 , 10     |
|            |                                                  |                                                                |                                            | String `Task doesn't exist` if not             | 6 , 10     |
|            | `remove(String description)`                     | Used to remove specific task from the taskList                 |                                            | `true` if task is found and got deleted        | 7          |
|            |                                                  |                                                                |                                            | `false` if task isn't found                    | 7          |
|            | `doShowAscending()`                              | Used to preview all the tasks in alphabetical ascending order  |                                            | String with all the tasks in ascending order   | 8          |
|            | `doShowDescending()`                             | Used to preview all the tasks in alphabetical descending order |                                            | String with all the tasks in descending order  | 9          |
|            | `doUpdateDescription(int Id)`                    | Updates task's description                                     |                                            | `true` if task is found and updated            | 11         |
|            |                                                  |                                                                |                                            | `false` if not                                 | 11         |

