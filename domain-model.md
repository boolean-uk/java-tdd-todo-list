# Domain Model

```java
public enum SortingOrder {
    Descending,
    Ascending
}
```

```java
public enum TaskStatus {
    Complete,
    InProgress
}
```

```java

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Task {
    private final String name;
    private TaskStatus status;

    public static Task of(String name) {
        return new Task(name, TaskStatus.InProgress);
    }
}
```

```java
public class TodoList {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String name) {
        // TODO
    }

    public List<Task> getAllTasks() {
        // TODO
        return null;
    }

    public void toggleTaskStatus(String name) {
        // TODO
    }

    public List<Task> getAllTasksByStatus(TaskStatus status) {
        // TODO
        return null;
    }

    public Optional<Task> getOneTaskByName(String name) {
        // TODO
        return null;
    }

    public void removeOneTaskByName(String name) {
        // TODO
    }

    public void removeAllTasksByName(String... names) {
        // TODO
    }

    public List<Task> getAllTasksSorted(SortingOrder sortingOrder) {
        // TODO
        return null;
    }
}
```
