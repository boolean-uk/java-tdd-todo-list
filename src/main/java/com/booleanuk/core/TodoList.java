package com.booleanuk.core;

import java.util.*;

public class TodoList {

    public LinkedHashMap<String, Boolean> todoItems;


    public TodoList() {
        this.todoItems = new LinkedHashMap<>();

    }

    public void addTask(String item, boolean status) {
        todoItems.put(item, status);
//        System.out.println("The task has been added.");
    }


    public String seeTasks() {
        if (todoItems.size() > 0) {
            StringBuilder str = new StringBuilder();
            List<String> keys = new ArrayList<>(todoItems.keySet());

            for (int i = 0; i < keys.size(); i++) {
                str.append(keys.get(i));
                if (i <= keys.size() - 2) {
                    str.append(", ");
                }
            }
            return str.toString();
        }

        return "No tasks found";

    }

    public void changeStatus(String itemName) {
        if (!todoItems.get(itemName)) {
            todoItems.put(itemName, true);
            System.out.println("The status has been changed.");
        } else {
            todoItems.put(itemName, false);
            System.out.println("The status has been changed.");
        }
    }

    public String getCompletedTasks() {
        StringBuilder completedTasks = new StringBuilder();
        List<Map.Entry<String, Boolean>> entryList = new ArrayList<>(todoItems.entrySet());

        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<String, Boolean> entry = entryList.get(i);
            if (entry.getValue()) {
                completedTasks.append(entry.getKey());
                if (i < entryList.size() - 1) {
                    completedTasks.append(", ");
                }
            }
        }
        System.out.println("List of all the completed tasks");
        return completedTasks.toString();
    }


    public String getUncompletedTasks() {
        StringBuilder uncompleted = new StringBuilder();

        for (Map.Entry<String, Boolean> entry : todoItems.entrySet()) {
            if (!entry.getValue()) {
                uncompleted.append(entry.getKey()).append(", ");
            }
        }

        if (!uncompleted.isEmpty()) {
            uncompleted.delete(uncompleted.length() - 2, uncompleted.length());
        }
        System.out.println("List of all the uncompleted tasks");
        return uncompleted.toString();
    }


    public Boolean searchTask(String taskName) {

        if (todoItems.containsKey(taskName)) {
            System.out.println("The task \"" + taskName + "\" has been found in your Todo-list");
            return true;
        }
        System.out.println("The task \"" + taskName + "\" has not been found in your Todo-list");
        return false;


    }

    public Boolean removeTask(String taskName) {
        if (todoItems.containsKey(taskName)) {
            todoItems.remove(taskName);
            System.out.println("The task \"" + taskName + "\" has been successfully removed");
            return true;
        }
        System.out.println("The task \"" + taskName + "\" could not be found in the list");
        return false;

    }

    public String ascendingTasks() {

        Map<String, Boolean> map = new TreeMap<>(todoItems);
        StringBuilder list = new StringBuilder();

        int i = 0;
        for (String sKey : map.keySet()) {

            list.append(sKey);
            if (i < map.size() - 1) {
                list.append(", ");
            }
            i++;
        }
        System.out.println(list);


        return list.toString();
    }

    public String descendingTasks() {
        Map<String, Boolean> map = new TreeMap<>(Collections.reverseOrder());
        map.putAll(todoItems);
        StringBuilder list = new StringBuilder();


        int i = 0;
        for (String sKey : map.keySet()) {

            list.append(sKey);
            if (i < map.size() - 1) {
                list.append(", ");
            }
            i++;
        }
        System.out.println(list);


        return list.toString();
    }


}
