package org.example.N_14ExamenFinal;

import java.util.Arrays;
import java.util.Scanner;

public class Examen_2 {
    static boolean[][] board;
    static boolean[][] visited;
    static int ans;

    public static boolean possible(int x, int y){
        if (x > 9 || x < 0 || y > 9 || y < 0)
            return false;
        if (!board[x][y])
            return false;
        if (visited[x][y])
            return false;

        return true;
    }
    public static void solve_dfs(int x, int y, int cur){

        visited[x][y] = true;
        ans = Math.max(ans, cur);

        if (possible(x-2, y-1))
            solve_dfs( x-2, y-1, cur+1 );
        if (possible(x-2, y+1))
            solve_dfs( x-2, y+1, cur+1 );
        if (possible(x+2, y-1))
            solve_dfs( x+2, y-1, cur+1 );
        if (possible(x+2, y+1))
            solve_dfs( x+2, y+1, cur+1 );

        if (possible(x-1, y-2))
            solve_dfs( x-1, y-2, cur+1 );
        if (possible(x-1, y+2))
            solve_dfs( x-1, y+2, cur+1 );
        if (possible(x+1, y-2))
            solve_dfs( x+1, y-2, cur+1 );
        if (possible(x+1, y+2))
            solve_dfs( x+1, y+2, cur+1 );

        visited[x][y] = false;
    }

    public static void main(String[] args) {
        board = new boolean[10][10];
        visited = new boolean[10][10];
        int t=0, i, n, j, amountSquares;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (n != 0){
            for (i = 0; i <board.length ; i++) {
                    Arrays.fill(board[i],0,10, false);
                    Arrays.fill(visited[i], 0, 10, false);
            }
            amountSquares = 0;
            int indexX = 0;
            for (i = 0; i <n ; i++) {
                int inicio = input.nextInt();
                int fin = input.nextInt();
                int indexY = inicio;
                for (j = 0; j < fin; j++) {
                    board[indexX][indexY] = true;
                    amountSquares ++;
                    indexY++;
                }
                indexX++;
            }
            solve_dfs(0, 0, 1);
            ans = amountSquares-ans;
            t++;
            System.out.println("Case " + t + " can not be reached." + ans +"squares");
            n = input.nextInt();
        }
    }
}
