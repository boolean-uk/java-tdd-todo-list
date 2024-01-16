package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoListExtension {

    ArrayList<TaskExtension> listOfTasks;

    public TodoListExtension() {
        this.listOfTasks = new ArrayList<>();
    }

    public boolean addTask(TaskExtension task) {
        try {
            this.listOfTasks.add(task);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public ArrayList<TaskExtension> retrieveTasks () {
        try {
            for(TaskExtension task : this.listOfTasks) {
                System.out.println(task.name);
            }
        } catch (Exception e) {
            System.out.println("Error, returning empty list");
            return new ArrayList<>();
        }
        return this.listOfTasks;
    }

    public ArrayList<TaskExtension> getCompleteTasks() {
        ArrayList<TaskExtension> completedTasks = new ArrayList<>();
        try {
            for(TaskExtension task : this.listOfTasks) {
                if (task.status) {
                    System.out.println(task.name);
                    completedTasks.add(task);
                }
            }
        } catch (Exception e) {
            System.out.println("Error, returning empty list");
            return new ArrayList<>();
        }
        return completedTasks;
    }

    public ArrayList<TaskExtension> getIncompleteTasks() {
            ArrayList<TaskExtension> incompleteTasks = new ArrayList<>();
            try {
                for(TaskExtension task : this.listOfTasks) {
                    if (!task.status) {
                        System.out.println(task.name);
                        incompleteTasks.add(task);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error, returning empty list");
                return new ArrayList<>();
            }
            return incompleteTasks;
        }

     public TaskExtension searchTask(TaskExtension task) {
        try {
            for (TaskExtension t : this.listOfTasks) {
                if (t.name == task.name) {
                    return task;
                }
            }
        } catch (Exception e) {
            System.out.println("ERror, returning naked task");
            return new TaskExtension("");
        }
         System.out.println("Task does not exist, thus not found");
         return task;
     }

     public void removeTask(TaskExtension task) {
        if (this.listOfTasks.contains(task)) {
            this.listOfTasks.remove(this.listOfTasks.indexOf(task));
            System.out.println("Task: " + task.name + " was successfully removed");
        } else {
            System.out.println("Task: " + task.name + " is not currently in To-Do List");
        }
     }

     public void removeAllTasks() {
        if (!this.listOfTasks.isEmpty()) {
            for (int i = 0; i <= this.listOfTasks.size(); i++) {
                System.out.println("Task: " + this.listOfTasks.get(0).name + " was successfully removed");
                this.listOfTasks.remove(0);
            }
        } else {
            System.out.println("No tasks to remove");
        }
     }

     public ArrayList<TaskExtension> showTasksAscending() {
        Collections.sort(this.listOfTasks, Comparator.comparing(TaskExtension::getName));
         System.out.print("Tasks: ");
         for(TaskExtension task : this.listOfTasks) {
             System.out.print(task.name + " ");
         }
         System.out.println();
        return this.listOfTasks;
    }

    public ArrayList<TaskExtension> showTasksDescending() {
        Collections.sort(this.listOfTasks, Comparator.comparing(TaskExtension::getName, Comparator.reverseOrder()));
        System.out.print("Tasks: ");
        for(TaskExtension task : this.listOfTasks) {
            System.out.print(task.name + " ");
        }
        System.out.println();
        return this.listOfTasks;
    }

    public TaskExtension getTaskByID(int ID) {
        for(TaskExtension task : this.listOfTasks) {
            if (task.ID == ID) {
                return task;
            }
        }
        return new TaskExtension("");
    }

    public void setNameByID(int ID, String name) {
        for(TaskExtension task : this.listOfTasks) {
            if (task.ID == ID) {
                task.setName(name);
                System.out.println("Name changed successfully");
                return;
            }
        }
        System.out.println("Name has not been changed");
    }

    public static void main(String[] args) {
        TodoListExtension lst = new TodoListExtension();
        TaskExtension task_1 = new TaskExtension("CV");
        TaskExtension task_2 = new TaskExtension("Sleep");
        TaskExtension task_3 = new TaskExtension("Abefest");
        TaskExtension task_4 = new TaskExtension("Zoo");
        lst.addTask(task_1);
        lst.addTask(task_2);
        lst.addTask(task_3);
        lst.addTask(task_4);

        lst.showTasksAscending();
        lst.showTasksDescending();

        lst.removeTask(task_1);
        lst.removeAllTasks();

    }

}
