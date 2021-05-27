package com.algo.math;

import java.io.*;

public class A11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());

        for(int i = 2; i <= N; i++) {
            while(N % i == 0) {
                N /= i;
                con.write(i + "\n");
            }
        }

        con.flush();
    }

}
