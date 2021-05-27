package com.algo.math;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A9613 {

    public static int gcd(int n, int m) {
        if(m == 0) { return n; }
        else { return gcd(m, n % m); }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++) {
            List<Integer> list = new ArrayList<>();
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(tokenizer.nextToken());

            while(tokenizer.hasMoreTokens()) {
                list.add(Integer.parseInt(tokenizer.nextToken()));
            }

            long sum = 0;
            for(int j = 0; j < N; j++) {
                int n = list.get(j);
                for(int k = j + 1; k < N; k++) {
                    sum += gcd(Math.max(n, list.get(k)), Math.min(n, list.get(k)));
                }
            }

            con.write(sum + "\n");
        }

        con.flush();
    }

}
