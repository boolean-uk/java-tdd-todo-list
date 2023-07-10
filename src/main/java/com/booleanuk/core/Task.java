package com.booleanuk.core;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
    private String title;
    private TaskStatus status = TaskStatus.INCOMPLETED;

}
