| Class    | Members                | Method                                       | Scenario            | Output     | Tested? |
|----------|------------------------|----------------------------------------------|---------------------|------------|---------|
| TodoList | List<Task> tasks       | add(String description)                      |                     | Void       | Yes     |
|          |                        | getTasks()                                   |                     | List<Task> | Yes     |
|          |                        | getCompleteTasks()                           |                     | List<Task> | Yes     |
|          |                        | getIncompleteTasks()                         |                     | List<Task> | Yes     |
|          |                        | search(String search)                        | Task exists         | True       | Yes     |
|          |                        |                                              | Task does not exist | False      |         |
|          |                        | remove(String description)                   | Task exists         | True       | Yes     |
|          |                        |                                              | Task doesnt exist   | False      |         |
|          |                        | getAlphAsc()                                 |                     | List<Task> | Yes     |
|          |                        | getAlphDesc()                                |                     | List<Task> | Yes     |
|          |                        |                                              |                     |            |         |
|          |                        | getById(String id)                           | Task exists         | Task       | Yes     |
|          |                        |                                              | Task does not exist | null       |         |
|          |                        | updateDescription(String id, String newDesc) | Task exists         | True       | Yes     |
|          |                        |                                              | Task does not exist | False      |         |
|          |                        | changeStatus(String id)                      | Task exists         | True       | Yes     |
|          |                        |                                              | Task does not exist | False      |         |
| Task     | boolean completed      |                                              |                     |            |         |
|          | String description     |                                              |                     |            |         |
|          | String ID              | completeTask( )                              | Task was incomplete | True       | Yes     |
|          | LocalDate creationDate |                                              | Task was complete   | False      | Yes     |
|          |                        | incompleteTask()                             | Task was complete   | True       | Yes     |
|          |                        |                                              | Task was incomplete | False      | Yes     |
|          |                        | getCreationDate()                            |                     | LocalDate  |         |