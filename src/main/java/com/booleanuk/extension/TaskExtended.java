package com.booleanuk.extension;

public class TaskExtended {

    String name;
    boolean isComplete;
    int id;
    static int order = 1000;
    String timeCreated;

    public TaskExtended(String name){
        this.name = name;
        this.isComplete = false;
        this.id = order;
        order ++;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public void setName(int id, String name){
        System.out.println(id + "input");
        System.out.println(name + "input");
        System.out.println(this.id + "actual");
        System.out.println(this.name + "actual");
        if (this.id == id){
            this.name = name;
        }
    }

    public String getTimeCreated(){
        return "";
    }
    public void changeCompletion(){
        this.isComplete = !this.isComplete;
    }


}
