package com.algo.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1475 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        int[] set = new int[10];

        for(char ch : chars) {
            set[ch - '0']++;
        }
        int avg;
        if((set[6] + set[9]) % 2 == 0) {
            avg = (set[6] + set[9]) / 2;
        }
        else {
            avg = (set[6] + set[9]) / 2 + 1;
        }
        set[9] = avg;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= 9; i++) {
            if(max < set[i]) {
                max = set[i];
            }
        }
        System.out.println(max);
    }

}
