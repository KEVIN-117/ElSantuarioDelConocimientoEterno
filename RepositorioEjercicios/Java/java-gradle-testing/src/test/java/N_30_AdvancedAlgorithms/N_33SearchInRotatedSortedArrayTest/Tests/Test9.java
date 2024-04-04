package N_30_AdvancedAlgorithms.N_33SearchInRotatedSortedArrayTest.Tests;

import org.example.N_31_LeetCode.N_33SearchInRotatedSortedArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test9 {
    @Test
    public void test() {
        int[] nums3 = {1};
        int target = 2;
        int expected = -1;
        int actual = N_33SearchInRotatedSortedArray.search(nums3, target);
        assertEquals(expected, actual);
    }
}
