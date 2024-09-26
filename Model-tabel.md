## Core Requirements

- I want to add tasks to my todo list.ok
- I want to see all the tasks in my todo list.ok
- I want to change the status of a task between incomplete and complete. ok
- I want to be able to get only the complete tasks.ok
- I want to be able to get only the incomplete tasks.ok
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.ok
- I want to remove tasks from my list.ok
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.


1.
| Methods               | Member variables  | Scenario       | Outputs/Results/Return values |
|-----------------------|-------------------|----------------|-------------------------------|
| addTasks(String task) | String[] toDoList | if task is new | True                          |
|                       |                   | if task exist  | false                         |
|                       |                   |                |

2.
| Methods        | Member variables  | Scenario          | Outputs/Results/Return values |
|----------------|-------------------|-------------------|-------------------------------|
| showToDoList() | String[] ToDoList | if list empty     | false                         |
|                |                   | if list not empty | true                          |

3.
| Methods                   | Member variables       | Scenario                         | Outputs/Results/Return values |
|---------------------------|------------------------|----------------------------------|-------------------------------|
| changeStatus(String task) | HashMap(String,String) | if task is changed to incomplete | True                          |
|                           |                        | if task is changed to complete   | True                          |

4.
| Methods           | Member variables        | Scenario                  | Outputs/Results/Return values |
|-------------------|-------------------------|---------------------------|-------------------------------|
| getCompleteTask() | HashMap(String, String) | if task get is complete   | True                          |
|                   | String complete         | if task get is incomplete | false                         |
|                   |                         |                           |

5.
| Methods             | Member variables        | Scenario                  | Outputs/Results/Return values |
|---------------------|-------------------------|---------------------------|-------------------------------|
| getInCompleteTask() | HashMap(String, String) | if task get is incomplete | True                          |
|                     | String incomplete       | if task get is complete   | false                         |
|                     |                         |                           |

6.
| Methods      | Member variables        | Scenario                  | Outputs/Results/Return values                 |
|--------------|-------------------------|---------------------------|-----------------------------------------------|
| searchTask() | HashMap(String, String) | if task is found          | Message(): "Task: " + task + "is found";      |
| Message()    |                         | if task get is incomplete | Message(): "Task: " + task + "does not exist" |
|              |                         |                           |

7.
| Methods                 | Member variables  | Scenario               | Outputs/Results/Return values |
|-------------------------|-------------------|------------------------|-------------------------------|
| removeTask(String task) | String[] toDoList | if task is removed     | True                          |
|                         |                   | if task is not removed | false                         |
|                         |                   |                        |

8.
| Methods              | Member variables  | Scenario           | Outputs/Results/Return values |
|----------------------|-------------------|--------------------|-------------------------------|
| listAsc(String task) | String[] toDoList | if task is asc     | True                          |
|                      |                   | if task is not asc | false                         |
|                      |                   |                    |

8.
| Methods              | Member variables  | Scenario           | Outputs/Results/Return values |
|----------------------|-------------------|--------------------|-------------------------------|
| listDec(String task) | String[] toDoList | if task is dec     | True                          |
|                      |                   | if task is not dec | false                         |
|                      |                   |                    |

