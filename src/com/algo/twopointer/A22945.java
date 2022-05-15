package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A22945 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] ability = new int[N];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 0; i < N; i++) {
            ability[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int lp = 0;
        int rp = N - 1;
        int max = Integer.MIN_VALUE;
        while(lp < rp) {
            int ab = (rp - lp - 1) * Math.min(ability[lp], ability[rp]);

            if(ability[lp] < ability[rp]) {
                lp++;
            }
            else {
                rp--;
            }
            max = Math.max(max, ab);
        }

        System.out.print(max);
    }

}
