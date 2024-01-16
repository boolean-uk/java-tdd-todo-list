package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class TodoList {

    HashMap<String, String> list = new HashMap<String, String>();


    public String add(String task){
        if (list.containsKey(task)){
            return "Task already in TodoList";
        }
        list.put(task, "Incomplete");
        return task+ " added to TodoList";
    }

    public String remove(String task){
        if (!list.containsKey(task)){
            return task + " not in TodoList";
        }
        list.remove(task);
        return task + " removed from TodoList";
    }

    public String show(){
        String str="";
        for (Map.Entry<String, String> entry : list.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
            str += entry.getKey()+ " : "+ entry.getValue() + "\n";
        }
        return str;
    }

    public String status(){
        return "";
    }

    public String showComplete(){
        return "";
    }

    public String showIncomplete(){
        return "";
    }

    public String search(){
        return "";
    }


    public String sort(){
        return "";
    }


}
