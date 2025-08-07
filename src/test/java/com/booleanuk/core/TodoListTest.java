package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void addTask() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        Assertions.assertEquals("Do dishes", todo.getTasks().getFirst().getDescription());
    }

    @Test
    public void testToggleStatus() {
        Task task = new Task("Do dishes");
        task.toggleStatus();
        Assertions.assertTrue(task.getStatus());
    }

    @Test
    public void testToggleStatusFalse() {
        Task task = new Task("Do dishes", true);
        task.toggleStatus();
        Assertions.assertFalse(task.getStatus());
    }

    @Test
    public void getCompleteTask() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        todo.add("Do homework", true);
        Assertions.assertEquals(1, todo.getCompleteTasks().size());
    }

    @Test
    public void getinCompleteTask() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        todo.add("Do homework", true);
        Assertions.assertEquals(2, todo.getIncompleteTasks().size());
    }

    @Test
    public void testSearch() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        todo.add("Do homework", true);
        Assertions.assertEquals("Do dishes", todo.search("Do dishes").getDescription());
    }

    @Test
    public void testSearchNull() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        todo.add("Do homework", true);
        Assertions.assertEquals(null, todo.search("Play games"));
    }

    @Test
    public void testRemoving() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        todo.add("Do homework", true);
        Assertions.assertEquals(true, todo.remove("Do dishes"));
        Assertions.assertEquals(2, todo.getTasks().size());
    }

    @Test
    public void testRemovingNotExisting() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        todo.add("Do homework", true);
        Assertions.assertEquals(false, todo.remove("Play Games"));
        Assertions.assertEquals(3, todo.getTasks().size());
    }

    @Test
    public void testSortAsc() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        todo.add("Do homework", true);
        Assertions.assertEquals("Do dishes", todo.getAlphAsc().get(0).getDescription());
        Assertions.assertEquals("Do homework", todo.getAlphAsc().get(1).getDescription());
        Assertions.assertEquals("Do vacuuming", todo.getAlphAsc().get(2).getDescription());
    }

    @Test
    public void testSortDesc() {
        TodoList todo = new TodoList();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        todo.add("Do homework", true);
        Assertions.assertEquals("Do dishes", todo.getAlphDesc().get(2).getDescription());
        Assertions.assertEquals("Do homework", todo.getAlphDesc().get(1).getDescription());
        Assertions.assertEquals("Do vacuuming", todo.getAlphDesc().get(0).getDescription());
    }
}
