package org.example.N_23_CodeWars.Fundamentals;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(XO.getXO("xxxooo"));
        System.out.println(XO.getXO("xxxXooOo"));
        System.out.println( XO.getXO("xxx23424esdsfvxXXOOooo"));
        System.out.println(XO.getXO("xXxxoewrcoOoo"));
        System.out.println(XO.getXO("XxxxooO"));
        System.out.println(XO.getXO("zssddd"));
        System.out.println(XO.getXO("Xxxxertr34"));


    }
    public class XO {

        public static boolean getXO (String str) {
            int counterX = 0;
            int counterO = 0;

            // Good Luck!!
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'x'){
                    counterX++;
                } else if (str.charAt(i) == 'o') {
                    counterO++;
                }
            }
            return counterX==counterO;
        }
        public static boolean getXO2 (String str) {
            str = str.toLowerCase();
            return str.replace("o","").length() == str.replace("x","").length();

        }
        public static boolean getXO3 (String str) {

            long countX = str.toLowerCase().chars().filter(ch -> ch =='x').count();
            long countO = str.toLowerCase().chars().filter(ch -> ch =='o').count();

            return (countO==countX);

        }
    }
}
