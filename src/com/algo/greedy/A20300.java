package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A20300 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        long[] arr = new long[T];

        for(int i = 0; i < T; i++) {
            arr[i] = Long.parseLong(tokenizer.nextToken());
        }
        Arrays.sort(arr);

        if(arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }

        int start = 0;
        int end = arr.length % 2 == 0 ? arr.length - 1 : arr.length - 2;
        long M = arr[arr.length - 1];
        while(start <= end) {
            M = Math.max(M, arr[start++] + arr[end--]);
        }

        System.out.println(M);
    }

}
