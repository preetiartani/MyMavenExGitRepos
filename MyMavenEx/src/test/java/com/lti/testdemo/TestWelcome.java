package com.lti.testdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWelcome {

	@Test
    public void testShow() {        
        Welcome w= new Welcome();        
        assertEquals("Hello Finally!!",w.show());
    }

}
