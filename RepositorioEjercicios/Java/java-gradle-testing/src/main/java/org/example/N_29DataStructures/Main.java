package org.example.N_29DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("911");
        words.add("97625999");
        words.add("91125426");
        Trie trie = new Trie();
        trie.insertar("911");
        trie.insertar("97625999");
        trie.insertar("91125426");
        /*System.out.println("Find 911 is " + trie.find("911"));*/
    }
}
