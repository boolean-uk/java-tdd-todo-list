package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TodoListExtension {
    ArrayList<String> toDoList;
    ArrayList<Boolean> taskComplete;
    HashMap<String, String> mapIDtoTask;
    HashMap<String, String> mapTaskToTime;
    DateTimeFormatter dtf;

    public TodoListExtension() {
        toDoList = new ArrayList<>();
        taskComplete = new ArrayList<>();
        mapIDtoTask = new HashMap<>();
        mapTaskToTime = new HashMap<>();
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    }

    public boolean addTaskID(String task, String ID) {
        if (!toDoList.contains(task) && !mapIDtoTask.containsKey(ID)) {
            toDoList.add(task);
            taskComplete.add(false);
            mapIDtoTask.put(ID, task);
            return true;
        }
        return false;
    }

    public boolean addTaskIDTime(String task, String ID) {
        if (!toDoList.contains(task) && !mapIDtoTask.containsKey(ID)) {
            toDoList.add(task);
            taskComplete.add(false);
            mapIDtoTask.put(ID, task);
            LocalDateTime now = LocalDateTime.now();
            mapTaskToTime.put(ID, dtf.format(now));

            return true;
        }
        return false;
    }

    public String getTask(String ID) {
        String result = "";
        if (mapIDtoTask.containsKey(ID)) {
            result = mapIDtoTask.get(ID);
        }
        return result;
    }

    public boolean newTaskName(String ID, String newName) {
        if (mapIDtoTask.containsKey(ID)) {
            int index = toDoList.indexOf(mapIDtoTask.get(ID));
            toDoList.set(index, newName);
            mapIDtoTask.replace(ID, newName);
            return true;
        }
        return false;
    }

    public boolean displayTasks() {
        if (toDoList.size() == 0){
            return false;
        }

        for (String task: toDoList) {
            System.out.println(task);
        }
        return true;
    }

    public boolean taskStatus(String task, boolean status) {
        if (toDoList.contains(task)) {
            int idx = toDoList.indexOf(task);
            taskComplete.set(idx, status);
            return taskComplete.get(idx);
        }
        return false;
    }

    public boolean taskStatusID(String ID, boolean status) {
        if (mapIDtoTask.containsKey(ID) ) {
            String task = mapIDtoTask.get(ID);
            int idx = toDoList.indexOf(task);
            taskComplete.set(idx, status);
            return taskComplete.get(idx);
        }
        return false;
    }

    public ArrayList<String> displayCompletedTasks() {
        ArrayList<String> completedTasks = new ArrayList<>();

        for (int i = 0; i < taskComplete.size(); i++) {
            if (taskComplete.get(i)) {
                completedTasks.add(toDoList.get(i));
            }
        }
        return completedTasks;
    }

    public ArrayList<String> displayIncompletedTasks() {
        ArrayList<String> incompletedTasks = new ArrayList<>();

        for (int i = 0; i < taskComplete.size(); i++) {
            if (!taskComplete.get(i)) {
                incompletedTasks.add(toDoList.get(i));
            }
        }
        return incompletedTasks;
    }

    public String searchTasks(String task) {
        String message = "Not Found";

        if (toDoList.contains(task)) {
                message = "Found";
        }
        return message;
    }

    public boolean removeTask(String task) {
        if (toDoList.contains(task)) {
            int idx = toDoList.indexOf(task);
            toDoList.remove(idx);
            taskComplete.remove(idx);
            return true;
        }
        return false;
    }

    public ArrayList<String> alphabetizeUp() {
        ArrayList<String> alphabetizedList = toDoList;
        Collections.sort(alphabetizedList);
        return alphabetizedList;
    }

    public ArrayList<String> alphabetizeDown() {
        ArrayList<String> alphabetizedList = toDoList;
        Collections.sort(alphabetizedList);
        Collections.reverse(alphabetizedList);
        return alphabetizedList;
    }





}
