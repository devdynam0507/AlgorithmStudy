package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A2230 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        if(N == 1) {
            System.out.println(arr[0]);
            return;
        }
        Arrays.sort(arr);

        int p1 = 0;
        int p2 = 0;
        int min = Integer.MAX_VALUE;
        int value = 0;
        while(p1 < arr.length && p2 < arr.length) {
            int diff = arr[p2] - arr[p1];
            int dist = Math.abs(M - diff);

//            if(dist == 0) {
//                value = 0;
//                break;
//            }
            if(min > dist && diff >= M) {
                min = dist;
                value = diff;
            }

            if(diff <= M) {
                p2++;
            }
            if(diff > M) {
                p1++;
            }
        }
        System.out.println(value);
    }

}
