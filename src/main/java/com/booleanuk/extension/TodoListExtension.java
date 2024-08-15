package com.booleanuk.extension;

import com.booleanuk.core.TodoList;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoListExtension {

    public static class Task{
        public int taskId;
        public String taskName;
        public String taskStatus;
        public LocalDateTime dateTime;
    }

    ArrayList<Task> todoList = new ArrayList<>();
    int idCounter = 1;

    // Extension methods

    public String getTaskById(int taskId){
        if (!todoList.isEmpty()){
            for (Task task : todoList) {
                if (taskId == task.taskId) {
                    return "'" + task.taskName + "' is " + task.taskStatus;
                }
            }
            return "Task not found.";
        }
        else {
            return "Todo list is empty.";
        }
    }

    public String editTaskName(int taskId, String newTaskName){
        if (!todoList.isEmpty()){
            for (int i=0;i<todoList.size();i++) {
                if (taskId == todoList.get(i).taskId) {
                    // Create new task object with updated name for insertion into list
                    Task editedTask = new Task();
                    editedTask.taskId=taskId;
                    editedTask.taskName=newTaskName;
                    editedTask.taskStatus=todoList.get(i).taskStatus;
                    editedTask.dateTime=todoList.get(i).dateTime;
                    todoList.set(i, editedTask);
                    return "Task name changed to '" + todoList.get(i).taskName + "'";
                }
            }
            return "Task not found.";
        }
        else {
            return "Todo list is empty.";
        }
    }

    public String setCompletedById(int taskId){
        if (!todoList.isEmpty()){
            for (int i=0;i<todoList.size();i++){
                if (taskId == todoList.get(i).taskId){
                    // Create new task object with updated status for insertion into list
                    Task editedTask = new Task();
                    editedTask.taskId=taskId;
                    editedTask.taskName=todoList.get(i).taskName;
                    editedTask.taskStatus="Completed";
                    editedTask.dateTime=todoList.get(i).dateTime;
                    todoList.set(i, editedTask);
                    return "Task status is now 'Completed'.";
                }
            }
            return "Task not found.";
        }else {
            return "Task list is empty.";
        }
    }

    public String setUncompletedById(int taskId){
        if (!todoList.isEmpty()){
            for (int i=0;i<todoList.size();i++){
                if (taskId == todoList.get(i).taskId){
                    // Create new task object with updated status for insertion into list
                    Task editedTask = new Task();
                    editedTask.taskId=taskId;
                    editedTask.taskName=todoList.get(i).taskName;
                    editedTask.taskStatus="Incomplete";
                    editedTask.dateTime=todoList.get(i).dateTime;
                    todoList.set(i, editedTask);
                    return "Task status is now 'Incomplete'.";
                }
            }
            return "Task not found.";
        }else {
            return "Task list is empty.";
        }
    }

    public String getCreationDateTime(int taskId){
        if (!todoList.isEmpty()){
            for (Task task : todoList) {
                if (taskId == task.taskId) {
                    return "Task created at '" + task.dateTime.toString() + "' is " + task.taskStatus;
                }
            }
            return "Task not found.";
        }
        else {
            return "Todo list is empty.";
        }
    }


    // Core methods

    public Boolean addTask(String taskName){
        Task task = new Task();
        task.taskId= idCounter;
        task.taskName=taskName;
        task.taskStatus="Incomplete";
        task.dateTime=LocalDateTime.now().withNano(0).withSecond(0);
        this.todoList.add(task);
        idCounter++;
        return true;
    }

    public String getTasks(){
        if (!this.todoList.isEmpty()){
            ArrayList<String> taskNames = new ArrayList<>();
            for (Task task : todoList) {
                taskNames.add(task.taskName);
            }
            return taskNames.toString();
        }else {
            return "Todo list is empty.";
        }
    }

    public String setCompleted(String taskName){
        Task task = new Task();
        task.taskStatus = "Completed";
        task.taskName = taskName;

        for (int i=0;i<todoList.size();i++){
            if (taskName.equals((todoList.get(i)).taskName)){
                todoList.set(i, task);
                return "Task status is now 'Completed'.";
            }
        }
        return "Task not found.";
    }

    public String setUncompleted(String taskName){
        Task task = new Task();
        task.taskStatus = "Incomplete";
        task.taskName = taskName;

        for (int i=0;i<todoList.size();i++){
            if (taskName.equals((todoList.get(i)).taskName)){
                todoList.set(i, task);
                return "Task status is now 'Incomplete'.";
            }
        }
        return "Task not found.";
    }

    public String getCompletedTasks(){
        ArrayList<String> completedTasks = new ArrayList<>();
        for (Task task : todoList) {
            if (task.taskStatus.equals("Completed")) {
                completedTasks.add(task.taskName);
            }
        }
        if (!completedTasks.isEmpty()){
            return completedTasks.toString();
        }else {
            return "No completed tasks in todo list.";
        }
    }

    public String getUncompletedTasks(){
        ArrayList<String> uncompletedTasks = new ArrayList<>();
        for (Task task : todoList) {
            if (task.taskStatus.equals("Incomplete")) {
                uncompletedTasks.add(task.taskName);
            }
        }
        if (!uncompletedTasks.isEmpty()){
            return uncompletedTasks.toString();
        }else {
            return "No uncompleted tasks in todo list.";
        }
    }

    public String searchTask(String taskName){
        for (Task task : todoList) {
            if (taskName.equals(task.taskName)) {
                return "Task '" + taskName + "' is " + task.taskStatus;
            }
        }
        return "Task not found.";
    }

    public String removeTask(String taskName) {
        for (int i = 0; i < todoList.size(); i++) {
            if (taskName.equals((todoList.get(i)).taskName)) {
                todoList.remove(i);
                return "Task removed from todo list.";
            }
        }
        return "Task not found.";
    }

    public String getTasksAscending(){
        if (!this.todoList.isEmpty()){
            ArrayList<String> taskNames = new ArrayList<>();
            for (Task task : todoList) {
                taskNames.add(task.taskName);
            }
            Collections.sort(taskNames);
            return taskNames.toString();
        }else {
            return "Todo list is empty.";
        }
    }

    public String getTasksDescending(){
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        if (!this.todoList.isEmpty()){
            ArrayList<String> taskNames = new ArrayList<>();
            for (Task task : todoList) {
                taskNames.add(task.taskName);
            }
            taskNames.sort(reverseComparator);
            return taskNames.toString();
        }else {
            return "Todo list is empty.";
        }
    }
}
