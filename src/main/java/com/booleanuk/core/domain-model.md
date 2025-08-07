| Class    | Members            | Method                     | Scenario            | Output     |
|----------|--------------------|----------------------------|---------------------|------------|
| TodoList | List<Task> tasks   | add(String description)    |                     | Void       |
|          |                    | getTasks()                 |                     | List<Task> |
|          |                    | getCompleteTasks()         |                     | List<Task> |
|          |                    | getIncompleteTasks()       |                     | List<Task> |
|          |                    | search(String search)      | Task exists         | Task       |
|          |                    |                            | Task does not exist | null       |
|          |                    | remove(String description) | Task exists         | True       |
|          |                    |                            | Task doesnt exist   | False      |
|          |                    | getAlphAsc()               |                     | List<Task> |
|          |                    | getAlphDesc()              |                     | List<Task> |
| Task     | boolean status     | toggleStatus()             |                     | Void       |
|          | String description |                            |                     |            |
