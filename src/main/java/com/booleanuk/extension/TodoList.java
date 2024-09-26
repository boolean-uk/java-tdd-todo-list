package com.booleanuk.extension;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoList {

    List<NewTask> todos = new ArrayList<>();


    NewTask getTask(int id){
        for (NewTask todo : todos) {
            if (todo.id == id){
                return todo;
            }
        }
        return null;
    }

    void updateTask(int id, String name){
        getTask(id).setName(name);
    }
    void changeStatus(int id){
        getTask(id).toggleCompleted();
    }
    Date getDate(int id){
        return getTask(id).date;
    }
}
