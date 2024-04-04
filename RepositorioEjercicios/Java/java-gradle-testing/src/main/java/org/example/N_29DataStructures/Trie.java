package org.example.N_29DataStructures;

class NodoTrie {
    NodoTrie[] hijos;
    boolean esFinalDePalabra;

    NodoTrie() {
        hijos = new NodoTrie[26]; // Un elemento por cada letra del alfabeto
        esFinalDePalabra = false;
    }
}

public class Trie {
    NodoTrie raiz;

    public Trie() {
        raiz = new NodoTrie();
    }

    public void insertar(String palabra) {
        NodoTrie actual = raiz;
        for (char letra : palabra.toCharArray()) {
            int indice = letra - 'a';
            if (actual.hijos[indice] == null) {
                actual.hijos[indice] = new NodoTrie();
            }
            actual = actual.hijos[indice];
        }
        actual.esFinalDePalabra = true;
    }

    public boolean buscar(String palabra) {
        NodoTrie actual = raiz;
        for (char letra : palabra.toCharArray()) {
            int indice = letra - 'a';
            if (actual.hijos[indice] == null) {
                return false;
            }
            actual = actual.hijos[indice];
        }
        return actual.esFinalDePalabra;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertar("hola");
        trie.insertar("adios");

        if (trie.buscar("hola")) {
            System.out.println("La palabra 'hola' está en el Trie");
        }

        if (trie.buscar("chao")) {
            System.out.println("La palabra 'chao' está en el Trie");
        } else {
            System.out.println("La palabra 'chao' no está en el Trie");
        }
    }
}

