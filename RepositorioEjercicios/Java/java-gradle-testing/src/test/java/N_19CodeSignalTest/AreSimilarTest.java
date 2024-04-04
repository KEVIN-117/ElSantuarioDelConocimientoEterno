package N_19CodeSignalTest;


import org.example.N_19CODESIGNAL.Introduccion.AreSimilar;
import org.junit.Test;
import static org.junit.Assert.*;
public class AreSimilarTest {
    @Test
    public void testAreSimilar(){
        assertTrue(AreSimilar.solution(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertTrue(AreSimilar.solution(new int[]{1, 2, 3}, new int[]{2, 1, 3}));
        assertFalse(AreSimilar.solution(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
        assertTrue(AreSimilar.solution(new int[]{1, 2, 1, 2}, new int[]{2, 2, 1, 1}));
        assertFalse(AreSimilar.solution(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
        assertFalse(AreSimilar.solution(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
        assertFalse(AreSimilar.solution(new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279},
                new int[]{832, 570, 148, 998, 533, 561, 455, 147, 894, 279}));
    }
}
