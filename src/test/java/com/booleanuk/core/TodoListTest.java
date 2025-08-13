package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void addTasksTest() {
        Task newtask = new Task("TheTitle", "The Description", false);

        TodoList todo = new TodoList(newtask);
        Assertions.assertEquals(true, todo.addtask(newtask));

    }
    @Test
    public void showTasksTest() {
        Task newtask = new Task("TheTitle", "The Description", false);

        TodoList todo = new TodoList(newtask);
        Task newtask2 = new Task("TheTitle2", "The Description111", true);
        Assertions.assertEquals(true, todo.show());

        todo.addtask(newtask);
        Assertions.assertEquals(true, todo.show());
        todo.addtask(newtask2);
        Assertions.assertEquals(true, todo.show());

    }
    @Test
    public void ChangeStatusTest() {
        Task newtask = new Task("TheTitle", "The Description", false);

        newtask.setStatus(false);
        TodoList todo = new TodoList(newtask);


        Assertions.assertEquals("Task turned to completed", todo.changeStatus(newtask));
        Assertions.assertEquals("Task turned to not completed", todo.changeStatus(newtask));


    }
    @Test
    public void showCompletedTest() {
        Task newtask = new Task("TheTitle", "The Description", false);
        newtask.setStatus(false);



        TodoList todo = new TodoList(newtask);
        Task newtask2 = new Task("TheTitle22", "The Description222", false);



        todo.addtask(newtask2);
        Assertions.assertEquals(false, todo.completed());

        newtask.setStatus(true);


        Assertions.assertEquals(new TodoList(newtask).addtask(newtask), todo.completed());




    }

    @Test
    public void showNotCompletedTest() {
        Task newtask = new Task("TheTitle", "The Description", true);

        TodoList todo = new TodoList(newtask);
        Assertions.assertEquals(false, todo.notCompleted());

        Task newtask2 = new Task("TheTitle", "The Description", false);


        todo.addtask(newtask2);

        Assertions.assertEquals(true, todo.notCompleted());
    }

    @Test
    public void searchTest() {
        Task newtask = new Task("Make Food", "The Description", false);

        TodoList todo = new TodoList(newtask);

        Task newtask2 = new Task("Do Homework", "The Description", false);

        Assertions.assertEquals(false, todo.search("Buy Gifts"));


        todo.addtask(newtask2);
        Assertions.assertEquals(false, todo.search("Buy Gifts"));
        Assertions.assertEquals(false, todo.search("D H"));
        Assertions.assertEquals(false, todo.search("Mak food"));
        Assertions.assertEquals(false, todo.search("Do Laundry"));
        Assertions.assertEquals(false, todo.search("Eat cakes"));
        Assertions.assertEquals(false, todo.search("Buy a kebab"));


        Assertions.assertEquals(true, todo.search("Do Homework"));
        Assertions.assertEquals(true, todo.search("Make Food"));

    }

    @Test
    public void removeTest() {
        Task newtask = new Task("Do Homework", "The Description", false);

        TodoList todo = new TodoList(newtask);

        Task newtask2 = new Task("Make Food", "The Description", false);
        Assertions.assertEquals(false, todo.remove("Buy Gifts"));


        todo.addtask(newtask2);
        Assertions.assertEquals(false, todo.remove("Buy Gifts"));
        Assertions.assertEquals(false, todo.remove("D H"));
        Assertions.assertEquals(false, todo.remove("Mak food"));
        Assertions.assertEquals(false, todo.remove("Do Laundry"));
        Assertions.assertEquals(false, todo.remove("Eat cakes"));
        Assertions.assertEquals(false, todo.remove("Buy a kebab"));


        Assertions.assertEquals(true, todo.remove("Do Homework"));

        Assertions.assertEquals(false, todo.remove("Do Homework"));
        Assertions.assertEquals(true, todo.remove("Make Food"));
        Assertions.assertEquals(false, todo.remove("Make Food"));
    }

    @Test
    public void ascendingTest() {
        Task newtask = new Task("TheTitle", "The Description", false);

        TodoList todo = new TodoList(newtask);
        todo.remove(("TheTitle"));
        Assertions.assertEquals(true, todo.ascending());

        Task newtask2 = new Task("A", "The Description", false);
        Task newtask3 = new Task("B", "The Description", false);
        Task newtask4 = new Task("C", "The Description", false);





        todo.addtask(newtask2);
        todo.addtask(newtask3);
        todo.addtask(newtask4);
        todo.addtask(newtask);
        Assertions.assertEquals(true, todo.ascending());







    }
    @Test
    public void descendingTest() {
        Task newtask = new Task("TheTitle", "The Description", false);

        TodoList todo = new TodoList(newtask);
        todo.remove(("TheTitle"));
        Assertions.assertEquals(true, todo.ascending());

        Task newtask2 = new Task("A", "The Description", false);
        Task newtask3 = new Task("B", "The Description", false);
        Task newtask4 = new Task("C", "The Description", false);





        todo.addtask(newtask2);
        todo.addtask(newtask3);
        todo.addtask(newtask4);
        todo.addtask(newtask);
        Assertions.assertEquals(true, todo.ascending());





    }

}
