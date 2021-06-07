package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2141 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[] X = new int[T];
        int[] A = new int[T];

        for(int i = 0; i < T; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            X[i] = Integer.parseInt(tokenizer.nextToken());
            A[i] = Integer.parseInt(tokenizer.nextToken());
        }


    }

}
