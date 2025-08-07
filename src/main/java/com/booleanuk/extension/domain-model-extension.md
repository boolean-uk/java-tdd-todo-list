| Class    | Members            | Method                             | Scenario            | Output     |
|----------|--------------------|------------------------------------|---------------------|------------|
| TodoList | List<Task> tasks   | add(String description)            |                     | Void       |
|          |                    | getTasks()                         |                     | List<Task> |
|          |                    | getCompleteTasks()                 |                     | List<Task> |
|          |                    | getIncompleteTasks()               |                     | List<Task> |
|          |                    | search(String search)              | Task exists         | Task       |
|          |                    |                                    | Task does not exist | null       |
|          |                    | search(int id)                     | Task exists         | Task       |
|          |                    |                                    | Task does not exist | null       |
|          |                    | remove(String description)         | Task exists         | True       |
|          |                    |                                    | Task doesnt exist   | False      |
|          |                    | getAlphAsc()                       |                     | List<Task> |
|          |                    | getAlphDesc()                      |                     | List<Task> |
|          |                    | renameTask(int id, String newDesc) | Task exists         | true       |
|          |                    |                                    | Task doesnt exist   | false      |
|          |                    | changeTaskStatus(int id)           | Task exists         | true       |
|          |                    |                                    | Task doesnt exist   | false      |
| Task     | boolean status     | toggleStatus()                     |                     | Void       |
|          | int id             |                                    |                     |            |
|          | String description |                                    |                     |            |
|          | String timestamp   |                                    |                     |            |
