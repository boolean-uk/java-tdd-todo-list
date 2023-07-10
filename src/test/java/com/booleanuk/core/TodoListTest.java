package com.booleanuk.core;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {
    private static String TASK1;
    private static String  TASK2;
    private static String  TASK3;
    private static TodoList TODOLIST;

    @BeforeAll
    static void testSetup() {
        TODOLIST = new TodoList();
        TASK1 = "Wash the dishes";
        TASK2 = "Walk the dog";
        TASK3 = "Drink a glass of water";
    }

    @AfterEach
    void clearTODOList() {
        TODOLIST.tasks.clear();
    }

    @Nested
    class AddTask {
        @Test
        void shouldReturnTrueIfTaskIsNotInTodoList() {
            assertTrue(TODOLIST.addTask(TASK1));
            assertTrue(TODOLIST.addTask(TASK2));
            assertTrue(TODOLIST.addTask(TASK3));
        }
        @Test
        void shouldReturnFalseIfTaskIsInTodoList() {
            assertTrue(TODOLIST.addTask(TASK1));
            assertFalse(TODOLIST.addTask(TASK1));
        }
    }

    @Nested
    class DisplayTasks {
        @Test
        void shouldReturnThreeElements() {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            TODOLIST.addTask(TASK3);
            String result = """
                    Tasks to do:\s
                    Completed: false | Wash the dishes
                    Completed: false | Drink a glass of water
                    Completed: false | Walk the dog
                    """;
            assertEquals(result, TODOLIST.displayTasks());
        }
    }

    @Nested
    class ChangeTaskStatus {
        @Test
        void shouldReturnFalse() {
            System.out.println(TODOLIST.changeTaskStatus(TASK2));
            assertFalse(TODOLIST.changeTaskStatus(TASK2));
        }
        @Test
        void shouldReturnTrue() {
            TODOLIST.addTask(TASK1);
            assertTrue(TODOLIST.changeTaskStatus(TASK1));
            assertTrue(TODOLIST.tasks.get(TASK1));

            assertTrue(TODOLIST.changeTaskStatus(TASK1));
            assertFalse(TODOLIST.tasks.get(TASK1));
        }
    }

    @Nested
    class DisplayCompletedTasks {
        @Test
        void shouldReturnInCompleted() {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            TODOLIST.addTask(TASK3);
            assertTrue(TODOLIST.changeTaskStatus(TASK1));
            assertTrue(TODOLIST.changeTaskStatus(TASK2));

            String result = """
                    Completed tasks:\s
                    Wash the dishes
                    Walk the dog
                    """;
            assertEquals(result, TODOLIST.displayCompletedTasks());
        }
    }

    @Nested
    class DisplayInCompletedTasks {
        @Test
        void shouldReturnInCompletedTasks() {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            TODOLIST.addTask(TASK3);
            assertTrue(TODOLIST.changeTaskStatus(TASK1));

            String result = """
                    InCompleted tasks:\s
                    Drink a glass of water
                    Walk the dog
                    """;
            assertEquals(result, TODOLIST.displayInCompletedTasks());
        }
    }

    @Nested
    class GetTask {
        @Test
        void shouldReturnStringDescribingTaskIfTaskInTodoList() {
            TODOLIST.addTask(TASK1);
            String result = "Completed: false | Wash the dishes";

            assertEquals(result, TODOLIST.getTask(TASK1));
        }

        @Test
        void shouldReturnStringThatSaysThereIsNoSuchTaskInTodoList() {
            String result = "There is no such task in the list.";

            assertEquals(result, TODOLIST.getTask(TASK1));
        }
    }


    @Nested
    class RemoveTask {
        @Test
        void shouldReturnTrueWhenTaskInTodoList() {
            TODOLIST.addTask(TASK1);

            assertTrue(TODOLIST.removeTask(TASK1));
        }

        @Test
        void shouldReturnFalseWhenTaskNotInTodoList() {
            TODOLIST.addTask(TASK1);

            TODOLIST.removeTask(TASK1);
            assertFalse(TODOLIST.removeTask(TASK1));
        }
    }

    @Nested
    class DisplayAlphabeticallyAscending {
        @Test
        void shouldReturnTasksSortedAscending () {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            TODOLIST.addTask(TASK3);
            String result = """
                    Tasks sorted Ascending:\s
                    Completed: false | Drink a glass of water
                    Completed: false | Walk the dog
                    Completed: false | Wash the dishes
                    """;
            assertEquals(result, TODOLIST.displayAlphabeticallyAscending());
        }
    }

    @Nested
    class DisplayAlphabeticallyDescending {
        @Test
        void shouldReturnTasksSortedDescending () {
            TODOLIST.addTask(TASK1);
            TODOLIST.addTask(TASK2);
            TODOLIST.addTask(TASK3);
            String result = """
                    Tasks sorted Descending:\s
                    Completed: false | Wash the dishes
                    Completed: false | Walk the dog
                    Completed: false | Drink a glass of water
                    """;
            assertEquals(result, TODOLIST.displayAlphabeticallyDescending());

        }
    }
}
