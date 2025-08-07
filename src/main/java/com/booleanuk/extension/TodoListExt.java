package com.booleanuk.extension;

import com.booleanuk.extension.TaskExt;

import java.util.ArrayList;
import java.util.List;

public class TodoListExt {
    private List<TaskExt> tasks;

    public TodoListExt(){
        tasks = new ArrayList<>();
    }

    public void add(String desc){
        TaskExt newTask = new TaskExt(desc);
        tasks.add(newTask);
    }

    public List<TaskExt> getTasks(){
        return this.tasks;
    }

    public List<TaskExt> getCompleteTasks(){
        List<TaskExt> completeTasks = new ArrayList<>();

        for(TaskExt task : this.tasks){
            if(task.getCompleteStatus()){
                completeTasks.add(task);
            }
        }
        return completeTasks;
    }

    public List<TaskExt> getIncompleteTasks(){
        List<TaskExt> completeTasks = new ArrayList<>();

        for(TaskExt task : this.tasks){
            if(!task.getCompleteStatus()){
                completeTasks.add(task);
            }
        }
        return completeTasks;
    }

    public boolean search(String desc){
        for(TaskExt task : this.tasks){
            if(task.getDescription().equals(desc)){
                return true;
            }
        }
        return false;
    }

    public boolean remove(String desc){
        for (int i = 0; i < this.tasks.size(); i++){
            if(desc.equals(this.tasks.get(i).getDescription())){
                this.tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<TaskExt> getAlphAsc(){
        List<TaskExt> returnVal = new ArrayList<>(List.copyOf(this.tasks));

        returnVal.sort((a, b) -> {return a.getDescription().compareTo(b.getDescription());});
        return returnVal;
    }

    public List<TaskExt> getAlphDesc(){
        List<TaskExt> returnVal = new ArrayList<>(List.copyOf(this.tasks));

        returnVal.sort((a, b) -> {return b.getDescription().compareTo(a.getDescription());});
        return returnVal;
    }

    public TaskExt getById(String id){
        for(TaskExt task : this.tasks){
            if(id.equals(task.getId())){
                return task;
            }
        }
        return null;
    }

    public boolean updateDescription(String id, String newDesc){
        for(TaskExt task : this.tasks){
            if(task.getId().equals(id)){
                task.setDescription(newDesc);
                return true;
            }
        }
        return false;
    }

    public boolean changeStatus(String id){
        for(TaskExt task : this.tasks){
            if(task.getId().equals(id)){
                task.setCompleteStatus(!task.getCompleteStatus());
                return true;
            }
        }
        return false;
    }

}
