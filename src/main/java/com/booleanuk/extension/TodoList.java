package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.*;

public class TodoList {

    Map<Integer, ArrayList<Object>> tasks;
    LocalDateTime currentTime = LocalDateTime.now();
    public TodoList(){
        this.tasks = new HashMap<>();
    }
    public Boolean addTask(String task, int ID) {
        ArrayList<Object> info = new ArrayList<>();
        info.add(task);
        info.add(false);
        info.add(this.currentTime);
        this.tasks.put(ID, info);
        System.out.println(this.tasks);
        return true;
        }

}

