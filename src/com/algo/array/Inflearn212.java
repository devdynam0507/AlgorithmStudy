package com.algo.array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn212 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int countOfStudent = Integer.parseInt(firstLine[0]);
        int countOfTest = Integer.parseInt(firstLine[1]);
        int[][] test = new int[countOfTest][countOfStudent];
        for(int i = 0; i < countOfTest; i++) {
            StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
            for(int j = 0; j < countOfStudent; j++) {
                test[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        int all = 0;

        for(int i = 0; i < countOfStudent; i++) {
            for(int j = 0; j < countOfStudent; j++) {
                int cnt = 0;
                for(int k = 0; k < countOfTest; k++) {
                    int pj = 0, pi = 0;
                    for(int s = 0; s < countOfStudent; s++) {
                        if(test[k][s] == i + 1) pi = s;
                        if(test[k][s] == j + 1) pj = s;
                    }
                    if(pi < pj) cnt ++;
                }
                if(cnt == countOfTest) {
                    all ++;
                }
            }
        }

        System.out.println(all);
    }

    /*
    * 20 2
19 15 4 17 12 18 6 3 11 14 1 8 13 9 2 20 5 16 10 7
5 20 18 17 14 11 19 3 10 16 6 8 13 9 2 12 4 7 1 15
    * */
}
