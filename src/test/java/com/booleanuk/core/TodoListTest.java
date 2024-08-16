package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {

    TodoList todoList;

    @Test
    public void addToListShouldReturnTrue() {
        this.todoList = new TodoList();
        Task task = new Task(1, "Code");
        Assertions.assertTrue(todoList.add(task));
        Assertions.assertEquals(1, todoList.size());
    }

    @Test
    public void listAllShouldReturnList() {
        // TODO: Not sure about this test, do I test the right things?
        // TODO: How do you check system.out.print-messages?

        this.todoList = new TodoList();
        Task task = new Task(1, "Code");
        Task task2 = new Task(2, "Draw");
        this.todoList.add(task);
        this.todoList.add(task2);

        ArrayList<Task> correctlist = new ArrayList<>();
        correctlist.add(task);
        correctlist.add(task2);

        ArrayList<Task> list = todoList.listAll();

        Assertions.assertTrue(list.containsAll(correctlist));
    }

    @Test
    public void listAllShouldReturnEmptyList() {
        this.todoList = new TodoList();

        ArrayList<Task> correctlist = new ArrayList<>();
        ArrayList<Task> list = todoList.listAll();

        Assertions.assertTrue(list.containsAll(correctlist));
    }

    @Test
    public void listAllShouldReturnOnlyCompletedOrIncompletedTasks() {
        this.todoList = new TodoList();

        Task tasks[] = new Task[] {
                new Task(1, "Code"),
                new Task(2, "Draw"),
                new Task(3, "Workout"),
                new Task(4, "Buy food")
        };
        for (Task task : tasks) {
            if (task.id() == 2 || task.id() ==4) {
                task.changeStatus(Status.COMPLETE);
            }
            todoList.add(task);
        }

        // TODO: Check if this is correct way to do it or not
        ArrayList<Task> completedTasks = todoList.listAll(Status.COMPLETE);
        for (Task task : completedTasks) {
            Assertions.assertTrue(task.status() == Status.COMPLETE);
        }

        ArrayList<Task> incompletedTasks = todoList.listAll(Status.INCOMPLETE);
        for (Task task : incompletedTasks) {
            Assertions.assertTrue(task.status() == Status.INCOMPLETE);
        }
    }

    @Test
    public void checkTaskStatus() {
        Task task = new Task(1, "Code");
        Assertions.assertEquals(Status.INCOMPLETE, task.status());

        task.changeStatus(Status.COMPLETE);
        Assertions.assertEquals(Status.COMPLETE, task.status());

        task.changeStatus(Status.INCOMPLETE);
        Assertions.assertEquals(Status.INCOMPLETE, task.status());
    }

    @Test
    public void searchShouldReturnTrue() {
        this.todoList = new TodoList();
        todoList.add(new Task(1, "Code"));
        todoList.add(new Task(1, "Code and chill"));
        todoList.add(new Task(1, "Draw"));
        Assertions.assertTrue(todoList.search("Code"));
    }

    @Test
    public void searchShouldReturnFalse() {
        this.todoList = new TodoList();
        todoList.add(new Task(1, "Code"));
        Assertions.assertFalse(todoList.search("Todo list"));
    }

    @Test
    public void removeTaskFromListThatDontExist() {
        this.todoList = new TodoList();
        Assertions.assertFalse(todoList.remove(1));
    }

    @Test
    public void removeTaskFromListThatExists() {
        this.todoList = new TodoList();
        todoList.add(new Task(1, "Walk"));
        Assertions.assertTrue(todoList.remove(1));
    }

    @Test
    public void sortedListAscending() {
        this.todoList = new TodoList();
        todoList.add(new Task(1, "Ba"));
        todoList.add(new Task(2, "Aa"));
        todoList.add(new Task(3, "C"));
        todoList.add(new Task(4, "Ab"));

        ArrayList<Task> correctListSorted = new ArrayList<>();
        correctListSorted.add(new Task(2, "Aa"));
        correctListSorted.add(new Task(4, "Ab"));
        correctListSorted.add(new Task(1, "Ba"));
        correctListSorted.add(new Task(3, "C"));

        ArrayList<Task> sortedList = todoList.sortedList(Order.ASCENDING);

        // Compare id in the arraylists
        for (int i = 0; i < correctListSorted.size(); i++) {
            Assertions.assertEquals(correctListSorted.get(i).id(), sortedList.get(i).id());
        }
    }

    @Test
    public void sortedListDescending() {
        this.todoList = new TodoList();
        todoList.add(new Task(1, "Ba"));
        todoList.add(new Task(2, "Aa"));
        todoList.add(new Task(3, "C"));
        todoList.add(new Task(4, "Ab"));

        ArrayList<Task> correctListSorted = new ArrayList<>();
        correctListSorted.add(new Task(3, "C"));
        correctListSorted.add(new Task(1, "Ba"));
        correctListSorted.add(new Task(4, "Ab"));
        correctListSorted.add(new Task(2, "Aa"));

        ArrayList<Task> sortedList = todoList.sortedList(Order.DESCENDING);

        // Compare id in the arraylists
        for (int i = 0; i < correctListSorted.size(); i++) {
            Assertions.assertEquals(correctListSorted.get(i).id(), sortedList.get(i).id());
        }
    }
}
