package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;

public class TodoList {

    public ArrayList<Task> tasks ;

    public TodoList(){

        tasks = new ArrayList<>();
    }
    public TodoList(ArrayList<Task> tasks){
        this.tasks = tasks;
    }

    public ArrayList<Task> getAllTasks(){
        return this.tasks;
    };

    public boolean addTask(Task task){

        if(task == null || task.getName().isEmpty() || task.getStatus().isEmpty())
            return false;


        return tasks.add(task);
    }

    public ArrayList<Task> getAllTask(){

        if(tasks.isEmpty())
            return null;

        return this.tasks;
    }

    public Task getSingleTask(String name){

        if(name.isEmpty())
            return null;

        ArrayList<Task> liste = new ArrayList<>();
        tasks.stream().filter(task->task.getName().equals(name)).forEach(t->liste.add(t));
       return liste.getFirst();
    }

    public Boolean changeStatus(String name, String status){

        if(status == null)
            return null;

        if(status.isEmpty())
            return false;

        Task t1 = getSingleTask(name);
        String nameBefore = t1.getStatus();

        tasks.stream().filter(task->task.getName().equals(name)).forEach(t->t.changeStatus(status));

        String nameAfter = t1.getStatus();


        return !nameBefore.equals(nameAfter);

    }
    public boolean removeTasks(Task t){

       return tasks.remove(t);
    }


    public ArrayList<Task> getAllCompleteTasks(){

        ArrayList<Task> list = new ArrayList<>();

        tasks.stream().filter(task->task.getStatus().equals("Complete")).forEach(list::add);


        return list;
    }

    public ArrayList<Task> getAllIncompleteTasks(){

        ArrayList<Task> list = new ArrayList<>();

        tasks.stream().filter(task->task.getStatus().equals("Incomplete")).forEach(list::add);

        return list;
    }

    public String searchTask(String name){


        for (Task t : tasks) {

            if (t.getName().equals(name))
               return "Task found" ;

        }


        return "Task not found" ;

    }

    public ArrayList<Task> ascAlphabetical(){

        ArrayList<Task> newList = new ArrayList<>();
        Comparator<Task> alphabet = (a,b) -> a.getName().compareTo(b.getName());
        tasks.stream().sorted(alphabet).forEach(t-> newList.add(t));

        return newList;

    }

    public ArrayList<Task> descAlphabetical(){


        ArrayList<Task> newList = new ArrayList<>();
        Comparator<Task> alphabet = (a,b) ->b.getName().compareTo(a.getName());
        tasks.stream().sorted(alphabet).forEach(t-> newList.add(t));

        return newList;
    }

}
