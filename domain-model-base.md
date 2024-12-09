# Domain model

1. I want to add tasks to my todo list.
2. I want to see all the tasks in my todo list.
3. I want to change the status of a task between incomplete and complete.
4. I want to be able to get only the complete tasks.
5. I want to be able to get only the incomplete tasks.
6. I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
7. I want to remove tasks from my list.
8. I want to see all the tasks in my list ordered alphabetically in ascending order.
9. I want to see all the tasks in my list ordered alphabetically in descending order.

All methods in the `TodoList` class:

| Methods                  | Scenario                       | Outputs        |
|--------------------------|--------------------------------|----------------|
| add(task)                | adds task to the todo list     | void           |
| getTasks()               | returns tasks                  | Arraylist<Task> |
| getTasks(status)         | returns tasks with given status | Arraylist<Task> |
| changeStatus(id, status) | changes task status            | boolean        |
| remove(id)               | removes task with given id     | boolean        |
| getTasksOrderedAsc       | get tasks ordered ascendingly  | Arraylist<Task> |
| getTasksOrderedDesc      | get tasks ordered descendingly | Arraylist<Task> |

The `Task` class contains `id`, `name`, `status` and `modificationDate`.