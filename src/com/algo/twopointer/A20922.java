package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A20922 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        StringTokenizer arrTokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(arrTokenizer.nextToken());
        }

        int lp = 0, rp = 0;
        int len = 0, longest = 0;
        while(rp < N) {
            int cnt = map.getOrDefault(arr[rp], 0);

            if(cnt + 1 > K) {
                map.put(arr[lp], map.get(arr[lp]) - 1);
                lp ++; len --;
                continue;
            }

            map.put(arr[rp], ++cnt);
            ++rp; ++len;

            if(len > longest) {
                longest = len;
            }
        }

        System.out.println(longest);
    }

}
