package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1758 {

    public static int f(int x, int y) {
        return x - (y - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        Integer[] arr = new Integer[T];

        for(int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());

        long sum = 0;
        for(int i = 1; i <= T; i++) {
            int f = f(arr[i - 1], i);
            if(f > 0) { sum += f; }
            else { break; }
        }

        System.out.println(sum);
    }

}
