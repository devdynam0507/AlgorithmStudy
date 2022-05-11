package com.algo.array;

import java.util.*;

public class Inflearn211 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] aa = new int[n][5];
        for(int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
            for(int j = 0; j < 5; j++) {
                aa[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        int answer = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < 5; k++) {
                    if(aa[i][k] == aa[j][k]) {
                        cnt += 1;
                        break;
                    }
                }
            }

            if(cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }

        System.out.println(answer);
    }

}
