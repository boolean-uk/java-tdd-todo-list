package com.booleanuk.core;

import java.util.*;

public class TodoList {
    public HashMap<String, Boolean> todoList = new HashMap<>();

    public HashMap<String, Boolean> getTodoList()
    {
        return todoList;
    }

    public void addTask(String task)
    {
        todoList.put(task, false);
    }

    public void List()
    {
        for (String key : todoList.keySet())
        {
            System.out.println(key);
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

    public HashMap<String, Boolean> getComplete()
    {
        HashMap<String, Boolean> complete = new HashMap<>();

        for (String key : todoList.keySet())
        {
            if (todoList.get(key))
            {
                complete.put(key, todoList.get(key));
            }
        }
        return complete;
    }

    public HashMap<String, Boolean> getIncomplete()
    {
        HashMap<String, Boolean> incomplete = new HashMap<>();

        for (String key : todoList.keySet())
        {
            if (!todoList.get(key))
            {
                incomplete.put(key, todoList.get(key));
            }
        }
        return incomplete;
    }

    public String findTask(String task)
    {
        if (todoList.containsKey(task))
        {
            return task;
        }
        return "Task not found";
    }

    public List<String> ascendingOrder()
    {
        List<String> returnList = new ArrayList<>(todoList.keySet());
        Collections.sort(returnList);
        return returnList;
    }

    public List<String> descendingOrder()
    {
        List<String> returnList = new ArrayList<>(todoList.keySet());
        Collections.sort(returnList, Collections.reverseOrder());
        return returnList;
    }

    public void removeTask(String task)
    {
        if (todoList.containsKey(task))
        {
            todoList.remove(task);
        }
    }
}
