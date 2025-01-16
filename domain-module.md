# TODO list

| Members                | Methods                | Scenario                | Outputs                              |
|------------------------|------------------------|-------------------------|--------------------------------------|
| Arraylist\<Task> tasks | add(Task task)         | Task is already in list | False                                |
|                        |                        | Task is not in the list | True                                 |
|                        | viewTask()             |                         | Display the list                     |
|                        | viewCompletedTasks()   |                         | Display the completed tasks          |
|                        | viewIncompletedTasks() |                         | Display the incompleted tasks        |
|                        | search(Task task)      | Task does not exist     | Print it was not found               |
|                        |                        | Task exist              | Print it was found                   |
|                        | removeTask(Task task)  | Task does not exist     | Print it was not found               |
|                        |                        | Task does exist         | Task removed                         |
|                        | viewAlphabeticAsc()    |                         | Display list alphabetical ascending  |
|                        | viewAplhabeticDesc()   |                         | Display list alphabetical descending |

# Task

| Members          | Methods                      | Scenario | Outputs                |
|------------------|------------------------------|----------|------------------------|
| boolean complete | changeStatus(boolean status) | True     | complete becomes True  |
| String name      |                              | False    | complete becomes False |
