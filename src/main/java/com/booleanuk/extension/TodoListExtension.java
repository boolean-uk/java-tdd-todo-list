package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TodoListExtension {
    public ArrayList<Task> tasks;

    public TodoListExtension() {
        this.tasks = new ArrayList<Task> ();
    }
}
