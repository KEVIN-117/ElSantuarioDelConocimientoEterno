package N_30_AdvancedAlgorithms.N_74_Search2DMatrixTest.Tests;

import org.example.N_31_LeetCode.N_74_Search2DMatrix;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test3 {
    @Test
    public void test() {
        int[][] matrix = {{1}};
        int target = 1;
        boolean result = N_74_Search2DMatrix.searchMatrix(matrix, target);
        System.out.println(result);
        assertEquals(true, result);
    }
}
