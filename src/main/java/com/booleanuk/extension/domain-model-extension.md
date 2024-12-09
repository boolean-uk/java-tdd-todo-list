# Domain Model - Extension
## Domain Model expands on core/domain-model.md

- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.

| Classes  | Methods                                         | Member Variables           | Scenario                          | Outputs / Return Value |
|----------|-------------------------------------------------|----------------------------|-----------------------------------|------------------------|
| Task     | getID()                                         | int id                     | Returns the id                    | int (id)               |
|          | setDescription(String description)              | String description         | Changes the description           | void                   |
|          | getCreationDate()                               | LocalDateTime creationDate | Returns the date/time of creation | LocalDateTime          |
| TodoList | renameTask(int id, String description)          | ArrayList\<Task> tasks     | Task exists                       | int (id)               |
|          |                                                 |                            | Task does not exist               | int (-1)               |
|          | setCompletionStatus(int id, boolean completion) | ArrayList\<Task> tasks     | Task exists                       | int (id)               |
|          |                                                 |                            | Task does not exist               | int (-1)               |
