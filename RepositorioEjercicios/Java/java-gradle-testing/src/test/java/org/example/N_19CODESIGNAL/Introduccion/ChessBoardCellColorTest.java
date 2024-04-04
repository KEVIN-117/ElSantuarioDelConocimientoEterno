package org.example.N_19CODESIGNAL.Introduccion;

import junit.framework.TestCase;

public class ChessBoardCellColorTest extends TestCase {
    ChessBoardCellColor chessBoardCellColor = new ChessBoardCellColor();
    public void testSolution() {
        assertTrue(chessBoardCellColor.solution("A1", "C3"));

    }
    public void testSolution2() {
        assertFalse(chessBoardCellColor.solution("A1", "H3"));
    }

    public void testSolution3() {
        assertFalse(chessBoardCellColor.solution("A1", "A2"));
    }

    public void testSolution4() {
        assertFalse(chessBoardCellColor.solution("A2", "B5"));
    }
}