package org.example.N_19CODESIGNAL.Introduccion;

import junit.framework.TestCase;

public class AbsoluteValuesSumMinimizationTest extends TestCase {
    AbsoluteValuesSumMinimization absoluteValuesSumMinimization = new AbsoluteValuesSumMinimization();
    public void testSolution() {
        assertEquals(4, absoluteValuesSumMinimization.solution(new int[]{2, 4, 7}));
    }

    public void testSolution2() {
        assertEquals(2, absoluteValuesSumMinimization.solution(new int[]{2, 3}));
    }

    public void testSolution3() {
        assertEquals(500, absoluteValuesSumMinimization.solution(new int[]{-10,100,200,300,400,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500}));
    }

    public void testSolution4() {
        assertEquals(15, absoluteValuesSumMinimization.solution(new int[]{-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
    }
}