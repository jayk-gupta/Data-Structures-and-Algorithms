package LeetCode;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] Arr = new int[3][2];
        System.out.println(Arr.length);
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j <Arr[i].length ; j++) {
                Arr[i][j] = in.nextInt();
            }
        }
        int[][] arr = {
                {1, 2, 3}, 
                {4, 5}
        };
    }



}
