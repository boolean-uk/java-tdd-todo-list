| Class                        | Variables               | Methods                                               | Scenario                                                        | Outputs                              |
|------------------------------|-------------------------|-------------------------------------------------------|-----------------------------------------------------------------|--------------------------------------|
| `TodoList`                   | `ArrayList<Task> tasks` | `add(Task task)`                                      | Task is added to list.                                          | true                                 |
|                              | `int size`              |                                                       | Task can't be added to list.                                    | false                                |
|                              |                         | `listAll()`                                           | There is tasks in todo list.                                    | List, all tasks                      |
|                              |                         |                                                       | There is no tasks.                                              | Show message                         |
|                              |                         | `listAll(Status status)` (enum)                       | List all tasks that have status completed.                      | List, only tasks that are complete   |
|                              |                         |                                                       | List all tasks that have status incompleted.                    | List, only tasks that are incomplete |
|                              |                         | `sortedList(Order order)` (enum)                      | Sort list in ascending order.                                   | Sorted list, ascending               |
|                              |                         |                                                       | Sort list in descending order.                                  | Sorted list, descending              |
|                              |                         | `search(String taskTitle)`                            | If task exist.                                                  | true; Show task                      |
|                              |                         |                                                       | If task doesn't exist.                                          | false; Show error message            |
|                              |                         | `remove(int taskId)`                                  | Remove task from todo list. Task exist.                         | true                                 |
|                              |                         |                                                       | Remove task from todo list. Task doesn't exist.                 | false                                |
|                              |                         | `printList(ArrayList<Task> list, String description)` | Print provided list. List is not empty.                         | Printed list                         |
|                              |                         |                                                       | Print provided list. List is empty.                             | Printed empty list with message      |
|                              |                         | `getTask(int id)`                                     | Get Task based on id. Task doesn't exist.                       | Task / null                          |
|                              |                         | `changeTitle(int taskId, String newTitle)`            | If the task exist, change name.                                 | true                                 |
|                              |                         |                                                       | If task doesn't exist, can't change name.                       | false                                |
|                              |                         | `changeStatus(int taskId, Status status)`             | If the task exist, change status.                               | true                                 |
|                              |                         |                                                       | If task doesn't exist, can't change status.                     | false                                |
| `Task(int id, String title)` | `int id`                | `id()`                                                | Get id to present id so user can remove task based on id later. | int                                  |
|                              | `Date dateCreated`      | `dateCreated()`                                       | Get the date and time for when task was created.                | Date/Timestamp                       |
|                              | `String title`          | `title()`                                             | Get title of this task.                                         | String                               |
|                              |                         | `changeTitle(String newTitle)`                        | Update title/name of task.                                      | -                                    |
|                              | `boolean Status`        | `changeStatus(Status status)`                         | Change status to Status.COMPLETE.                               | -                                    |
|                              |                         |                                                       | Change status to Status.INCOMPPLETE).                           | -                                    |
|                              |                         | `status()`                                            | Get status for this task.                                       | true/false                           |
| `enum Status`                | `COMPLETE, INCOMPLETE`  |                                                       |                                                                 |                                      |
| `enum Order`                 | `ASCENDING, DESCENDING` |                                                       |                                                                 |                                      |


## Core Requirements
- [x] I want to add tasks to my todo list.
- [x] I want to see all the tasks in my todo list.
- [x] I want to change the status of a task between incomplete and complete.
- [x] I want to be able to get only the complete tasks.
- [x] I want to be able to get only the incomplete tasks.
- [x] I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- [x] I want to remove tasks from my list.
- [x] I want to see all the tasks in my list ordered alphabetically in ascending order.
- [x] I want to see all the tasks in my list ordered alphabetically in descending order.


## Extension Requirements
- [x] I want to be able to get a task by a unique ID.
- [x] I want to update the name of a task by providing its ID and a new name.
- [x] I want to be able to change the status of a task by providing its ID.
- [x] I want to be able to see the date and time that I created each task.