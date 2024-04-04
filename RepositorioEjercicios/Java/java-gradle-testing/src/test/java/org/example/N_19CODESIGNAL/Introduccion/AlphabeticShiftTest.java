package org.example.N_19CODESIGNAL.Introduccion;

import junit.framework.TestCase;

public class AlphabeticShiftTest extends TestCase {
    AlphabeticShift shift = new AlphabeticShift();
    public void testSolution() {
        assertEquals(shift.solution("crazy"), "dsbaz");
    }

    public void testSolution2() {
        assertEquals(shift.solution("z"), "a");
    }

    public void testSolution3() {
        assertEquals(shift.solution("aaaabbbccd"), "bbbbcccdde");
    }

    public void testSolution4() {
        assertEquals(shift.solution("fuzzy"), "gvaaz");
    }

    public void testSolution5() {
        assertEquals(shift.solution("codesignal"), "dpeftjhobm");
    }
}