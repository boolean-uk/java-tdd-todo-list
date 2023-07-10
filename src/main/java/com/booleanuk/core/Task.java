package com.booleanuk.core;


import com.booleanuk.shared.TaskStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Task {
    private final String name;
    private TaskStatus status;

    public static Task of(String name) {
        return new Task(name, TaskStatus.InProgress);
    }

    public void toggleStatus() {
        switch (status) {
            case InProgress -> status = TaskStatus.Complete;
            case Complete -> status = TaskStatus.InProgress;
        }
    }
}
