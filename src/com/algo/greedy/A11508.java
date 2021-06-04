package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class A11508 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        Integer[] arr = new Integer[T];

        for(int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        int sum = 0;
        for(int i = 0; i < arr.length;) {
            int cnt = 0;

            for(int j = i; j < arr.length && j < i + 3; j++, i++) {
                if(cnt + 1 == 3) {
                    ++i;
                    break;
                }

                sum += arr[j];
                ++cnt;
            }
        }

        System.out.println(sum);
    }

}
