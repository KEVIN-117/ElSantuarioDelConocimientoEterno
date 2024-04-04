package N_30_AdvancedAlgorithms;

import org.example.N_30_AdvancedAlgorithms.AlienDictionary;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlienDictionaryTest {
    @Test
    public void test() {
        AlienDictionary ad = new AlienDictionary();
        String[] words = {"habito", "hacer", "lectura", "sonreir"};
        String order = "hlabcdfgijkmnopqrstuvwxyz";
        assertTrue(ad.isAlienSorted(words, order));
    }

    @Test
    public void test2() {
        AlienDictionary ad = new AlienDictionary();
        String[] words = {"habito", "hacer", "sonreir", "lectura"};
        String order = "hlabcdfgijkmnopqrstuvwxyz";
        assertFalse(ad.isAlienSorted(words, order));
    }

    @Test
    public void test3() {
        AlienDictionary ad = new AlienDictionary();
        String[] words = {"conocer", "cono"};
        String order = "abcdefghijkmnopqrstuvwxyz";
        assertFalse(ad.isAlienSorted(words, order));
    }
}
