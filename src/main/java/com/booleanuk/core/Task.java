package com.booleanuk.core;

public class Task {
    public String title;
    public String description;
    public boolean status;
    //Assertions.assertEquals(newtask, todo.search("Do Homework"));
      //  Assertions.assertEquals(newtask2, todo.search("Make Food"));


    public Task(String title, String description, boolean status) {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public Task() {
        this.title = "TheTitle";
        this.description = "The Description";
        this.status = false;
    }

    public String show(){
        return "Here is the tasks\n"+ title  +" " +description + " is it done? " + ((status) ? " JA " : " nei ");
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }
}
