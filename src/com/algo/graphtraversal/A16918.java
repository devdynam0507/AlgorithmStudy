package com.algo.graphtraversal;

import java.io.*;
import java.util.StringTokenizer;

public class A16918 {

    static int[] dx = new int[] { 1, -1, 0, 0 };
    static int[] dy = new int[] { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int R = Integer.parseInt(tokenizer.nextToken());
        int C = Integer.parseInt(tokenizer.nextToken());
        int N = Integer.parseInt(tokenizer.nextToken());
        int[][] arr = new int[R][C];

        for(int i = 0; i < R; i++) {
            char[] ch = reader.readLine().toCharArray();
            for(int j = 0; j < C; j++) {
                arr[i][j] = ch[j];
            }
        }


    }

}
