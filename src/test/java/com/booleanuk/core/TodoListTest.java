package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void CheckAdd() {
        TodoList todolist = new TodoList();
        Assertions.assertEquals(todolist.taskList.size(),0);
        Assertions.assertTrue(todolist.add("Wash the Dishes"));
        Assertions.assertEquals(todolist.taskList.size(),1);
        //check for double entry
        Assertions.assertFalse(todolist.add("Wash the Dishes"));
        Assertions.assertEquals(todolist.taskList.size(),1);
    }

    @Test
    public void CheckTaskListPreview() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        Assertions.assertEquals(todoList.doShowTaskList(),"Task 1: Wash the dishes  ~~Completed: false\n" +
                "Task 2: Iron the clothes  ~~Completed: false\n");
    }

    @Test
    public void CheckTaskCompletionUpdate() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        Assertions.assertTrue(todoList.doSetCompletion(1,true));
        Assertions.assertEquals(todoList.doShowTaskList(),"Task 1: Wash the dishes  ~~Completed: true\n" +
                "Task 2: Iron the clothes  ~~Completed: false\n");
    }

    @Test
    public void CheckSelectedView() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        todoList.add("Walk the dog");
        todoList.add("Water the flowers");
        todoList.doSetCompletion(1,true);
        todoList.doSetCompletion(3,true);
        Assertions.assertEquals(todoList.doShowCompleted(),"Task 1: Wash the dishes  ~~Completed: true\n" +
                "Task 3: Walk the dog  ~~Completed: true\n");
        Assertions.assertEquals(todoList.doShowIncomplete(),"Task 2: Iron the clothes  ~~Completed: false\n" +
                "Task 4: Water the flowers  ~~Completed: false\n");
    }

    @Test
    public void CheckSearch() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        todoList.add("Walk the dog");
        todoList.add("Water the flowers");
        todoList.doSetCompletion(1,true);
        todoList.doSetCompletion(3,true);
        //Search using description
        Assertions.assertEquals(todoList.search("Walk the dog"),"Task 3: Walk the dog  ~~Completed: true\n");
        Assertions.assertEquals(todoList.search("Wash the car"),"Task doesn't exist");
        //Search using Id
        Assertions.assertEquals(todoList.search(3),"Task 3: Walk the dog  ~~Completed: true\n");
        Assertions.assertEquals(todoList.search(12),"Task doesn't exist");
    }

    @Test
    public void CheckRemove() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        todoList.add("Walk the dog");
        todoList.add("Water the flowers");
        todoList.doSetCompletion(1,true);
        todoList.doSetCompletion(3,true);
        Assertions.assertTrue(todoList.remove("Iron the clothes"));
        Assertions.assertFalse(todoList.remove("take a walk"));
        Assertions.assertEquals(todoList.taskList.size(),3);
    }

    @Test
    public void CheckOrdered() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        todoList.add("Walk the dog");
        todoList.add("Water the flowers");
        todoList.doSetCompletion(1,true);
        todoList.doSetCompletion(3,true);

        Assertions.assertEquals(todoList.doShowAscending(),"Task 2: Iron the clothes  ~~Completed: false\n" +
                "Task 3: Walk the dog  ~~Completed: true\n" +
                "Task 1: Wash the dishes  ~~Completed: true\n" +
                "Task 4: Water the flowers  ~~Completed: false\n");
        Assertions.assertEquals(todoList.doShowDescending(),"Task 4: Water the flowers  ~~Completed: false\n" +
                "Task 1: Wash the dishes  ~~Completed: true\n" +
                "Task 3: Walk the dog  ~~Completed: true\n" +
                "Task 2: Iron the clothes  ~~Completed: false\n");
    }

    @Test
    public void CheckUpdateDescription() {
        TodoList todoList = new TodoList();
        todoList.add("Wash the dishes");
        todoList.add("Iron the clothes");
        todoList.add("Walk the dog");
        todoList.add("Water the flowers");
        todoList.doSetCompletion(1,true);
        todoList.doSetCompletion(3,true);
        Assertions.assertTrue(todoList.doUpdateDescription(1,"Wash the Kitchen"));
        Assertions.assertFalse(todoList.doUpdateDescription(15,"Drink some water"));
        Assertions.assertEquals(todoList.search(1),"Task 1: Wash the Kitchen  ~~Completed: true\n");
    }
}
