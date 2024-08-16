package com.booleanuk.extension;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public String add(Task task){
        tasks.add(task);
        String result = task.getName() + " added.";
        return result;
    }

    public String seeTasks(){
        String result = "";
        for(Task task : tasks){
            result += task.getName();

            if(task.getCompleted()){
                result += " completed";
            }
            else{
                result += " incomplete";
            }

            if(tasks.getLast() != task){
                result += ", ";
            }
        }
        return result;
    }

    public Boolean changeStatus(Task task){
        /*if(!tasks.contains(task)){
            throw new Exception("Task not found!");
        }*/
        if(tasks.contains(task)){
            if(task.getCompleted()){
                task.setCompleted(false);
            }
            else{
                task.setCompleted(true);
            }
        }
        return task.getCompleted();
    }

    public String seeCompletedTasks(){
        String result = "";
        for(Task task : tasks){
            if(task.getCompleted()){
                result += task.getName();
                if(tasks.getLast() != task){
                    result += ", ";
                }
            }
        }
        return result;
    }

    public String seeIncompleteTasks(){
        String result = "";
        for(Task task : tasks){
            if(!task.getCompleted()){
                result += task.getName();
                if(tasks.getLast() != task){
                    result += ", ";
                }
            }
        }
        return result;
    }

    public String search(String searchedTask){
        String result = "";
        for(Task task : tasks){
            if(task.getName().equals(searchedTask)){
                result += task.getName();
                if(task.getCompleted()){
                    result += " completed";
                }
                else{
                    result += " incomplete";
                }
                return result;
            }
        }
        return "Task not found";
    }

    public String remove(Task task){
        if(tasks.contains(task)){
            tasks.remove(task);
            return task.getName() + " removed";
        }
        return "Task not found";
    }

    public String seeTasksAscending(){
        String result = "";
        tasks.sort((t1, t2) -> t1.getName().compareTo(t2.getName()));
        for(Task task : tasks){
            result += task.getName();

            if(tasks.getLast() != task){
                result += " ";
            }
        }
        return result;
    }

    public String seeTasksDescending(){
        String result = "";
        tasks.sort((t2, t1) -> t2.getName().compareTo(t1.getName()));
        for(int i = tasks.size()-1; i > -1; --i){
            result += tasks.get(i).getName();

            if(tasks.getFirst() != tasks.get(i)){
                result += " ";
            }
        }
        return result;
    }

    public Task getTaskById(String id){
        for(Task task : tasks){
            if(task.getId().equals(id)){
                return task;
            }
        }
        return null;
    }

    public String setNameById(String id, String newName){
        Task task = getTaskById(id);
        task.setName(newName);
        return task.getName();
    }

    public Boolean changeStatusById(String id){
        return changeStatus(getTaskById(id));
        //return null;
    }

    public String seeDates(){
        String result = "";
        for(Task task : tasks){
            result += task.getName() + " " + task.getDate().truncatedTo(ChronoUnit.SECONDS).toString();

            if(tasks.getLast() != task){
                result += " ";
            }
        }
        System.out.println(result);
        return result;
    }

}
