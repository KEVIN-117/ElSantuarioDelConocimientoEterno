package N_19CodeSignalTest;

import org.example.N_19CODESIGNAL.Introduccion.ArrayChange;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ArrayChangeTest {

    @Test
    public void test(){
        assertEquals(3, ArrayChange.solution(new int[]{1, 1, 1}));
    }
}
