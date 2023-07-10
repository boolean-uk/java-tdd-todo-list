package com.booleanuk.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Task {
    private String title;

    public Task(String title) {
        this.title = title;
    }
}
