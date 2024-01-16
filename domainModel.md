# Domain Model for todo list

I want to add tasks to my todo list.
I want to see all the tasks in my todo list.
I want to change the status of a task between incomplete and complete.
I want to be able to get only the complete tasks.
I want to be able to get only the incomplete tasks.
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
I want to remove tasks from my list.
I want to see all the tasks in my list ordered alphabetically in ascending order.
I want to see all the tasks in my list ordered alphabetically in descending order.


Class: TodoList 


| Methods                                  | Scenarios                      | Outputs                   |
|------------------------------------------|--------------------------------|---------------------------|
| addTask(String task, String status)      | task added successfully        | true                      |
|                                          | task already exist             | false                     |
| getAllTask()                             | taskList is not empty          | tasks                     |
|                                          | taskList is empty              | empty message             |
| changeStatus(String task, String status) | task is completed              | change to complete        |
|                                          | task is incomplete             | change to incomplete      |
| getCompleteTask(String task)             | there are completed tasks      | all completed tasks       |
|                                          | there are no completed tasks   | empty message             |
| getIncompleteTask(String task)           | there are incompleted tasks    | all uncompleted tasks     |   
|                                          | there are no incompleted tasks | empty message             |
| searchTask(String task)                  | there is matched task          | task status               |
|                                          | there is no matched task       | empty message             |
| removeTask(String task)                  | task is in the list            | true                      |
|                                          | task is not in the list        | false                     |
| getTaskAscending()                       | list is not empty              | tasks in ascending order  |
|                                          | list is empty                  | empty message             |
| getTaskDescending()                      | list is not empty              | tasks in descending order |
|                                          | list is empty                  | empty message             |                              |                          |
