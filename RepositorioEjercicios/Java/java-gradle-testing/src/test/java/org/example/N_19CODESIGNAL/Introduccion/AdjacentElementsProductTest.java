package org.example.N_19CODESIGNAL.Introduccion;

import junit.framework.TestCase;

public class AdjacentElementsProductTest extends TestCase {
    AdjacentElementsProduct product = new AdjacentElementsProduct();
    public void testSolution() {
        int[] array = {-23, 4, -3, 8, -12};
        assertEquals(product.solution(array), -12);
    }
}