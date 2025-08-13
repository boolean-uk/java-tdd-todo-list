package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TodoList { //should I use public variables or private?
    public ArrayList<Task> tasks;


    public TodoList(Task tasks) {
        this.tasks = new ArrayList<Task>();
        this.tasks.add(tasks);

    }

    public boolean addtask(Task addedtask){
        this.tasks.add(addedtask);
       // this.tasks.set(0, new Task());
        return true;

    }
    public boolean show(){
        for (Task task: tasks){
            task.show();

        }
        return true;
    }



    public String changeStatus(Task addedtask){
        if (addedtask.isStatus()){
            addedtask.setStatus(false);
            return "Task turned to not completed";
        }
        addedtask.setStatus(true);
        return "Task turned to completed";
    }

    public boolean completed(){
        boolean found = false;
        for (Task task: tasks){
            if (task.isStatus()){
                task.show();
                found = true;
            }

        }
        return found;
    }
    public boolean notCompleted(){
        boolean found = false;
        for (Task task: tasks){
            if (!task.isStatus()){
                task.show();
                found = true;
            }

        }
        return found;
    }
    public boolean search(String  query){
        for (Task task: tasks){
            if (Objects.equals(task.getTitle(), query)){
                task.show();
                return true;
            }
        }
        return false;
    }
    public boolean remove(String title){

        for (Task task: tasks){
            if (Objects.equals(task.getTitle(), title)){
                task.show();
                tasks.remove((task));
                return true;
            }
        }
        return false;
    }
    public boolean ascending(){
        Task[] toBeSorted = new Task[tasks.size()];
        Task temp;

        for (int i = 0; i < toBeSorted.length; i ++) {
            toBeSorted[i] = tasks.get(i);
        }

        for (int i = 0; i < tasks.size(); i ++) {
            for (int j = i + 1; j < tasks.size(); j ++) {

                if (toBeSorted[i].description.compareTo(toBeSorted[j].description) > 0) {
                    temp = toBeSorted[i];
                    toBeSorted[i] = toBeSorted[j];
                    toBeSorted[j] = temp;
                }
            }
        }
        List<Task> ascending = new ArrayList<>();
        ascending.addAll(List.of(toBeSorted));
        return true;

    }
    public boolean descending(){
        if (tasks.isEmpty()){
            return false;
        }

        Task[] toBeSorted = new Task[tasks.size()];
        Task temp;

        for (int i = 0; i < toBeSorted.length; i ++) {
            toBeSorted[i] = tasks.get(i);
        }

        for (int i = 0; i < tasks.size(); i ++) {
            for (int j = i + 1; j < tasks.size(); j ++) {

                if (toBeSorted[i].description.compareTo(toBeSorted[j].description) < 0) {
                    temp = toBeSorted[i];
                    toBeSorted[i] = toBeSorted[j];
                    toBeSorted[j] = temp;
                }
            }
        }
        List<Task> descending = new ArrayList<>();
        descending.addAll(List.of(toBeSorted));
        return true;
    }

}
