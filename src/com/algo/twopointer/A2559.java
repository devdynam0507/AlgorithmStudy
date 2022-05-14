package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2559 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(reader.readLine());
        int[] arr = new int[Integer.parseInt(firstLine.nextToken())];
        int day = Integer.parseInt(firstLine.nextToken());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int p1 = 0;
        int p2 = day;
        int max = Integer.MIN_VALUE;
        if(p2 == arr.length) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            max = sum;
        }
        else {
            while (p2 <= arr.length) {
                int sum = 0;
                for (int i = p1; i < p2; i++) {
                    sum += arr[i];
                }
                p1 += 1;
                p2 += 1;
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }

}
