package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoList {
    private final ArrayList<Task> listOfTasks = new ArrayList<>();

    public void add(String task) {
        if (doesTaskExist(task)) return;
        listOfTasks.add(new Task(task));
    }

    public void remove(String task) {
        if (!doesTaskExist(task)) {
            System.out.println("There are no tasks with the name '" + task + "'");
            return;
        }

        listOfTasks.remove(getTask(task));
    }

    public void toggleTaskCompletion(String task) {
        Task _task = getTask(task);

        if (_task == null) {
            System.out.println("There are no tasks with the name '" + task + "'");
            return;
        }

        toggleTaskCompletion(task, !_task.completed);
    }

    public void toggleTaskCompletion(String task, boolean specify) {
        Task _task = getTask(task);

        if (_task == null) {
            System.out.println("There are no tasks with the name '" + task + "'");
            return;
        }

        _task.completed = specify;
    }

    public String[] viewIncompleteTasks() {
        ArrayList<String> _incompleteTasks = new ArrayList<>();

        for (Task t : listOfTasks)
            if (!t.completed)
                _incompleteTasks.add(t.text);

        return _incompleteTasks.toArray(new String[]{});
    }

    public String[] viewCompletedTasks() {
        ArrayList<String> _incompleteTasks = new ArrayList<>();

        for (Task t : listOfTasks)
            if (t.completed)
                _incompleteTasks.add(t.text);

        return _incompleteTasks.toArray(new String[]{});
    }

    public boolean doesTaskExist(String task) {
        for (Task t : listOfTasks)
            if (t.text.equals(task))
                return true;
        return false;
    }

    public String[] printAllTasksOrdered(boolean ascending) {
        ArrayList<String> _orderedTasks = new ArrayList<>();

        for (Task t : listOfTasks)
            _orderedTasks.add(t.text);

        _orderedTasks.sort(Comparator.comparing(task -> task));

        if (!ascending)
            Collections.reverse(_orderedTasks);

        return _orderedTasks.toArray(new String[]{});
    }

    public boolean getTaskStatus(String task) {
        for (Task t : listOfTasks)
            if (t.text.equals(task))
                return t.completed;
        return false;
    }

    private Task getTask(String task) {
        for (Task t : listOfTasks)
            if (t.text.equals(task))
                return t;
        return null;
    }
}
