package com.booleanuk.extension;

import java.util.ArrayList;

public class ToDoExtension{
    ArrayList<IDTask> tasks;

    public ToDoExtension(){
        tasks = new ArrayList<>();
    }

    public void add(String ID, String name){
        if (getTask(ID) == null){
            tasks.add(new IDTask(ID, name));
        }
    }

    public IDTask getTask(String ID){
        for (IDTask t : tasks){
            if (ID.equals(t.ID)){
                return t;
            }
        }
        return null;
    }

    public void changeName(String ID, String newName){
        if (getTask(ID) != null){
            getTask(ID).description = newName;
        }
    }

    public void changeStatus(String ID, boolean status){
        if (getTask(ID) != null){
            getTask(ID).status = status;
        }
    }

    public void displayTimeCreated(){
        for (IDTask t : tasks){
            System.out.println(t + ": " + t.created);
        }
    }
}
