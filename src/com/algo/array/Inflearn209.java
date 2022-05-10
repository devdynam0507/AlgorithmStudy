package com.algo.array;

import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn209 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
            for(int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int a = 0, b = 0;
            for(int j = 0; j < n; j++) {
                a += board[i][j];
                b += board[j][i];
            }

            max = Math.max(max, a);
            max = Math.max(max, b);
        }

        int a = 0, b = 0;
        for(int i = 0; i < n; i++) {
            a += board[i][i];
            b += board[i][n - i - 1];
        }
        max = Math.max(max, a);
        max = Math.max(max, b);

        System.out.println(max);
    }

}
