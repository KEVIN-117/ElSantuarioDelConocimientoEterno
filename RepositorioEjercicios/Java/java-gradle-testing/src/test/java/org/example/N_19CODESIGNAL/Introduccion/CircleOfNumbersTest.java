package org.example.N_19CODESIGNAL.Introduccion;

import junit.framework.TestCase;

public class CircleOfNumbersTest extends TestCase {
    CircleOfNumbers circleOfNumbers = new CircleOfNumbers();
    public void testSolution() {
        assertEquals(7, circleOfNumbers.solution(10, 2));
    }

    public void testSolution2() {
        assertEquals(2, circleOfNumbers.solution(10, 7));
    }

    public void testSolution3() {
        assertEquals(3, circleOfNumbers.solution(4, 1));
    }

    public void testSolution4() {
        assertEquals(14, circleOfNumbers.solution(18, 5));
    }
}