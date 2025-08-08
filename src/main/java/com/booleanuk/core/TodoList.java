package com.booleanuk.core;

import java.util.*;

public class TodoList {


    public boolean addTask(Map<String,String> toDoList, String task) {
        if (!toDoList.containsKey(task)) {
            toDoList.put(task, "Incomplete");
            return true;
        }
        return false;
    }

    public boolean printTask(Map<String,String> toDoList) {
        if (!toDoList.isEmpty()){
            for(String key : toDoList.keySet()){
                System.out.println(key);
            }
            return true;
        }
        return false;
    }

    public Boolean changeStatus(Map<String,String> toDoList, String task) {
        if (toDoList.containsKey(task)){
            if (Objects.equals(toDoList.get(task), "Completed")){
                toDoList.replace(task, "Incomplete");
                return true;
            } else toDoList.replace(task, "Completed");
            return true;
        }
        return false;
    }

    public List<String> completeTasks(Map<String,String> toDoList){
        List<String> list = new ArrayList<>();
        for(String key: toDoList.keySet()){
            if(Objects.equals(toDoList.get(key), "Completed")){
                list.add(key);
            }
        }
        return list;
    }
    public List<String> inCompleteTasks(Map<String, String> toDoList) {
        List<String> list = new ArrayList<>();
        for(String key: toDoList.keySet()){
            if(Objects.equals(toDoList.get(key), "Incomplete")){
                list.add(key);
            }
        }
        return list;
    }


    public boolean searchTaskNotFound(Map<String,String> toDoList, String task) {
        if (!toDoList.containsKey(task)) {
            System.out.println("The task was not found");
            return true;
        }
        return false;
    }



    public boolean removeTask(Map<String, String> toDoList, String task) {
        if (toDoList.containsKey(task)) {
            toDoList.remove(task);
            return true;
        }
        return false;
    }

    public Map<String, String> sortAscending(Map<String, String> toDoList) {
        List<String> sortedAscendingList = new ArrayList<>(toDoList.keySet());
        Collections.sort(sortedAscendingList);
        Map<String, String> sortedAscending = new TreeMap<>();
        for(String key : sortedAscendingList){
            String value  = toDoList.get(key);
            sortedAscending.put(key, value);
        }
        return sortedAscending;

    }

    public Map<String, String>  sortDescending(Map<String, String> toDoList) {
        List<String> sortedDescendingList = new ArrayList<>(toDoList.keySet());
        Map<String, String> sortedDescending = new TreeMap<>(Comparator.reverseOrder());
        for(String key : sortedDescendingList){
            String value  = toDoList.get(key);
            sortedDescending.put(key, value);
        }
        return sortedDescending;
    }
}
