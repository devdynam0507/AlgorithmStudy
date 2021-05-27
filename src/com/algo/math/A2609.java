package com.algo.math;

import java.io.*;
import java.util.StringTokenizer;

public class A2609 {

    public static int gcd(int n, int m) {
        if(m == 0) { return n; }
        else { return gcd(m, n % m); }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n1 = Integer.parseInt(tokenizer.nextToken());
        int n2 = Integer.parseInt(tokenizer.nextToken());

        con.write(gcd(n1, n2) + "\n");
        con.write((n1 * n2) / gcd(n1, n2) + "\n");

        con.flush();
    }

}
