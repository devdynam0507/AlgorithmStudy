package com.algo.math;

import java.io.*;
import java.util.StringTokenizer;

public class A5347 {

    public static long gcd(long n, long m) {
        if(m == 0) { return n; }
        else { return gcd(m, n % m); }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            long n = Long.parseLong(tokenizer.nextToken());
            long m = Long.parseLong(tokenizer.nextToken());
            long r = (n * m) / gcd(Math.max(n, m), Math.min(n, m));

            con.write(r + "\n");
        }

        con.flush();
    }
}
