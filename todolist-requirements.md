# Todo list - Requirements

## User Stories

```
1. I want to 
add tasks to my todo list.
```
```
2. I want to 
see all the tasks in my todo list.
```
```
3. I want to 
change the status of a task between incomplete and complete.
```
```
4. I want to 
be able to get only the complete tasks.
```
```
5. I want to 
be able to get only the incomplete tasks.
```
```
6. I want to 
search for a task and receive a message that says it wasn't found if it doesn't exist.
```
```
7. I want to 
remove tasks from my list.
```
```
8. I want to 
see all the tasks in my list ordered alphabetically in ascending order.
```
```
9. I want to 
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
| doesTaskExist()               |                               |
| removeTask()                  |                               |
| showTasksReversed()           |                               |

| Scenario                                                            | Return Value/Output/Result                                                             |
|---------------------------------------------------------------------|----------------------------------------------------------------------------------------|
| User adds a new task to the todo list. (1)                          | Returns the updated list. When added it's marked as incomplete.                        |
| User wants to see all the tasks in the todo list. (2)               | Prints out the list via System.out.print() in alphabetical order.                      |
| User changes status of a tasks (incomplete --> complete). (3)       | Returns string "Task has been marked as complete.". Changes status of task to true.    |
| User changes status of a tasks (complete --> incomplete). (3)       | Returns string "Task has been marked as incomplete.". Changes status of task to false. |
| User wants to see all the complete tasks. (4)                       | Returns ArrayList with only the complete tasks.                                        |
| User wants to see all the incomplete tasks. (5)                     | Returns ArrayList with only the incomplete tasks.                                      |
| User wants to see if a certain tasks exists. (It does) (6)          | Returns true.                                                                          |
| User wants to see if a certain tasks exists. (It does not) (6)      | Returns false and the message "Task does not exist" via System.out.println().          |
| User wants to remove a task that exists. (7)                        | Return true.                                                                           |
| User tries to remove a task that does not exist. (7)                | Returns false.                                                                         |
| User wants to see the todo list in alphabetical order. (8)          | Prints out the list via System.out.print() in alphabetical order.                      |
| User wants to see the todo list in reversed alphabetical order. (9) | Prints out the list via System.out.print() in reversed alphabetical order.             |
