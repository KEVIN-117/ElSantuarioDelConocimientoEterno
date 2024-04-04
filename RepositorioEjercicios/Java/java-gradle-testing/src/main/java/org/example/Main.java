package org.example;

public class Main {
    private final char[] alpahbet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private String letter;
    private int displacement;

    public Main(String letter, int displacement){
        this.letter = letter;
        this.displacement = displacement;
    }

    public String getLetter() {
        return letter;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String solution(){
        String result = "";
        for (int i = 0; i < this.letter.length(); i++) {
            char currentLetter = (this.alpahbet[(this.letter.charAt(i) - 'a' + this.displacement) % 26]);
            result +=currentLetter;
        }
        return result;
    }
    public static void main(String[] args) {
        Main res = new Main("parangaricutirimicuaro", 1);
        System.out.println(res.solution());
    }
}
