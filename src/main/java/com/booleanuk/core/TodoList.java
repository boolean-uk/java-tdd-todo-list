package com.booleanuk.core;

import java.util.*;


public class TodoList {
    TreeMap<String, Boolean> toDos = null;


    public TodoList() {
        this.toDos = new TreeMap<>();
    }

    public boolean add(String taskName) {

        if (!toDos.containsKey(taskName)) {
            toDos.put(taskName, false);
            return true;
        } else
            return false;
    }

    public String[] view() {

        String[] resultSet  = toDos.keySet().toArray(new String[0]);
        return resultSet;
    }

    public boolean changeStatus(String taskName) {

        if (toDos.containsKey(taskName)) {

            if (toDos.get(taskName) == false) {
                toDos.put(taskName, true);
                return true;
            }
            if (toDos.get(taskName) == true) {
                toDos.put(taskName, false);
                return true;

            }

        }
        return false;
    }
    public String[] viewCompletedTasks() {

        TreeMap<String, Boolean> completed = new TreeMap<>();

        for (String s : toDos.keySet())

            if (toDos.get(s)==true) {
                completed.put(s, toDos.get(s));
            }
        String[] resultSet  = completed.keySet().toArray(new String[0]);
        return resultSet;

    }

    public String[] viewIncompletedTasks() {

        TreeMap<String, Boolean> incomplete = new TreeMap<>();

        for (String s : toDos.keySet())

            if (toDos.get(s)==false) {
                incomplete.put(s, toDos.get(s));
            }
        String[] resultSet  = incomplete.keySet().toArray(new String[0]);
        return resultSet;

    }

    public boolean removeTask(String taskName) {

        if (toDos.containsKey(taskName)) {
            toDos.remove(taskName);
            return true;

        } else
            return false;

    }

    public String searchTask(String taskName) {

        if (toDos.containsKey(taskName)) {
            return taskName + " was found.";

        } else
            return "No matching task was found.";
    }

    public String[] sortAsc() {

        String[] resultSet  = toDos.keySet().toArray(new String[0]);
        return resultSet;
    }

    public String[] sortDesc() {
        TreeMap<String, Boolean> sortedList = new TreeMap<>(Comparator.reverseOrder());

        sortedList.putAll(toDos);
        String[] resultSet  = sortedList.keySet().toArray(new String[0]);
        return resultSet;
}
}
