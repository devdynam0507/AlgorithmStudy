package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inflearn301 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr1Len = Integer.parseInt(reader.readLine());
        int[] arr1 = new int[arr1Len];
        StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
        int arr2Len = Integer.parseInt(reader.readLine());
        int[] arr2 = new int[arr2Len];
        StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
        for(int i = 0; i < arr1Len; i++) {
            arr1[i] = Integer.parseInt(tokenizer1.nextToken());
        }
        for(int i = 0; i < arr2Len; i++) {
            arr2[i] = Integer.parseInt(tokenizer2.nextToken());
        }
        int[] result = new int[arr1Len + arr2Len];

        int p1 = 0;
        int p2 = 0;
        int current = 0;
        while(current < result.length) {
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            if(p1 < arr1.length) {
                a = arr1[p1];
            }
            if(p2 < arr2.length) {
                b = arr2[p2];
            }
            if(a < b) {
                result[current] = a;
                p1 ++;
            }
            else {
                result[current] = b;
                p2 ++;
            }
            current += 1;
        }

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
