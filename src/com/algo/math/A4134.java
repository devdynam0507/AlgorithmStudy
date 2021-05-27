package com.algo.math;

import java.io.*;
import java.math.BigInteger;

public class A4134 {

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
        int T;
        BigInteger n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            n = new BigInteger(br.readLine());

            if (n.isProbablePrime(100)) {
                System.out.println(n);
            } else {

                System.out.println(n.nextProbablePrime());
            }
        }
    }

}
