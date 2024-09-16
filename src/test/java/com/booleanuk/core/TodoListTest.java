package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListTest {
    @Test
    public void testAdd() {
        TodoList list = new TodoList();

        // add something to empty list
        boolean r1 = list.add(new Task("Study", false));

        Assertions.assertTrue(r1);

        // add task with the same name and completed value
        boolean r2 = list.add(new Task("Study", false));

        Assertions.assertFalse(r2);

        // add task with same name but different completed value
        boolean r3 = list.add(new Task("Study", true));

        Assertions.assertTrue(r3);

        // add new task to non-empty list
        boolean r4 = list.add(new Task("Go for a walk", false));

        Assertions.assertTrue(r4);
    }

    @Test
    public void testSeeTheWholeList() {
        Task t1 = new Task("Study", false);
        Task t2 = new Task("Eat", false);
        Task t3 = new Task("Watch Lesson", true);


        TodoList list = new TodoList() {
            {
                add(t1);
                add(t2);
                add(t3);
            }
        };

        List<Task> returnedList = list.tasks();

        Assertions.assertEquals(t1, returnedList.get(0));
        Assertions.assertEquals(t2, returnedList.get(1));
        Assertions.assertEquals(t3, returnedList.get(2));
    }

    @Test
    public void testUpdateStatus() {
        Task t1 = new Task("Study", false);
        Task t2 = new Task("Eat", false);
        Task t3 = new Task("Watch Lesson", true);


        TodoList list = new TodoList() {
            {
                add(t1);
                add(t2);
                add(t3);
            }
        };

        // update status of non-existent task
        boolean r1 = list.update(new Task("Trash", true), false);

        Assertions.assertFalse(r1);

        // completed is true and status is true
        boolean r2 = list.update(t3, true);

        Assertions.assertFalse(r2);

        // completed is false and status is false
        boolean r3 = list.update(t1, false);

        Assertions.assertFalse(r3);

        // completed is false and status is true
        boolean r4 = list.update(t1, true);

        Assertions.assertTrue(r4);

        // completed is true and status is false
        boolean r5 = list.update(t1, false);

        Assertions.assertTrue(r5);
    }

    @Test
    public void testGetOnlyCompletedTasks() {
        Task t1 = new Task("Study", false);
        Task t2 = new Task("Eat", false);
        Task t3 = new Task("Watch Lesson", true);


        TodoList list = new TodoList() {
            {
                add(t1);
                add(t2);
                add(t3);
            }
        };

        List<Task> completedTasks = list.completedTasks();

        Assertions.assertEquals(1, completedTasks.size());
        Assertions.assertEquals(t3, completedTasks.get(0));
    }

    @Test
    public void testGetOnlyIncompletedTasks() {
        Task t1 = new Task("Study", false);
        Task t2 = new Task("Eat", false);
        Task t3 = new Task("Watch Lesson", true);


        TodoList list = new TodoList() {
            {
                add(t1);
                add(t2);
                add(t3);
            }
        };

        List<Task> incompleteTasks = list.incompleteTasks();

        Assertions.assertEquals(2, incompleteTasks.size());
        Assertions.assertEquals(t1, incompleteTasks.get(0));
        Assertions.assertEquals(t2, incompleteTasks.get(1));
    }

    @Test
    public void testContains() {
        Task t1 = new Task("Study", false);
        Task t2 = new Task("Eat", false);
        Task t3 = new Task("Watch Lesson", true);


        TodoList list = new TodoList() {
            {
                add(t1);
                add(t2);
                add(t3);
            }
        };

        String r1 = list.contains(t1);

        Assertions.assertEquals("Task is already in the list", r1);

        String r2 = list.contains(new Task("Troll", false));

        Assertions.assertEquals("Task is not in the list", r2);
    }

    @Test
    public void testRemove() {
        Task t1 = new Task("Study", false);
        Task t2 = new Task("Eat", false);
        Task t3 = new Task("Watch Lesson", true);

        TodoList list = new TodoList() {
            {
                add(t1);
                add(t2);
                add(t3);
            }
        };

        boolean r1 = list.remove(t1);
        Assertions.assertTrue(r1);

        boolean r2 = list.remove(new Task("Troll", false));
        Assertions.assertFalse(r2);
    }

    @Test
    public void testSortAlphabeticallyAscending() {
        Task t1 = new Task("Study", false);
        Task t2 = new Task("Eat", false);
        Task t3 = new Task("Watch Lesson", true);

        TodoList list = new TodoList() {
            {
                add(t2);
                add(t1);
                add(t3);
            }
        };

        List<Task> sortedTasksAscending = list.sortAlphabeticallyAscending();

        Assertions.assertEquals(list.tasks(), sortedTasksAscending);

        TodoList unSortedlist = new TodoList() {
            {
                add(t1);
                add(t2);
                add(t3);
            }
        };

        Assertions.assertNotEquals(unSortedlist.tasks(), sortedTasksAscending);
    }

    @Test
    public void testSortAlphabeticallyDescending() {
        Task t1 = new Task("Study", false);
        Task t2 = new Task("Eat", false);
        Task t3 = new Task("Watch Lesson", true);

        TodoList list = new TodoList() {
            {
                add(t3);
                add(t1);
                add(t2);
            }
        };

        List<Task> sortedTasksDesceding = list.sortAlphabeticallyDescending();

        Assertions.assertEquals(list.tasks(), sortedTasksDesceding);

        TodoList unSortedlist = new TodoList() {
            {
                add(t1);
                add(t2);
                add(t3);
            }
        };

        Assertions.assertNotEquals(unSortedlist.tasks(), sortedTasksDesceding);
    }
}
