import org.example.SearchPairNumber;
import org.junit.Test;

import static org.junit.Assert.*;
public class SearchNumberPrimeTest {
    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
    @Test
    public void testSearch(){
        assertTrue(SearchPairNumber.isPair(2));
        assertFalse(SearchPairNumber.isPair(1));
        assertFalse(SearchPairNumber.isPair(9));
        assertFalse(SearchPairNumber.isPair(37));
        assertTrue(SearchPairNumber.isPair(20));
    }
}
