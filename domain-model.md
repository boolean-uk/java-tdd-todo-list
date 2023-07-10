| Classes  | Attributes                           | Methods                     | Scenarios                                                         | Output                                |
|----------|--------------------------------------|-----------------------------|-------------------------------------------------------------------|---------------------------------------|
| TodoList | HashMap<String, Boolean> todoList    | add(String task)            | user adds a new task to todoList                                  |                                       |
|          |                                      | list()                      | user wants to see all the tasks in todoList                       | list of all tasks printed             |
|          |                                      | toggle(String todo)         | user changes the status of a task between complete and incomplete |                                       |
|          |                                      | getComplete()               | user wants to be able to get only complete tasks                  | list of complete tasks                |
|          |                                      | getIncomplete()             | user wants to be able to get only incomplete tasks                | list of incomplete tasks              |
|          |                                      | search(String todo)         | user searches for a task                                          | task or null if not found             |
|          |                                      | remove(String todo)         | user removes a task                                               |                                       |
|          |                                      | getTasksInAscendingOrder()  | user gets all tasks in alphabetical order                         | list of all tasks in ascending order  |
|          |                                      | getTasksInDescendingOrder() | user gets all tasks in alphabetically descending order            | list of all tasks in descending order |
