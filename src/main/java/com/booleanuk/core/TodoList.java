package com.booleanuk.core;

import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Map;

public class TodoList {

   private Map<String, Boolean> todolist = new HashMap<>();

    public TodoList() {

    }



    public void addTaskToTodolist(String task) {
        this.todolist.put(task, false);
    }

    public Map<String, Boolean> getTodolist() {
        return new HashMap<>(todolist);
    }

    public void printTasksFromTodolist() {
        for(String str : todolist.keySet()) {
            System.out.println(str);
        }
    }

    public void changeTaskToCompleteOrIncomplete(String task1) {
        if(this.todolist.containsKey(task1)) {
            this.todolist.put(task1, !(this.todolist.get(task1)));
        }

    }


    //Wanted to just pass in boolean value as i could just check the same value when looping, but for readability and eas of use i use String.
    public Map<String, Boolean> getCompleteOrIncompleteTasks(String completeOrIncomplete) {
        Map<String, Boolean> returnList = new HashMap<>();

        boolean completeOrNot;

        if(completeOrIncomplete.equalsIgnoreCase("complete") || completeOrIncomplete.equalsIgnoreCase("incomplete")) {
            completeOrNot = completeOrIncomplete.equalsIgnoreCase("complete");
        } else {
            throw new IllegalArgumentException("Must use complete or incomplete as parameter");
        }


        for (Map.Entry<String, Boolean> entry : this.getTodolist().entrySet()) {
            if(entry.getValue() == completeOrNot) {
                returnList.put(entry.getKey(), entry.getValue());
            }

        }

        return new HashMap<>(returnList);
    }

    public boolean checkTask(String task1) {
        if(!this.getTodolist().containsKey(task1)) {
            System.out.println("The task (" + task1 + ") does not exist in your Todolist.") ;
        }
        return this.getTodolist().containsKey(task1);
    }

    public void removeTask(String task) {
        this.todolist.remove(task);
    }
}
