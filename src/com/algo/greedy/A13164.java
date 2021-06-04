package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A13164 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(reader.readLine());
        StringTokenizer tall = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(in.nextToken());
        int group = Integer.parseInt(in.nextToken());
        int[] arr = new int[T];
        int[] diff = new int[T - 1];

        for(int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(tall.nextToken());
        }

        for(int i = 0; i < T - 1; i++) {
            diff[i] = arr[i + 1] - arr[i];
        }
        Arrays.sort(diff);

        int sum = 0;
        for(int i = 0; i < T - group; i++) {
            sum += diff[i];
        }

        System.out.println(sum);
    }

}
