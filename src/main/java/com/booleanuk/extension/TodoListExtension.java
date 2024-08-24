package com.booleanuk.extension;
import java.util.HashMap;
import java.util.Map;
public class TodoListExtension {

    HashMap<Integer, TaskExtension> taskList;
    public TodoListExtension(){
        taskList = new HashMap<>();
    }

    public boolean add(String name, int id){
        if(taskList.containsKey(id)){
            return false;
        }
        taskList.put(id, new TaskExtension(id, name, false));
        return true;
    }
    public void getAllTask(){
        if (taskList.isEmpty()){
            System.out.println("There is no task left");
        }
        for (Map.Entry<Integer, TaskExtension> entry : taskList.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public boolean changeStatus(int id, boolean status){
        if(taskList.containsKey(id)){
            taskList.get(id).status = status;
            return true;
        }
        System.out.println("There is no task found to change status");
        return false;
    }
    public String updateTaskName(int id, String newName){
        if(taskList.containsKey(id)){
            taskList.get(id).name = newName;
            return  "The task is updated to " + newName;
        }
        return "No task found";
    }
    public String getDateTime(int id){
        return taskList.get(id).dateTime;
    }
    public static void main(String[] arg){
        TodoListExtension object = new TodoListExtension();
        object.add("Watch video on JUnit", 1);
        object.add("Watch video on JUnit2", 2);
        object.add("Watch video on JUnit3", 3);
        object.getAllTask();
    }
}
