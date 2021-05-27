package com.algo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1978 {

    public static boolean[] prime;

    public static void makePrime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++) {
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        prime = new boolean[1001];
        makePrime();

        int cnt = 0;
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(tokenizer.nextToken());
            if(N <= 1) continue;

            if(!prime[N]) {
                ++cnt;
            }
        }

        System.out.println(cnt);
    }

}
