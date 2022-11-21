package com.company;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestTest {

    @Test
    public void sum() {
        test a = new test();
        int actual = a.sum(15);
        int expected = 120;
        assertEquals(expected,actual);
    }
}