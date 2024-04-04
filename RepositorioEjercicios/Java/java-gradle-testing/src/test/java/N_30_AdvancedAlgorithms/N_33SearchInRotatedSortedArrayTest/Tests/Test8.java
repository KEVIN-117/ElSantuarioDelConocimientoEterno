package N_30_AdvancedAlgorithms.N_33SearchInRotatedSortedArrayTest.Tests;

import org.example.N_31_LeetCode.N_33SearchInRotatedSortedArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class Test8 {
    //int[] nums3 = {1,2,3,4,5,6,7,8};
    //        target = 3;
    //        expected = 2;
    //        actual = N_33SearchInRotatedSortedArray.search(nums3, target);
    //        System.out.println(expected + " " +actual);
    @Test
    public void test() {
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 3;
        int expected = 2;
        int actual = N_33SearchInRotatedSortedArray.search(nums3, target);
        assertEquals(expected, actual);
    }
}
