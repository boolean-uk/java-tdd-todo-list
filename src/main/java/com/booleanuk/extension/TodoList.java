package com.booleanuk.extension;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;


public class TodoList {

    ArrayList<Tasks> listOfTasks = new ArrayList<>();

    public void addToList(Tasks task) {
        listOfTasks.add(task);

    }


    public String showList(ArrayList<Tasks> listOfTasks) {
        StringBuilder listOfItems = new StringBuilder();
        for (Tasks listOfTask : listOfTasks) {
            listOfItems.append(listOfTask);

        }
        System.out.println(listOfItems);
        return listOfItems.toString();

    }

    public String searchForCompletedTasks() {
        ArrayList<Tasks> completedTask = new ArrayList<>();
        for (Tasks listOfTask : listOfTasks) {
            if (listOfTask.isStatusForTask()) {
                completedTask.add(listOfTask);
            }


        }
        return completedTask.toString();
    }

    public String searchForNotCompletedTasks() {
        ArrayList<Tasks> notCompletedTask = new ArrayList<>();
        for (Tasks listOfTask : listOfTasks) {
            if (!(listOfTask.isStatusForTask())) {
                notCompletedTask.add(listOfTask);
            }


        }
        return notCompletedTask.toString();
    }

    public Tasks searchForTasksByUniqueID(Tasks task) {

        for (Tasks listOfTask : listOfTasks) {
            if(task.getUuid().equals(listOfTask.getUuid())) {
                System.out.println(task);
                return task;
            }
        }
        System.out.println("Your task did not exist");
        return null;
    }

    public String updateNameByUniqueID(Tasks task, String newName) {
        for (Tasks listOfTask : listOfTasks) {
            if(task.getUuid().equals(listOfTask.getUuid())) {
                listOfTask.setTask(newName);
            }
        }
        System.out.println(task);
        return task.getTask();
    }

    public void removeTasks(Tasks task) {
        listOfTasks.removeIf(listOfTask -> listOfTask.equals(task));
    }

    public boolean changeStatusOfTaskByID(Tasks task) {

        for (Tasks listOfTask : listOfTasks) {
            if(task.getUuid().equals(listOfTask.getUuid())) {
                if(!listOfTask.isStatusForTask()) {
                    listOfTask.setStatusForTask(true);
                } else listOfTask.setStatusForTask(false);
            }
        }

        return task.isStatusForTask();
    }

    public String showDateAndTimeOfATask(Tasks task) {
        String result = "";
        for (Tasks listOfTask : listOfTasks) {
            System.out.println(task.getNow());
            result += listOfTask.getNow().truncatedTo(ChronoUnit.SECONDS).toString();
        }
            return result;

    }

    public String alphAscending(ArrayList<Tasks> tasks) {
        listOfTasks.sort((task1, task2) -> task1.getTask().compareToIgnoreCase(task2.getTask()));

        return tasks.toString();
    }

    public String alphDecending(ArrayList<Tasks> tasks) {
        listOfTasks.sort((task1, task2) -> task1.getTask().compareToIgnoreCase(task2.getTask()));
        Collections.reverse(listOfTasks);
        return tasks.toString();
    }

}

