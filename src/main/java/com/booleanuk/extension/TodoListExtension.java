package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoListExtension {
    private final ArrayList<TaskExtension> listOfTasks = new ArrayList<>();

    private int indexIDCounter;

    public void add(String task) {
        if (doesTaskExist(task)) return;
        listOfTasks.add(new TaskExtension(indexIDCounter, task));
        indexIDCounter++;
    }

    public void remove(String task) {
        if (!doesTaskExist(task)) {
            System.out.println("There are no tasks with the name '" + task + "'");
            return;
        }

        listOfTasks.remove(getTask(task));
    }

    public boolean setTaskCompletionStatus(int id, boolean status) {
        TaskExtension _task = getTask(id);

        if (_task != null) {
            _task.completed = status;
            return true;
        }

        return false;
    }

    public String[] viewIncompleteTasks() {
        ArrayList<String> _incompleteTasks = new ArrayList<>();

        for (TaskExtension t : listOfTasks)
            if (!t.completed)
                _incompleteTasks.add(t.text);

        return _incompleteTasks.toArray(new String[]{});
    }

    public String[] viewCompletedTasks() {
        ArrayList<String> _incompleteTasks = new ArrayList<>();

        for (TaskExtension t : listOfTasks)
            if (t.completed)
                _incompleteTasks.add(t.text);

        return _incompleteTasks.toArray(new String[]{});
    }

    public boolean doesTaskExist(String task) {
        for (TaskExtension t : listOfTasks)
            if (t.text.equals(task))
                return true;
        return false;
    }

    public String[] printAllTasksOrdered(boolean ascending) {
        ArrayList<String> _orderedTasks = new ArrayList<>();

        for (TaskExtension t : listOfTasks)
            _orderedTasks.add(t.text);

        _orderedTasks.sort(Comparator.comparing(task -> task));

        if (!ascending)
            Collections.reverse(_orderedTasks);

        return _orderedTasks.toArray(new String[]{});
    }

    public boolean getTaskStatus(int id) {
        TaskExtension _task = getTask(id);
        if (_task != null)
            return _task.completed;
        return false;
    }

    private TaskExtension getTask(int id) {
        for (TaskExtension t : listOfTasks)
            if (t.id == id)
                return t;
        return null;
    }

    private TaskExtension getTask(String text) {
        for (TaskExtension t : listOfTasks)
            if (t.text.equals(text))
                return t;
        return null;
    }

    public String getTaskByID(int id) {
        TaskExtension _task = getTask(id);

        if (_task != null)
            return _task.text;

        return null;
    }

    public boolean updateTaskText(int id, String newText) {
        TaskExtension _task = getTask(id);

        if (_task != null) {
            _task.text = newText;
            return true;
        }

        return false;
    }

    public String getTaskDate(int id) {
        TaskExtension _task = getTask(id);

        if (_task != null)
            return _task.creationDate;

        return "INVALID";
    }
}
