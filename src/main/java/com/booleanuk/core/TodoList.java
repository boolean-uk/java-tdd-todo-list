package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TodoList {

    public HashMap<String, Boolean> ts;

    public TodoList() {
        this.ts = new HashMap<>();
    }

    public boolean add(String task) {
        if (this.ts.containsKey(task)) {
            return false;
        }
        this.ts.put(task, false);
        return true;
    }

    public boolean remove(String task) {
        if (this.ts.containsKey(task)) {
            this.ts.remove(task);
            return true;
        }

        return false;
    }

    public ArrayList<String> sort(boolean sortOneWay) {
        if (this.ts.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> tasks = new ArrayList<>(this.ts.keySet());
        Collections.sort(tasks);
        if (!sortOneWay) {
            Collections.reverse(tasks);
        }
        return tasks;
    }

    public boolean setStatus(String task) {
        if (this.ts.containsKey(task)) {
            boolean st = this.ts.get(task);
            this.ts.replace(task, !st);
            return true;
        }

        return true;
    }


    public ArrayList<String> showStatus(boolean completionStatus) {
        if (this.ts.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> tasks = new ArrayList<>();
        for (String task : this.ts.keySet()) {
            if (this.ts.get(task) && completionStatus) {
                tasks.add(task);
            } else if (!this.ts.get(task) && !completionStatus) {
                tasks.add(task);
            }

        }
        return tasks;
    }

    public String retriveTask(String task) {

        if (this.ts.containsKey(task)) {

            boolean st = this.ts.get(task);
            if (st) {
                return task + " complete";
            } else {
                return task + " incomplete";
            }


        }
        return task + " not found";
    }

        public String fetchMultipleTask() {
            if (this.ts.isEmpty()) {
                return "No tasks";
            }
            StringBuilder sb = new StringBuilder();
            for (String missions : this.ts.keySet()) {
                if (this.ts.get(missions)) {
                    String res = missions + " complete\n";
                    sb.append(res);
                } else {
                    String res = missions + " incomplete\n";
                    sb.append(res);
                }
            }
            return sb.toString();
        }
    }

