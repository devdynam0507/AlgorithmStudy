package com.algo.array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn210 {

    public static void main(String[] args) {
        int[] dx = new int[] { 0, 0, 1, -1 };
        int[] dy = new int[] { 1, -1, 0, 0 };
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int curr = arr[i][j];
                boolean isBongwoori = true;
                for(int d = 0; d < 4; d++) {
                    int x = i + dx[d];
                    int y = j + dy[d];
                    int compare;
                    if(x < 0 || x >= n || y < 0 || y >= n) {
                        compare = 0;
                    }
                    else {
                        compare = arr[x][y];
                    }

                    if(curr <= compare) {
                        isBongwoori = false;
                        break;
                    }
                }
                if(isBongwoori) {
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }

}
