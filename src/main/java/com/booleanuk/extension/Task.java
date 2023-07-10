package com.booleanuk.extension;


import com.booleanuk.shared.TaskStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Task {
    private static long idCounter = 0;

    private final long id;
    private String name;
    private TaskStatus status;
    private final ZonedDateTime timestamp;

    public static Task of(String name) {
        return new Task(idCounter++, name, TaskStatus.InProgress, ZonedDateTime.now());
    }

    public static long getCurrentIdCounter() {
        return idCounter;
    }

    public void toggleStatus() {
        switch (status) {
            case InProgress -> status = TaskStatus.Complete;
            case Complete -> status = TaskStatus.InProgress;
        }
    }
}
