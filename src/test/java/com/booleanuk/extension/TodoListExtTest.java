package com.booleanuk.extension;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtTest {
    @Test
    public void testIdIsCreated() {
        TodoListExt todo = new TodoListExt();
        todo.add("Do dishes");
        Assertions.assertNotEquals("", todo.getTasks().getFirst().getId());
    }

    @Test
    public void testIdIsUnique() {
        TodoListExt todo = new TodoListExt();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        Assertions.assertNotEquals(todo.search("Do dishes").getId(), todo.search("Do vacuuming").getId());
    }

    @Test
    public void testUpdateName() {
        TodoListExt todo = new TodoListExt();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        String id = todo.search("Do dishes").getId();
        Assertions.assertTrue(todo.renameTask(id, "Play games"));
        Assertions.assertEquals("Play games", todo.searchById(id).getDescription());
    }

    @Test
    public void testUpdateNameWithWrongId() {
        TodoListExt todo = new TodoListExt();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        String id = todo.search("Do dishes").getId();
        Assertions.assertFalse(todo.renameTask("wrong id", "Play games"));
        Assertions.assertEquals("Do dishes", todo.searchById(id).getDescription());
    }

    @Test
    public void testUpdateStatus() {
        TodoListExt todo = new TodoListExt();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        String id = todo.search("Do dishes").getId();
        Assertions.assertTrue(todo.changeTaskStatus(id));
        Assertions.assertEquals(true, todo.searchById(id).getStatus());
    }

    @Test
    public void testUpdateStatusWithWrongId() {
        TodoListExt todo = new TodoListExt();
        todo.add("Do dishes");
        todo.add("Do vacuuming");
        String id = todo.search("Do dishes").getId();
        Assertions.assertFalse(todo.changeTaskStatus("wrong id"));
        Assertions.assertEquals(false, todo.searchById(id).getStatus());
    }
}
