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

| U.C. | Class      | Attributes               | Methods                                        | Scenario                                           | Outcome                                           |
|------|------------|--------------------------|------------------------------------------------|----------------------------------------------------|---------------------------------------------------|
|      | `Task`     | `id: int`                |                                                |                                                    |                                                   |
|      |            | `name: String`           |                                                |                                                    |                                                   |
|      |            | `completed: boolean`     |                                                |                                                    |                                                   |
|      | `TodoList` | `tasks: Arraylist<Task>` |                                                |                                                    |                                                   |
| 1    |            |                          | `add(String task): boolean`                    | Adding a new Task to the list                      | -                                                 |
| 2    |            |                          | `getTasks(): Arraylist<Task>`                  | Task list is not empty                             | Arraylist<Task>                                   |
|      |            |                          |                                                | Task list is empty                                 | null                                              |
| 3    |            |                          | `toggleCompleted(int id): void`                | Changing a task's completed state                  | -                                                 |
| 4, 5 |            |                          | `getTasks(boolean completed): Arraylist<Task>` | if completed = true and completed tasks exist      | Arraylist<Task>                                   |
|      |            |                          |                                                | if completed = false and not completed tasks exist | Arraylist<Task>                                   |
|      |            |                          |                                                | No tasks exist with the specified completed state  | null                                              |
| 6    |            |                          | `getTask(int id): Task`                        | If Task exists                                     | Task                                              |
|      |            |                          |                                                | if Task doesn't exist                              | Message: Task was not found                       |
| 7    |            |                          | `remove(int id): void`                         | if Task exists, remove it from tasks list          | -                                                 |
| 8    |            |                          | `sortAscending(): void`                        |                                                    | Sorts the tasks alphabetically in ascending order |
| 9    |            |                          | `sortDescending(): void`                       |                                                    | Sorts the tasks descending in ascending order     |
|      |            |                          |                                                | No tasks exist                                     | -                                                 |
