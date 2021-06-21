package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        int[] n = new int[N];
        tokenizer = new StringTokenizer(reader.readLine());

        for(int i = 0; i < N; i++) {
            n[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int v = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = n[i] + n[j] + n[k];

                    if(sum == M) {
                        v = sum;
                        break;
                    }
                    else if(v < sum && sum < M) {
                        v = sum;
                    }
                }
            }
        }

        System.out.println(v);
    }

}
