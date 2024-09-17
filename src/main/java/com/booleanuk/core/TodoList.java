package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class TodoList {
    public Random randomiser;
    HashMap<String, Integer> list = new HashMap<>();
    // 0 for uncompleted tasks, 1 for completed.
    public boolean add(String task, int completed) {
        if (list.containsKey(task)) {
            return false;
        }
        list.put(task, completed);
        return true;
    }
    public HashMap see() {
        return list;
    }
    public String change(String task, int status) {
        list.put(task, status);
        if (status == 1) {
            return "completed";
        }
        return "uncompleted";
    }

    public ArrayList completed () {
        ArrayList<String> completed = new ArrayList<>();
        for (String key : list.keySet()) {
            if (list.get(key) == 1 ) {
                completed.add(key);
            }
        }
        return completed;
    }
    public ArrayList uncompleted () {
        ArrayList<String> uncompleted = new ArrayList<>();
        for (String key : list.keySet()) {
            if (list.get(key) == 0 ) {
                uncompleted.add(key);
            }
        }
        return uncompleted;
    }
     public boolean search (String task) {
         return list.containsKey(task);
     }

     public boolean remove(String task) {
         if (list.containsKey(task)) {
             list.remove(task);
             return true;
         }
         return false;
     }

    public TreeMap orderAscending() {
        TreeMap<String, Integer> order = new TreeMap<>();
        order.putAll(list);
        return order;
    }
}
