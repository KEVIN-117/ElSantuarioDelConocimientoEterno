package org.example.N_19CODESIGNAL.Introduccion;

import junit.framework.TestCase;

public class AddTest extends TestCase {
    Add add = new Add();
    public void testSolution() {
        assertEquals(add.solution(10,10), 20);
    }

    public void testSolution2() {
        assertEquals(add.solution(2,3), 5);
    }

    public void testSolution3() {
        assertEquals(add.solution(5,20), 25);
    }

    public void testSolution4() {
        assertEquals(add.solution(0,10), 10);
    }
}