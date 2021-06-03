package com.algo.greedy;

import java.io.*;

public class A14916 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = 0;

        if(n <= 1 || n == 3) {
            System.out.println(-1);
            return;
        }

        while(n > 0) {
            if(n % 5 == 0) {
                m += 1;
                n -= 5;
            } else {
                n -= 2;
                m += 1;
            }
        }

        System.out.println(m);
    }

}
