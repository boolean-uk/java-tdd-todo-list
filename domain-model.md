# Todo List

## Core Requirements - Use Cases

1. I want to add tasks to my todo list.
2. I want to see all the tasks in my todo list.
3. I want to change the status of a task between incomplete and complete.
4. I want to be able to get only the complete tasks.
5. I want to be able to get only the incomplete tasks.
6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
7. I want to remove tasks from my list.
8. I want to see all the tasks in my list ordered alphabetically in descending order.
9. I want to see all the tasks in my list ordered alphabetically in ascending order.

## Domain Model

| U.C.     | Class      | Attributes               | Methods                                        | Scenario                                           | Outcome                                           |
|----------|------------|--------------------------|------------------------------------------------|----------------------------------------------------|---------------------------------------------------|
|          | `Task`     | `id: int`                |                                                |                                                    |                                                   |
|          |            | `name: String`           |                                                |                                                    |                                                   |
|          |            | `completed: boolean`     |                                                |                                                    |                                                   |
|          | `TodoList` | `tasks: Arraylist<Task>` |                                                |                                                    |                                                   |
| C.1      |            |                          | `add(String task): boolean`                    | Adding a new Task to the list                      | -                                                 |
| C.2      |            |                          | `getTasks(): Arraylist<Task>`                  | Task list is not empty                             | Arraylist of Tasks                                |
|          |            |                          |                                                | Task list is empty                                 | null                                              |
| C.3      |            |                          | `toggleCompleted(int id): void`                | Changing a task's completed state                  | -                                                 |
| C.4, C.5 |            |                          | `getTasks(boolean completed): Arraylist<Task>` | if completed = true and completed tasks exist      | Arraylist of Tasks                                |
|          |            |                          |                                                | if completed = false and not completed tasks exist | Arraylist of Tasks                                |
|          |            |                          |                                                | No tasks exist with the specified completed state  | null                                              |
| C.6      |            |                          | `getTask(int id): Task`                        | If Task exists                                     | Task                                              |
|          |            |                          |                                                | if Task doesn't exist                              | Message: Task was not found                       |
| C.7      |            |                          | `remove(int id): void`                         | if Task exists, remove it from tasks list          | -                                                 |
| C.8      |            |                          | `sortAscending(): void`                        |                                                    | Sorts the tasks alphabetically in ascending order |
| C.9      |            |                          | `sortDescending(): void`                       |                                                    | Sorts the tasks descending in ascending order     |
|          |            |                          |                                                | No tasks exist                                     | -                                                 |

## Extensions Requirements - Use Cases
1. I want to be able to get a task by a unique ID. ✔
2. I want to update the name of a task by providing its ID and a new name.
3. I want to be able to change the status of a task by providing its ID. ✔
4. I want to be able to see the date and time that I created each task.


| U.C. | Class              | Attributes                 | Methods                       | Scenario                    | Outcome               |
|------|--------------------|----------------------------|-------------------------------|-----------------------------|-----------------------|
| E.2  | `TodoListExtended` |                            | `updateTaskName(int id)`      | Task with id already exists | Update the tasks name |
|      |                    |                            |                               | Task with id doesn't exist  | -                     |
| E.4  |                    |                            | `getTaskCreationDate(int id)` | Task with id already exists | Return createdAt      |
|      |                    |                            |                               | Task with id doesn't exist  | null                  |
|      | `Task`             | `createdAt: LocalDateTime` |                               |                             |                       |