package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1806 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int S = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[N];
        tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 0; i < N; i++) { arr[i] = Integer.parseInt(tokenizer.nextToken()); }

        int sum = 0;
        int min = 9999999;
        int lp = 0, rp = 0;
        while(rp < N && lp < N) {
            if(sum < S) {
                sum += arr[rp++];
                if(sum >= S) {
                    --rp;
                }
            }
            else if(sum >= S) {
                while(sum >= S) {
                    sum -= arr[lp++];
                }
                ++rp;
                min = Math.min(rp - (lp - 1) , min);
            }
        }

        if(min == 9999999) {
            System.out.println("0");
        } else {
            System.out.println(min);
        }
    }

}
