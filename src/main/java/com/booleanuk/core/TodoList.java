package com.booleanuk.core;

import java.util.*;

public class  TodoList {
    public HashMap<String,String> todoList = new HashMap<>();

    public boolean isTaskInList(String task){
        return todoList.containsKey(task);
    }

    public String[] checkAllTasks(String order){
        if (todoList.isEmpty()){
            return new String[]{"List is empty"};
        }
        ArrayList<String> tasks = new ArrayList<>();
        for (HashMap.Entry<String,String> entry: todoList.entrySet()){
            tasks.add(entry.getKey());
        }
        String [] taskArray = new String[tasks.size()];
        for(int i = 0; i < taskArray.length; i++){
            taskArray[i] = tasks.get(i) +": " + todoList.get(tasks.get(i));
        }
        order.toLowerCase();
        if (order.equals("descending")){
            Arrays.sort(taskArray, Collections.reverseOrder());
        }
        else if (order.equals("ascending")){
            Arrays.sort(taskArray);
        }
        return taskArray;
    }

    public String addTask(String task, String status){
        if (isTaskInList(task)){
            return "Can not add: Task already added";
        }
        todoList.put(task,status);
        return "Task added";
    }

    public String removeTask(String task){
        if (!isTaskInList(task)){
            return "Task does not exist";
        }
        todoList.remove(task);
        return "Task removed";
    }

    public String checkOneTask(String task){
        if (!isTaskInList(task)){
            return "Task not found";
        }
        return task +": "+ todoList.get(task);
    }

    public String changeTaskStatus(String task, String status){
        todoList.replace(task,status);
        return "Status changed";
    }

    public String [] getCompleteOrIncomplete(String status){
        ArrayList<String> tasks = new ArrayList<>();
        if (todoList.containsValue(status)){
            for (HashMap.Entry<String,String> entry: todoList.entrySet()){
                if (Objects.equals(entry.getValue(), status)){
                    tasks.add(entry.getKey());
                }
            }
        }
        String [] taskArray = new String[tasks.size()];
        for(int i = 0; i < taskArray.length; i++){
            taskArray[i] = tasks.get(i);
        }
        return taskArray;
    }
}

