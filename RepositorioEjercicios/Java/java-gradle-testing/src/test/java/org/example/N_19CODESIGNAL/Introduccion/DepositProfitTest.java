package org.example.N_19CODESIGNAL.Introduccion;

import junit.framework.TestCase;

public class DepositProfitTest extends TestCase {
    DepositProfit depositProfit = new DepositProfit();
    public void testSolution() {
        assertEquals(3, depositProfit.solution(100, 20, 170));
    }

    public void testSolution2() {
        assertEquals(1, depositProfit.solution(100, 1, 101));
    }

    public void testSolution3() {
        assertEquals(4, depositProfit.solution(50, 25, 100));
    }
}