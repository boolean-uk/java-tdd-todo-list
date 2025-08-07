

| Classes  | Methods                                     | Scenario                                  | Outputs                            |
| -------- | ------------------------------------------- | ----------------------------------------- |------------------------------------|
| TodoList | boolean addTask(Task task)                  | task is valid                             | true                               |
|          |                                             | task is empty object                      | false                              |
|          |                                             | task is null                              | false                              |
| TodoList | List\<Tasks\> getAllTasks()                 | one or more tasks exists                  | List\<Task\>                       |
|          |                                             | less than one task exists                 | null                               |
| task     | void changestatus(string status)            | status is changed                         | task with new status               |
|          |                                             | status dosen't exist                      | false                              |
|          |                                             | status is null                            | false                              |
| todolist | list\<tasks\> getallincompletetasks()       | one or more tasks are incomplete          | list of incomplete tasks           |
|          |                                             | no tasks are incomplete                   | empty list                         |
| todolist | list<\tasks\> getallcompletetasks()         | one or more tasks are completed           | list of complete tasks             |
|          |                                             | no tasks are complete                     | empty list                           |
| todolist | string searchtask(string taskname)          | task is found                             | string  that says task is found    |
|          |                                             | task is not found                         | string that says task is not found |
|          |                                             | string is null                            | string that says error with search |
| todolist | boolean removetask(int numer)               | tasks exists in todo-list                 | true                               |
|          |                                             | task does not exist                       | false                              |
| todolist | list\<tasks\> ascendingalphabeticalorder()  | tasks are complete and not missing values | correct list                       |
|          |                                             | tasks missing names                       | null                               |
|          |                                             | task missing id                           | null                               |
| todolist | list\<tasks\> descendingalphabeticalorder() | tasks are complete and not missing values | correct list                       |
|          |                                             | task missing names                        | null                               |
|          |                                             | task missing id                           | null                               |

