# Todo list

## User stories

- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

## Domain model

| Classes  | Methods                                  | Scenario                                                      | Output             |
|----------|------------------------------------------|---------------------------------------------------------------|--------------------|
| TodoList | HashMap<String, Boolean> getTodoList()   | returns todoList                                              | HashMap todoList   |
|          | addTask(String task)                     | adds task to todoList                                         | void               |
|          | List()                                   | prints out the todoList                                       |                    |
|          | Boolean completeIncomplete(String task)  | toggles a task from incomplete to complete                    | true               |
|          |                                          | toggles a task from complete to incomplete                    | false              |
|          | HashMap<String, Boolean> getComplete()   | returns list with complete tasks                              | Hashmap complete   |
|          | HashMap<String, Boolean> getIncomplete() | returns list with incomplete tasks                            | Hashmap incomplete |
|          | String findTask(String task)             | finds a task in the todoList                                  | task               |
|          |                                          | doesn't find a task in the todoList                           | "Task not found"   |
|          | List<String> ascendingOrder()            | returns List of all the tasks in todoList in ascending order  | List               |
|          | List<String> descendingOrder()           | returns List of all the tasks in todoList in descending order | List               |
|          | remove(String task)                      | removes task from todoList                                    | void               |
