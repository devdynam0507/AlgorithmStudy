package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A19532 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str);
        int[] n = new int[tokenizer.countTokens()];

        for(int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int a = n[0]; int b = n[1];
        int d = n[3]; int e = n[4];
        int c = n[2]; int f = n[5];

        //ax + by = c
        //dx + ey = f
        for(int x = -999; x <= 999; x++) {
            for(int y = -999; y <= 999; y++) {
                int equation1 = a * x + b * y;
                int equation2 = d * x + e * y;

                if(equation1 == c && equation2 == f) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }

}
