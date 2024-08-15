package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class TodoListExtension {
    ArrayList<Task> todoList;
    int uniqueID = 0;

    public TodoListExtension(){
        todoList = new ArrayList<>();
    }

    public Boolean addTask(String task){
        LocalDate myDate = LocalDate.now();
        uniqueID += 1;
        Task newTask = new Task(task, uniqueID, false, myDate.toString());
        todoList.add(newTask);
        return true;
    }

    public boolean seeAllTasks(){
        if(todoList.size() == 0){
            System.out.println("No tasks to display");
            return false;
        }
        for(int i = 0; i < todoList.size(); i++){
            System.out.println(todoList.get(i));
        }
        return true;
    }

    public Boolean getTaskByID(int id){
        for (int i = 0; i < todoList.size(); i++){
            if(todoList.get(i).getUniqueID() == id){
                System.out.println(todoList.get(i).toString());
                return true;
            }
        }
        System.out.println("Couldnt find the task");
        return false;
    }

    public Boolean updateTaskNameByID(int id, String newName){
        for (int i = 0; i < todoList.size(); i++){
            if (todoList.get(i).getUniqueID() == id){
                System.out.println("Found task, updating");
                todoList.get(i).setTaskName(newName);
                return true;
            }
        }
        System.out.println("couldnt' find task");
        return false;
    }

    public Boolean updateStatusByID(int id, Boolean status){
        for(int i = 0; i < todoList.size(); i++){
            if(todoList.get(i).getUniqueID() == id){
                System.out.println("Found task, updating status");
                todoList.get(i).setStatus(status);
                return true;
            }
        }
        System.out.println("Couldnt find task");
        return false;
    }

    public Boolean getDateAndTime(){
        if(todoList.size()== 0){
            return false;
        }

        for(int i = 0; i < todoList.size(); i++){
            System.out.println(todoList.get(i).getTaskName());
            System.out.println(todoList.get(i).getDateCreated());
        }
        return true;
    }

    //Recreate the core functionality with the Task class instead

    public boolean removeTask(int id){
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getUniqueID() == id){
                todoList.remove(todoList.get(i));
                return true;
            }
        }
        return false;
    }

    public ArrayList<Task> getCompletedTasks(){
        ArrayList<Task> completedTasks = new ArrayList<>();
        for (int i = 0; i < todoList.size(); i++){
            if(todoList.get(i).getStatus()== true){
                completedTasks.add(todoList.get(i));
            }
        }
        return completedTasks;
    }

    public ArrayList<Task> getUncompletedTasks(){
        ArrayList<Task> uncompletedTasks = new ArrayList<>();
        for (int i = 0; i < todoList.size(); i++){
            if(todoList.get(i).getStatus()== false){
                uncompletedTasks.add(todoList.get(i));
            }
        }
        return uncompletedTasks;
    }

    public ArrayList<Task> getSortedTasks(String order){
        //ArrayList<Task> sortedTasks = todoList;
        ArrayList<Task> sortedTasks = new ArrayList<>();
        for(int i = 0; i < todoList.size(); i++){
            sortedTasks.add(todoList.get(i));
        }

        if(order.equals("Ascending")){
            sortedTasks.sort(((t1, t2) -> t1.getTaskName().compareTo(t2.getTaskName())));
        }else{
            sortedTasks.sort(((t1, t2) -> t1.getTaskName().compareTo(t2.getTaskName())));
            Collections.reverse(sortedTasks);
        }
        System.out.println(sortedTasks);
        return sortedTasks;
    }





    public static void main(String[] args) {
        ArrayList<String> newlist;
        TodoListExtension myList = new TodoListExtension();
        myList.addTask("Make Dinner");
        myList.addTask("Work out");
        myList.addTask("Zoom meeting");
        myList.addTask("Bus");

        myList.getSortedTasks("Ascending");

        for (int i = 0; i < myList.todoList.size(); i++){
            System.out.println(myList.todoList.get(i).toString());
        }

    }





}
