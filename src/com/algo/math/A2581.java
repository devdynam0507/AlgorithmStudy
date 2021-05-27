package com.algo.math;

import java.io.*;

public class A2581 {

    public static boolean prime[];

    public static void makePrime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++) {
            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(reader.readLine());
        int N = Integer.parseInt(reader.readLine());

        prime = new boolean[N + 1];
        makePrime();

        int sum = 0;
        int min = -999;
        for(int i = M; i <= N; i++) {
            if(!prime[i]) {
                sum += i;

                if(min == -999) {
                    min = i;
                }
            }
        }

        if(sum == 0) {	// 소수가 없다면
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

}
