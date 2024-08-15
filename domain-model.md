
Class TodoList

| Variables                         | Methods                                   | Scenario                                                | Result                                 | User story |
|-----------------------------------|-------------------------------------------|---------------------------------------------------------|----------------------------------------|------------|
| HashMap<String, Boolean> todoList | addTask(String task)                      | Task already exists                                     | return false                           | 1          |
|                                   |                                           | Task doesn't exist                                      | add to hashmap and return true         |            |
|                                   | changeStatus(String task, Boolean status) | Task doesn't exist                                      | return false                           | 3          |
|                                   |                                           | Task exists                                             | change bool and return true            |            |
|                                   | getAllTasks()                             | Loops hashmap and constructs<br/> list of all tasks     | returns list of all taskNames          | 2          |
|                                   | getCompletedTasks()                       | Iterate map and construct<br/>list of completed tasks   | return list of completed tasks         | 4          |
|                                   | getUncompletedTasks()                     | Iterate map and construct<br/>list of uncompleted tasks | returns list of incomplete tasks       | 5          |
|                                   | searchTasks(String task)                  | task doesn't exist in map                               | print error, return empty String       | 6          |
|                                   |                                           | task exists in map                                      | return Task string with status         |            |
|                                   | removeTask(String s)                      | task doesn't exist in map                               | print error, return false              | 7          |
|                                   |                                           | task exists in map                                      | remove task key from map, return true  |            |
|                                   | getSortedTasks(String order)              | order is "Ascending"                                    | return sorted list in ascending order  | 8 9        |
|                                   |                                           | order is "Descending"                                   | return sorted list in descending order |            |
