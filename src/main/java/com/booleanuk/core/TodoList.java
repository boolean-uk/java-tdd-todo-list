package com.booleanuk.core;

import java.util.*;

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

    public void status(String task, String newStatus){
        if (!list.containsKey(task)){
            System.out.println("That task is not in list");
            return;
        }
        list.put(task, newStatus);
        System.out.println("Status on " + task + " changed to " +newStatus);
    }

    public String showComplete(){
        String str="";
        for (Map.Entry<String, String> entry : list.entrySet()) {
            if (entry.getValue().equals("Complete")) {
                str += entry.getKey() + " : " + entry.getValue()+"\n";
            }
        }
        return str;
    }

    public String showIncomplete(){
        String str="";
        for (Map.Entry<String, String> entry : list.entrySet()) {
            if (entry.getValue().equals("Incomplete")) {
                str += entry.getKey() + " : " + entry.getValue()+"\n";
            }
        }
        return str;

    }

    public String search(){
        return "";
    }


    public String sortAlphabetically(){
        String str="";

        List<Map.Entry<String, String>> entryList = new ArrayList<>(list.entrySet());

        entryList.sort(Map.Entry.comparingByKey());

        Map<String, String> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, String> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
            str += entry.getKey() + " : " + entry.getValue()+"\n";

        }
        System.out.println(str);

        return str;
    }
    public String sortAlphabeticallyReverse(){
        String str="";

        List<Map.Entry<String, String>> entryList = new ArrayList<>(list.entrySet());

        entryList.sort((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()));

        Map<String, String> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, String> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
            str += entry.getKey() + " : " + entry.getValue()+"\n";

        }
        System.out.println(str);

        return str;
    }


}
