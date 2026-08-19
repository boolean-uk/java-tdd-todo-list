package com.booleanuk.core.pojo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    private Task t;

    public TaskTest(){
        t = new Task("Testing");

    }

    @Test
    public void overloadingConstructor(){
        Assertions.assertEquals(false, t.getComplet());
        this.t = new Task("Testing", true);
        Assertions.assertEquals(true, t.getComplet());
    }

    @Test
    public void get_and_setCompTest(){
        Assertions.assertEquals(false, t.getComplet());
        t.setComplet(true);
        Assertions.assertEquals(true, t.getComplet());
    }

    @Test
    public void getTaskTest(){
        Assertions.assertEquals("Testing", t.getTask());
    }


}