#1

| Classes | Methods                      | Members                          | Scenario              | Output |
|---------|------------------------------|----------------------------------|-----------------------|--------|
| Task    | addTask(int id, String name) | HashMap<int id, String taskname> | A string is given     | true.  |
|         |                              |                                  | String already added? | false. |
|         |                              |                                  |                       |        |

#2

| Classes | Methods    | Members | Scenario                             | Output                     |
|---------|------------|---------|--------------------------------------|----------------------------|
| Task    | allTasks() |         | Method is called for a task overview | tasks are shown as output. |
|         |            |         |                                      |                            |
|         |            |         |                                      |                            |

#3

| Classes | Methods                   | Members | Scenario        | Output                |
|---------|---------------------------|---------|-----------------|-----------------------|
| Task    | setStatus(boolean status) |         | status is given | outputs the taskname. |
|         |                           |         |                 |                       |
|         |                           |         |                 |                       |

#4

| Classes | Methods       | Members | Scenario           | Output         |
|---------|---------------|---------|--------------------|----------------|
| Task    | getComplete() |         | If status is true  | outputs tasks. |
|         |               |         |                    |                |
|         |               |         |                    |                |

#5

| Classes | Methods         | Members | Scenario         | Output        |
|---------|-----------------|---------|------------------|---------------|
| Task    | getInComplete() |         | if task is false | output tasks. |
|         |                 |         |                  |               |
|         |                 |         |                  |               |

#6


| Classes | Methods         | Members | Scenario                  | Output           |
|---------|-----------------|---------|---------------------------|------------------|
| Task    | getTask(int id) |         | if id exists in map       | returns task.    |
|         |                 |         | if id doesnt exist in map | returns message. |
|         |                 |         |                           |                  |

#7


| Classes | Methods            | Members | Scenario       | Output        |
|---------|--------------------|---------|----------------|---------------|
| Task    | removeTask(int id) |         | An id is given | returns true. |
|         |                    |         | id not there   | returns false |
|         |                    |         |                |               |

#8


| Classes | Methods     | Members | Scenario       | Output                                  |
|---------|-------------|---------|----------------|-----------------------------------------|
| Task    | ascending() |         | Method is used | tasks are displayed in ascending order. |
|         |             |         |                |                                         |
|         |             |         |                |                                         |

#9


| Classes | Methods      | Members | Scenario       | Output                                   |
|---------|--------------|---------|----------------|------------------------------------------|
| Task    | descending() |         | Method is used | tasks are displayed in descending order. |
|         |              |         |                |                                          |
|         |              |         |                |                                          |

