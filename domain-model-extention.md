# Todo List Exetcise Extention

## Requirements

- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.

## Domain Model

| **Classes**      | Methods                            | Members                                               | Scenario             | Outputs/Results                       |
|------------------|------------------------------------|-------------------------------------------------------|----------------------|---------------------------------------|
| TodoListExtended | add(String task)                   | HashMap<Integer id, String task> tasks                | Task is new.         | Output generated id.                  |
|                  |                                    |                                                       | Task already exists. | Output generated id for new instance. |
| TodoListExtended | get(int id)                        | HashMap<Integer id, String task> tasks                | Task exists.         | Return String task.                   |
|                  |                                    |                                                       | Task does not exist. | Return empty string.                  |
| TodoListExtended | updateName(int id, String newName) | HashMap<Integer id, String task> tasks                | Id exists            | Return true.                          |
|                  |                                    |                                                       | Id does not exist.   | Return false.                         |
| TodoListExtended | changeStatus(int id)               | HashMap<Integer id, Boolean status> taskStatus        | Id exists.           | Return true.                          |
|                  |                                    |                                                       | Id does not exist.   | Return false.                         |
| TodoListExtended | showDateTimeTask(int id)           | HashMap<Integer id, LocalDateTime dateTime> dateTimes | Id exists.           | Return LocalDateTime.                 |
|                  |                                    |                                                       | Id does not exist.   | Return empty object.                  |
