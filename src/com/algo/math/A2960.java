package com.algo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2960 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        boolean[] prime = new boolean[Integer.parseInt(tokenizer.nextToken()) + 1];
        int K = Integer.parseInt(tokenizer.nextToken());
        int k = 0;

        prime[0] = prime[1] = true;

        for(int i = 2; i <= prime.length; i++) {
            for(int j = i; j < prime.length; j += i) {
                if(prime[j]) continue;

                prime[j] = true;
                ++k;

                if(k == K) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }

}
