package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        int v = 0;
        for(int i = 0; i < N; i++) {
            int sum = 0;
            int n = i;

            while(n != 0) {
                sum += (n % 10);
                n /= 10;
            }

            if(sum + i == N) {
                v = i;
                break;
            }
        }

        System.out.println(v);
    }
}
