  package com.booleanuk.extension;

  import java.time.LocalDateTime;

  import org.junit.jupiter.api.Assertions;
  import org.junit.jupiter.api.Test;

  class TodoListTest {

    @Test
    public void getTaskByIdTest() {
    TodoList todoList = new TodoList();
    todoList.add("wash the car");
    todoList.add("eat pizza");

    int id = todoList.getTasks().get(1).getId();
    Task found = todoList.getTaskById(id);

    Assertions.assertEquals("eat pizza", found.getName());

    }

    @Test
    public void changeNameByIdTest() {
        TodoList todoList = new TodoList();
        todoList.add("wash the car");

        int id = todoList.getTasks().get(0).getId();
        todoList.changeNameById(id, "wash the bike");
        Assertions.assertEquals("wash the bike", todoList.getTaskById(id).getName());
    }

    @Test
    public void changeStatusByIdTest() {
        TodoList todoList = new TodoList();
        todoList.add("wash the car");
        int id = todoList.getTasks().get(0).getId();

        Assertions.assertFalse(todoList.getTaskById(id).isStatus());
        todoList.changeStatus(id);
        Assertions.assertTrue(todoList.getTaskById(id).isStatus());

        todoList.changeStatus(id);

        Assertions.assertFalse(todoList.getTaskById(id).isStatus());
    }

    @Test
    public void createdAtTest() {
        TodoList todoList = new TodoList();

        LocalDateTime before = LocalDateTime.now();
        todoList.add("wash the car");
        LocalDateTime after = LocalDateTime.now();

        LocalDateTime createdAt = todoList.getTasks().get(0).getCreatedAt();

        Assertions.assertNotNull(createdAt);
        Assertions.assertFalse(createdAt.isBefore(before));
        Assertions.assertFalse(createdAt.isAfter(after));
    }
}