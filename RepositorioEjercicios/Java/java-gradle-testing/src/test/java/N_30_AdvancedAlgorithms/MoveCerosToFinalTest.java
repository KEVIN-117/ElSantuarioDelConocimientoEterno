package N_30_AdvancedAlgorithms;

import org.example.N_30_AdvancedAlgorithms.MoveCerosToFinal;
import org.example.N_31_LeetCode.N_283_MoveZeroes;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class MoveCerosToFinalTest {
    @Test
    public void testMoveCerosToFinal() {

        int[] nums = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};
        int[] actual = N_283_MoveZeroes.moveCeros(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoveCerosToFinal1() {

        int[] nums = {0};
        int[] expected = {0};
        int[] actual = N_283_MoveZeroes.moveCeros(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoveCerosToFinal2() {
        int[] nums = {0, -31, 0,40,0,-32,52,100};
        int[] expected = {-31,40,-32,52,100,0,0,0};
        int[] actual = N_283_MoveZeroes.moveCeros(nums);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoveCerosToFinal3() {
        int[] nums = {1,0,1};
        int[] expected = {1,1,0};
        int[] actual = N_283_MoveZeroes.moveCeros(nums);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testMoveCerosToFinal4() {
        int[] nums = {2,1};
        int[] expected = {2,1};
        int[] actual = N_283_MoveZeroes.moveCeros(nums);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testMoveCerosToFinal5() {
        int[] nums = {1,5,7,5,85,5,45,5,5,65,1,5,4,85,5,5,4,4,4,5,5,8,5,5,0,0,0,0,0};
        int[] expected = {1,5,7,5,85,5,45,5,5,65,1,5,4,85,5,5,4,4,4,5,5,8,5,5,0,0,0,0,0};
        int[] actual = N_283_MoveZeroes.moveCeros(nums);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testMoveCerosToFinal6() {
        int[] nums = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};
        int[] actual = N_283_MoveZeroes.moveCeros(nums);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}
