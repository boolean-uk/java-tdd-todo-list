package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ExTodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }


    private ExTodoList tdList;

    public ExTodoListTest(){
        tdList = new ExTodoList();

    }

    @Test
    public void add_and_retList_twoExTask_twoExTaskString(){
        ExTask t1 = new ExTask("Fix nvim config");
        ExTask t2 = new ExTask("Clean house");

        List<ExTask> empty = tdList.retList();

        Assertions.assertEquals(empty, new ArrayList<ExTask>());

        tdList.add(t1);
        tdList.add(t2);

        List<ExTask> resNotEmpty = tdList.retList();

        Assertions.assertTrue(resNotEmpty.contains(t1));

        Assertions.assertTrue(resNotEmpty.contains(t2));
    }

    @Test
    public void changeStatus_twoExTask_todoListExTaskStatusChanged(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);
        
        List<ExTask> res1 = tdList.retList();

        Assertions.assertEquals(res1.get(0).getComplet(), true);

        tdList.changeStatus("Fix nvim config", false);

        Assertions.assertEquals(res1.get(0).getComplet(), false);
    }

    @Test
    public void getComplet_twoExTask_todoListOneCompletedExTask(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        List<ExTask> res = tdList.getComp();

        Assertions.assertTrue(res.contains(t1));

        Assertions.assertFalse(res.contains(t2));
    }

    @Test
    public void getInComplet_twoExTask_todoListOneIncompletedExTask(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        List<ExTask> res = tdList.getInComp();

        Assertions.assertFalse(res.contains(t1));

        Assertions.assertTrue(res.contains(t2));
    }
 
    @Test
    public void search_threeExTask_stringExTask(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);
        ExTask t3 = new ExTask("Do dishes", false);

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
    public void delete_twoExTask_todoListExTaskRemoved(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        List<ExTask> res1 = tdList.retList();

        Assertions.assertTrue(res1.contains(t1));
        Assertions.assertTrue(res1.contains(t2));

        tdList.delete("Clean house");

        List<ExTask> res2 = tdList.retList();

        Assertions.assertTrue(res2.contains(t1));
        Assertions.assertFalse(res2.contains(t2));
    }

    @Test
    public void orderAscend_threeExTask_todoListOrderAcent(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);
        ExTask t3 = new ExTask("Do dishes", false);

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
    public void orderDecend_threeExTask_todoListOrderDecent(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);
        ExTask t3 = new ExTask("Do dishes", false);

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

    @Test
    public void getExTaskByID_twoExTask_task(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        String resTask = tdList.getExTaskByID(1);

        Assertions.assertEquals(t1.getTask(), resTask);

    }

    @Test
    public void updateNameExTask_twoExTask_taskNameUdated(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        List<ExTask> res1 = tdList.retList();

        Assertions.assertEquals(res1.get(0).getTask(), "Fix nvim config");

        tdList.updateNameExTask(1, "Learn Lua");

        Assertions.assertEquals(res1.get(0).getTask(), "Learn Lua");

    }

    @Test
    public void changeStatus_twoExTask_statusChangedByID(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        List<ExTask> res1 = tdList.retList();

        Assertions.assertEquals(res1.get(0).getComplet(), true);

        tdList.changeStatus(1, false);

        Assertions.assertEquals(res1.get(0).getComplet(), false);

    }

    @Test
    public void dateTime_twoExTask_stringOfDateTime(){
        ExTask t1 = new ExTask("Fix nvim config", true);
        ExTask t2 = new ExTask("Clean house", false);

        tdList.add(t1);
        tdList.add(t2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        String expected = "Fix nvim config " + 
        LocalDateTime.now().format(formatter) + "\nClean house " + LocalDateTime.now().format(formatter);

        Assertions.assertEquals(expected, tdList.dateTime());

    }
}
