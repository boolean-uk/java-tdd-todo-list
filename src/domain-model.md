##1

| Classes  | Methods                      | Members                          | Scenario              | Output |
|----------|------------------------------|----------------------------------|-----------------------|--------|
| TodoList | addTask(int id, String name) | HashMap<int id, String taskname> | A string is given     | true.  |
|          |                              |                                  | String already added? | false. |
|          |                              |                                  |                       |        |

##2

| Classes  | Methods    | Members | Scenario                             | Output                     |
|----------|------------|---------|--------------------------------------|----------------------------|
| TodoList | allTasks() |         | Method is called for a task overview | tasks are shown as output. |
|          |            |         |                                      |                            |
|          |            |         |                                      |                            |

##3

| Classes  | Methods                   | Members | Scenario        | Output                |
|----------|---------------------------|---------|-----------------|-----------------------|
| TodoList | setStatus(boolean status) |         | status is given | outputs the taskname. |
|          |                           |         |                 |                       |
|          |                           |         |                 |                       |

##4

| Classes  | Methods       | Members | Scenario           | Output         |
|----------|---------------|---------|--------------------|----------------|
| TodoList | getComplete() |         | If status is true  | outputs tasks. |
|          |               |         |                    |                |
|          |               |         |                    |                |

##5

| Classes  | Methods         | Members | Scenario         | Output        |
|----------|-----------------|---------|------------------|---------------|
| TodoList | getInComplete() |         | if task is false | output tasks. |
|          |                 |         |                  |               |
|          |                 |         |                  |               |

##6


| Classes  | Methods              | Members | Scenario                    | Output                     |
|----------|----------------------|---------|-----------------------------|----------------------------|
| TodoList | getTask(String name) |         | if name exists in map       | returns message with task. |
|          |                      |         | if name doesnt exist in map | returns message.           |
|          |                      |         |                             |                            |

##7


| Classes  | Methods                 | Members | Scenario       | Output        |
|----------|-------------------------|---------|----------------|---------------|
| TodoList | removeTask(String name) |         | An id is given | returns true. |
|          |                         |         | id not there   | returns false |
|          |                         |         |                |               |

##8


| Classes  | Methods     | Members | Scenario       | Output                                  |
|----------|-------------|---------|----------------|-----------------------------------------|
| TodoList | ascending() |         | Method is used | tasks are displayed in ascending order. |
|          |             |         |                |                                         |
|          |             |         |                |                                         |

##9


| Classes  | Methods      | Members | Scenario       | Output                                   |
|----------|--------------|---------|----------------|------------------------------------------|
| TodoList | descending() |         | Method is used | tasks are displayed in descending order. |
|          |              |         |                |                                          |
|          |              |         |                |                                          |

#Extension
##1

| Classes           | Methods     | Members                  | Scenario                                      | Output |
|-------------------|-------------|--------------------------|-----------------------------------------------|-------|
| TodoListExtension | getWithId() | HashMap<Integer, String> | Method is called with id and id exists        | true  |
|                   |             |                          | Method is called with id, but id doesnt exist | false |
|                   |             |                          |                                               |       |

##2

| Classes  | Methods                            | Members | Scenario                | Output                    |
|----------|------------------------------------|---------|-------------------------|---------------------------|
| TodoList | setNewName(int id, String newName) |         | Parameters are provided | The task gets a new name. |
|          |                                    |         |                         |                           |
|          |                                    |         |                         |                           |

##3


| Classes  | Methods                    | Members | Scenario                       | Output         |
|----------|----------------------------|---------|--------------------------------|----------------|
| TodoList | changeStatusWithId(int id) |         | Method is used with correct id | returns true.  |
|          |                            |         | Method is used with wrong id   | returns false. |
|          |                            |         |                                |                |

##4


| Classes  | Methods       | Members | Scenario                       | Output                                        |
|----------|---------------|---------|--------------------------------|-----------------------------------------------|
| TodoList | timeCreated() |         | Method is called for all tasks | tasks are displayed with their creation time. |
|          |               |         |                                |                                               |
|          |               |         |                                |                                               |