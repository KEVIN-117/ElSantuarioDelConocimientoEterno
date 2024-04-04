package N29_DataStructuresTest;
import org.example.N_29DataStructures.Trie;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class TrieTest {

    @Test
    public void test(){
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        /*
        Trie trie = new Trie(words);
        assertTrue(trie.find("hello"));
        assertFalse(trie.find("code"));
        trie.insert("code");
        assertTrue(trie.find("code"));
        assertTrue(trie.find("java"));
        assertTrue(trie.find("world"));


        trie.insert("911");
        assertTrue(trie.find("911"));
        trie.insert("97625999");
        assertTrue(trie.find("97625999"));
        trie.insert("91125426");
        assertTrue(trie.find("91125426"));
         */
    }
}
