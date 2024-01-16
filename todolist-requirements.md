# Todo list - Requirements

## User Stories

```
I want to 
add tasks to my todo list.
```
```
I want to 
see all the tasks in my todo list.
```
```
I want to 
change the status of a task between incomplete and complete.
```
```
I want to 
be able to get only the complete tasks.
```
```
I want to 
be able to get only the incomplete tasks.
```
```
I want to 
search for a task and receive a message that says it wasn't found if it doesn't exist.
```
```
I want to 
remove tasks from my list.
```
```
I want to 
see all the tasks in my list ordered alphabetically in ascending order.
```
```
I want to 
see all the tasks in my list ordered alphabetically in descending order.
```

### TodoList Class

| Methods                       | Member Variables              |
|-------------------------------|-------------------------------|
| addTask(String task)          | HashMap<String, Boolean> todo |
| showAllTasks()                |                               |
| changeTaskStatus(String task) |                               |
| getCompletedTasks()           |                               |
| getIncompleteTasks()          |                               |
| showTask()                    |                               |
| removeTask()                  |                               |
| showTasksReversed()           |                               |

| Scenario                                                        | Return Value/Output/Result                                                            |
|-----------------------------------------------------------------|---------------------------------------------------------------------------------------|
| User adds a new task to the todo list.                          | Returns the updated list. When added it's marked as incomplete.                       |
| User wants to see all the tasks in the todo list.               | Prints out the list via System.out.print() in alphabetical order.                     |
| User changes status of a tasks (incomplete --> complete)        | Returns string "Task has been marked as complete.". Changes status of task to true.   |
| User changes status of a tasks (complete --> incomplete)        | Returns string "Task has been marked as incomplete.". Changes status of task to false. |
| User wants to see all the complete tasks.                       | Returns ArrayList with only the complete tasks.                                       |
| User wants to see all the incomplete tasks.                     | Returns ArrayList with only the incomplete tasks.                                     |
| User wants to see if a certain tasks exists. (It does)          | Returns true.                                                                         |
| User wants to see if a certain tasks exists. (It does not)      | Returns false and the message "Task does not exist" via System.out.println().         |
| User wants to remove a task that exists.                        | Return true.                                                                          |
| User tries to remove a task that does not exist.                | Returns false.                                                                        |
| User wants to see the todo list in alphabetical order.          | Prints out the list via System.out.print() in alphabetical order.                     |
| User wants to see the todo list in reversed alphabetical order. | Prints out the list via System.out.print() in reversed alphabetical order.            |
