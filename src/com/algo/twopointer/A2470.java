package com.algo.twopointer;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2470 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int arr[] = new int[N];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(arr);

        if(N == 2) {
            System.out.println(arr[0] + " " + arr[1]);
            return;
        }

        int start = 0, end = arr.length - 1;
        int value = 2000000000;
        int r1 = -1, r2 = -1;
        while(start < end) {
            int sum = arr[start] + arr[end];

            if(Math.abs(sum) < value)  {
                value = Math.abs(sum);
                r1 = arr[start];
                r2 = arr[end];
            }

            if(sum < 0) {
                ++start;
            }
            else {
                --end;
            }
        }

        System.out.println(r1 +" "+ r2);
    }

}
