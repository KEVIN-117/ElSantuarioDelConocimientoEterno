package N_30_AdvancedAlgorithms;

import org.example.N_31_LeetCode.N_75_Sort_Colors;
import org.junit.Test;
import static org.junit.Assert.*;

public class N_75_Sort_ColorsTests {

    @Test
    public void testSortColors() {
        int[] nums = {2,0,2,1,1,0};
        int[] expected = {0,0,1,1,2,2};
        int[] actual = N_75_Sort_Colors.sortColors(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortColors2() {
        int[] nums = {2,0,1};
        int[] expected = {0,1,2};
        int[] actual = N_75_Sort_Colors.sortColors(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortColors3() {
        int[] nums = {0};
        int[] expected = {0};
        int[] actual = N_75_Sort_Colors.sortColors(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortColors4() {
        int[] nums = {1};
        int[] expected = {1};
        int[] actual = N_75_Sort_Colors.sortColors(nums);
        assertArrayEquals(expected, actual);
    }

}
