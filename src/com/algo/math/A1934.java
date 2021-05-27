package com.algo.math;

import java.io.*;
import java.util.StringTokenizer;

public class A1934 {

    public static int gcd(int n, int m) {
        if(m == 0) { return n; }
        else { return gcd(m, n % m); }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());

            if(n == 1) { con.write(m + "\n"); }
            else { con.write((n * m) / gcd(n, m) + "\n"); }
        }

        con.flush();
    }

}
