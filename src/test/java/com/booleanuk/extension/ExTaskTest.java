package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExTaskTest {
    private ExTask t;

    public ExTaskTest(){
        t = new ExTask("Testing");

    }

    @Test
    public void overloadingConstructor(){
        Assertions.assertEquals(false, t.getComplet());
        this.t = new ExTask("Testing", true);
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