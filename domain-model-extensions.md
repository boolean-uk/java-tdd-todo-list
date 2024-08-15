# TodoList - Domain Model - Extensions

### Extensions Requirements
1. I want to be able to get a task by a unique ID.
2. I want to update the name of a task by providing its ID and a new name.
3. I want to be able to change the status of a task by providing its ID.
4. I want to be able to see the date and time that I created each task.

| Class      | Member        | Type              |
|------------|---------------|-------------------|
| `TodoList` | `list`        | `ArrayList<Item>` |
| `Item`     | `id`          | `String`          |
|            | `message`     | `String`          |
|            | `identifier`  | `Integer`         |

| Requirement | Method                   | Return | Note                                                        |
|-------------|--------------------------|--------|-------------------------------------------------------------|
| **1**       | `getTaskById(String id)` | `Item` | Returns the task that is associated with the provided id.   |

