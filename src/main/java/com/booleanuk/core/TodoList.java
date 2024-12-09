package com.booleanuk.core;

import java.util.*;

public class TodoList {
    Map<String, Boolean> tasks = new HashMap<>();


    public void add(String task) {
        tasks.put(task, false);
    }

    public String taskSearch(String task) {
        if (tasks.containsKey(task)) return "Task is on your list";
        else return "Task is not on your list";
    }

    public void taskRemove(String task) {
        tasks.remove(task);
    }

    public ArrayList taskList() {
        ArrayList<String> list = new ArrayList<>();
        for (String s : tasks.keySet()) {
            list.add(s);
        }
        if(list.isEmpty()) System.out.println("The list is empty");
        return list;
    }

    public void statusChange(String task) {
        if (tasks.containsKey(task)) {
            tasks.put(task, true);
        }
    }

    public ArrayList completedTasks() {
        ArrayList<String> list = new ArrayList<>();
        for (String s : tasks.keySet()) {
            if (tasks.get(s))
                list.add(s);
        }
        if(list.isEmpty()) System.out.println("The list is empty");
        return list;
    }

    public ArrayList incompletedTasks() {
        ArrayList<String> list = new ArrayList<>();
        for (String s : tasks.keySet()) {
            if (!tasks.get(s))
                list.add(s);
        }
        if(list.isEmpty()) System.out.println("The list is empty");
        return list;
    }

    public ArrayList tasksAsc() {
        ArrayList<String> list = new ArrayList<>();
        for (String s : tasks.keySet()) {
            if (!tasks.get(s))
                list.add(s);
        }
        Collections.sort(list);
        if(list.isEmpty()) System.out.println("The list is empty");
        return list;
    }

    public ArrayList tasksDesc() {
        ArrayList<String> list = new ArrayList<>();
        for (String s : tasks.keySet()) {
            if (!tasks.get(s))
                list.add(s);
        }
        Collections.sort(list, Collections.reverseOrder());
        if(list.isEmpty()) System.out.println("The list is empty");
        return list;
    }
}