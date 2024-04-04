package org.example.N_19CODESIGNAL.Introduccion;

import java.util.HashMap;

public class ChessBoardCellColor {
    boolean solution(String cell1, String cell2) {
        char[] cell1Array = cell1.toCharArray();
        char[] cell2Array = cell2.toCharArray();
        int cell1Row = getcolumn(cell1Array[0])-1;
        int cell2Row = Integer.parseInt(String.valueOf(cell2Array[1]))-1;
        int cell2Column = getcolumn(cell2Array[0])-1;
        int cell1Column = Integer.parseInt(String.valueOf(cell1Array[1]))-1;

        return table(cell1Row, cell1Column) == table(cell2Row, cell2Column);
    }

    private int getcolumn (char column){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);
        map.put('G', 7);
        map.put('H', 8);
        return map.get(column);
    }

    private char table(int row, int column){
        char[][] table = {
                {'0', '1', '0', '1', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1', '0', '1', '0'},
                {'0', '1', '0', '1', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1', '0', '1', '0'},
                {'0', '1', '0', '1', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1', '0', '1', '0'},
                {'0', '1', '0', '1', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1', '0', '1', '0'}
        };
        return table[row][column];
    }

    public static void main(String[] args) {
        ChessBoardCellColor chessBoardCellColor = new ChessBoardCellColor();

        System.out.println(chessBoardCellColor.solution("A1", "C3"));
        System.out.println(chessBoardCellColor.solution("A1", "H3"));
    }
}
