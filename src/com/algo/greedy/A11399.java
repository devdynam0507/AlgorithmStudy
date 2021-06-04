package com.algo.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int[] arr = new int[T];

        for(int i = 0; i < T; i ++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(arr);

        int sum = arr[0];
        for(int i = 1; i < T; i++) {
            for(int j = 0; j <= i; j++) {
                sum += arr[j];
            }
        }

        writer.write(sum);
        writer.flush();
    }

}
