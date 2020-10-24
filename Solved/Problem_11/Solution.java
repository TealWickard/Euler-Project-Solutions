package Solved.Problem_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        int answer = 0;
        String[][] grid = new String[20][];
        Scanner scan = new Scanner(new File("Solved/Problem_11/grid.txt"));
        for(int i = 0; i < 20; i++){
            String line = scan.nextLine();
            grid[i] = line.split(" ");
        }
        scan.close();
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 16; j++){
                if(i < 16){
                    int horiz = Integer.parseInt(grid[i][j]) * Integer.parseInt(grid[i][j + 1]) * Integer.parseInt(grid[i][j + 2]) * Integer.parseInt(grid[i][j + 3]);
                    int vert = Integer.parseInt(grid[i][j]) * Integer.parseInt(grid[i + 1][j]) * Integer.parseInt(grid[i + 2][j]) * Integer.parseInt(grid[i + 3][j]);
                    int drDiag = Integer.parseInt(grid[i][j]) * Integer.parseInt(grid[i + 1][j + 1]) * Integer.parseInt(grid[i + 2][j + 2]) * Integer.parseInt(grid[i + 3][j + 3]);
                    if(horiz > answer) answer = horiz;
                    if(vert > answer) answer = vert;
                    if(drDiag > answer) answer = drDiag;
                }
                if(i > 3){
                    int dlDiag = Integer.parseInt(grid[i][j]) * Integer.parseInt(grid[i - 1][j + 1]) * Integer.parseInt(grid[i - 2][j + 2]) * Integer.parseInt(grid[i - 3][j + 3]);
                    if(dlDiag > answer) answer = dlDiag;
                }
            }
        }
        System.out.printf("The answer is: %s", answer);
    }
}