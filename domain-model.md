### Domain model for ToDo list

```
I want to add tasks to my todo list.
```
Class Task

| Method           | Member variables  | Scenario                    | Output/result       |
|------------------|-------------------|-----------------------------|---------------------|
| add(String task) | String nameOfTask | add the parameter String as | return confirmation |
|                  | boolean status    | a new task, set the status  |                     |
|                  |                   | as default false            |                     |
|                  |                   |                             |                     |

```
I want to see all the tasks in my todo list
```
| Method    | Member variables  | Scenario                        | Output/result         |
|-----------|-------------------|---------------------------------|-----------------------|
| showAll() | String nameOfTask | Add every task into a string    | return taskListString |
|           | boolean status    | and show each boolean as either |                       |
|           |                   | complete or incomplete          |                       |
|           |                   |                                 |                       |
```
I want to change the status of a task between incomplete and complete.
```
| Method                    | Member variables  | Scenario                        | Output/result       |
|---------------------------|-------------------|---------------------------------|---------------------|
| changeStatus(String task) | String nameOfTask | Find the selected task in the   | return confirmation |
|                           | boolean status    | arraylist and change the status |                     |
|                           |                   | to the opposite                 |                     |
|                           |                   |                                 |                     |
```
I want to be able to get only the complete tasks.
```
| Method               | Member variables  | Scenario                                | Output/result       |
|----------------------|-------------------|-----------------------------------------|---------------------|
| showCompletedTasks() | String nameOfTask | make a new list and add every task with | return new taskList |
|                      | boolean status    | status = true into the new list         |                     |
|                      |                   |                                         |                     |
|                      |                   |                                         |                     |
```
I want to be able to get only the incomplete tasks.
```
| Method                | Member variables  | Scenario                                | Output/result       |
|-----------------------|-------------------|-----------------------------------------|---------------------|
| showIncompleteTasks() | String nameOfTask | make a new list and add every task with | return new taskList |
|                       | boolean status    | status = false into the new list        |                     |
|                       |                   |                                         |                     |
|                       |                   |                                         |                     |
```
I want to search for a task and receive a message that says
it wasn't found if it doesn't exist.
```
| Method              | Member variables  | Scenario                            | Output/result |
|---------------------|-------------------|-------------------------------------|---------------|
| search(String task) | String nameOfTask | look through the list for the task  |               |
|                     | boolean status    | if it is there: present it. if not: | return task   |
|                     |                   | return doesnt exist                 | return 0      |
|                     |                   |                                     |               |
```
I want to remove tasks from my list.
```
| Method                  | Member variables  | Scenario                                 | Output/result       |
|-------------------------|-------------------|------------------------------------------|---------------------|
| removeTask(String task) | String nameOfTask | for loop that goes through the list      |                     |
|                         | boolean status    | if list(i) equals task: remove from list | return confirmation |
|                         |                   |                                          |                     |
|                         |                   |                                          |                     |
```
I want to see all the tasks in my list ordered alphabetically in ascending order.
```
| Method        | Member variables  | Scenario                            | Output/result      |
|---------------|-------------------|-------------------------------------|--------------------|
| sortListAsc() | String nameOfTask | use array.sort method to            | return sorted list |
|               | boolean status    | sort the array, and present to user |                    |
|               |                   |                                     |                    |
|               |                   |                                     |                    |
```
I want to see all the tasks in my list ordered alphabetically in descending order.
```
| Method         | Member variables  | Scenario                               | Output/result              |
|----------------|-------------------|----------------------------------------|----------------------------|
| sortListDesc() | String nameOfTask | use array sort method in reverse order | return reverse sorted list |
|                | boolean status    | and present to user                    |                            |
|                |                   |                                        |                            |
|                |                   |                                        |                            |