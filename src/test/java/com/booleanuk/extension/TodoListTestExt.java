package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListTestExt {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void testAddAndGetTasks(){
        TodoListExt todo = new TodoListExt();

        List<TaskExt> tasks = todo.getTasks();

        Assertions.assertTrue(tasks.isEmpty());

        todo.add("This is my task");

        Assertions.assertFalse(tasks.isEmpty());
        Assertions.assertEquals(1, todo.getTasks().size());
    }


    @Test
    public void testGetCompleteTasks(){
        TodoListExt todo = new TodoListExt();

        todo.add("Test1");
        todo.add("Test2");
        todo.add("Test3");
        todo.add("Test4");

        Assertions.assertTrue(todo.getCompleteTasks().isEmpty());

        List<TaskExt> tasks = todo.getTasks();

        tasks.getFirst().completeTask();

        Assertions.assertEquals(1, todo.getCompleteTasks().size());
        Assertions.assertEquals("Test1", todo.getCompleteTasks().getFirst().getDescription());

        tasks.get(1).completeTask();

        Assertions.assertEquals(2, todo.getCompleteTasks().size());

    }



    @Test
    public void testGetIncompleteTasks(){
        TodoListExt todo = new TodoListExt();

        todo.add("Test1");
        todo.add("Test2");
        todo.add("Test3");
        todo.add("Test4");

        Assertions.assertEquals(4, todo.getIncompleteTasks().size());

        List<TaskExt> tasks = todo.getTasks();

        tasks.getFirst().completeTask();

        Assertions.assertEquals(3, todo.getIncompleteTasks().size());

        tasks.get(1).completeTask();

        Assertions.assertEquals(2, todo.getIncompleteTasks().size());

        tasks.get(2).completeTask();

        Assertions.assertEquals("Test4", todo.getIncompleteTasks().getFirst().getDescription());

        tasks.get(3).completeTask();

        Assertions.assertTrue(todo.getIncompleteTasks().isEmpty());

    }

    @Test
    public void testSearch(){
        TodoListExt todo = new TodoListExt();

        todo.add("Test1");
        todo.add("Test2");
        todo.add("Test3");
        todo.add("Test4");

        Assertions.assertTrue(todo.search("Test1"));
        Assertions.assertTrue(todo.search("Test2"));
        Assertions.assertTrue(todo.search("Test3"));
        Assertions.assertTrue(todo.search("Test4"));

        Assertions.assertFalse(todo.search("hello"));
        Assertions.assertFalse(todo.search("java"));
        Assertions.assertFalse(todo.search("wow"));
        Assertions.assertFalse(todo.search("hello23"));
    }

    @Test
    public void testRemove(){
        TodoListExt todo = new TodoListExt();

        todo.add("Test1");
        todo.add("Test2");
        todo.add("Test3");
        todo.add("Test4");

        Assertions.assertFalse(todo.remove("wow"));
        Assertions.assertFalse(todo.remove("hello"));
        Assertions.assertFalse(todo.remove("123"));

        Assertions.assertTrue(todo.remove("Test2"));
        Assertions.assertTrue(todo.remove("Test4"));

        boolean removeCheck = todo.search("Test1") && todo.search("Test3")
                            && !todo.search("Test2") && !todo.search("Test4");

        Assertions.assertTrue(removeCheck);

    }

    @Test
    public void testGetSortAsc(){
        TodoListExt todo = new TodoListExt();

        todo.add("CTest");
        todo.add("ATest");
        todo.add("DTest");
        todo.add("BTest");

        Assertions.assertEquals("ATest", todo.getAlphAsc().get(0).getDescription());
        Assertions.assertEquals("BTest", todo.getAlphAsc().get(1).getDescription());
        Assertions.assertEquals("CTest", todo.getAlphAsc().get(2).getDescription());
        Assertions.assertEquals("DTest", todo.getAlphAsc().get(3).getDescription());
    }

    @Test
    public void testGetSortDesc(){
        TodoListExt todo = new TodoListExt();

        todo.add("CTest");
        todo.add("ATest");
        todo.add("DTest");
        todo.add("BTest");

        Assertions.assertEquals("DTest", todo.getAlphDesc().get(0).getDescription());
        Assertions.assertEquals("CTest", todo.getAlphDesc().get(1).getDescription());
        Assertions.assertEquals("BTest", todo.getAlphDesc().get(2).getDescription());
        Assertions.assertEquals("ATest", todo.getAlphDesc().get(3).getDescription());
    }

    @Test
    public void testGetById(){
        TodoListExt todo = new TodoListExt();
        todo.add("test1");
        todo.add("test2");

        String id = todo.getTasks().getLast().getId();

        Assertions.assertEquals(id, todo.getById(id).getId());
        Assertions.assertEquals("test2", todo.getById(id).getDescription());

        Assertions.assertNull(todo.getById("hello"));
    }

    @Test
    public void testUpdateById(){
        TodoListExt todo = new TodoListExt();
        todo.add("test1");
        todo.add("test2");

        String firstId = todo.getTasks().getFirst().getId();
        String lastId = todo.getTasks().getLast().getId();

        Assertions.assertTrue(todo.updateDescription(firstId, "test3"));
        Assertions.assertTrue(todo.updateDescription(lastId, "test4"));

        Assertions.assertFalse(todo.updateDescription("123", "tes"));

        Assertions.assertEquals("test3", todo.getById(firstId).getDescription());
        Assertions.assertEquals("test4", todo.getById(lastId).getDescription());
    }

    @Test
    public void testChangeStatus(){
        TodoListExt todo = new TodoListExt();
        todo.add("test1");
        todo.add("test2");

        String id = todo.getTasks().getFirst().getId();

        boolean prevStatus = todo.getById(id).getCompleteStatus();
        Assertions.assertTrue(todo.changeStatus(id));
        boolean postStatus = todo.getById(id).getCompleteStatus();

        Assertions.assertNotEquals(prevStatus, postStatus);

        Assertions.assertTrue(todo.changeStatus(id));

        boolean newerStatus = todo.getById(id).getCompleteStatus();

        Assertions.assertNotEquals(postStatus, newerStatus);

        Assertions.assertFalse(todo.changeStatus("123"));

    }

}
