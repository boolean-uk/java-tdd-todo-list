package com.booleanuk.core;
import java.util.*;

public class TodoList {
    private Map<String, Boolean> todoList = new HashMap<>();

    public Map<String, Boolean> getTodoList() {
        return todoList;
    }

    public void addTask(String task) {
        todoList.put(task, false);
    }

    public void listTasks() {
        for (String task : todoList.keySet()) {
            System.out.println(task);
        }
    }

    public boolean completeIncomplete(String task)
    {
        if (todoList.containsKey(task))
        {
            todoList.put(task, !todoList.get(task));
            return true;
        }
        return false;
    }


    public boolean toggleCompletion(String task) {
        if (todoList.containsKey(task)) {
            todoList.put(task, !todoList.get(task));
            return true;
        }
        return false;
    }

    public Map<String, Boolean> getCompleteTasks() {
        Map<String, Boolean> completeTasks = new HashMap<>();

        for (Map.Entry<String, Boolean> entry : todoList.entrySet()) {
            if (entry.getValue()) {
                completeTasks.put(entry.getKey(), true);
            }
        }
        return completeTasks;
    }

    public Map<String, Boolean> getIncompleteTasks() {
        Map<String, Boolean> incompleteTasks = new HashMap<>();

        for (Map.Entry<String, Boolean> entry : todoList.entrySet()) {
            if (!entry.getValue()) {
                incompleteTasks.put(entry.getKey(), false);
            }
        }
        return incompleteTasks;
    }

    public String findTask(String task) {
        return todoList.containsKey(task) ? task : "Task not found";
    }

    public List<String> getTasksAscendingOrder() {
        List<String> returnList = new ArrayList<>(todoList.keySet());
        Collections.sort(returnList);
        return returnList;
    }

    public List<String> getTasksDescendingOrder() {
        List<String> returnList = new ArrayList<>(todoList.keySet());
        Collections.sort(returnList, Collections.reverseOrder());
        return returnList;
    }

    public void removeTask(String task) {
        todoList.remove(task);
    }
}

