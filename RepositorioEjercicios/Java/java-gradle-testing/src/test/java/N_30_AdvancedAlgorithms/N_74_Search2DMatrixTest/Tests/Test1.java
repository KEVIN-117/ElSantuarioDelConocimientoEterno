package N_30_AdvancedAlgorithms.N_74_Search2DMatrixTest.Tests;

import org.example.N_31_LeetCode.N_74_Search2DMatrix;
import org.junit.Test;
import static org.junit.Assert.*;
public class Test1 {
    @Test
    public void test() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int target = 3;
        boolean expected = true;
        boolean actual = N_74_Search2DMatrix.searchMatrix(matrix, target);
        assertEquals(expected, actual);
    }

}
