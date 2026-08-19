package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.ArrayList;

import com.booleanuk.core.pojo.Task;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }


    private TodoList tdList;

    public TodoListTest(){
        tdList = new TodoList();

    }

    @Test
    public void add_and_retList_twoTask_twoTaskString(){
        Task t1 = new Task("Fix nvim config");
        Task t2 = new Task("Clean house");

        List<Task> empty = tdList.retList();

        Assertions.assertEquals(empty, new ArrayList<Task>());

        tdList.add(t1);
        tdList.add(t2);

        List<Task> resNotEmpty = tdList.retList();

        Assertions.assertTrue(resNotEmpty.contains(t1));

        Assertions.assertTrue(resNotEmpty.contains(t2));
    }

    @Test
    public void changeStatus_twoTask_todoListTaskStatusChanged(){
        Task t1 = new Task("Fix nvim config", true);
        Task t2 = new Task("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);
        
        List<Task> res1 = tdList.retList();

        Assertions.assertEquals(res1.get(0).getComplet(), true);

        tdList.changeStatus("Fix nvim config", false);

        Assertions.assertEquals(res1.get(0).getComplet(), false);
    }

    @Test
    public void getComplet_twoTask_todoListOneCompletedTask(){
        Task t1 = new Task("Fix nvim config", true);
        Task t2 = new Task("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        List<Task> res = tdList.getComp();

        Assertions.assertTrue(res.contains(t1));

        Assertions.assertFalse(res.contains(t2));
    }

    @Test
    public void getInComplet_twoTask_todoListOneIncompletedTask(){
        Task t1 = new Task("Fix nvim config", true);
        Task t2 = new Task("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        List<Task> res = tdList.getInComp();

        Assertions.assertFalse(res.contains(t1));

        Assertions.assertTrue(res.contains(t2));
    }
 
    @Test
    public void search_threeTask_stringTask(){
        Task t1 = new Task("Fix nvim config", true);
        Task t2 = new Task("Clean house", false);
        Task t3 = new Task("Do dishes", false);

        tdList.add(t1);
        tdList.add(t2);
        tdList.add(t3);

        String res1 = tdList.search("Fix");
        String res2 = tdList.search("house");
        String res3 = tdList.search("vscode");

        Assertions.assertEquals(res1, "Found/Exists!");
        Assertions.assertEquals(res2, "Found/Exists!");
        Assertions.assertEquals(res3, "Does not exist!");
    }




    @Test
    public void delete_twoTask_todoListTaskRemoved(){
        Task t1 = new Task("Fix nvim config", true);
        Task t2 = new Task("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        List<Task> res1 = tdList.retList();

        Assertions.assertTrue(res1.contains(t1));
        Assertions.assertTrue(res1.contains(t2));

        tdList.delete("Clean house");

        List<Task> res2 = tdList.retList();

        Assertions.assertTrue(res2.contains(t1));
        Assertions.assertFalse(res2.contains(t2));
    }

    @Test
    public void orderAscend_threeTask_todoListOrderAcent(){
        Task t1 = new Task("Fix nvim config", true);
        Task t2 = new Task("Clean house", false);
        Task t3 = new Task("Do dishes", false);

        tdList.add(t1);
        tdList.add(t2);
        tdList.add(t3);

        String res = tdList.orderAscend();

        String expected = """
        Clean house
        Do dishes
        Fix nvim config""".trim();

        Assertions.assertEquals(expected, res);
    }

    @Test
    public void orderDecend_threeTask_todoListOrderDecent(){
        Task t1 = new Task("Fix nvim config", true);
        Task t2 = new Task("Clean house", false);
        Task t3 = new Task("Do dishes", false);

        tdList.add(t1);
        tdList.add(t2);
        tdList.add(t3);
        
        String res = tdList.orderDescend();

        String expected = """
        Fix nvim config
        Do dishes
        Clean house""".trim();

        Assertions.assertEquals(expected, res);
    }
}
