package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Extension {

    List<Task> list = new ArrayList<>();
    Task task1 = new Task("Cleaning", 123);
    Task task2 = new Task("Work", 111);

    public Extension(){
        list.add(task1);
        list.add(task2);
    }

    public Task getTask(int id){
        for(Task t : list){
            if(t.id == id){
                return t;
            }
        }
        return null;
    }

    public void updateTask(int id, String name) {
        for(Task t : list){
            if(t.id == id){
                t.name = name;
            }
        }
    }

    public void updateStatus(int id){
        for(Task t : list){
            if(t.id == id){
                t.status = true;
            }
        }
    }

    public LocalDateTime getTimeOfCreation(int id){
        for(Task t : list){
            if(t.id == id){
                return t.time;
            }
        }
        return null;
    }

}
